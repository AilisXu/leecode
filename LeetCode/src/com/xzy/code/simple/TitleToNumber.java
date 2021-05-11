package com.xzy.code.simple;

/**
 * Excel表列序号
 * 
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 例如，
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28
 *  
 *  示例 1:
 *  输入: "A"
 *  输出: 1
 *  
 *  示例 2:
 *  输入: "AB"
 *  输出: 28
 * 
 * @author xuzhiyang
 * @Description:TODO
 * 思路：
 * 直接作为26进制来计算  根据ASCII码来操作
 */
public class TitleToNumber {
	
	public int titleToNumber(String s) {

		char [] charArr = s.toCharArray();
		int result = 0;
		for(char ch:charArr){
			result = result*26 +(ch-'A'+1);
		}
		return result;
    }
	
}
