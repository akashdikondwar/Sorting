public class InsertionSort {
    public static void main(String[] args) 
    {
        int arr[]={5,6,7,8,2,4,1,9,10,3};
        int n=arr.length;
        int temp;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i; j>0 && arr[j]<arr[j-1]; j--)
            {
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        for (int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
    }
}