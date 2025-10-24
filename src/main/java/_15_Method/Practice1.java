package _15_Method;

public class Practice1 {

    // 메서드 작성
    // return을 실행하면
    // 1. 메서드 즉시종료 / 2. 호출한 곳으로 리턴값 전달
    // 3. 메모리 정리(stack 정리)
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean containsNum(int[] nums, int num) {
        // nums 안에 num이 있는가?
        for (int number : nums) {
            if(number == num) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // 1. 홀짝을 판단하는 메서드를 작성해 주세요
        // isEven(8) -> true
        System.out.println(isEven(8));
        // 2. 배열과 숫자를 매개변수로 받아서, 숫자가 배열에 있는지 검사하는 메서드
        int[] nums = {1, 3, 7, 9};
        // containsNum(nums, 8) -> false
    }
}
