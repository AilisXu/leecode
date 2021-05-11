package com.xzy.code.simple;

/**
 * 快乐数
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
 * 也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 * 示例：
 * 输入：19
 * 输出：true
 * 解释：
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * @author xuzhiyang
 * @Description:TODO
 * 思路：采用快慢指针去做，如果一直循环，那么快指针一定能追上慢指针，最后2者一定会相等，
 * 如果没有重复循环，最后也会相等都为1
 */
public class IsHappy {
	
	public boolean isHappy(int n) {
        boolean flag = false;
        int fast = n;
        int slow = n;
        do{
        	fast = squareSum(fast);
        	fast = squareSum(fast);
        	slow = squareSum(slow);
        }while(fast!=slow);
        if(fast==1){
        	flag = true;
        }
        return flag;
    }
	
	private int squareSum(int n){
		int sum = 0;
		while(n!=0){
			sum +=(n%10)*(n%10);
			n = n/10;
		}
		return sum;
	}

}
