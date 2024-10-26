#include "Main.h"

JNIEXPORT jint JNICALL Java_Main_DoSthWithInt
        (JNIEnv *env, jobject obj, jint iVal) {
    return iVal + 3;
}
