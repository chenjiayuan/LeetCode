/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

==idea==
1. traverse
2. sort, then traverse
3. hashset (as implemented here)
*/

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> distinct = new HashSet<Integer>();

		for (int num : nums) {
			if (distinct.contains(num)) {
				return true;
			}
			distinct.add(num);
		}

		return false;
	}
}