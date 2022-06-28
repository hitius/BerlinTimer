# BerlinTimer Project

This is a Quarkus Framework project.

This is a simple API for BerlinClock Algorithm

Base API URL: http://localhost:8080/api/

	(GET) berlinClock: You can get BerlinClock formated data. If you want to get server time as BerlinClock formatted only call the service. 
		queryParam = time(HH:mm:ss, optional)
		
		Example 1:
			Request = http://localhost:8080/api/berlinClock
			
			Response = 
			     O
			   RRRR
			   OOOO
			YYRYYRYYRYO
			   YYOO
			
		Example 2:
			Request = http://localhost:8080/api/berlinClock?time=20:14:26
			
			Response = 
			     Y
			   RRRR
			   OOOO
			YYOOOOOOOOO
			   YYYY
			   
			   
	(GET) realBerlinClock: You can get time at Berlin :)
		
		Example 1: 
			Request = http://localhost:8080/api/realBerlinClock
			
			Response = 19:57:16.0524913+02:00