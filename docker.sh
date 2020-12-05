#!/bin/bash -
#===============================================================================
#
#          FILE: docker.sh
#
#         USAGE: ./docker.sh
#
#   DESCRIPTION: Wrapper for command to ssh into docker container
#
#===============================================================================

set -o nounset                                  # Treat unset variables as an error

docker exec -it first-java-webapp_webapp_1 /bin/bash