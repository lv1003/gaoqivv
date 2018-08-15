package com.cc.day07;

import java.util.Date;
import java.util.Objects;

/**
 * Created by vv on 2018/7/17.
 * Collection
 * 模拟实现ArrayList类
 */
public class MyArrayList {
    private Object[] value;
    private int size;

    public MyArrayList() {
        //   value = new Object[16];
        this(10);
    }

    public MyArrayList(int size) {
        if (size < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        value = new Object[size];
    }

    public void add(Object object) {
        value[size] = object;
        size++;
        if (size >= value.length) {
            //装不下了，扩容吧
            int newCapacity = value.length * 2;
            Object[] newList = new Object[newCapacity];
            //System.arraycopy();
            for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];

            }
            value = newList;
        }
    }

    public Object get(int index) {
        rangeCheck(index);
        return value[index];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object object) {
        if (object == null) {
            return -1;
        } else {
            for (int i = 0; i < value.length; i++) {
                if (object == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public int lastIndexOf(Object object) {
        if (object == null) {
            return -1;
        } else {
            for (int i = value.length - 1; i >= 0; i--) {
                if (object == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Object set(int index, Object object) {
        rangeCheck(index);
        Object old = value[index];
        value[index] = object;
        return old;
    }

    public void rangeCheck(int index) {
        if (index < 0 || index > size - 1) {//[0,size-1]
            try {
                throw new Exception();  //手动抛出一个异常。
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add("aaa");
        myArrayList.add(new Human("lvwei"));
        myArrayList.add(new Date(2001 - 01 - 12));
        Human human = (Human) myArrayList.get(1);
        System.out.println(human.name);
        System.out.println(myArrayList.getSize());
    }
}
