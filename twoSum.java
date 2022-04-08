import java.util.*;
public class twoSum
{
	public static int[] twoSumBruteForce(int[] nums,int target)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]==(target-nums[i]))
				{
					return new int []{i,j};
				}
			}
		}
		throw new IllegalArgumentException("no pair is found");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] nums=new int[10];
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			 nums[i]=sc.nextInt();
			 
		}
		int target=sc.nextInt();
		twoSumBruteForce(nums,target);
	}
}
