package com.cc.collection;

import com.cc.day01.ExerFor;

/**
 * 自己实现一个ArrayList  更好的理解ArrayList底层结构！
 * Created by vv on 2018/7/23.
 */
public class VvArrayList {
    private Object[] elementData;
    private int size;

    public int size() {
        return size;
    }

    public VvArrayList() {
        this(10);
    }

    public VvArrayList(int initalCapacity) {
        if (initalCapacity < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initalCapacity];
    }

    public void add(Object obj) {
        //数组扩容  数据拷贝
        if (size == elementData.length) {
            Object[] newArray = new Object[size * 2 + 1];
            //数据拷贝
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
//      自己写的数据拷贝       for (int i=0;i<elementData.length;i++){
//                newArray[i]=elementData[i];
//
//            }
            //替换 新数组 扩容成功
            elementData = newArray;
        }

        elementData[size] = obj;
        size++;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return elementData[index];
    }

    //范围检测
    private void rangeCheck(int index) {
        if (index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(int index) {
        rangeCheck(index);
        //刪除指定位置的对象   a b c d e
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        }
        elementData[--size] = null; // clear to let GC do its work
    }
    public void remove(Object obj) {
    for (int i=0;i<size;i++){

    }

    }

    public static void main(String[] args) {
        VvArrayList vvArrayList = new VvArrayList();
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("333");
        vvArrayList.add("311");
        vvArrayList.remove("311");
        System.out.println(vvArrayList.size());
        System.out.println(vvArrayList.get(11));
       for (int i=0;i<vvArrayList.size;i++){
           System.out.println(vvArrayList.get(i));
       }
    }
}
