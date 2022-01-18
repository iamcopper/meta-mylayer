# helloworld application
SUMMARY = "helloworld of cmake recipe"
DESCRIPTION = "My hello world application"
LICENSE = "CLOSED"

# 重点：继承了cmake
inherit cmake

FILESEXTRAPATHS_prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld/"

S = "${WORKDIR}/helloworld"

#CFLAGS_append = "-Wall -O -g"

FILES_${PN} = "${bindir}/"
