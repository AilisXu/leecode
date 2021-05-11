package com.xzy.code.simple;

/**
 * 回文数
 * 
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * 示例 1:
 * 输入: 121
 * 输出: true
 * 
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * @author xuzhiyang
 * @Description:TODO
 * 思路：先把负值过滤掉，剩下的就是除法和取余的计算了
 */
public class IsPalindrome {
	
	public boolean isPalindrome(int x) {
        int a = x;
        if(x<0){
            return false;
        }
        int temp = 0;
        while(a>0){
            temp = temp*10+a%10;
            a = a/10;
        }
        if(temp==x){
            return true;
        }
        return false;
    }

}
