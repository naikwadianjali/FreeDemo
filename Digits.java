
public class Digits
{
 public static void main(String... g)
 {
	 long a=62856;
	 int r,sum=0; 
	 int count=0;
	 int dg[] = new int [10];
	 System.out.println("All the digits of the number : \nr \t a");
	
	 while(a>0)
	 {
		 r =(int)a % 10;
		 dg[count] = r;
		 a = a / 10;
		 sum = sum + r;
		 System.out.println(r+"\t"+a +"\t"+sum+"\n");
	       count++;
	 }
	 System.out.println("Sum of all the digits in a number : " +sum);
     System.out.println("\n Total number is :" + count);
      System.out.println("Sum of first and last:" +(dg[0]+dg[count-1]));
 }
}
