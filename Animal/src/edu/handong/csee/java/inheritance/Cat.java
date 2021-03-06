package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal dog = new Cat();
        Animal.testClassMethod();
        dog.testClassMethod();
        myAnimal.testInstanceMethod();
        dog.testInstanceMethod();
    }
}

