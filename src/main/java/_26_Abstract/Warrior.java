package _26_Abstract;

public class Warrior extends Character {

    public Warrior(String name) {
        // 전사
        super(name, 120, 25);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(name + "이" + targetName + "에게 강력하게 공격합니다.");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이" + attackDamage + "의 데미지를 받았습니다.");
    }
}
