package example;

public class Human {
    
    private int damage;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Maou attack(Maou maou) {
        maou.setHp(maou.getHp() - this.damage);

        return maou;
    }

    public int getDamage() {
        return this.damage;
    }

}
