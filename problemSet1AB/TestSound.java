package problemSet1AB;

public class TestSound {
    // You are not required to modify this class
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new SiberianCat()};

        System.out.println( AnimalConcert.performConcert(animals) );
    }
}

// define all classes (AnimalConcert, Animal, Dog, Cat, Cow, SiberianCat) below this line
class Animal{
    public String makeSound(){
        return "I am just an animal";
    }
}

class Dog extends Animal{
    @Override
    public String makeSound(){
        return "Woof";
    }
}
class Cat extends Animal{
    @Override
    public String makeSound(){
        return "Meow";
    }
}
class Cow extends Animal{
    @Override
    public String makeSound(){
        return "Moo";
    }
}
class SiberianCat extends Cat{
}
class AnimalConcert{
    static String performConcert(Animal[] animals){
        String sounds=animals[0].makeSound();
        for (int i=1;i<animals.length;i++){
            sounds+=(", "+animals[i].makeSound());
        }
        return sounds;
    }
}