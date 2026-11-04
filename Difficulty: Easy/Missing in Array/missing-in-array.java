class Solution {
    int missingNum(int arr[]) {
        // code here
        long n=arr.length+1;
        long totsum=(n*(n+1))/2;
        long actsum=0;
        for(int x:arr){
            actsum+=x;
        }
        return (int)(totsum-actsum);
    }
}