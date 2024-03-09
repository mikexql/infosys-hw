package problemSet1AB;

import java.util.Arrays;

public class BaseInteger {

    private String representation;
    private int base;

    private int[] digits;
    private int decimalValue;

    BaseInteger( String representation, int base){
        this.representation = deleteSpaces(representation);
        this.base = base;
        convertRepresentationToArray();
        setDecimalValue();
    }


    private void convertRepresentationToArray(){
        String[] arrStr=this.representation.split(",");
        digits=new int[arrStr.length];
        for (int i =0;i<arrStr.length;i++){
            this.digits[i]=Integer.parseInt(arrStr[i]);
        }

    }

    private void setDecimalValue(){
        for (int i= 0;i< digits.length;i++){
            this.decimalValue+=this.digits[digits.length-1-i]*Math.pow(this.base,i);
        }
    }

    public int getDecimalValue() {
        return decimalValue;
    }

    public String getDigitsString(){
        return Arrays.toString(digits);
    }


    public BaseInteger add(BaseInteger other, int base){
        int total=this.getDecimalValue()+ other.getDecimalValue();
        String newString=convertBase(total,base);
        BaseInteger sum= new BaseInteger(newString,base);
        return sum;
    }

    private String convertBase(int decimalValue, int base){
        String decimalString="";
        int remainder=0;
        while (decimalValue>0){
            remainder=decimalValue%base;
            decimalValue=decimalValue/base;
            decimalString=","+remainder+decimalString;
        }
        return decimalString.replaceFirst(",","");
    }

    private String deleteSpaces( String representation){
        return representation.replaceAll(" ","");
    }

    @Override
    public String toString() {
        return representation + " Base " + base;
    }
}

