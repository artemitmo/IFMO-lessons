package TaskOOP.animals;

public class Fermi {
    public Pets[] callArrPet () {
    Pets[] petsM = new Pets[20];
    petsM[0] = new Pets("Cow1", 120, 5, 60, 15);
    petsM[1] = new Pets("Cow2", 100, 5, 70, 19);
    petsM[2] = new Pets("Cow3", 110, 5, 60, 10);
    petsM[3] = new Pets("Cat1", 15, 30, 20);
    petsM[4] = new Pets("Rabbit",5 , 27, 20);
    petsM[5] = new Pets("Rabbit1", 2, 25, 20);
    petsM[6] = new Pets("Chicken", 5, 10, 30, 3);
    petsM[7] = new Pets("Chicken2", 5, 14, 30, 3);
    return petsM;}

    public WildAnimals[] callArrWild(){
        WildAnimals[] wildA = new WildAnimals[3];
        wildA[0] = new WildAnimals("Wolf", 100, 10, 30);
        wildA[1] = new WildAnimals("Fox", 70, 25, 20);
        wildA[2] = new WildAnimals("Bear", 70, 10, 20);
        return wildA;
    }


}
