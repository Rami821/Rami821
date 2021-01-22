
public class NumberMethods {
	
	public static boolean isPrime(int num) {
		boolean prime = false;
		
		int divisorCount =0;
		for (int denominator = 1;denominator<=num;denominator=denominator+1) {
			 if ((num % denominator)==0) {
				 
					 divisorCount=divisorCount+1;
			}
		}
		if (divisorCount==2) {
			prime =true;
		}
	   
	   return prime; 
      }
		
		
	public static int divisorSum(int num) {
		   int sum=0;
		   int divisor=1;
		   
		   while (divisor < num) {
			   if(num%divisor==0) {
				   sum=sum+divisor;
				   }
			   divisor++;
			    }
		   return sum; 
		   }
		
   
	
	public static boolean isStrong(int num) {
		boolean strong=false;
		if (isPrime(num)==false){
			if(divisorSum(num)<num) {
				 strong= true;
			}
			else {
				strong=false;
			}
		
			
		}
		return strong;
	}
	
	public static void printDivisors(int num) {
		   int divisor=1;
		   int divisorLimit=0;
		   while (divisor != num) {
			   if(num%divisor==0) {
				   System.out.print(divisor+" " );
				   if(divisor!=1 && (num/divisor)>divisorLimit) {
					   divisorLimit=num/divisor;
				   }
				   
			   }
			   divisor++;
		   }
	}
	
	public static void printPrimes(int num) {
		int count=1; 
		while (count<num) {
			if (isPrime(count)==true) {
				System.out.print(count+" " );
			}
			count++;
		}
	}

	public static void printComposites(int num) {
		int count=2; 
		while (count<num) {
			if (isPrime(count)==false) {
				System.out.print(count +" ");
			}
			
			count++;
		}
	}
	
	public static void printStrong(int num) {
		int count =2;
		while (count<num) {
			if (isStrong(count)==true) {
				System.out.print(count+" ");
			}
			count++;
		}
	}
	
	public static void printWeak(int num) {
		int count =3;
		
		
		  while (count<=num) {
			 if (isPrime(count)==true) {
				 count++;
			 }
			if (isStrong(count)==false) {
				System.out.print(count+" ");
			}
			count++;
		}
	}
	
	public static void test(int num) {
		System.out.print("The number is 30.");
	}
}


