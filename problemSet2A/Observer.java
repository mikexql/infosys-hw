package problemSet2A;

//**SEE BELOW** modify AirPollutionAlert
//Necessary Import statements here
import java.util.ArrayList;
// **** YOU DO NOT NEED TO MODIFY THIS PART OF THE CODE -------
interface Observer{
    void update(double airPollutionIndex);
}

class Subscriber implements Observer{
    private Subject subject;
    private String observerId;
    public static String outputMessage = "";

    public Subscriber(String observerId, Subject subject){
        this.subject=subject;
        this.observerId = observerId;
        this.subject.register(this);		// register itself
    }

    @Override
    public void update(double airPollutionIndex) {
        String s = this.observerId + " received notification: " + airPollutionIndex;
        System.out.println(s);
        outputMessage += (s + " ");
    }
}

interface Subject{
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
//-------------------------------------------------------

//TODO: modify AirPollutionAlert to implement interface Subject, under Observer design pattern
class AirPollutionAlert implements Subject{
    private double airPollutionIndex;
    private ArrayList<Observer> listOfObservers;

    @Override
    public void register(Observer o) {
        if (listOfObservers==null) {
            listOfObservers = new ArrayList<Observer>();
        }
        listOfObservers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        for (int i=0; i<listOfObservers.size();i++){
            if (listOfObservers.get(i)==o){
                listOfObservers.remove(i);
            }

        }
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i<listOfObservers.size();i++){
            listOfObservers.get(i).update(airPollutionIndex);
        }

    }

    public void setAirPollutionIndex(double airPollutionIndex) {
        this.airPollutionIndex = airPollutionIndex;
        if (airPollutionIndex>100){
            this.notifyObservers();
        }
    }
}


/* Some information on test cases:
 Test Cases 1, 3, 5 and 8 use an airPollutionIndex that is less than 100
 The rest use an airPollutionIndex that is larger than 100 */
