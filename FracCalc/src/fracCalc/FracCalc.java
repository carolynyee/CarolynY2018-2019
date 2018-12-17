  // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
package fracCalc;
//import static org.junit.Assert.assertArrayEquals;


import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner userinput = new Scanner(System.in);
    	System.out.print("Please input a fraction: ");
    	String input = userinput.nextLine();
    	
    	while(input != "quit") {
    		String output = produceAnswer(input);
    		System.out.println(output);
    		System.out.println("Please input a fraction: ");
    		input = userinput.nextLine();
    	}
}
  //toImproperFraction
  	//converts mixed number to improper fraction
  	public static String toImproperFrac(int whole, int numerator, int denominator) {
  		/*if (denominator == 0) {
  			return "ERROR: Cannot divide by zero.";
  		} */
  		
  		if (whole < 0) {
  			whole *= -1;
  			System.out.println("whole: " + whole);
  			numerator = (whole * denominator) + numerator;
  			System.out.println(numerator);
  			return (-(numerator) + "/" + denominator);
  		}
  		numerator = whole * denominator + numerator;
  		return (numerator + "/" + denominator);
  	}
  	
  //isDivisibleBy
  	//determines if integer is evenly divisible
  	public static boolean isDivisibleBy(int num1, int num2) {
  		if (num2 == 0) {
  			throw new IllegalArgumentException("Second number cannot be 0");
  		}
  		if (num1 % num2 == 0) {
  			return true;
  		} else {
  			return false;
  		}
  		
  	}
  //gcf
  	//finds greatest common factor of two integers
  	public static int gcf(int a, int b){
  	    int answer = 1;
  	    for (int i = 1; i <= Math.abs(a); i++) {
  	    	
  	    	if (isDivisibleBy(a, i) && (isDivisibleBy(b, i))){
  	    		answer = i;
  	    		
  	    	}
  	    }
  		return answer;
  	}


  	public static String produceAnswer(String input) {
        String[] space = (input.split(" "));
        System.out.println(Arrays.toString(space));
        
        String[] underscore = (space[0].split("_"));
        String[] underscore2 = (space[2].split("_"));
        String[] slash;
        String[] slash2;
        
        if(underscore.length == 2) { 
        	slash = (underscore[1].split("/"));
        } else {
        	slash = (underscore[0].split("/"));
        	System.out.println("slash: " + Arrays.toString(slash));
        	
        	//if length is 1, then it will be either a whole number or a fraction
        }
        //if (slash) {
    		//return "ERROR: Cannot divide by zero.";
    	//}
        if(underscore2.length == 2) { 
            slash2 = (underscore2[1].split("/"));
        } else { 
            slash2 = (underscore2[0].split("/"));
            //if length is 1, then it will be either a whole number or a fraction
        }
        
        
       // String underscore2[] = (space[2].split("_"));
        //String slash2[] = (underscore2[1].split("/"));
        
       
        
        System.out.println(Arrays.toString(underscore));
        System.out.println(Arrays.toString(underscore2));
        System.out.println(Arrays.toString(slash));
        System.out.println(Arrays.toString(slash2));
        
       int whole = 0;
       int num = 0;
       int denom = 0;
       int whole2 = 0;
       int num2 = 0;
       int denom2 = 0;
       
       //System.out.println(slash[0]);
      
       if (underscore.length == 2) {
       	whole = Integer.parseInt(underscore[0]);
       } else {
       	whole = 0;
       }
       if (slash.length == 2) {
       	num = Integer.parseInt(slash[0]);
       	denom = Integer.parseInt(slash[1]);
       } else {
       	num = 0;
       	denom = 1;
       }
       
      if(slash.length == 1) {
    	   whole = Integer.parseInt(underscore[0]);
       }
       String answer = ("whole:" + whole + " numerator:" + num + " denominator:" + denom);
       
       
       
     
       
      if (underscore2.length == 2) {
        	whole2 = Integer.parseInt(underscore2[0]);
       } else {
        	whole2 = 0;
       }
       if (slash2.length == 2) {
        	num2 = Integer.parseInt(slash2[0]);
        	denom2 = Integer.parseInt(slash2[1]);
       } else {
        	num2 = 0;
        	denom2 = 1;
       }
        
       
       if (slash2.length == 1) {
          	whole2 = Integer.parseInt(underscore2[0]);
         }
        String answer2 = ("whole:" + whole2 + " numerator:" + num2 + " denominator:" + denom2);
      //  subtraction(whole, num, denom);
        //subtraction(whole2, num2, denom2);
       
        
        
       System.out.println(whole + " " + num + " " + denom);
       System.out.println(whole2 + " " + num2 + " " + denom2);
       String[] first = (toImproperFrac(whole, num, denom).split("/"));
       
       System.out.println(Arrays.toString(first));
       String[] second = (toImproperFrac(whole2, num2, denom2).split("/"));
       System.out.println(Arrays.toString(second));
     
        if (space[1].equals("-")) {
        	return subtraction(makeNum(first, second));
        } else if (space[1].equals("+")) {
        	return addition(makeNum(first, second));
        }else if (space[1].equals("*")) {
        	return multiplication(makeNum(first, second));
        }else if (space[1].equals("/")) {
        	return division(makeNum(first, second));
      /*  }else if (denom == 0 || denom2 == 0) {
        	return "ERROR: Cannot divide by zero.";
        */
        }else {
        	return "ERROR: Input is an invalid format.";
        }
        
        
       // return answer + answer2; 
		
  	}
    public static int[] makeNum(String[] first, String[] second) {
    	int[] convertInt = new int[4]; 
    	convertInt[0] = Integer.parseInt(first[0]);
        convertInt[1] = Integer.parseInt(first[1]);
        convertInt[2] = Integer.parseInt(second[0]);
        convertInt[3] = Integer.parseInt(second[1]);
        System.out.println(Arrays.toString(convertInt));
       
        return convertInt;
  	 }
   
    
 public static String subtraction(int[] convertInt) {
	 int num;
	 int denom;
	/* if(convertInt[3] == convertInt[1]) {
		 num = convertInt[0] - convertInt[2];
		 denom = convertInt[3];
	 } else {
		 denom = convertInt[3]*convertInt[1];
		 num = (convertInt[0] * convertInt[3]) - (convertInt[2] * convertInt[1]);
	 }*/
	 denom = convertInt[3]*convertInt[1];
	 num = (convertInt[0] * convertInt[3]) - (convertInt[2] * convertInt[1]);
	 String answer = num + "/" + denom;
	 answer = finalAnswer(num, denom);
	 return answer;
 	}
 
