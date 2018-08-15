package com.cc.day06;

/**
 * Created by vv on 2018/7/15.
 * 测试可变字符序列
 * StrngBuider   线程不安全的 效率高
 * StringBuffer  线程安全的 效率低
 * String 不可变字符序列
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(32);
        StringBuilder stringBuilder2 = new StringBuilder("abcd");
        stringBuilder2.append("efg");//可变字符序列
        stringBuilder2.append(true);
        System.out.println(stringBuilder2);
        // return this  实现方法链   工作流  return this
        stringBuilder.append("aaa").append("bbb").append("vvv").append("水邊");
        System.out.println(stringBuilder);
        System.out.println("######################################");
        //两个对象
        StringBuilder gh = new StringBuilder("a");
        for (int i = 0; i < 1000; i++) {
            gh.append(i);
        }
        System.out.println(gh);
    }
}
