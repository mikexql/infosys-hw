

import java.util.*;

public class Zoo {

    private AnimalFactory animalFactory;
    private List<Animal> animalList;

    Zoo(AnimalFactory animalFactory){
        // TODO Complete the constructor
        this.animalFactory=animalFactory;
        this.animalList=new ArrayList<Animal>();
    }

    public void addAnimal(String type, String name){
       // TODO Complete this method
        Animal temp=animalFactory.createAnimal(type,name);
        if (temp!=null){
            animalList.add(temp);
        }
    }

    public String performConcert(){
        String temp="";
        for (int i = 0;i < animalList.size();i++){
            temp+=animalList.get(i).makeSound()+"*";
        }
        return temp;
    }

    @Override
    public String toString() {
        // TODO Complete this method
        return animalList.toString();
    }


}
