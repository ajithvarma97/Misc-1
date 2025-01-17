// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
class Solution {
    public int brokenCalc(int startValue, int target) {
        int count = 0;
        while(target > startValue){
            if(target%2 == 0){
                target/=2;
            }
            else{
                target++;
            }
            count++;
        }
        return count + startValue - target;
    }
}