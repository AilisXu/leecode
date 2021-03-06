package com.xzy.code.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 两数之和
 * 
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * @author xuzhiyang
 * @Description:TODO
 * 思路：把数组装到list中，然后根据list的方法来获取下标
 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        	list.add(nums[i]);
        }
        for(int j=0;j<list.size();j++){
        	int a = list.get(j);
        	if(list.contains(target-a)){
        		int b=list.indexOf(target-a);
        		if(j!=b){
        			return new int[]{j,b};
        		}
        		
        	}
        }
        
        return null;
    }

}
