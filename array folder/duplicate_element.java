public class duplicate_element {
    public static int findduplicate(int arr[]){
        
        if (arr.length == 0) {
        return 0;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
                
            }
            
            
        }
        return uniqueIndex+1;
          
    }
         
    
    public  static void main(String[] args){
        int arr[]={3,1,2,2,3,4,4};
        int newlength=findduplicate(arr);
        for(int i=0;i<newlength;i++){
            System.out.println(arr[i]);
        }
        
    }
}
