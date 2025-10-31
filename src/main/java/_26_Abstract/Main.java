package _26_Abstract;

public class Main {
    public static void main(String[] args) {
        // 추상클래스는 직접 인스턴스(객체)를 생성할 수 없다.
        // Character ch1 = new Character("테스트", 20, 10); // 컴파일 에러

        Character warrior1 = new Warrior("전사1"); // 업캐스팅
        Character warrior2 = new Warrior("전사2"); // 업캐스팅

        // 컴파일러는 부모(Character)클래스에 attack()이 있는지 검사 -> 통과
        // JVM은 new로 생성된 객체(Warrior 객체)의 attack()을 호출!
        // 오버라이딩이 강제된다! -> 업캐스팅 되더라도 자식의 메서드를 호출하겠다.
        warrior1.attack(warrior2);

        /* 실습)
        Mage 클래스, Archer 클래스를 만들어 주세요! - Character 상속을 받자!
        Mage는 체력이 80, 공격력이 30
        공격시에 name이 targetName에게 마법 미사일을 발사합니다! 출력
        Archer 체력이 100, 공격력이 20
        공격시에 name이 targetName에게 관통 화살을 발사합니다! 출력
        */

        Character mage1 = new Mage("법사1"); // 업캐스팅
        Character archer1 = new Archer("궁수1"); // 업캐스팅

        Character[] characters = {warrior2, mage1, archer1};

        // 추상 클래스 상속 -> 오버라이딩 강제 -> 다형성 보장
        // attack은 객체마다 서로 다르게 작동하게 된다.
        for(Character ch : characters) {
            ch.attack(warrior1);
        }

    }
}
