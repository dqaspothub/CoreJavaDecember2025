package com.java.learning.controlFlow;

public class SwitchExample {

	public static void main(String[] args) {

/*
		switch (expression) {
			case value1:
				// Code block for value1
				break; // Exits the switch
			case value2:
			case value3:
				// Code block for value2 and value3 (fall-through for value2 is intentional here)
				break;
			default:
				// Code block if no case matches (optional)
				break; // Not strictly necessary if default is last
		}
*/

		int day = 16;

		switch (day) {
		    case 1:
		        System.out.println("Monday");
				break;
		    case 2:
		        System.out.println("Tuesday");
				break;
			default:
		        System.out.println("Another day");
		}

		String result = "FAIL";

		switch (result) {

			case "PASS":
				System.out.println("Your mark is greater than 35");
				break;
			case "FAIL":
				System.out.println("Your mark is less than 35");
				break;
			default:
				System.out.println("Enter PASS or FAIL");
		}

	}

}

