package oopstest;

public class oops2markand3mark {
//section A

	//1. Encapsulation
	class student{
		private String name;
		private int age;
		private int marks;
		// its means wrapping data & method into a single class and protecting data using private access modifier.
	}

	//2. inheritance
	class vehicle{
		void start() {
			System.out.println("vehical starts");
		}
	}

	class car extends vehicle{
		//inheritance allows a child class to reuse parent class properties and methods
	}


	//3. method overloading
	//using the same method name with different parameters.


	//4. method overriding
	//child class  provides its own implementation of the parent class method

	//5.Abstract
	//hide implementation details and shows only essential features. its uses abstract classes and interfaces


	//section B

	//6. overloading and overriding
	//=> overloading: same method name, different parameters, same class is enough, compile time polymorphism
	class calculator{
		int add(int a, int b) {
			return a+b;
		}
		int add(int a, int b, int c) {
			return a+b+c;
		}
	}
	//=> overriding: same method name, same parameters, parent to child class, runtime polymorphism
	class animal{
		void sound() {
			System.out.println("animal sound");
		}
	}
	class dog extends animal{
		@Override
		void sound() {
			System.out.println("dog sound");
		}
	}


	//7. Abstract class and interface
	//=> Abstract class: use abstract class, can have constructors, supports abstract and normal methods
	//=> interface: use interface, cannot have constructors, support abstract , default and static methods

	//8. Oops priciples
	//=> Encapsulation: protecting data using private variables.
	//=> inheritance: Resuing parent class properties.
	//=> polymorphism: one method with different behaviours.
	//=> Abstraction: hiding implementation details.

	//9. Can a private method of a parent class be overridden by a child class? Explain your answer with a small code example or reason.
	//NO.
	class parent{
		private void display() {
			System.out.println("parent");
		}

	}
	class child extends parent{
		private void display() {
			System.out.println("child");
		}
	}

	//private method cannot be overridden because it is accessible only within its own class.
	//the child method with the same name is a seperate method, not an overridden method.
}