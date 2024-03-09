package problemSet1AB;

import java.util.ArrayList;

public class FilterPersonExample {
    // No need to modify this class
    public static void main(String[] args) {
        Person p1 = new Person("A", 90, 'F', false);
        Person p2 = new Person("B", 60, 'M', true);
        Person p3 = new Person("C", 30, 'F', true);
        Person[] p = {p1, p2, p3};

        System.out.println( Filter.seniorFilter(p) );
    }
}

class Filter {
    public static ArrayList seniorFilter(Person[] person){
        ArrayList<String> oldies = new ArrayList<String>();
        for (int i=0;i< person.length;i++){
            if (person[i].getAge()>=60){
                oldies.add(person[i].getName());
            }
        }
        return oldies;
    }

}



class Person {
    private String name;
    private int age;
    private char gender;
    private boolean sharingConsent;
    public Person(String name, int age, char gender, boolean sharingConsent){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.sharingConsent=sharingConsent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        if (getSharingConsent()){
            return name;
        }else{
            return "Anonymous";
        }
    }

    public boolean getSharingConsent(){
        return sharingConsent;
    }
}
