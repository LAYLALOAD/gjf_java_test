public class Car {

    private String brand;
    private String model;
    private int year;

    public void move() {
        System.out.println("자동차가 움직입니다.");
    }

    public void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    // model 설정/조회
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    // year 설정/조회
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    // 메인 메서드
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("현대");
        myCar.setModel("쏘나타");
        myCar.setYear(2022);

        System.out.println("브랜드 " + myCar.getBrand());
        System.out.println("모델: " + myCar.getModel());
        System.out.println("연식: " + myCar.getYear());

        myCar.move();
        myCar.stop();
    }
}
