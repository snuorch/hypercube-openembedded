require xorg-lib-common.inc
DESCRIPTION = "X Input extension library."
DEPENDS += " xproto virtual/libx11 xextproto libxext inputproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "4a5207a29a6b220e5462129854689844"
SRC_URI[archive.sha256sum] = "7e6339539d3d0a4fc95cc23ca2b13ae67dd783e011b3cc5ca76040e376bff57f"

XORG_PN = "libXi"
