package _32_Enum;

public class GradeMain {
    public static void main(String[] args) {
        int price = 10000;

        double basicPrice = Grade.BASIC.getDiscountPrice(price);
        double goldPrice = Grade.GOLD.getDiscountPrice(price);
        double diamondPrice = Grade.DIAMOND.getDiscountPrice(price);

        // Enum 클래스를 상속받았다.
        // -> Enum에 선언되어있는 메서드를 상속해서 쓸 수 있다.
        // String -> Enum / Enum -> String
        // Database는 자바환경이 아니라서 우리가 직접정의한 Enum을 모른다.
        // Database에는 문자열로 전송하는 경우가 잦다.

        // 1. String -> Enum("GOLD" 문자열로 GOLD 객체 불러오기)
        // DB에 있는 데이터를 자바로 읽어올때
        Grade goldInstance = Grade.valueOf("GOLD");
        System.out.println(goldInstance == Grade.GOLD); // true

        // 2. Enum -> String
        // 자바에 있는 데이터를 DB에 쓸때
        String GradeName = Grade.GOLD.name();
        System.out.println(GradeName);




    }
}
