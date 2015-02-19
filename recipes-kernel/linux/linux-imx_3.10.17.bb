# Copyright (C) 2014 Gateworks Corporation
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

PR = "11"

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(ventana)"

# override URI of source and PR for Gateworks linux-imx kernel
SRCREV = "d42a4fc8cc664898d4dafd91e7113569b49b64e8"
LOCALVERSION = "-1.0.0_ga+yocto"
SRC_URI = "git://github.com/imthatoneguy/linux-imx6.git;protocol=git;branch=gateworks_3.10.17_1.0.0_ga file://defconfig"
