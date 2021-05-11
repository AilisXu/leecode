package com.xzy.code.simple;

/**
 * 有效的括号
 * 
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 *      1.左括号必须用相同类型的右括号闭合。
 *      2.左括号必须以正确的顺序闭合。   
 * 注意空字符串可被认为是有效字符串。
 * 
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * 
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * 
 * 示例 4:
 * 输入: "{[]}"
 * 输出: true
 * @author xuzhiyang
 * @Description:TODO
 * 思路：循环使用字符串函数替换括号，查看结果即可
 */
public class IsValid {
	
	public boolean isValid(String s) {
        String a = s.replace(" ","");
        while(a.contains("{}")||a.contains("()")||a.contains("[]")){
            a = a.replace("{}","");
            a = a.replace("()","");
            a = a.replace("[]","");
        }
        if("".equals(a)){
            return true;
        }
        return false;

    }

}
