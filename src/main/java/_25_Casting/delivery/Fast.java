package _25_Casting.delivery;

public class Fast extends Delivery {
    public Fast(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public int calcFee() {
        System.out.println("특급배송 계산 시작");
        int fee = 4000 + distance * 300 + weight * 200;
        return fee;
    }
}
