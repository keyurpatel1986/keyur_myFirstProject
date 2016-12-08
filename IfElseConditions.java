package com.digitek.ifconditions;

public class IfElseConditions {

	public static void main(String[] args) {

//		ifElseExample();
		
		determineGrade();
		
//		processPayment();
	}
	
	public static void ifElseExample() {
		
		int value1 = 10;
		int value2 = 20;
		

		if (value1 == value2) {
			System.out.println("If condition#1");
			System.out.println("value1==value2");
		} 
		else {
			System.out.println("Else condition#1");
			System.out.println("value1 is equal to value2");
		}
		
		if (value1 != value2) {
			System.out.println("If condition#2");
			System.out.println("value1 != value2");
		} else {
			System.out.println("Else condition#2");
		}
		
		if (value1 > value2) {
			System.out.println("If condition#3");
			System.out.println("value1 > value2");
		} else {
			System.out.println("Else condition#2");
		}
		
		if (value1 <= value2) {
			System.out.println("If condition#4");
			System.out.println("value1 <= value2");
		} else {
			System.out.println("Else condition#2");
		}
		
		if (value1 >= value2) {
			System.out.println("If condition#5");
			System.out.println("value1 >= value2");
		} else {
			System.out.println("Else condition#2");
		}
		
	}

	public static void processPayment() {
		String customerPaymentMethod = null;
		if(customerPaymentMethod  == "Apple") {
			System.out.println("Process payment using ApplePay");
			// connect to Apple payment system
		} else {
			System.out.println("Process payment using Chase paymentech");
		}
	}
	
	public static void determineGrade() {
		
		int marks = 75;
		char grade;
		
		if(marks >= 90) {
			grade = 'A';
		} else if (marks >= 80) {
			grade = 'B';
		} else if (marks >= 70) {
			grade = 'C';
		} else if (marks >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("Grade is: " + grade);
		
	}
	

}
