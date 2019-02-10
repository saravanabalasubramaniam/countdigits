import java.io.*;
import java.util.*;
class Countdigit
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int count=0;
	while(a!=0)
	{
		a=a/10;
		count++;
	}
	System.out.println(count);
  }
}
