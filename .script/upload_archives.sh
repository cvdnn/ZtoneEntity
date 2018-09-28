#!/usr/bin/env bash

_PROJECT_PATH='/workon/m2/mvn-repo'

#git status
#git add ./
#git commit -m "ZTONE_LANG"
#git push origin master

if (( $# == 0 )) || [[ -z $1 ]]; then
    ./gradlew -q -p ztone-entity clean build install bintrayUpload

else
    _MODULE_NAME=$1

    ./gradlew -q -p ${_MODULE_NAME} clean build install bintrayUpload
fi
