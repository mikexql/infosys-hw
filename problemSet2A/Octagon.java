package problemSet2A;

//Modify the class header and implement any necessary methods
public class Octagon implements Comparable<Octagon> {
    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public int compareTo(Octagon o) {
        double diff=this.getSide()-o.getSide();
        if (diff>0){
            return 1;
        } else if (diff==0) {
            return 0;
        } else
        return -1;
    }
}
