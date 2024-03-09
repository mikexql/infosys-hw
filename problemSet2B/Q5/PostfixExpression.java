
public class PostfixExpression extends FixExpression {
    private String operators="+-*/";
    private String operands="0123456789";
    public PostfixExpression(String expression){
        super(expression);
    }

    @Override
    public int evaluateExpression(){
        if (!isValidString()){
            return Integer.MIN_VALUE;
        }
        else {
            CustomStack<Integer> newStack = new StackImpl<Integer>();
            for (int i = 0; i < getExpression().length(); i++) {
                char c = getExpression().charAt(i);
                if (operands.contains(c+"")) {
                    int cInt = Character.getNumericValue(c);
                    newStack.push(cInt);
                } else if (operators.contains(c+"")) {
                    int p1 = newStack.pop();
                    int p2 = newStack.pop();
                    if (c == '+') {
                        newStack.push(p2 + p1);
                    } else if (c == '-') {
                        newStack.push(p2 - p1);
                    } else if (c == '*') {
                        newStack.push(p2 * p1);
                    } else if (c == '/') {
                        newStack.push(p2 / p1);
                    }
                }
            }
            return newStack.pop();
        }
    }
}
