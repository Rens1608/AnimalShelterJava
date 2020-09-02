import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    List<Animal> Animals = new ArrayList<Animal>();

    public List<Animal> getAnimals() {
        return Animals;
    }

    public void setAnimals(List<Animal> animals) {
        Animals = animals;
    }

    public void newCat(String name, Gender gender, String badHabits){
        Animals.add(new Cat(gender, name, badHabits));
    }

    public void newDog(String name, Gender gender){
        Animals.add(new Dog(gender , name));
    }
}
