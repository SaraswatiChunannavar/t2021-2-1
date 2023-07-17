package Program;
import java.util.*;
public class Program-1 {
	public static double Addition(double num4,double num5) {
		return num4+num5;
	}
	public static double subtractNumbers(double num1, double num2) {
		return num1-num2;
	}

	public static double multiplyNumbers(double num3, double num2) {
		return num3*num2;
	}
	public static double divideNumbers(double num1,double num3) {
		if(num3==0) {
			System.out.println("Invalid Input");		}
		else {
		return num1/num3;
	}
	  return 3;
	
	}
	public static int findRemainder(int num4,int num5) {
		return num4%num5;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		double num4=sc.nextDouble();
		double num5=sc.nextDouble();
		double res4= Addition(num4,num5);
		double res1=subtractNumbers(num1,num2);
		double res2=multiplyNumbers(num3,num2);
		double res3=divideNumbers(num1,num3);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		
		
		
		
	}

}
