package TaskOOP.animals;

public class WildAnimals extends Animals {
    private int damage;

    public WildAnimals(String name, int weight, int speed, int damage) {
        super(name, weight, speed);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

   /* public int hunt (Pets prey) {
        if (prey.getSpeed()<this.getSpeed()){
            System.out.println("Хищник догнал добычу ");
            this.prey.getHealth() -= this.getDamage();
        }
        else if (prey.getSpeed()<this.getSpeed()&&this.prey.getHealth()<=this.getDamage()) {
            System.out.println("Животное убито");
        }
        else {System.out.println("Животное не было догнано ");}
        return prey.getHealth();
    }*/
}
