class Solution {
    public int trap(int[] height) {
        int prevMax = 0;
        int[] waterTrapped = new int[height.length];
        for(int i=0; i<height.length; i++){
            if(height[i] > prevMax){
                prevMax = height[i];
            }
            waterTrapped[i] = prevMax - height[i];
        }
        prevMax = 0;
        for(int j=height.length-1; j>0; j--){
            if(height[j] > prevMax){
                prevMax = height[j];
            }
            waterTrapped[j] = Math.min(prevMax - height[j], waterTrapped[j]);
        }
        int solution = 0;
        for(int k = 0; k<waterTrapped.length; k++){
            solution+=waterTrapped[k];
        }
        return solution;
    }
}
