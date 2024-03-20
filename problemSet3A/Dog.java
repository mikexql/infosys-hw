

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Dog:"+super.getName();
    }

    @Override
    public String makeSound() {
        return getName()+" says Woof";
    }

}
