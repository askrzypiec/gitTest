cmake_minimum_required(VERSION 3.27)
project(gitTest_JNI)

set(CMAKE_CXX_STANDARD 20)

set(JAVA_HOME "C:\\Program Files\\Java\\jdk-21")
include_directories(${JAVA_HOME}/include)
include_directories(${JAVA_HOME}/include/win32)


add_library(gitTest_JNI SHARED library.cpp)
