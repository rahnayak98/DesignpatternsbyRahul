# Design patterns by Rahul

# Singleton design pattern

* Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
* The singleton class must provide a global access point to get the instance of the class.
* Singleton pattern is used for logging, drivers objects, caching, and thread pool.

## Code Logic ##

* Create a Car class or the which is basically your driver class. This class is the class that we want to create singleton of. Which means that we are allowing users to have only 1 instance of the car class to be used.
* In this car class we do only 2 steps to make the class a singleton, First we make the constructor a private constructor. Second we create a method called getinstance  which is static so that this intance is created in that car class only once. 
* Do check out the code to get a better clarity
