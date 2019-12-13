set projectLocation="C:\Users\JAGADESHAN R\Downloads\Eit_track"
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java -cp %classpath% org.testng.TestNG %projectLocation%\testng.xml
pause