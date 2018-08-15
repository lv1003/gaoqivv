package com.liuyi.day14;

import java.util.Arrays;

/**
 * Created by vv on 2018/8/13.
 * 复制数组
 */
public class SystemDemo1 {
    public static void main(String[] args) {
        int []arr={2,22,13,4,654,7,6,8,7,87,98,9};
        int []arr1={1,2,3};
        System.arraycopy(arr,1,arr1,1,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
