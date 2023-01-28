
public class SelectionSort 
{
public static void main(String args[])
{
	int arr[]= {5,6,7,2,3,1,4,8,9,10};
	int n=arr.length;
	
	for (int i=0; i<(n-1);i++)
	{
			int index=i;
			int small=arr[i];

			for (int j=i+1; j<n; j++)
			{
				if (arr[j]<small)
				{
					small=arr[j];
					index= j;
				}
			}
			if (index!=i)
			{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
	}
	for (int i=0; i<n; i++)
	{
		System.out.print(arr[i]+" ");
	}
}

}
