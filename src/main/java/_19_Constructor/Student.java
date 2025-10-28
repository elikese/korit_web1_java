package _19_Constructor;

public class Student {
    String name;
    int kor;
    int eng;
    int math;

    // 클래스 내에 정의한 생성자가 없으면
    // -> 자바가 자동으로 기본 생성자(NoArgsConstructor)를 만들어준다.

    // 클래스 내에 하나라도 생성자를 정의하면
    // -> 기본생성자는 사라진다.

    /* 생성자
    1. 클래스 이름과 동일해야 한다.
    2. 반환 타입을 명시하지 않는다.(없다)
    3. 객체 생성시(new 연산시) 자동으로 호출된다.
    4. 생성자도 오버로딩을 할 수 있다.

    --- 엄밀하게 말하면 생성자 != 메서드
    -> 자바가 통일감 있는 문법을 보여주고자, 메서드와 비슷하게 사용하게 설계함
    */
    public Student(String name, int kor, int eng, int math) {
        System.out.println("Student 생성자 호출 됨!");
        // 매개변수로 들어온 값들을 검증해야함!


        boolean korValidation = validateScore(kor);
        boolean engValidation = validateScore(eng);
        boolean mathValidation = validateScore(math);

        // false면 if 문 실행
        if(!korValidation || !engValidation || !mathValidation) {
            System.out.println("점수는 0~100 이어야합니다.");
            return; // 원래라면 정의한 에러를 일으켜야한다.
        }

        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        // student1의 입장에서 student1.eng 와 this.eng는 같은 말이다.
        // student2의 입장에서 student2.eng 와 this.eng는 같은 말이다.


        /*
        this란? 객체 자신을 가르키는 참조값(주소)이다.
        Student student2 = new Student(~,~,~,~);
        Student student1 = new Student(~,~,~,~);
        student2.kor -> student2의 kor 필드에 있는 데이터
        student1.kor -> student1의 kor 필드에 있는 데이터
        
        this는 호출한 객체의 자기자신의 주소를 의미하는 대명사
        this.kor -> 해당 메서드(생성자)를 호출한 객체의 주소에 있는 kor 필드의 데이터
        */



    }

    public boolean validateScore(int score) {
        if (score > 100) {
            return false;
        }

        if (score < 0) {
            return false;
        }

        return true;
    }
    
    // 기본생성자(NoArgsConstructor)
    public Student() {}

    // 이름만 받아주는 생성자
    public Student(String name) {
        this(name, 0, 0, 0);
        // this()
        // this() != this 서로 상관없음.
        // 같은 이름의 생성자를 호출 -> 오버로딩된 생성자를 호출
        // 제약사항: 생성자의 가장 첫줄에 적어줘야 한다.
    }

}
