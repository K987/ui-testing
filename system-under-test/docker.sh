#!/bin/bash

build() {
  npm run build --scripts-prepend-node-path=auto
  docker build --tag system-under-test .
}

run() {
  docker run --rm -p 8080:80 system-under-test
}

"$@"
