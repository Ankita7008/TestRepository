import java.util.*;

class Test{
	
	
	public static void main(String[] arg){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your integer number:");
		
		int x = s.nextInt();
	
	
	//Example 1
		if(x > 0){
			System.out.println(x+" is a postive number");
		}else if(x < 0){
			System.out.println(x+" is a negative number");
		}else{
			System.out.println(x+" is zero");
		}
		System.out.println("==================================");
	//Example 2
	int fact = 1;
		for(int i = x; i > 0; i--){
			fact *= i;
		}
		
		System.out.println(x+" factorial is "+fact);
		
		System.out.println("==================================");
		
	//Example 3
		int sum = 0;
		for(int i = 1; i<= 20; i++){
			sum += i;
		}
		System.out.println("First 20 number sum is "+sum);
		System.out.println("==================================");
		
	//Example 4
	   
	   System.out.println("Please enter any 1st number:");
	   int val1 = s.nextInt();
	   System.out.println("Please enter any 2nd number:");
		
	   int val2 = s.nextInt();
	   
	   //int val1 = 4;
	   //int val2 = 10;
      
       int length = (val2 - val1) +1;
	   int sum1 = 0;
	   int i = val1;
	   
	   while (i<= val2){
		  sum1 +=i;
		  i++;
	   }
	   	   
	   double avg= (double) sum1/length;
	   System.out.println(" avg between "+ val1 +" and " + val2 + " is " +avg);

	}
}

class Test2{
	
	public static void main(String[] args){
		//findAvg();
		drawPattern();
	}
	
	public static void drawPattern(){
		Scanner s = new Scanner(System.in);
	    System.out.println("Please enter number of rows :");
	    int row = s.nextInt();
		int col = row;
		
		for(int i =row; i > 0; i--){ // row 
			for(int k = 0; k < i -1; k++){ //space
				System.out.print(" ");
			}
			for (int j =row; j >= i; j--){ //col
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void findAvg(){
		Scanner s = new Scanner(System.in);
	    System.out.println("Please enter any start number:");
	    int start = s.nextInt();
	    System.out.println("Please enter any end number:");
		
	   int end = s.nextInt();
	   int length = (end - start) +1;
	   int sum1 = 0;
	   int i = start;
	   
	   while (i<= end){
		  sum1 +=i;
		  i++;
	   }
	   	   
	   double avg= (double) sum1/length;
	   System.out.println(" avg between "+ start +" and " + end + " is " +avg);

	}
}