package com.company;

public class Array {

    static void Arr1 () {
        int mult = 1;
        int[] arr = {2, 3, 4, 5};
        for (int i = 0; i < 4; i++) {
            mult *= arr[i];
        }
        System.out.println(mult);
    }
}
