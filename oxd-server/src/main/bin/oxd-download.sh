#!/bin/sh

warName=oxd-server-2.4.4.sp2-distribution.zip
distDir=oxd-dist

# Clean up
rm -f $warName
rm -f -r $destDir

# Download and unzip
wget http://ox.gluu.org/maven/org/xdi/oxd-server/2.4.4.sp2/$warName
unzip $warName -d $distDir