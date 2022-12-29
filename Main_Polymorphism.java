public class Main_Polymorphism {
    public static void main(String[] args) {

        Animal_Sound animalSound = new Animal_Sound();
        Cow_Sound cowSound = new Cow_Sound();
        Cat_Sound catSound = new Cat_Sound();

        animalSound.Sound();
        cowSound.Sound();
        catSound.Sound();
    }
}
