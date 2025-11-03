package _30_Singleton;

public class Main {
    public static void main(String[] args) {
        // 스태틱메서드로 객체생성
        LogManager logger1 = LogManager.getInstance();
        logger1.log("첫번째 로그");

        LogManager logger2 = LogManager.getInstance();
        logger2.log("두번째 로그");
        
        // 정말 같은 주소(stack에 저장된 값)일까?
        System.out.println(logger1 == logger2); // true
        // 정말로 하나의 객체를 사용하더라

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        System.out.println(config1 == config2); // true

        System.out.println(config1);
        System.out.println(config2);

        // 설정값(객체 상태를)을 공유한다
        // config1의 상태를 변경
        config1.setAppMode(AppConfig.PRODUCTION_MODE);

        // config1과 config2의 상태 모두 변경 -> 같은 객체다.
        System.out.println(config1);
        System.out.println(config2);

    }
}
