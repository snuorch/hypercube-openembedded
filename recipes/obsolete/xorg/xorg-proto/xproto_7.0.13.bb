require xorg-proto-common.inc
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "7d26f45dca52632712a696e0631dc17b"
SRC_URI[archive.sha256sum] = "6f6328922d69f5de29513a5baf1d010db2a7a54cb58a7a6cbbb1b25097ecd592"

BBCLASSEXTEND = "native nativesdk sdk"
