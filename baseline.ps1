$env:JAVA_HOME = "C:\Program Files\Java\jdk-20"
$env:Path = $env:JAVA_HOME + "\bin;" + $env:Path

cd "C:\Users\Gabriel Sales David\Documents\Estudos\Cursos\Tecnologia\Dio.me\BootCamp\Java\Bradesco\DioMe-Bradesco"

Write-Host "Java version:"
java -version

Write-Host "`nCompiling with Maven..."
mvn clean test-compile -DskipTests -q 2>&1 | Select-Object -First 50

if ($LASTEXITCODE -eq 0) {
    Write-Host "`nBaseline compilation: SUCCESS"
    Write-Host "`nRunning tests..."
    mvn test -q 2>&1 | Select-Object -Last 20
} else {
    Write-Host "`nBaseline compilation: FAILED (exit code: $LASTEXITCODE)"
}
