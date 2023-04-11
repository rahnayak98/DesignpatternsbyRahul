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
* Now Let us try to understand why do we need the strategy pattern in the first place. Let us consider a Duck Super class which has 3 child classes namely Mountain duck,cloud duck and rubber duck.There may be a method named fly which is implemented by the mountain duck in one way wheras it may be implemented by the rubber duck in another way.In that case do we have to create another class called fly behaviour1? and fly behaviour2? This will be an overhead and can cause problems.That is when strategy pattern comes into use. 
* In order to tackle the above situation we try to use a HAS-A relationship instead of a IS-A relationship more because if we create an interface and create abstract methods using this interface for separate flying behaviours then it will be much simpler to implement the fly behaiours.
* The Class diagram for this is as follows:
![Screenshot 2023-04-07 at 6 55 30 PM](https://user-images.githubusercontent.com/22400467/230698844-76a58d2a-8d7c-4eb8-a814-d50772b158e6.png)

# Observer pattern
* Let us first try to understand where observer pattern is used. There may be 2 classes 1 maybe a weather service which periodically changes its values wheras other services which constantly polls this weather service whenever there is a change.So the weather service can be called as an obervable wheras the other classes/service that observe this service are observers.
* The class diagram looks as follows
<img width="414" alt="Screenshot 2023-04-08 at 7 32 30 PM" src="https://user-images.githubusercontent.com/22400467/230751114-a290565e-7edc-4138-a733-da0c223b5a91.png">

# Decorator Pattern
* The decorator pattern is used to change the contents of a class at Run time instraed of at compile time. Meaning if you want to change the contents of a class we can do it run time instead of us actaully change the contents.
* Suppose you. want to make a Coffee app where the customers are allowed to make their own variety of Coffee beans in such a case combining various ingredients can be a little bit complex as in creating a class fora each of its combination will create a overhead by creating classes this is not vaible. This is when the decorator pattern comes into picture
* A much clearer class diagram is as below:
![Screenshot 2023-04-10 at 7 35 45 PM](https://user-images.githubusercontent.com/22400467/231041108-9b34cc9e-bbc6-48e1-ad22-f509191876a7.png)

