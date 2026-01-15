public class Main
{
	public static void main(String[] args) {
	    int arr[]={2,3};
	    boolean flag=false;
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	            
	            if(arr[i]==arr[j]){
	                System.out.println(" duplicate element"+arr[i]);
	            flag=true;
	            break;
	            }
	        }
	    }	            
	        if(!flag){
	            System.out.println("no duplicate element");
	        }	    
	}
}
