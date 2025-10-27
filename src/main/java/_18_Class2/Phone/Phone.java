package _18_Class2.Phone;

public class Phone {
    int battery;
    boolean isPowerOn;

    // turnOn: 전원켜기(배터리가 10% 이상일때만 가능)
    void turnOn() {
        if (this.battery < 10) {
            System.out.println("배터리가 부족합니다. 전원을 켤수 없습니다.");
            return;
        }

        this.isPowerOn = true;
        System.out.println("핸드폰 전원을 켭니다");
    }

    // 전원 끄기
    void turnOff() {
        if (!this.isPowerOn) {
            System.out.println("이미 전원이 꺼져있습니다.");
            return;
        }

        this.isPowerOn = false;
        System.out.println("전원을 끕니다.");
    }

    // 전원이 켜져있고, 배터리가 5% 이상일때만 가능, 배터리 5%소모
    void playYoutube() {
        if(!isPowerOn) {
            System.out.println("전원을 먼저 켜주세요");
            return;
        }

        if(battery < 5) {
            System.out.println("배터리가 부족합니다(최소 5%필요)");
            return;
        }

        battery -= 5;
        System.out.println("유투브 시작!");

    }

    // 충전하기(20% 충전, 최대 100%)
    void charge() {
        battery += 20;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("배터리를 충전했습니다");
    }
}
