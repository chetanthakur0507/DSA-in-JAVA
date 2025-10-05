public class shortest_path {
    public static float direction(String dir){
        int x=0;
        int y=0;
       for(int i=0;i<dir.length();i++){
        if(dir.charAt(i)=='W'){
           x--;
        }
        else if(dir.charAt(i)=='E'){
            x++;
        }
        else if(dir.charAt(i)=='N'){
            y++;
        }
        else{
            y--;
        }
        
       }
       int X2=x*x;
        int Y2=y*y;

       return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
        String dir="WNEENESENNN";
        System.out.println(direction(dir));
    }
}
