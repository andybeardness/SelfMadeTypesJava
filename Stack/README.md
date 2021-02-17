# Stack

[>> TO ROOT <<](https://github.com/andybeardness/SelfMadeTypesJava)

----

### Basic Stack algorythm:

![stack img](https://cdn.programiz.com/sites/tutorial2program/files/stack.png)

_image by https://www.programiz.com/dsa/stack_


----

## Files

- [RunStack.java](https://github.com/andybeardness/SelfMadeTypesJava/blob/main/Stack/RunStack.java) -- Main class to run stack tests
- [SelfStack.java](https://github.com/andybeardness/SelfMadeTypesJava/blob/main/Stack/SelfStack.java) -- Self-made Stack 
- [SelfStackInterface.java](https://github.com/andybeardness/SelfMadeTypesJava/blob/main/Stack/SelfStackInterface.java) -- Interface for self-made Stack 

----

## Logic

At start you have two ways to create an object:
- Default -- make Stack with size 1
```java
        SelfStack<String> strStack = new SelfStack<>();
```
- Custum sized -- make Stack with custom size
```java
        int size = 10;
        SelfStack<String> strStack = new SelfStack<>(size);
```

#### Methods

- push -- Push object to Stack
```java
        strStack.push(new String("A1")); // void
```
- pop -- Take last object and remove from Stack
```java
        strStack.pop(); // return "A1"
```
- toString -- String value of Stack
```java
        strStack.toString();
        // SelfStack{size=10, stack=[A1, null, null, null, null, null, null, null, null, null], current=1}
```

----

## Features

- When Stack is empty -- .pop return Null
- When Stack is full -- .push rewrite last element