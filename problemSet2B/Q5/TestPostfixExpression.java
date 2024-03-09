public class TestPostfixExpression {

    public static void main(String[] args) {

        FixExpression f1 = new PostfixExpression("12+");
        System.out.println(f1.evaluateExpression()); //3

        FixExpression f2 = new PostfixExpression("234*+");
        System.out.println(f2.evaluateExpression()); //14

        FixExpression f3 = new PostfixExpression("1");
        System.out.println(f3.evaluateExpression()); // 1
    }
}
