# ASSESSMENT


This is mvc demo venture which gives yes/no reaction if a route availability (input.txt) exists between two urban areas. 

The end point is as follows http://localhost:8085/connected?origin=xxxx&destination=yyyy where 'xxxx' is the inception city and 'yyyy' is the goal city 

endpoint example : http://localhost:8085/connected?origin=Boston&destination=New York 

The above url responds with yes/no. The "yes" reaction affirms the route between the urban communities and "no" affirms no network. The inclusion can be extended by altering the "input.txt" under assets by including the connectivity between more urban areas. 

The program peruses the input.txt record and parses it to build up the route database. For each GET demand, the projects removes the solicitation boundaries "origin" and "destination" utilizing "RequestParam" explanation and does the query on the route database and reacts back "yes" if the route exists between them in any case reacts with "no". 

A couple of unit tests additionally exists utilizing mockmvc for positive tests and negative tests 

Swagger documentation can be found at this endpoint: http://localhost:8085/swagger-ui.html 

The route controller connection will show the GET end point and boundary types.
