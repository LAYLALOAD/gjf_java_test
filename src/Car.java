public class Car {

    //메소드

    //접근자 반환형 이름 : 이 메소드에 대해서 외부에서 접근을 혀용할지 안할지
    public static int addCal(int a, int b) {
        int sum = a + b; // a와 b를 더함
        return sum; // 합계를 반환

    }

    public static void main(String[] args) {
        int sum = addCal(3, 4);// 메소드 호출
        System.out.println("합계: " +sum); // 결과 출력
    }
}
