package _21_Access.bottle;

public class WaterBottle {
    private int currentWater;

    // OOP에서 중요하게 여기는 가치 중 하나는 생성자를 통한 값검증이다.
    public WaterBottle(int currentWater) {
        if (currentWater < 0) {
            System.out.println("물의 양은 음수 일 수 없습니다.");
            return; // 생성자에서는 예외를 던지는게 올바른 방법이다.
        }
        if (currentWater > 1000) {
            System.out.println("물병의 최대 용량은 1000입니다.");
            return; // 생성자에서는 예외를 던지는게 올바른 방법이다.
        }

        this.currentWater = currentWater;
    }

    public int getCurrentWater() {
        return currentWater;
    }

    // amount가 음수면 x
    // 기존값 + amount -> 1000이 넘어가면 x
    public void fill(int amount) {
        if(amount < 0) {
            System.out.println("물의 양은 음수 일 수 없습니다.");
            return;
        }

        int result = this.currentWater + amount;

        if (result > 1000) {
            System.out.println("물병의 최대용량은 1000입니다. 현재 양을 초과합니다.");
            return;
        }

        currentWater += amount;
        System.out.println("물을 채웠습니다.");
    }

    // amount 음수 x
    // 현재양보다 더 많은 양을 마실수 없다.
    public void drink(int amount) {
        if(amount < 0) {
            System.out.println("물의 양은 음수 일 수 없습니다.");
            return;
        }

        if(amount > currentWater) {
            System.out.println("현재 물의 양보다 더 많은 양을 마실 수 없습니다.");
            return;
        }

        // currentWater = currentWater - amount;
        currentWater -= amount;
        System.out.println("물을 마셨습니다.");
    }

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
}
