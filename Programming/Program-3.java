
import java.util.Scanner;

public class Program-4 {
	public static void main(String args[])
	{ 
		int num,line=0;
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	if(num==1)
	{
		System.out.println(num);
	}
	else {
	for ( int i = 1; i <= num; i++)
 {
	if(num%2==0)
	{
		line=2*(i-1)-1;
		if(line==-1)
		{
			continue;
		}
		System.out.println(line+" ");
	}
	else
	{
		line=2*i-1;
		System.out.println(line+" ");
	}
 }
 }
	}
}