package problemSet2A;

import java.util.Comparator;

public class OctagonComparator implements Comparator<Octagon> {
    @Override
    public int compare(Octagon o, Octagon b){
        double diff=o.getSide()-b.getSide();
        if (diff>0){
            return 1;
        } else if (diff==0) {
            return 0;
        } else
            return -1;
    }
}
