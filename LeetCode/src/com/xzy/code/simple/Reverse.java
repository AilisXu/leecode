package com.xzy.code.simple;

/**
 * 整数反转
 * 
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 
 * @author xuzhiyang
 * @Description:TODO
 * 思路：反转的时候应该考虑到超出int类型的长度
 */
public class Reverse {
	
	public int reverse(int x) {

		long a = 0;
		while(x!=0){
			a = a*10+x%10;
			x = x/10;
		}
		return (a>Integer.MAX_VALUE||a<Integer.MIN_VALUE)?0:(int)a;
    }

}
