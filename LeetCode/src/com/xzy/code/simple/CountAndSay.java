package com.xzy.code.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 外观数列
 * 
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * 注意：整数序列中的每一项将表示为一个字符串。
 * @author xuzhiyang
 * @Description:TODO
 */
public class CountAndSay {

	public String countAndSay(int n) {
		List<String> list = new ArrayList<>();
		int a = 1;
		String aStr = a+"";
		list.add(aStr);
		for(int i=2;i<=30;i++){
			aStr = getNextData(aStr);
			list.add(aStr);
		}
		
		return list.get(n-1);
		
    }
	
	public String getNextData(String str){
		String result = "";
		String a = str;
		while(a.length()>0){
			int count = 1;
			for(int i=0;i<a.length();i++){
				String m = a.substring(0, 1);
				String n = a.substring(i+1,i+2);
				if(m.equals(n)){
					count++;
				}else{
					break;
				}
			}
			String x = a.substring(count-1,count);
			a = a.substring(count, a.length());
			result += count+""+x;
		}
		return result; 
	}
	
	public static void main(String[] args) {
		CountAndSay count = new CountAndSay();
		String result = count.countAndSay(3);
		System.out.println(result);
	}
	
}
