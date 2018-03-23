#!/bin/bash

./install_jar.sh

docker build -f Dockerfile -t rest-calculator .


