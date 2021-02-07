import java.util.Arrays;

public class Calculator {
    public static void main(String[] args) {
        Sum sObj = new Sum();
        Multiple mObj = new Multiple();
        System.out.println("Sum = " +sObj.doSum(1,2));
        System.out.println("Multiply = " + mObj.multiple(2,3));
    }
}
