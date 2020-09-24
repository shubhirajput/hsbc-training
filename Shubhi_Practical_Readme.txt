Problem description
We have to make a java application which generates a daily sales report, taking category as an input and report top 3 items based on quantity.


It implements three interfaces:-
ApparelDaoImpl
ElectronicsDaoImpl
FoodItemsDaoImpl.
All of these are being implemented by ProductDB which implements methods mentioned in all of these including Display() and findById().

It implements layered architecture:-
Data Access layer- function used ProductDB
Service layer- function used ProductService
View layer layer- function used MainApp.

Through Interaction layer(MainApp) object,we  calls service layer(ProductService) which in term access our DOW LAYER(ProductDB).

It has exception called ItemNotFound which extends Exception. This is called everytime Item required is not found.
In exceptions, the order of flow of exception is inverse of what happens in layered architecture i.e DOW Layer-> Service Layer-> Interaction Layer

It has three entity classes:-
Apparel which have products defined by itemName,itemCode,price.It has getter and setter methods , constructots, hash code and equals implementation.
FoodItems which have products defined by  itemName,itemCode,price.It has getter and setter methods , constructots, hash code and equals implementation.
Electronics which have products defined by  itemName,itemCode,price.It has getter and setter methods , constructots, hash code and equals implementation.