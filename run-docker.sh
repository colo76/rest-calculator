#!/bin/bash

echo "Running from docker, the image rest-calculator must exists"

docker run --rm -p 9090:9090  -t rest-calculator calc
