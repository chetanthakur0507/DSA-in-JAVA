public class assignment4 {
    public static int trapwater(int height[]){
       
        //rightmax boundary

        int rightmax[]=new int[height.length];
        rightmax[0]=height[0];

        for(int i=1;i<height.length;i++){
          rightmax[i]=Math.max(rightmax[i-1],height[i]);
        }

         // leftmax boundary
        int leftmax[]=new int[height.length];
        leftmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i-- ){
            leftmax[i]=Math.max(leftmax[i+1], height[i]);

        }

        //loop
       int trappedwater=0;
        for(int i=0;i<height.length;i++){
            
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappedwater+=waterlevel-height[i];
            
        }
        return trappedwater;
           



    }
    public static void main(String[] args){
        int height[]={6,5,4,3,2,1};
       System.out.println(trapwater(height));
    }
}
