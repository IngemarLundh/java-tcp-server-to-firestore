Java Server for Connection to Firestore, (Soldified Version) v1.0
==================================

 - Ingemar Lundh 
 - Lavdim Imeri 
 - Robert Alm

Our project is based on the following initial project:
https://github.com/Exarchias/Gradle-Java-to-Firestore


To use this project you need to aquire a json private key from your Firebase project

In the server project there is a folder called theKey. There is the place to paste your private key called key.json (Iplease name it so)

The 2 projects are ready to run, you just unzipping the folder somewhere, (the server needs the key.json though), and you run the 2 projects

The server project "gradledServer" is not to be tempted with. better leave it as it is and do your job with the client. Except if you developing the server, then it is another story.

The client "genericJavaClient" is the one that you can play with, BUT the classes "EchoClient" and "FireStoreQueries" are NOT to be edited, (instead of editing them, make methods that are using them). The configurations' class "Configurations" can be slightly modified if it is necessary. The rest of the client project is just for your convenience. You can take the 3 mandatory classes and throw them in whatever project you are working with and they will work. It will be wise though to study the content of the Main class in order to understand how the system works.

This version, (at least its interface), is the 99% of how it will look in the future, and disruptive changes to the interface that may affect your code are not expected. Additional features will be added though, (like the live-data feature that comes in the future), that you may wish to use for your advantage, and of course they will be improvements to communication between server and client instance that will not affect your code, but you will need to have latest version at all the times for compatibility issues, (our newest versions are usually published every Monday).
EXPECTED CHANGE: In order to create an element inside a document inside a collection, is unfortunally necessary to create a collection with its first document first. This will changes in the future, but for now, unfortunately you will have to create a document, (and its collection), in order to create something in it.

For now use this one to play with to understand how it works.

**TROUBLESHOOTING**
1) Make sure that the internal clock of your computer works correctly. Otherwise it will throw you a permission error.

2) Run the server first and after the client.

3) Make sure, that you have the key.json in the folder theKey which is in the correct position inside the server.

4) On your java instance, if you wish to use it as a client for our server you just have to insert and use the classes that we provide. Nothing else is necessary, (no frameworks or external libraries), but please don't edit those 2 classes for any reason.

5) The server is to be used. apart of the folder with the key and the key itself, and of course the run and stop features of the project, nothing else is to be touched

6) OPEN the server project with the Intellij idea. DO NOT IMPORT IT. Importing it will create new dependencies that are not connected propely.

7) ingore the warnings in the build of the server. they are unavoidable and they don't play any role to the functionality of the server.


(Lavdim please delete this line)
