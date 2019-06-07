SET projectLocation=%cd%
CD %projectLocation%
javac -cp "%projectLocation%\lib\*"; Src/Demo.java
java -cp "Src";"%projectLocation%\lib\*"; Demo
