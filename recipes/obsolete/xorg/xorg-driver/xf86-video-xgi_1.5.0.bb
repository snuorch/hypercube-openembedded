require xorg-driver-video.inc
DEPENDS += " xineramaproto xf86miscproto drm xf86driproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "08529fd015191be9244f598aa0894aa6"
SRC_URI[archive.sha256sum] = "5fb23432ee8940c04494744da8b5f58bebc6ef113e96a50a74f0aa7d98a69194"
