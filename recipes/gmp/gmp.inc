SECTION = "libs"
DESCRIPTION = "GNU multiprecision arithmetic library"
HOMEPAGE = "http://www.swox.com/gmp/"
LICENSE = "GPL LGPL"

SRC_URI = "${GNU_MIRROR}/gmp/gmp-${PV}.tar.bz2;name=gmp \
	   file://configure.patch \
	   file://amd64.patch"

inherit autotools 

ARM_INSTRUCTION_SET = "arm"

acpaths = ""

