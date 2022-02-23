#!/bin/bash
# ------------------------------------------------------------------
# [Author] Niles Hacking (nhacking@sensoryinc.com)
# [Title] Android cloud SDK helper script
# ------------------------------------------------------------------

USAGE="Usage: ./sc.sh [COMMAND]"

COMMANDS="
    Commands:\n
    genproto | gp\t\t Generate Proto Files\n
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

# --- Helper Functions ---------------------------------------------
gen_proto() {

  mkdir -p "Sources/SensoryCloud/Generated"
  for x in $(find ./proto -iname "*.proto");
  do
    
    if [[ "$x" == *'validate.proto' ]]; then
      continue
    fi

    protoc \
      --proto_path="./proto" \
      --swift_opt="Visibility=Public" \
      --swift_out="./Sources/SensoryCloud/Generated" \
      --grpc-swift_opt="Visibility=Public" \
      --grpc-swift_out="Client=true,TestClient=true,Server=false:./Sources/SensoryCloud/Generated" \
      $x;

    echo "Generated grpc code for $x";
  done
}

# --- Body ---------------------------------------------------------
case "$1" in

  "genproto"|"gp")
    gen_proto
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
