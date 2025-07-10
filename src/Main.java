//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //switch 문
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
                break;
        }

//        //Java 조건문
//        //if 문
//        int num = 10;
//        if (num > 0) {
//            System.out.println("양수입니다.");
//        } else if (num == 0) {
//            System.out.println("0입니다.");
//        } else {
//            System.out.println("음수입니다.");
//        }

//        //비트 연산자: &, |, ^, ~, <<, >>, >>>
//        int n = 5; // 0101
//        int m = 3; // 0011
//        System.out.println(n & m); // 1 (0001)

//        //조건(삼항) 연산자: 조건식 ? 값1 : 값2
//        int score = 85;
//        String grade = (score >= 90) ? "A" : "B";
//        System.out.println(grade);

//        //증감 연산자: ++, -
//        int i = 1;
//        i++; // i = 2
//        System.out.println(i);

//        //논리 연산자: && (AND), || (OR), ! (NOT)
//        boolean result = (5 > 3) && (10 > 5); // true
//        System.out.println(result);

//        //비교 연산자: ==, !=, >, <, >=, <=
//        int num = 5;
//        System.out.println(num == 5); // true

//        //대입 연산자: =, +=, =, =, /=, %= 등
//        int x = 5;
//        x += 3; // x = x + 3 → 8
//        System.out.println(x);

//        //Java 연산자
//        //산술 연산자: + (더하기),  (빼기),  (곱하기), / (나누기), % (나머지)\
//        int a = 10;
//        int b = 3;
//        System.out.println(a + b); // 13
//        System.out.println(a % b); // 1

//        // first commit
//        //System.out.printf("Hello world!!");

    }
}