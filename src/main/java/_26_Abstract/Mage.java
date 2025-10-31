package _26_Abstract;
/*
Mage는 체력이 80, 공격력이 30
공격시에 name이 targetName에게 마법 미사일을 발사합니다! 출력
 */
public class Mage extends Character {

    public Mage(String name) {
        super(name, 80, 30);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(name + "이" + targetName + "에게 마법 미사일을 발사합니다.");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이" + attackDamage + "의 데미지를 받았습니다.");
    }
}
