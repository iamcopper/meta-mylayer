# helloworld application
SUMMARY = "helloworld of Autotools recipe"
DESCRIPTION = "My hello world application"
LICENSE = "CLOSED"

# 重点：继承了autotools
inherit autotools

FILESEXTRAPATHS_prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld/"

S = "${WORKDIR}/helloworld"

#CFLAGS_append = "-Wall -O -g"

FILES_${PN} = "${bindir}/"
