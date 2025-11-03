package _30_Singleton;

public class LogManager {
    /*
    디자인패턴 - 싱글톤(스프링부트, 스프링에서 자주 등장)
    서버 전체에서 단 하나의 인스턴스를 공유하도록 하고 싶다.
    객체를 여러번 new로 만드는게 아니라, 한번만 만들고 재사용하고 싶다.
    어떤 객체를 싱글톤으로 설계해야 할까?
    - 상태(필드값 고정)가 존재하지 않을 때: ex) controller, service, repo-
    어떻게 구현 할 수 있을까?
    1. 생성자 - 외부에서 new로 만들지 못하게 private로 제한
    2. 메서드로 하나만 돌려쓰게 구현
    3. 외부에 공유할 단 하나의 객체 변수를 필드로 가진다.
    */

    // 외부접근을 막으면서, 전역에서 하나를 공유할 필드
    // 메서드영역에 저장될 변수
    // instance 변수에 공유할 객체의 heap 주소를 저장
    private static LogManager instance;

    // 기본생성자
    private LogManager() {} // private로 외부에서 new 금지

    // 외부용 접근 메서드
    // public(외부접근용), static(객체 생성전에도 호출되어야함)
    public static LogManager getInstance() {
        // 단 하나의 객체를 사용하도록 코드를 구현
        if (instance == null) { // 저장된 heap 주소가 없다면, (최초 1회만)
            // 새로 하나 heap에서 메모리 만들어서 주소를 대입해라!
            instance = new LogManager();
        }
        
        return instance; // 저장된 heap 주소가 있다면
    }

    // static 아님 -> 객체 생성 이후 사용
    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
    
    // 스프링 프레임워크에서는 객체를 싱글톤으로 관리한다.
    // 기능적인 서비스(service, repo-, controller) -> 템플릿화
    // 왜? 여러요청마다 new로 생성하면 메모리 낭비

}
