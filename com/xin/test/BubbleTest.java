package com.xin.test;

import com.xin.sort.Bubble;

import java.util.Arrays;

/**
 * @author liuyisiyisi
 * @date 2022-09-06 21:36
 */
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, 3, 2, 1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
