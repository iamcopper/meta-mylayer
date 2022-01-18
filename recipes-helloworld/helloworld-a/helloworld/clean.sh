#!/bin/bash

make distclean

rm -f aclocal.m4 compile configure depcomp missing config.h.in install-sh Makefile.in
rm -rf autom4te.cache
rm -f src/Makefile.in
