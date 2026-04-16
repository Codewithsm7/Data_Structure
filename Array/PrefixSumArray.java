package Data_Structure.Array;

public class PrefixSumArray {
    public static void prefixSum(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefixSum[]=new int[num.length];
        prefixSum[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefixSum[i]=prefixSum[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=start==0?prefixSum[end]:prefixSum[end]-prefixSum[start-1];
                maxSum=Math.max(currSum, maxSum);
            }
        }
        System.out.println("Maximum sum of SubArray: " + maxSum);
    }
    public static void main(String args[]){
        int num[]={1,-2,6,-1,3};
        prefixSum(num);
    }
    
}
