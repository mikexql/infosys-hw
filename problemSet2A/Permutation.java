import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        Permutation neeew= new Permutation("abb");
        neeew.permute();
        System.out.println(neeew.a);
    }
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed

    Permutation(final String str){
        in = str;
        a =new ArrayList<String>();
        // additional initialization if needed
    }

    public void permute(){
        runPermute(in,"");
    }

    public void runPermute(String str, String current){
        // produce the permuted sequence of 'in' and store in 'a', recursively
        if (str.isEmpty()){
            getA().add(current);
            return;
        }
        for (int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            String remainder=str.substring(0,i)+str.substring(i+1);
            runPermute(remainder,current+temp);
            }
        }

    public ArrayList<String> getA(){
        return a;
    }
}

