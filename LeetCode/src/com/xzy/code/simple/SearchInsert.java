package com.xzy.code.simple;

/**
 * 搜索插入位置:
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * @author xuzhiyang
 * @Description:TODO
 * 思路：采用二分法进行查找
 */
public class SearchInsert {
	
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if(nums[left]>=target){
        	return left;
        }
        if(nums[right]<target){
        	return right+1;
        }
        while(left<=right){
        	int mid = (left+right)/2;
        	if(nums[mid]>target){
        		right = mid-1;
        	}else if(nums[mid]<target){
        		left = mid+1;
        	}else{
        		return mid;
        	}
        }
        return left;
        
    }
	
	public static void main(String[] args) {
		SearchInsert solution = new SearchInsert();
		int[] nums = {1,3,5,6};
		int a = solution.searchInsert(nums, 2);
		System.out.println(a);
	}

}
