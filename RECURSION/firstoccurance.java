public class firstoccurance {
    public static int firstocur(int arr[],int i,int key){
     if(i==arr.length-1){
        return -1;
     }
     if(arr[i]==key){
        return i;
     }
      return firstocur(arr, i+1, key);
    }

    public static void main(String[] args){
       int arr[]={1,2,4,5,6};
       System.out.println(firstocur(arr, 0, 3));

    }
}
