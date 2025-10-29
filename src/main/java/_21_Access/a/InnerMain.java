package _21_Access.a;

public class InnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        
        // public - 직접 접근 가능
        accessData.publicField = 1; // 가능
        accessData.publicMethod(); // 호출 가능
        
        // default - 같은 패키지라서 가능
        accessData.defaultField = 2;
        accessData.defaultMethod();
        
        // private - 클래스 내부에서만 접근가능
        // accessData.privateField 접근 불가
        // accessData.privateMethod(); 호출이 불가능하다!
        
        // private 필드, 메서드 -> 접근하려면 열려있는 메서드로 접근해야한다.
        accessData.inner(); // 간접적으로 내부에 접근
        
    }
}
