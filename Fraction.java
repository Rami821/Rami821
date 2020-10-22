import java.lang.Math;

public class Fraction {
	private int  num;
    private int  den;
       
       public Fraction() {
    	   
    	   num = 1;
    	   den = 2;
    	   
       }
       
       public Fraction(int num1, int num2) {
    	   num = num1;
    	   den = num2;
    	  
       }
       
       public static void addition( int num, int den, int x,int y ) {
    	   double a = ((double)num/den+(double)x/y)*10;
    	   System.out.println("The addition of "+ num + "/" + den+" and "+x+"/"+y+ " is:"+ (int)a+"/"+"10");
    	 
       }
       
       public static void subtraction( int num, int den, int x,int y  ) {
    	 double a = Math.abs(((double)num/den-(double)x/y)*10);
      	 System.out.println("The subtraction of "+ num + "/" + den+" and "+x+"/"+y+ " is:"+ (int)a+"/"+"10");
      	 
       }
       
       public static void division( int num, int den, int x,int y  ) {
    	  double a = (((double)num/den)/((double)x/y))*10;
      	 System.out.println("The division of "+ num + "/" + den+" and "+x+"/"+y+ " is:"+ (int)a+"/"+"10");
      	 
       }
       
       public static void multiplication( int num, int den, int x,int y  ) {
    	   double a = ((double)num/den*(double)x/y)*10;
        	 System.out.println("The addition of "+ num + "/" + den+" and "+x+"/"+y+ " is:"+ (int)a+"/"+"10");
        	 
        }
       
       
       
       
       
       
}
