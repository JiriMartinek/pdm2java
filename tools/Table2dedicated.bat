echo off

set INSIDE=NO
set FILENAME=undef.txt

for /f "delims=" %%A in (%WORKDIR%\TableCodeName.txt) do call :oneTableline "%%A"
for /f "delims=" %%A in (%WORKDIR%\ViewCodeName.txt) do call :oneViewline "%%A"
echo on

goto :eof

:oneTableline
set LINE=%1
if "%LINE:~1,9%"=="</o:View>" (
  set INSIDE=NO
  goto :eof
)

if "%LINE:~1,10%"=="</o:Table>" (
  set INSIDE=NO
  goto :eof
)

if "%INSIDE%"=="YES" (
  echo %1>>%WORKDIR%\%FILENAME%.txt
  goto :eof
)

if "%LINE:~1,11%" == "<o:View Id=" (
  set INSIDE=YES
  set FILENAME="ViewID%LINE:~13,-3%"
  echo #### %FILENAME%>>%WORKDIR%\TableCodeName2.txt
  goto :eof
)

if "%LINE:~1,12%" == "<o:Table Id=" (
  set INSIDE=YES
  set FILENAME="TableID%LINE:~14,-3%"
  echo #### %FILENAME%>>%WORKDIR%\TableCodeName2.txt
  goto :eof
)

goto :eof

:oneViewline
set LINE=%1

if "%LINE:~1,9%"=="</o:View>" (
  set INSIDE=NO
  goto :eof
)

if "%INSIDE%"=="YES" (
  echo %1>>%WORKDIR%\%FILENAME%.txt
  goto :eof
)

if "%LINE:~1,11%" == "<o:View Id=" (
  set INSIDE=YES
  set FILENAME="ViewID%LINE:~13,-3%"
  echo #### %FILENAME%>>%WORKDIR%\TableCodeName2.txt
)

goto :eof

