public class Main {
	
	public static void main(String[] args) {
		
		/*************************
		 * Hello World statement *
		 *************************/
		
		// System.out.println("Hello World");
		
		
		
		/****************************
		 * Variables and data types *
		 ****************************/
		
		// byte b = 127;
		
		// short s = 32767;
		
		// int i; // Declaration  Note: you cannot declare multiple variables of the same name
		// i = 30000000; // Initialization
		
		// long l = 233333333L; // Add the L at the back by convention
		
		
		// float f = 3.14f; // Add the f at the back to specify that it is a float
		// 				 // instead of a double
		// double pi = 3.14;
		
		// char c = 'A';
		
		// boolean bool = true;
		
		
		
		/***********
		 * Strings *
		 ***********/
		
		// // String comparison
		// String s1 = "Hello World!";
		// String s2 = "Hello World!";
		// String s3 = new String("Hello World!");
		// System.out.println(s1 == s2);      // True
		// System.out.println(s1.equals(s2)); // True
		// System.out.println(s1 == s3);      // False
		// System.out.println(s1.equals(s3)); // True
		
		// // String vs char
		// System.out.println("H" + "I"); // Prints: HI
		// System.out.println('H' + 'I'); // Prints: 145



		/*************
		 * Operators *
		 *************/

		// // Arithmetic operators
		// int x;
		// x = 1 + 1;   // 2
		// x = x - 1;   // 1
		// x = x * 4;   // 4
		// x = 99 / 10; // 9  Note: integer division truncates all decimals
		// x = 22 % 7;  // 1
		// x++;         // 2

		// int i = 3;
		// int j = i++;    // i = 4, j = 3
		
		// i = 3;
		// j = ++i;        // i = 4, j = 4

		// // Assignment operators
		// x += 1;      // 3
		// x *= 3;      // 9
		// x = 9;       // 9
		
		// // Bitwise operators (extra knowledge)
		// x = x | 16;  // 25
		// x = x & 16;  // 16
		// x = ~3;      // -4
		// x = 16
		// x = x ^ 19;  // 3
		// x = x >> 1;  // 1
		// x = x << 2;  // 4
		
		// // Comparison operators
		// boolean y = true;
		// y = (y == true); // true
		// y = (y != true); // false
		// y = (3 > 5);     // false
		// y = (3 < 5);     // true
		// y = (2 >= 4);    // false
		// y = (x <= 5);    // true

		// // Logical operators
		// y = (true) && (x == 3); // true  Note: x == 3 is actually not evaluated
		//                         //             due to short circuit property
		// y = (false) || (true);  // true 
		// y = !false;             // true
		
		// // Short cirtuit property and exercise
		// int n = 5;
		// y = (true) || (++n == 6);  // n = 5
		// y = (true) |  (++n == 6);  // n = 6
		
		// n = 5;
		// y = (false) && (++n == 6); // n = 5
		// y = (false) &  (++n == 6); // n = 6

		// n = 5;
		// y = (false) || (++n == 6); // n = 6  Note: short circuit not triggered because
		//                            //              second argument has to be evaluated
		
		

		/**************************
		 * Conditional statements *
		 **************************/

		// if (true) {
		// 	System.out.println("Hi!");
		// }

		// if (false) {
		// 	System.out.println("This will not be printed!");
		// } else {
		// 	System.out.println("But this will work!");
		// }

		// if (false) {
		// 	System.out.println(1);
		// } else if (false) {
		// 	System.out.println(2);
		// } else if (true) {
		// 	System.out.println(3);
		// } else {
		// 	System.out.println(4);
		// }

		// int x = 4; // Experiment with other initial values of x
		// // int x = 2;
		// // int x = 5;
		// // int x = 2000; // Also try taking away the default case
		// switch(x) {
		// 	case 2:
		// 		System.out.println("Case 2");
		// 	case 3:
		// 		System.out.println("Case 3");
		// 	case 4:
		// 		System.out.println("Case 4");
		// 		break; // Without breaks, switch statements will fall through
		// 	case 5:
		// 		System.out.println("Case 5");
		// 	case 1:
		// 		System.out.println("Case 1");
		// 	default:
		// 		System.out.println("Default case"); 
		// }



		/*********
		 * Loops *
		 *********/
		
		// // For loops
		// for (int i = 0; i < 3; i++) {
		// 	System.out.println("Hi");
		// }

		// // While loops
		// int i = 0;
		// while (i < 3) {
		// 	System.out.println("Bye");
		// 	i++;
		// }

		// // Do-while loops
		// i = 0;
		// do {
		// 	System.out.println("Yay");
		// 	i++;
		// } while (i < 3);
		
		

		/*******************
		 * Break, Continue * (Advanced)
		 *******************/
		
		// for (int i = 0; i < 10; i++) {
		// 	if (i == 7) {
		// 		break;
		// 	}
		// 	if (i == 5) {
		// 		System.out.println("This will continue from next number");
		// 		continue;
		// 	}
		// 	System.out.println(i);
		// }
		// System.out.println("\n\n");

		// int i = 0;
		// int round = 1;
		// while (round <= 10) {
		// 	System.out.printf("Round %d:\ni = %d\n", round, i);
		// 	round++;
		// 	if (i == 5) {
		// 		System.out.println("This will continue from current number");
		// 		continue;
		// 	}
		// 	i++;
		// }



		// ==============================================================================
		// TIME FOR EX1
		// ==============================================================================



		/**********
		 * Arrays *
		 **********/

		// String[] names = new String[] {"Alice", "Bob", "Charlie"};
		// for (String name : names) {
		// 	System.out.println(name);
		// }

		// int[] integers = new int[10];
		// for (int i = 0; i < 3; i++) {
		// 	integers[i] = 100;
		// }
		// for (int i = 0; i < 5; i++) { // Numbers default to 0
		// 	System.out.println(integers[i]);
		// }

		// String[] blanks = new String[3];
		// for (int i = 0; i < 3; i++) { // Objects default to null
		// 	System.out.println(blanks[i]);
		// }

		// boolean[] bools = new boolean[3]; // Booleans default to false
		// System.out.println(bools[0]);



		/********************
		 * Nested for-loops * (Advanced)
		 ********************/
		
		// for (int i = 1; i <= 3; i++) {
		// 	for (int j = 1; j <= 2; j++) {
		// 		System.out.println(String.format("i = %d, j = %d", i, j));
		// 	}
		// }
		
		
		
		 /************
		 * Matrices * (Advanced)
		 ************/

		// int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
		// int[][] matrix2 = new int[2][3];
		// for (int i = 0; i < 2; i++) {
		// 	for (int j = 0; j < 3; j++) {
		// 		System.out.printf("%d\n", matrix1[i][j]);
		// 	}
		// }

	}
	
}