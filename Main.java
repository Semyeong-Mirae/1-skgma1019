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
    // multiply는 default 메서드 그대로 사용 (오버라이딩 생략 가능)
}

public class Main{
    public static void main(String[] args){
        NCalculator cc = new NCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 1: ");
        int num1 = sc.nextInt();
          System.out.print("숫자를 입력하세요 2: ");
        int num2 = sc.nextInt();
        System.out.println(cc.add(num1,num2));
        System.out.println(cc.multiply(num1,num2));
        System.out.println(Calculator.subtract(num1,num2));
    }
}
