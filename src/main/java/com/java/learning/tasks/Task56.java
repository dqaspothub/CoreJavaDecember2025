package com.java.learning.tasks;

import java.util.Arrays;

public class Task56 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);

    }}