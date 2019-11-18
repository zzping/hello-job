package com.funtl.hello.job.test;


import java.util.ArrayList;
import java.util.List;

public class TestGen {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(123);
        System.out.println(stringList.getClass() == integerList.getClass()); // true
    }

}