public static String addition(int[] convertInt) {
	 int num;
	 int denom;
	/* if(convertInt[3] == convertInt[1]) {
		 num = convertInt[0] + convertInt[2];
		 denom = convertInt[3];
	 } else {
		 denom = convertInt[3]*convertInt[1];
		 num = (convertInt[0] * convertInt[3]) + (convertInt[2] * convertInt[1]);
	 }*/
	 denom = convertInt[3]*convertInt[1];
	 num = (convertInt[0] * convertInt[3]) + (convertInt[2] * convertInt[1]);
	 String answer = num + "/" + denom;
	 answer = finalAnswer(num, denom);
	 return answer;
	}
public static String multiplication(int[] convertInt) {
	int denom = convertInt[3]*convertInt[1];
	int num = convertInt[0] * convertInt[2];
	String answer = num + "/" + denom;
	answer = finalAnswer(num, denom);
	if(convertInt[0] == 0 || convertInt[2] == 0 ) {
		return answer = "0";
	 }
	 return answer;
	}
public static String division(int[] convertInt) {
	int denom = convertInt[1]*convertInt[2];
	int num = convertInt[0] * convertInt[3];
	String answer = num + "/" + denom;
	answer = finalAnswer(num, denom);
		if (convertInt[0] == 0 || convertInt[2] == 0 ) {
			return answer = "0";
		}
	return answer;
	}






	//finalAnswer
	//reduce and change to mixed number
public static String finalAnswer(int num, int denom) {
	

	int gcf = gcf(num, denom);
	System.out.println("gcf: " + gcf);
	num = num / gcf;
	denom = denom / gcf;
	System.out.println("num + denom: " + num + " " + denom);
		String answer = (num / denom + "_" + num  % denom + "/" + denom);
	/*int num2 = num % denom;
	System.out.println("num2 + denom: " + num2 + "" + denom);
	gcf = gcf(num2, denom);
	System.out.println("gcf2: " + gcf);
	num2 = num / gcf;
	
	if(num < 0 && denom < 0) {
		num *= -1;
		denom *= -1;
		return (-num / denom) + "_" + num % denom + "/" + denom;
	}
	*/
	
	
	
	
		if (num == 0) {
		return "0";
	}
	if (num/denom == 0) {
		answer = num % denom + "/" + denom;
		if(denom < 0) {
			answer = -(num % denom) + "/" + (denom * -1);
		} return answer;
	}
	if (num % denom == 0) {
		return num / denom + "";
	}
	/*
	if (num < 0) {
		answer = (-num / denom) + "_" + num % denom + "/" + denom;
	}*/
	
	
	if (num < 0) {
		answer = (num / denom + "_" + (num * -1) % denom + "/" + denom);
			if (denom < 0) {
				answer = (num / denom + "_" + (num * -1) % denom + "/" + (denom * -1));
			}
	}else if (num > 0 && denom < 0) {
		answer = (num / denom + "_" + num % denom + "/" + (denom * -1));
	}else {
		
		answer = (num / denom + "_" + num % denom + "/" + denom);
	}
	return answer;
	}
}
    		