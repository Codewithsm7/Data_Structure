package Data_Structure.Array;

public class TrappingRainWater {
    public static int trappedWater(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int k=n-2;k>=0;k--){
            rightMax[k]=Math.max(rightMax[k+1],height[k]);
        }
        int trappedWater=0;
        for(int j=0;j<n;j++){
            trappedWater+=Math.min(leftMax[j],rightMax[j])-height[j];
        }
       return trappedWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};    
        System.out.println(trappedWater(height));
    }
}
