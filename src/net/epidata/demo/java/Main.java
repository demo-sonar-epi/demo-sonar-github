package net.epidata.demo.java;

public class Main {

	public static void main(String[] args) {

		System.out.print("hola");

		int target = -5;
		int num = 3;

		target =- num;  // Noncompliant: target = -3. Is that the intended behavior?
		target =+ num; // Noncompliant: target = 3

		
	}

}
