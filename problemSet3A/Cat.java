

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Cat:"+super.getName();
    }

    @Override
    public String makeSound() {
        return getName()+" says Meow";
    }


}
