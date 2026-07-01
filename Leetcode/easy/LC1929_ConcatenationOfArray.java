/*
Problem: LC1929 - Concatenation of Array

Pattern: Array Traversal

Java Concepts:
- Arrays
- for loop
- Method return type (int[])
- Array indexing

Time Complexity: O(n)
Space Complexity: O(n)

Mistake I Made:
Initially confused between System.out.print() and return.

Key Insight:
Fill both halves of the answer array in one traversal using:
ans[i + nums.length] = nums[i];
*/


class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}    