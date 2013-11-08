#!/bin/bash
cd src/;
x=0
javac -d ../classes MainFrame.java || x=1
if [ $x -eq 0 ];then
	cd ../classes
	java -cp ../postgresql-9.3-1100.jdbc3.jar: MainFrame
fi 
cd ../;
