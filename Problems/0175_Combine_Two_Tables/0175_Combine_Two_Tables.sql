SELECT Person.FirstName, Person.LastName, Address.City, Address.State
FROM Person
Left JOIN Address
ON Address.PersonId = Person.PersonId