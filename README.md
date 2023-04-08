# Design patterns by Rahul

# Singleton design pattern

* Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
* The singleton class must provide a global access point to get the instance of the class.
* Singleton pattern is used for logging, drivers objects, caching, and thread pool.

## Code Logic ##

* Create a Car class or the which is basically your driver class. This class is the class that we want to create singleton of. Which means that we are allowing users to have only 1 instance of the car class to be used.
* In this car class we do only 2 steps to make the class a singleton, First we make the constructor a private constructor. Second we create a method called getinstance  which is static so that this intance is created in that car class only once. 
* Do check out the code to get a better clarity
* In order to handle multi threading we used the Synchronised keyword to do so and make the object to volatile so that each thread will have access to the local copy.

![Screenshot 2023-04-07 at 5 42 44 PM](https://user-images.githubusercontent.com/22400467/230695928-ca62ad49-e141-4fa1-a123-7db8504c8da1.png)

# Strategy design pattern
* In order to understand what a Let us first deep dive into the basics first. IS-A relationship means inheritence wheras HAS-A relationship means composition.
* Now Let us try to understand why do we need the strategy pattern in the first place. Let us consider a Duck Super class which has 3 child classes namely Mountain duck,cloud duck and rubber duck.There may be a method named fly
