@echo off
cd /d "%~dp0"

echo Academic Stress Management System
echo.
echo Enter your MySQL password:
powershell -NoProfile -Command "$p = Read-Host 'MySQL Password' -AsSecureString; $b = [Runtime.InteropServices.Marshal]::SecureStringToBSTR($p); try { $env:MYSQL_PASSWORD = [Runtime.InteropServices.Marshal]::PtrToStringBSTR($b); java -cp '.;lib/*' Main } finally { [Runtime.InteropServices.Marshal]::ZeroFreeBSTR($b) }"

pause