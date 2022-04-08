import java.util.*;
import java.io.*;
class TwoSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		int[] array=new int[10];
		for(int i=0;i<=n;i++)
		{
			array[i]=sc.nextInt();
		}
		int result=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(array[i]+array[j]==result){
					System.out.println("true");
					break;	
				
					
			}	
			
			}
		}
	}
}
