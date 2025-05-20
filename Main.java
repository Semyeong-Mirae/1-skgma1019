import java.util.Scanner;

interface Calculator{
    int add(int a, int b);
    default int multiply(int a, int b){
        return a * b;
    }
    static int subtract(int a, int b){
        return a - b;
    }
}
class NCalculator implements Calculator{
    @Override
    public int add(int a, int b){
        return a + b;
    }
   
}

public class Main{
    public static void main(String[] args){
        NCalculator cc = new NCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int num1 = sc.nextInt();
          System.out.print("");
        int num2 = sc.nextInt();
        System.out.println(cc.add(num1,num2));
        System.out.println(cc.multiply(num1,num2));
        System.out.println(Calculator.subtract(num1,num2));
    }
}
