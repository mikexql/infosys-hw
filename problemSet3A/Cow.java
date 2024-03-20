
public class Cow extends Animal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Cow:"+super.getName();
    }

    @Override
    public String makeSound() {
        return getName()+" says Moo Moo";
    }


}
