public class rainwater {
    public static int trapped(int height[]){
      //find right max

      int rightmax[]=new int[height.length];
      rightmax[0]=height[0];
      for(int i=1;i<height.length;i++){
        rightmax[i]=Math.max(rightmax[i-1], height[i]);
      }

      //find left max
      int leftmax[]=new int[height.length];
      leftmax[height.length-1]=height[height.length-1];
      for(int j=height.length-2;j>=0;j--){
        leftmax[j]=Math.max(leftmax[j+1], height[j]);
      }

      //loop find water
      int trappedwater=0;
      for(int i=0;i<height.length;i++){
        int waterlevel=Math.min(rightmax[i], leftmax[i]);
        trappedwater+=waterlevel-height[i];
       

      }

        return trappedwater;
    }
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapped(height));
    } 
}
