SUMMARY = "Betacentauris couch flashing"
MAINTAINER = "Betacentauri"
HOMEPAGE = "https://github.com/oe-alliance/ofgwrite"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3 \
                    file://include/common.h;beginline=1;endline=17;md5=ba05b07912a44ea2bf81ce409380049c"

inherit gitpkgv
SRCREV = "${AUTOREV}"
PKGV = "4.x+git${GITPKGV}"
PV = "4.x+git${SRCPV}"

SRC_URI = "git://github.com/oe-alliance/ofgwrite.git \
    file://fix_glibc_major.patch \
"

S = "${WORKDIR}/git"
EXTRA_OEMAKE=""

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/ofgwrite ${D}${bindir}
    install -m 755 ${S}/ofgwrite_bin ${D}${bindir}
    install -m 755 ${S}/ofgwrite_test ${D}${bindir}
}
