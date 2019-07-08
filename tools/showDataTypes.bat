rem show all used datatypes in the given data model file
rem @param1 DataModel.pdm file
@echo off
find "a:DataType" %1 | sort >%TEMP%\datatypes.txt

type nul>only_new.txt
for /f "tokens=* delims=" %%a in (%TEMP%\datatypes.txt) do (
  findstr /ixc:"%%a" %TEMP%\only_new.txt || >>%TEMP%\only_new.txt echo.%%a
)
notepad "%TEMP%\only_new.txt"
