package homework;

/**
 * Created by prots on 27.04.2017.
 */
public class Dog {
    private String name;
    Breed breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }
    Dog(String name, Breed breed, int age){
        setName(name);
        setBreed(breed);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed.toString();
    }

    public int getAge() {
        return age;
    }

    public enum Breed{
        CHOW_CHOW, LABRADOR_RETRIVER, ROYAL_PEKINGESE, PEKINGESE, POODLES, GERMAN_SHEPHERDS
    }

    public static String checkTheSameName(Dog dog1, Dog dog2, Dog dog3){
        if(dog1.name.equals(dog2.name) && dog2.name.equals(dog3.name) && dog1.name.equals(dog3.name)){
            return "You have dogs with the same name.";
        }
        else
            return "You have not dogs with the same name.";
    }

    public static String checkTheOldesDog(Dog dog1, Dog dog2, Dog dog3) {
        int tmp = dog1.age >= dog2.age ? (dog1.age >= dog3.age ? dog1.age : dog3.age) : dog2.age >= dog3.age ? dog2.age : dog3.age;
        if(tmp == dog1.age) {
            return "The oldest dog have " + Integer.toString(tmp) + " years. It's " + dog1.name;
        }
        if(tmp == dog2.age) {
            return "The oldest dog have " + Integer.toString(tmp) + " years. It's " + dog2.name;
        }
        if(tmp == dog3.age) {
            return "The oldest dog have " + Integer.toString(tmp) + " years. It's " + dog3.name;
        }
        else
            return "Wrong!";
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Linda",Breed.CHOW_CHOW, 5);
        Dog dog2 = new Dog("Tyson", Breed.LABRADOR_RETRIVER, 1);
        Dog dog3 = new Dog("Tufik", Breed.ROYAL_PEKINGESE, 3);

        System.out.println(checkTheSameName(dog1,dog2,dog3));
        System.out.println(checkTheOldesDog(dog1,dog2,dog3));
    }
}
