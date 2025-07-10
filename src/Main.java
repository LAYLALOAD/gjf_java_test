//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //do-while 문: 반복 후 조건 검사, 최소 1회 실행 보장
        int num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num < 3);

//        //while 문: 조건이 참이면 계속 반복, 건만 명시, 반복 전에 조건 검사
//        int count = 3;
//        while (count > 0) {
//            System.out.println(count);
//            count--;
//        }

//        //Java 반복문
//        //for 문: : 반복 횟수가 정해진 경우 사용,초기화, 조건식, 증감식을 한 줄에 작성
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        //switch 문: 값에 따라 여러 분기로 나눔, break 필수
//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("월요일");
//                break;
//            case 2:
//                System.out.println("화요일");
//                break;
//            case 3:
//                System.out.println("수요일");
//                break;
//            default:
//                System.out.println("기타 요일");
//                break;
//        }

//        //Java 조건문
//        //if 문: 조건식의 결과에 따라 분기
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