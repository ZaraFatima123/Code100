class Solution {
  public:
    long long findSmallest(vector<int> &arr) {
      long smallestMissing = 1;
        
        for(int num : arr){
            if(num > smallestMissing){
                break;
            }
            
            smallestMissing += num;
        }
        
        return smallestMissing;
    }
};
