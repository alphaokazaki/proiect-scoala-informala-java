# proiect-scoala-informala-java

This application was made to work with QR codes, each seat at each table at the restaurant is supposed to have a specific QR code, that would be scanned by the customer (user) and would be redirected to web page linked to the seat.
For using the web app, after starting the program, you either use QR codes or manual link input : 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
http://localhost:8080/?tableId=1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

?tableId=    #can be changed for each table and it uses different sessions, so you can simultanely go on table 3 and 6, and they will have their own orders, without interfering with one another. 
