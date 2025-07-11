public class Calculator {

    // 덧셈
    public int add(int a, int b) {
        return a + b;
    }

    // 뺄셈
    public int subtract(int a, int b) {
        return a - b;
    }

    // 곱셈
    public int multiply(int a, int b) {
        return a * b;
    }

    // 나눗셈
    public double divide(int a, int b) {

        //예외처리
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }

//        if (b == 0) {
//            System.out.println("0으로 나눌 수 없습니다.");
//            return 0;
//        }
        return (double) a / b;
    }

    // main 메소드
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 10;
        int num2 = 0;

        System.out.println("덧셈: " + calc.add(num1, num2));
        System.out.println("뺄셈: " + calc.subtract(num1, num2));
        System.out.println("곱셈: " + calc.multiply(num1, num2));
        System.out.println("나눗셈: " + calc.divide(num1, num2));

    }


//

}
