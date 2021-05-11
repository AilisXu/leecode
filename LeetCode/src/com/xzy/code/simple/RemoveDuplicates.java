package com.xzy.code.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除排序数组中的重复项:
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 
 * 示例 1:
 * 给定数组 nums = [1,1,2], 
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 
 * @author xuzhiyang
 * @Description:TODO
 * 思路：遍历数组，将数组值存放到list中
 */
public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int num:nums){
			if(list.contains(num)){
				continue;
			}
			list.add(num);
		}
		for(int i=0;i<list.size();i++){
			nums[i]=list.get(i);
		}
		
		return list.size();
    }
	
	public static void main (String args[]) {
		RemoveDuplicates  removeDuplicates = new RemoveDuplicates();
		int[] nums ={1,1,2};
		int a = removeDuplicates.removeDuplicates(nums);
		System.out.println(a);
	}

}
