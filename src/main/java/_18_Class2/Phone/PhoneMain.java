package _18_Class2.Phone;

public class PhoneMain {
    public static void main(String[] args) {
        /* 실습
        Phone 클래스를 정의해 주세요.
        필드: battery(int), isPowerOn(boolean)
        메서드:
        turnOn: 전원켜기(배터리가 10% 이상일때만 가능)
        turnOff: 전원끄기
        playYoutube: 전원이 켜져있고, 배터리가 5% 이상일때만 가능, 배터리 5%소모
        charge: 충전하기(20% 충전, 최대 100%)
        */

        Phone myPhone = new Phone();
        // 초기화(직접 접근 중)
        myPhone.battery = 50;
        myPhone.isPowerOn = false;

        // 캡슐화 - 내부구현은 main에서는 알 수 없다.
        // myPhone의 필드에 주소로 직접 접근하지 않는다.
        myPhone.turnOn();
        myPhone.playYoutube();
        myPhone.charge();
        myPhone.turnOff();

    }
}
