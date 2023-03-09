#!/bin/bash
# ------------------------------------------------------------------
# [Author] Niles Hacking (nhacking@sensoryinc.com)
# [Title] Android cloud SDK helper script
# ------------------------------------------------------------------

USAGE="Usage: ./sc.sh [COMMAND]"

COMMANDS="
    Commands:\n
    genproto | gp [tag]\t Pulls and generates proto files from master or from an optional git tag\n
    release | rv [version]\t Releases and tags the SDK\n
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

release_version() {
  version=$1
  regex_version='^v[0-9]+\.[0-9]+\.[0-9]+$'

  if [[ ! ${version} =~ ${regex_version} ]]; then
    echo "Version string should be of the format v{Major}.{Minor}.{Trivial} ex: v1.2.3"
    exit 1
  fi

  # Check if version exists
  git fetch --tags
  if [ $(git tag -l "${version}") ]; then
    echo "Version ${version} already exists. Exiting."
    exit 1
  fi

  git add *
  git commit -am "Release [${version}]"
  git tag ${version}
  git push --atomic origin HEAD ${version}
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

  "release"|"rv")
    if [[ $# -ne 2 ]]; then
        echo "Please supply a version string in the format {Major}.{Minor}.{Trivial} ex: 1.2.3"
        exit 1;
    fi

    release_version $2
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
