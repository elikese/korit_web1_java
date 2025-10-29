package _22_Static.ticket;

public class NumberTicket {
    // 모든 객체들이 공유
    // 번호표를 뽑으면 nextNum 1씩 증가
    public static int nextNum = 1;
    
    // 인스턴스는 그 번호표를 num이라는 인스턴스 변수에 저장
    private int num;

    // new 할때마다 번호표가 1씩 증가된 상태로 생성
    // 생성자에서 매개변수로 초기화하는게 아니라
    // static 변수를 사용해서 초기화
    // 1. 생성자(new를 할때 호출)
    public NumberTicket() {
        this.num = nextNum++; // 대입하고, 증가
        System.out.println("번호표 발급! 번호: " + num);
    }

    // 2. getter - getNum()
    public int getNum() {
        return num;
    }
}
