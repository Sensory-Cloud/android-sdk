#!/bin/bash
# ------------------------------------------------------------------
# [Author] Niles Hacking (nhacking@sensoryinc.com)
# [Title] Android cloud SDK helper script
# ------------------------------------------------------------------

USAGE="Usage: ./sc.sh [COMMAND]"

COMMANDS="
    Commands:\n
    genproto | gp [tag]\t Pulls and generates proto files from master or from an optional git tag\n
    help | h\t\t Display This Help Message\n
"

print_helper() {
  echo
  echo ${USAGE}
  echo
  echo -e ${COMMANDS}
}

# --- Options Processing -------------------------------------------
if [ $# == 0 ] ; then
    print_helper
    exit 1;
fi

# --- Vars ---------------------------------------------------------
PROTO_PATH='./proto'
GEN_PATH='./SensoryCloud/src/main/java'
PACKAGE_PATH='/ai/sensorycloud/api'
PROTO_REPO='git@gitlab.com:sensory-cloud/sdk/proto.git'
PROTO_BRANCH='master'

# --- Helper Functions ---------------------------------------------
gen_proto() {

  for x in $(find ./proto -iname "*.proto");
  do
    
    if [[ "$x" == *'validate.proto' ]]; then
      continue
    fi

    protoc \
      --proto_path="${PROTO_PATH}" \
      --java_out=lite:"${GEN_PATH}" \
      --grpc-java_out=lite:"${GEN_PATH}" \
      $x;

    echo "Generated grpc code for $x";
  done
}

# --- Body ---------------------------------------------------------
case "$1" in

  "genproto"|"gp")
    echo "Deleting old generated code"
    rm -rf "${GEN_PATH}${PACKAGE_PATH}"

    echo "Pulling raw proto files"
    if [[ $# -eq 2 ]]; then
      git clone -b $2 "${PROTO_REPO}"
    else
      git clone -b "${PROTO_BRANCH}" "${PROTO_REPO}" 
    fi
    
    echo "Generating Java code"
    gen_proto

    echo "Deleting raw proto files"
    rm -rf "${PROTO_PATH}"

    exit 0;
    ;;

  "help"|"h")
    print_helper
    exit 0;
    ;;

  *)
    print_helper
    exit 1;
    ;;

esac
