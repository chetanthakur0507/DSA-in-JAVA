public class peakelement {
   
    
    public static boolean peakElement(int arr[]) {
        if(arr.length==1){
            return true;
        }
        else if(arr[0]>arr[1]){
            return true;
        }
        else if(arr[arr.length-1]>arr[arr.length-2]){
            return true;
        }
       
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args){
        int arr[]={1};
        System.out.println(peakElement(arr));
    }
}
