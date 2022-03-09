package TemaCurs3;

public class Dog implements IAnimal{
    private AnimalName animalName;
    private static final String DOG_NAME_PREFIX = "My dog name is: ";
    private static final String DOG_SOUND_PREFIX = "My dog makes the sound: ";

    public Dog (AnimalName animalName){
        this.animalName = animalName;
    }


    @Override
    public String makeSound(){
        return DOG_SOUND_PREFIX + "Dog Sound";
    }

    @Override
    public String getAnimalName() {
        return DOG_NAME_PREFIX + animalName.getAnimalName();
    }
}
