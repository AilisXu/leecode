package com.xzy.code.simple;

/**
 * 最长公共前缀
 * 
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * @author xuzhiyang
 * @Description:TODO
 * 思路：取出字符串数组中的一个元素作为基准，使用indexOf函数判断其他元素中是否包含基准元素，
 */
public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0){
			return "";
		}
		String a = strs[0];
        if("".equals(a)){
        	return "";
        }
        for(int i=1;i<strs.length;i++){
        	while(strs[i].indexOf(a)!=0){
        		a = a.substring(0, a.length()-1);
        	}
        }
        return a;
    }

}
