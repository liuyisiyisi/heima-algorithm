package com.xin.test;

import com.xin.sort.Bubble;
import com.xin.sort.Selection;

import java.util.Arrays;

/**
 * @author liuyisiyisi
 * @date 2022-09-07 20:41
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
