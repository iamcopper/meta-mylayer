#!/bin/bash

make distclean

rm aclocal.m4 compile configure depcomp missing config.h.in install-sh Makefile.in
rm -r autom4te.cache
rm src/Makefile.in
