#!/bin/bash

echo ">>>[autoreconf]"
autoreconf --install

echo ">>>[configure]"
./configure

echo ">>>[make]"
make
