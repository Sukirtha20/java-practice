public class Main
{
	public static void main(String[] args) {
	    int arr[]={2,3,4,7,8,1,9};
	    int max=arr[0];
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>max){
	            max=arr[i];
	        }
	        
	    }
		System.out.println("Largest element: "+max);
	}
}
