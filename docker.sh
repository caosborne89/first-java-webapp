#!/bin/bash -
#===============================================================================
#
#          FILE: docker.sh
#
#         USAGE: ./docker.sh
#
#   DESCRIPTION: 
#
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 12/05/2020 08:14:56 AM
#      REVISION:  ---
#===============================================================================

set -o nounset                                  # Treat unset variables as an error

docker exec -it first-java-webapp_webapp_1 /bin/bash

# javac -cp /usr/local/tomcat/lib/servlet-api.jar classes src/Ch1Servlet.java