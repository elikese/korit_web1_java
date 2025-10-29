package _22_Static;

public class Main {
    /*
    public: 외부에서 접근할 수 있다. JVM이 호출해야 하니까
    static: 객체 생성없이, 실행가능해야함
    void: 리턴x main은 오로지 프로그램 시작만 담당
    String[] args -> args라는 변수로 외부로부터 문자열배열을 받아오겠다.
    -> java 외부로부터 데이터를 받아오는 역할
    */
    public static void main(String[] args) {
        
        /*
        메서드영역(Method Area)
        - 클래스 정보를 저장하는 공간
        - 클래스정보: 메서드정보(메서드 시그니처), static 변수

        - 참고) 메서드영역은 main 실행 하자 마자 먼저 로드된다.
        */
        
        
        StaticData staticData1 = new StaticData(1);
        StaticData staticData2 = new StaticData(2);
        StaticData staticData3 = new StaticData(3);
        // 생성자 총 3번 호출

        // 생성자는 3번 호출 되었더라도,
        // count는 객체마다 가지고 있는 변수라서 0->1 (최초호출)
        // 변경 이후 아무일도 일어나지 않았다.
        System.out.println(staticData1.count); // 값? 1
        System.out.println(staticData2.count); // 값? 1
        System.out.println(staticData3.count); // 값? 1

        // staticCount변수는 heap에 있을까? heap에 없다.
        // 별도의 메모리 공간에 존재(Method Area)
        // 클래스 변수로서,
        // 그 클래스로 부터 만들어진 모든 객체가 공유한다(하나의 메모리공간만 차지한다)
        System.out.println(staticData1.staticCount); // 값? 3
        System.out.println(staticData2.staticCount); // ? 3
        System.out.println(staticData3.staticCount); // ? 3

        // 클래스로도 참조할 수 있음(권장되는 방식)
        System.out.println(StaticData.staticCount);



    }
}
