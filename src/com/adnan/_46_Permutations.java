package com.adnan;


import java.util.ArrayList;
import java.util.List;

/*

tutorial used: https://www.youtube.com/watch?v=R3Sm9V2OSCo&ab_channel=Codebix

46. Permutations
Medium

12579

215

Add to List

Share
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]


Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.

*/
public class _46_Permutations {

    public static void main(String[] args) {
int[] nums = {1,2,3};
        System.out.println(solution(nums));
    }

    public static List<List<Integer>> solution(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(res, nums,new ArrayList(),visited);
        return res;
    }

    static void backtrack(List<List<Integer>> res, int[] nums, List<Integer> curr, boolean[] visited){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length; i++){
            if(visited[i] == true) continue;
            curr.add(nums[i]);
            visited[i] = true;
            backtrack(res,nums,curr,visited);
            curr.remove(curr.size()-1);
            visited[i] = false;
        }
    }
}
