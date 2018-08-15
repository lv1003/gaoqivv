package com.liuyi.day13;

/**
 * Created by vv on 2018/8/9.
 * <p>
 * 数组拼接成字符串
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
//定义一个数组
        int[] arr = {44, 54, 34546, 5, 576557};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    //用StringBuffer 做拼接
    public static String arrayToString(int[] arr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuffer.append(arr[i]);
            } else {
                stringBuffer.append(arr[i]).append(",");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
