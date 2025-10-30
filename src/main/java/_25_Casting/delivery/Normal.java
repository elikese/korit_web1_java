package _25_Casting.delivery;

public class Normal extends Delivery {

    public Normal(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public int calcFee() {
        System.out.println("일반배송 계산 시작");
        int fee = 3000 + distance * 200 + weight * 100;
        return fee;
    }
}
