require xorg-lib-common.inc
DESCRIPTION = "X cursor management library"
LICENSE = "BSD-X"
DEPENDS += "libxrender libxfixes"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "ec2acd10a7736a85dd1e1ed9ea5bec96"
SRC_URI[archive.sha256sum] = "8f039f81af52c88d583fba48b878abd074542221cb0030638ad52336b4ae1377"

BBCLASSEXTEND = "native"

XORG_PN = "libXcursor"
