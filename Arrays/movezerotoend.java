public class Main{
    public static void main(String[]args){
        int arr[]={1,0,3,8,0,5,9,0,0,8};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
            
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
