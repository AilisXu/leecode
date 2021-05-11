package com.xzy.code.simple;

/**
 * 最后一个单词的长度
 * 
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，
 * 那么最后一个单词就是最后出现的单词。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 * 
 * @author xuzhiyang
 * @Description:TODO
 * 思路：使用split()函数获取最后一个字符串长度
 */
public class LengthOfLastWord {
	
	public int lengthOfLastWord(String s) {
		int length = 0;
		if(s==null||s.trim().length()==0){
			return length;
		}
		String [] b = s.split(" ");
		String c = b[b.length-1];
		length = c.length();
		
		return length;
    }

}
