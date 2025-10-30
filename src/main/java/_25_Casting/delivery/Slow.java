package _25_Casting.delivery;

public class Slow extends Delivery {
    public Slow(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public int calcFee() {
        System.out.println("느린 배송 계산시작");
        int fee = 2000 + distance * 150 + weight * 50;
        return fee;
    }
}
