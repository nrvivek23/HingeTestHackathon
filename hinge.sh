#!/bin/sh

#  hinge.sh
#  
#
#  Created by Vivek Nyayapathi on 4/2/15.
#

#########################################################################
#############CHECK DEVICE API LEVEL######################################


echo "Make sure your device is connected"


############################################################################################

echo $pwd

cd ${ANDROID_HOME}

cd tools/

./android create uitest-project -n skSampleTest -t "android-21" -p ${MY_HOME}

cd ${MY_HOME}

ant build

echo "****************Remove old jars from SDcard****************"
echo "********************************"
adb shell rm -r /data/local/tmp/skSampleTest.jar
echo "****************pushed jar to sdcard****************"
echo "********************************"

adb push bin/skSampleTest.jar /data/local/tmp
echo "********************************"


CURRENT_DATE=`date +%m-%d-%Y_%HH-%MM`

adb shell uiautomator runtest skSampleTest.jar