/*
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

==idea==
for loop
*/

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        /*
        if (nums.length == 1) {
            list.add(nums[0] + ""); //way to convert integer to string
            return result;
        }
        */
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            
            while ((i+1 < nums.length) && (nums[i+1] - nums[i]) == 1)) {
                i++;
            }
            if (a != nums[i]) {
                result.add(a + "->" + nums[i]);
            } else {
                result.add(a+"");
            }
        }
        return result;
    }
}