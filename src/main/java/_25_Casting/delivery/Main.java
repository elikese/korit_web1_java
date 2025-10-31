package _25_Casting.delivery;

public class Main {
    public static void main(String[] args) {
        // 업캐스팅 상태로 생성
        Delivery d1 = new Normal(10, 5); // 업캐스팅
        Delivery d2 = new Fast(10, 5); // 업캐스팅
        Delivery d3 = new Slow(10, 5); // 업캐스팅

        Delivery[] dList = {d1, d2, d3};

        // 오버라이딩된 calcFee() 호출!
        // 다형성: 같은 메서드(코드변경을 안해도되겠네?)를 호출 -> 서로 다른 동작
        // 컴파일러에러 회피: 오버라이딩된 메서드(부모도 같은 메서드가 있다)
        // JVM: 실제객체 기준으로만 메서드를 호출!
        for(Delivery d : dList) {
            d.printInfo(); // 부모의 메서드(내부에는 calcFee() 호출)
        }
    }
}
