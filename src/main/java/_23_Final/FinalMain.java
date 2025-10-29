package _23_Final;

public class FinalMain {
    public static void main(String[] args) {
        // final 키워드: 반드시 "한번"만 "초기화" 되어야 한다.(변수)
        // 재대입 x, 초기화가 필수

        final int data1; // data1
        data1 = 10;
        // data1 = 20; 재대입 x

        final int data2 = 20;
        // data2 = 30; 재대입 x
        
        FinalStudent student1 
                = new FinalStudent("김자바", 20250001, 20);
        
        student1.printInfo("자바고");
        student1.setAge(21);
        
        final FinalStudent student2 
                = new FinalStudent("이자바", 20250002, 20);
        
        student2.setAge(21); // 가능
        // student2 = new FinalStudent("이자바", 20250002, 21); 불가능
        
        // 왜 final 키워드가 붙었는데 객체의 상태는 변경할 수 있는가?
        // 결론: final은 스택에 있는 변수가 저장하고 있는 값을 변경하지 못하게 하는 것
        
        // 퀴즈) final로 재대입을 막고있는데, 재대입을 막는건 
        // 1. JVM (x)
        // 2. 컴파일러 (o)

        System.out.println(Constant.GAME_NAME);
        System.out.println(Constant.MAX_LEVEL);
        
    }
}
