# Jungle Beat

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)  
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Coverage](#coverage)  
- [Authors](#authors)  

## Introduction

JungleBeat is a Module 1 project from the Turing School of Software and Design.  This project is meant for Ruby, but I have written in it Java.  

The overall intent of the project is to create a linked list.  The list contains a series of words, which the program sends to the operating system to be played.

There are seven iterations, with an extra one provided for extensions.

The first iteration creates a simple node class.  This class has two attributes: data, and next_node.  

The second iteration creates a linked list class.  This class performs most of the work for this program.  In this iteration, the class is created.  A head node variable is provided, which is initially empty.  Three list methods are created in this iteration.  The first is `append()`.  This method takes a string as a parameter.  The method creates a new node (with the supplied string data) and applies it to the end of the list.  The second method is `count()`, which returns the number of nodes in the list.  The third method is `to_string()`, which returns a string of the data elements in the entire list, from head to tail.  Initially `count()` was an instance variable, but further review of the requirements showed that this is supposed to be a method, so the code was changed accordingly.

Iteration 2 (the third in the list) uses the same methods as the previous iteration, but this time the methods are adjusted so that multiple nodes can be added.

Iteration 3 adds two new methods.  `prepend()` takes a string parameter, and creates a new head node.  The original head node becomes the second on in the list.  `insert()` takes an integer and a string parameter.  The integer tells the method at which node to insert the data, and the string tells the method what data to insert.  The remaining part of the list is moved down one place from the insertion.

In iteration 4 there are three new methods.  The first one is `find()`, which takes two integer parameters.  The first integer tells the method at which node to start looking, and the second integer indicates how many nodes to return.  The `includes()` method takes a string parameter.  The method searches through the linked list, returing a boolean to indicate if the string parameter is present in the data of the list.  The third method is `pop()`, which removes the last node from the list.

Iteration 5 creates a new class - JungleBeat.  This is a wrapper class for LinkedList.  The JungleBeat constructor creates a new LinkedList object.  There is also an `append()`, which differs from the LinkedList `append()`.  The JungleBeat method is used as a string separator, so that only word at a time is appended.  

In iteration 6, the program is ran to play the words stored in the linked list.  Since none of the classes have a main method, a Runner class was created.  The main method creates a JungleBeat instance, gives it data to populate the list, and then runs the `play()` method to play the sounds.

The last part of the requirements is the extensions.  There are two parts to the extensions.  The first part adds a validation of the data that is supplied for creating the nodes.  A list of approved words is created in the LinkedList object.  The data words that are provided to the program must be in the approved list, or they will not be included.  The `onApprovedList()` returns a boolean to indicate if the word is in the list or not.  The second part of the extensions is to control the speed and voice of playback.  Only the default voice would work, and any other options would not play.  However, the rate of playback did work as expected.  The JungleBeat `getRate()` method prompts the user for an input speed, which is then passed to the `play()` method.  The user can also select the default rate.

## Installation

Clone the repo to your local machine.  Navigate to the files in JungleBeat/src/main.  For each file, perform the following:  
`javac -d . filename.java`

## Getting Started   

To run the program, at the command line type:  
`java -cp . main.Runner`

## Further Improvements

The code is built using iteration.  It would be good to try the code using recursion.  

There are some rather large methods in the LinkedList class that could probably be refactored into several smaller methods.  

The code should be examined for methods that could be made private instead of public.

## Built With

OpenJDK 16.0.1

JUnit 5  

Eclipse 2020-06

## Coverage

94.6%

## Authors

[Earl Stephens](https://github.com/earl-stephens)