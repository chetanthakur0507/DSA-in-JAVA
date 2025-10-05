

public class arrays {
    public static int[] check(int arr[]){
        int rev[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
           rev[i]=arr[arr.length-i-1];
        }
        return rev;
    }
        

  

    
     
    
    
    public static void main(String[] args){
      int arr[]={2,4,6,8,10,12,14};
      int result[]=check(arr);
      for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
      }
      
  
    }
}
