require xorg-driver-video.inc
DEPENDS += " xineramaproto xf86miscproto drm xf86driproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "06db625391c75c8be86c4dd5a5d713e6"
SRC_URI[archive.sha256sum] = "8923a08232255ceacf770ef767d86bbfb195dffa9559baa1b1de90f9c947a6d9"
