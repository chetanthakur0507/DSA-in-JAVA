// public class Binarysearch {
//     public static int getlargest(int num[],int key){
//         int start=0;
//         int end=num.length-1;
        
//         while(start<=end){
//            int mid=(start+end)/2;
//            if(key==num[mid]){
//                 return mid;
//            }
//            if(num[mid]<key){
//              start=mid+1;
//            }
//            else{
//             end=mid-1;
//            }

//         }
//         return -1;

//     }
//         public static void main(String[] args){
//         int num[]={2,4,6,8,10,12};
//         int key=2;
        

//         System.out.println("index is : "+getlargest(num, key));
//     }
// }







// public class Binarysearch{
//     public static int binary(int arr[],int key){
//         int start=0;
//         int last=arr.length;
//         int mid=(start+last)/2;
//         while(start<=last){
//             if(arr[mid]==key){
//                 return mid;
//             }
//              if(arr[mid]<key){
//                start=mid+1;
                
//             }
//             else {
                
//                 last=mid-1;
//             }
//             mid=(start+last)/2;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,6,7};
//        int key=6;
//        System.out.println(binary(arr,key));
//     }
// }



