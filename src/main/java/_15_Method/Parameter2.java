package _15_Method;

public class Parameter2 {
    public static void changeNumber(int number) {
        System.out.println("changeNumber 호출됨!");
        number += 2;
    }

    public static void changeArray(int[] arr) {
        arr[0] = 999;
    }

    public static void main(String[] args) {
        int num = 10;
        // 퀴즈
        changeNumber(num);
        System.out.println(num); // 출력값? 10
        // 함수별로 각기 다른 stack 메모리 공간을 가지고 있기 때문
        /*
        stack(main)---
        num : 10
        stack(main)---
        stack(changeNumber)---
        number : 10 -> 12
        stack(changeNumber)---
        */

        int[] nums = {1, 2, 3};
        System.out.println(nums[0]);
        // 퀴즈
        changeArray(nums);
        System.out.println(nums[0]); // 출력값? 999
        /*
        stack(main)---
        nums: 0x1000
        stack(main)---
        stack(changeArray)---
        arr: 0x1000
        stack(changeArray)---
        heap---
        0x1000: 1 -> 999
        */
        

    }
}
