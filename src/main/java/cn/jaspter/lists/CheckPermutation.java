package cn.jaspter.lists;

import java.util.Scanner;
//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
//
// 示例 1：
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true
//
//
// 示例 2：
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
//
//
// 说明：
//
//
// 0 <= len(s1) <= 100
// 0 <= len(s2) <= 100
//
// Related Topics 哈希表 字符串 排序
// 👍 38 👎 0

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        System.out.println("字符串1：" + str1);
        String str2 = scanner.next();
        System.out.println("字符串2：" + str2);
        boolean ss = equal(str1,str2);
        System.out.println(ss);
        boolean isTrue = false;
        if (str1.length()==0 || str2.length()==0 || str1.length() != str2.length()) {
            isTrue = false;
        }
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            int count = count(str1,c);
            int count1 =count(str2,c);
            if(count!=count1){
                isTrue= false;
                break;
            }
            isTrue= true;
        }

        System.out.println(isTrue);
    }
    public static int count(String str,char ch){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static Boolean equal(String s1,String s2){
        int l1=s1.length(),l2=s2.length();
        if(l1!=l2)
            return false;
        int []index=new int[128];
        for(int i=0;i<l1;i++){
            System.out.println(index[s1.charAt(i)]);
            index[s1.charAt(i)]++;
            index[s2.charAt(i)]--;
        }
        for(int i=0;i<128;i++){
            if(index[i]!=0)
                return false;
        }
        return true;
    }
}
