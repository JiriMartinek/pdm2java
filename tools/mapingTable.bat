@echo off
rem show all used datatypes in the given data model file
rem @param1 DataModel.pdm file

rem prepare empty working directory
set WORKDIR=%TEMP%\DataModel2Java

set NAME=
set CODE=

for /r %WORKDIR% %%I in (TableID*.txt) do call :onefile "%%I"
goto :eof

:onefile
for /f "tokens=2,3 delims=<>" %%A in ('findstr "Name Code" %1') do call :oneline %%A "%%B"
goto :eof

:oneline
rem echo %1 - %2

if #%1# equ #a:Name# (
  set NAME=%2
  goto :eof
)
if #%1# neq #a:Code# (
  goto :eof
)

rem remove quotes
set NAME=%NAME:"=%
echo %~2, %NAME%
set NAME=
set CODE=

goto :eof
