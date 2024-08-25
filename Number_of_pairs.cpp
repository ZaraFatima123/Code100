class Solution {
  public:
   int search(int val, vector<int>& brr){
        int low=0, high=brr.size()-1, index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(brr[mid]<=val){
                index=mid;
                low=mid+1;
            }else high=mid-1;
        }
        return index;
    }
    
    long long countPairs(vector<int> &arr, vector<int> &brr) {
        long long ans=0;
        long long one=0, two=0, threeFour=0; 
        sort(brr.begin(), brr.end());
        int n=brr.size();
        
        for(auto i:brr){
            if(i==1) one++;
            else if(i==2) two++;
            else if(i==3 || i==4) threeFour++;
        }
        for(auto i:arr){
            if(i!=1){
                ans+=one;
                if(i==2) ans-=threeFour;
                if(i==3) ans+=two;
                int index=search(i, brr);
                ans+=n-index-1;
            }
        }
        return ans;
    }
};
