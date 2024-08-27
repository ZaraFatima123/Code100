class Solution {
       public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        int[] right = new int[n];
        int[] left = new int[n];
        
        
        for(int i=0 ;i<n ;i++){
            left[i] =0;
            for(int j=i-1; j>=0;j--){
                if(arr[j] < arr[i]){
                    left[i] = arr[j];
                    break;
                }
            }
        }
        for(int i=0 ;i<n ;i++){
            right[i] =0;
            for(int j=i+1; j<n;j++){
                if(arr[j] < arr[i]){
                    right[i] = arr[j];
                    break;
                }
            }
        }
        int maxDiff = 0;
        for(int i=0;i<n;i++){
            int diff = Math.abs(left[i] - right[i]);
            if(diff > maxDiff){
                maxDiff = diff;
            }
        }
        return maxDiff;
        
    }

}
