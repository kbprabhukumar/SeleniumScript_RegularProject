SET projectLocation=D:\Devops\Workspace\SeleniumDemo
CD %projectLocation%
javac -cp "D:\Devops\Workspace\SeleniumDemo\lib\*"; Src/Demo.java
java -cp "Src";"D:\Devops\Workspace\SeleniumDemo\lib\*"; Demo
