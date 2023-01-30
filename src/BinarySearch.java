
public class BinarySearch 
{
	public static void main(String args[])
	{
		int arr[]= {2,4,6,8,10,12,14,16,18,20};
		int hi=arr.length-1;
		int lo=0;
		int x=4;
		int mid;
		int y=-1;
		
		while(hi!=lo)
		{
			mid=(hi+lo)/2;
			if (arr[hi]==x)
				{y=hi;
				break;
				}
			else if(arr[lo]==x)
				{y=lo;
				break;
				}
			else if(arr[mid]==x)
				{y=mid;
				break;
				}
			else if (x<arr[mid])
				hi=mid;
			else if(x>arr[mid])
				lo=mid;				
		}
		if (y==-1)
			System.out.println("not found");
		else
			System.out.println(y);
	}
}
