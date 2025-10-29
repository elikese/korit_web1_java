package _21_Access.bottle;

public class Main {
    public static void main(String[] args) {
        /* 
        WaterBottle 클래스를 완성해 주세요.
        필드: currentWater(현재 물의 양)
        생성자: currentWater를 초기화하는 생성자
        메서드:
            - void fill(int amount)
                1. amount값을 검증(0보다 큰지)
                2. 총량은 1000ml를 넘으면 안된다.
                3. 유효하면 "물을 채웠습니다." 출력
            - void drink(int amount)
                1. amount값을 검증(0보다 큰지)
                2. 현재물의 양보다 더 많은 양을 마실 수 는 없음
                3. 유효하면 "물을 마셨습니다." 출력
            - int getCurrentWater()
                -> 현재 물의 양 리턴
        */

        WaterBottle waterBottle = new WaterBottle(0);

        waterBottle.fill(500);
        waterBottle.fill(800);
        waterBottle.drink(400);
        waterBottle.drink(800);
        waterBottle.fill(-10);
        waterBottle.drink(-10);

        System.out.println(waterBottle.getCurrentWater());
        // 클래스의 필드는 private로 선언
        // 변경은 public 메서드로!(메서드에는 검증코드가 있다)


    }
}
