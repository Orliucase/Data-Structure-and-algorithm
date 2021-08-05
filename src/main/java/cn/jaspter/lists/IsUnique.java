package cn.jaspter.lists;

import java.util.Scanner;
//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
//
// 示例 1：
//
// 输入: s = "leetcode"
//输出: false
//
//
// 示例 2：
//
// 输入: s = "abc"
//输出: true
//
//
// 限制：
//
// 0 <= len(s) <= 100
// 如果你不使用额外的数据结构，会很加分。
//
// Related Topics 位运算 哈希表 字符串 排序
// 👍 133 👎 0

public class IsUnique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str);
        boolean isTrue = false;
        int index[] = new int[128];
        for(int i=0;i<str.length();i++){
            index[str.charAt(i)]++;
        }
        for(int j=0;j<index.length;j++){
            if(index[j]>1){
                isTrue= false;
                break;
            }
            isTrue= true;
        }
        System.out.println(isTrue);
    }
}
