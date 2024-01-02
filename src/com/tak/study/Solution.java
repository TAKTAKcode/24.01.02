package com.tak.study;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();     //반복 횟수 입력
        int[] arr = new int[num];   //array 크기

        //횟수 반복하여 입력값 array 세팅
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        //array sort하기 위함
        for (int i = 0; i < num - 1; i++) {
            for(int j = i + 1; j < num; j++) {

                //
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        for(int val : arr) {
            System.out.println(val);
        }

    }

}
