// TODO Complete this 

public class FarmFactory implements AnimalFactory{


    @Override
    public Animal createAnimal(String type, String name) {
        if (type=="Cat"){
            return new Cat(name);
        } else if (type=="Dog") {
            return new Dog(name);
        } else if (type=="Cow") {
            return new Cow(name);
        }else {
            return null;
        }
    }
}
