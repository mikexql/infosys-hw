import java.util.Objects;

public abstract class Animal {

    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String makeSound();
    
    @Override
    public String toString(){
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    // override toString(), equals() and hashCode()

}