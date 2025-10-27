package _17_Class;

public class ClassMain {
    public static void main(String[] args) {
        // 클래스 -> 나만의 참조 자료형을 정의 하는 것.
        // 학생 점수를 관리한다고 생각!
        
        int[] scores = {80, 90, 40, 60, 50}; // 누구의 점수인가?
        String[] names = {"홍길동0", "홍길동1"}; // index끼리 동기화해서 관리

        // 이름은 홍길동,국어,영어,수학 점수를 몇점씩 저장
        // (학생이름, 국, 영, 수) -> 한셋트로 저장
        // (String, int, int, int) -> 묶어주는 배열? x 자료형? x
        // 저런 자료들의 묶음을 직접 정의하겠다 -> 클래스 정의

        // Student 타입의 "student1" 변수 선언 -> stack에 student1 생성
        Student student1;
        // new : 참조자료형 데이터를 저장할때(heap에 메모리공간을 할당)
        // 할당하고, 메모리주소(heap주소)를 student1 변수에 대입
        student1 = new Student();
        
        // student1의 주소에 접근하여, 필드값들을 초기화
        // arr[1] -> arr배열의 index 1에 접근
        student1.name = "홍길동";
        student1.korean = 90;
        student1.english = 80;
        student1.math = 70;

        // 선언과 생성을 동시에
        Student student2 = new Student();
        // student2가 담은 객체의 주소는 30번째 라인에서 생성되었다.
        // student2가 담은 객체의 주소는 29번째 라인에서는 메모리에 없다.

        
        // student1은 변수, Student는 클래스(자료형,타입)
        // 객체(Object)? 인스턴스(instance)?
        // 객체와 인스턴스는 사실상 같은 말이다.
        // student1과 student2는 객체(인스턴스)의 주소를 담은 변수다(o)
        // student1과 student2는 Student 클래스로 만들어진 인스턴스다(o)
        // Student는 객체다(x) -> 클래스는 객체가 아니다.

        // 엄밀히 말하면 틀린말이지만, 자주쓰는 말
        // student1, student2 -> 객체,인스턴스

        // Student들을 저장하는 배열
        Student[] students = {student1, student2};

        /*
        클래스를 정의해주세요
        클래스이름 : Car
        필드: brand(브랜드명), model(모델명), year(출시년도)
        1. main에서 Car 객체를 생성
        2. 객체의 필드에 접근해서 현대, 소나타, 2023으로 초기화
        3. 필드값들에 접근해서 "현대-소나타-2023년식"을 콘솔에 출력!
        */

        // 선언 생성 동시
        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "소나타";
        car1.year = 2023;

        System.out.println(car1.brand
                + "-"
                + car1.model
                + "-"
                + car1.year
                + "년식");
    }
}
