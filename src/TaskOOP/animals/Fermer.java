package TaskOOP.animals;

public class Fermer implements  GiveFood{
    private int resourceFerm = 5;

    public int getResource (Pets anyPet) {
        this.resourceFerm += anyPet.getOneDayPut();
        System.out.println("Получен профит c " + anyPet.getName());
        return this.resourceFerm;
    }

    public int eat(int resourceFerm){
        this.resourceFerm -= 4;
        return this.resourceFerm;
    }

    @Override
    public void giveFood() {

    }

    public void oneDay(){
        Fermi f1 = new Fermi();

    }
}
