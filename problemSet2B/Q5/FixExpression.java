// COPY AND PASTE YOUR SOLUTION FROM THE PREVIOUS QUESTION HERE
public abstract class FixExpression {


    private String expression;
    private String validChars = "0123456789+-*/";

    FixExpression(String expression){
        this.expression = expression;
    }

    public boolean isValidString(){
        for (int i=0;i<getExpression().length();i++){
            if (!getValidChars().contains(getExpression().charAt(i)+"")){
                return false;
            }
        }
        return true;
    }

    public String getExpression() {
        return expression;
    }

    public String getValidChars() {
        return validChars;
    }

    public abstract int evaluateExpression();

}
