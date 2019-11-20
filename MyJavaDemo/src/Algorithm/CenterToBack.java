package Algorithm;
import java.util.Stack;

public class CenterToBack {
    private Stack<Character> opStack;
    private Stack<Character> outStack;
    private String input;
    
    public CenterToBack(String in) {
        input = in;
        opStack = new Stack<Character>();
        outStack = new Stack<Character>();
    }
    
    public Stack<Character> doTrans() { //其他类型自行转换
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
            case '+':
            case '-':
                operationOpStack(ch, 1);
                break;
            case '*':
            case '/':
                operationOpStack(ch, 2);
                break;
            case '(':
                opStack.push(ch);
                break;
            case ')':
                operationParen();
                break;
            default:
                outStack.push(ch);
                break;
            }
        }
        while (!opStack.isEmpty()) {
            outStack.push(opStack.pop());
        }
        return outStack;
    }
    
    public void operationOpStack(char opThis, int prec1) {//运算符栈操作
        while (!opStack.isEmpty()) {
            char opTop = opStack.pop();
            if (opTop == '(') {
                opStack.push(opTop);
            }
            else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    opStack.push(opTop);
                    break;
                }
                else
                    outStack.push(opTop);
            }
        }
        opStack.push(opThis);
    }
    public void operationParen() {
        while (!opStack.isEmpty()) {
            char c = opStack.pop();
            if (c == '(') 
                break;
            else
                outStack.push(c);
        }
    }
    
    public static void main(String[] args) {
        String input = "1+2*4/5-7+3/6";
        CenterToBack theTrans = new CenterToBack(input);
        Stack<Character> output = theTrans.doTrans(); 
        System.out.println("Postfix is " + output + '\n');
    }
}
