public class TestingFixExpression {

    public static void main(String[] args) {

        FixExpression fixExpression1 = new TrivialImplExpression("1+2");
        System.out.println(fixExpression1.isValidString()); //true

        FixExpression fixExpression2 = new TrivialImplExpression("abc");
        System.out.println(fixExpression2.isValidString()); //false

    }
}

class TrivialImplExpression extends FixExpression{

    public TrivialImplExpression(String string){
        super(string);
    }
    @Override
    public int evaluateExpression() {
        return 0;
    }
}
