public class Main
{
	public static void main(String[] args) {
	    int arr[]={4,5,6,-1};
	    int currentsum=arr[0];
	    int maxsum=arr[0];
	    for(int i=1;i<arr.length;i++){
	        currentsum=Math.max(arr[i],currentsum+arr[i]);
	        maxsum=Math.max(maxsum,currentsum);
	    }
		System.out.print("maximum subarray: "+maxsum);
	}
}
