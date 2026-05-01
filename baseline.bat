@echo off
REM Setup Java 20 and run baseline tests
setlocal enabledelayedexpansion

echo Setting JAVA_HOME to Java 20...
set JAVA_HOME=C:\Program Files\Java\jdk-20

echo Compiling with Java 20 baseline...
cd /d "C:\Users\Gabriel Sales David\Documents\Estudos\Cursos\Tecnologia\Dio.me\BootCamp\Java\Bradesco\DioMe-Bradesco"
call mvn clean test-compile -DskipTests -q
if %ERRORLEVEL% EQU 0 (
  echo Baseline compilation: SUCCESS
) else (
  echo Baseline compilation: FAILED
)

echo Running tests with Java 20 baseline...
call mvn test -q
if %ERRORLEVEL% EQU 0 (
  echo Baseline tests: SUCCESS
) else (
  echo Baseline tests: SOME FAILURES (see above for details)
)
