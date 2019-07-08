rem @echo off
rem convert Data Model to Java classes
rem @param DataModel.pdm (for example "LBP_WA - database model- 2019-05-07.pdm")

set PDM=%1

if not defined JAVAHOME (
  set JAVAHOME=C:\Program Files\Java\jdk1.8.0_211
)

rem switch to the directory where this script is located
pushd "%~dp0"

rem prepare empty working directory
set WORKDIR=%TEMP%\DataModel2Java
rmdir /S /Q %WORKDIR%
mkdir %WORKDIR%

rem reduce PDM to about 5% to speedup processing
findstr /C:"a:Name" /C:"a:Code" /C:"<o:Table Id" /C:"</o:Table>" /C:"<a:DataType>" /C:"<o:Column Id" /C:"<o:Column Ref" %PDM% >%WORKDIR%/TableCodeName.txt
findstr /C:"a:Name" /C:"a:Code" /C:"<o:View Id" /C:"</o:View>" /C:"<a:DataType>" /C:"<o:Column Id" /C:"<o:Column Ref" %PDM% >%WORKDIR%/ViewCodeName.txt

rem divide TableCodeName.txt to a dedicated table files
call Table2dedicated.bat

rem convert dedicated files to java files
"%JAVAHOME%\bin\javac" -d %WORKDIR% Table2Java.java
mkdir %WORKDIR%\model
for /r %WORKDIR% %%I in (TableID*.txt) do (
  java -classpath %WORKDIR% zlbpwa.tools.Table2Java %%I model
)
mkdir %WORKDIR%\view
for /r %WORKDIR% %%I in (ViewID*.txt) do (
  java -classpath %WORKDIR% zlbpwa.tools.Table2Java %%I view
)
xcopy /U /Y %WORKDIR%\model\*.java ..\src\zlbpwa\javatest\model\
xcopy /U /Y %WORKDIR%\view\*.java ..\src\zlbpwa\javatest\view\

popd
