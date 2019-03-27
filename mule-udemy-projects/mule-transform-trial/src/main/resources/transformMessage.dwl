%dw 1.0
%output application/json
---
{
	"firstName": "Sanjay",
	"lastName" : "Bharatiya",
	"city"     : flowVars.city,
	"country"  : sessionVars.country
}