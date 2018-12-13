//Carolyn Yee
//11/02/2018
//String.split project 
	//working with arrays

import java.util.Arrays;
public class Split {
 public static void main(String[] args) {

// Your task Part 0

//String.split();

//It's a method that acts on a string, <StringName>.split(<String sp>);
	 //(toUppercase, toLowercase, equals, substring, length, indexOf, charAt)
	 

//Where sp is the string where the string splits

//And it returns an array

// Example: "I like apples!".split(" ");

// it will split at spaces and return an array of ["I","like","apples!"]
	 System.out.println(Arrays.toString("I like apples!".split(" ")));

// Example 2: "I really like really red apples".split("really")

// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
	 
	 System.out.println(Arrays.toString("I really like really red apples!".split("really")));

//play around with String.split!

//What happens if you "I reallyreally likeapples".split("really") ?
	 System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
	 System.out.println();
	 
//Your task Part 1:
	 System.out.println("Part 1: ");

//Write a method that take in a string like

// "applespineapplesbreadlettustomatobaconmayohambreadcheese"
		

//describing a sandwich.
	
	String s = "String: applespineapplesbreadlettustomatobaconmayohambreadcheese";
	System.out.println(s);

	
	
// Use String.split to split up the sandwich by the word "bread" and return what's in the middle of
	System.out.println("split by bread");
	System.out.println(Arrays.toString("applespineapplesbreadlettucetomatobaconmayohambreadcheese".split("bread")));
	System.out.println();
	
//the sandwich and ignores what's on the outside
	System.out.println("print the inside only");
	String[] sandwich = ("applespineapplesbreadlettucetomatobaconmayohambreadcheese".split("bread"));
	System.out.println(Arrays.toString(sandwich));
	System.out.println(sandwich[1]);
	System.out.println();

//What if it's a fancy sandwich with multiple pieces of bread?

	System.out.println("fancy sandwich");
	String sandwh = "apples pineapples bread lettuce tomato bacon mayo ham bread cheese";
	int start = sandwh.indexOf("bread");
	sandwh = sandwh.substring(start);
	System.out.println(sandwh);
	String[] sandwhi = sandwh.split("bread");
	System.out.println(Arrays.toString(sandwhi));
	

//Your task pt 2:
	System.out.println();
	 System.out.println("Part 2: ");

//Write a method that take in a string like

// "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"
	 System.out.println("String: apples pineapples bread lettuce tomato bacon mayo ham bread cheese");
// describing a sandwich

// use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of
	System.out.println("split at the spaces");
	String[] a = "apples pineapples bread lettuce tomato bacon mayo ham bread cheese".split(" ");
	System.out.println(Arrays.toString(a));
	

// the sandwich and ignores what's on the outside.
	System.out.println();
	System.out.println("print the inside only");
	for(int i = 3; i <= 7; i++) {
		System.out.print(a[i]);
	}
	System.out.println();
	
// Again, what if it's a fancy sandwich with multiple pieces of bread?
	System.out.println();
	System.out.println("fancy sandwich");
	String sandwhic = "apples pineapples bread lettuce tomato bacon mayo ham bread cheese";
	int start2 = sandwhic.indexOf("bread");
	sandwhic = sandwhic.substring(start2);
	System.out.println(sandwhic);
	String[] sandwhich = sandwh.split("bread");
	System.out.println(Arrays.toString(sandwhich));
	

	 }

}





