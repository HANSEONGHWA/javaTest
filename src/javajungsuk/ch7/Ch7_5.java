package javajungsuk.ch7;

/**
 * 인터페이스
 */

interface  Tire2{
    public void roll();
}
//구현클래스
class HankookTire2 implements Tire2{
//Tire 인터페이스 구현
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}

class KumhoTire2 implements Tire2{

    @Override
    public void roll() {
        System.out.println("금호 타이어가 굴러갑니다.");
    }
}

class Car2{
    //인터페이스 타입 필드 선언과 초기 구현 객체 대입
    Tire2 frontLeft = new HankookTire2();
    Tire2 frontRight = new HankookTire2();
    Tire2 backLeft = new HankookTire2();
    Tire2 backRight = new HankookTire2();

    //인터페이스에서 설명된 roll()메소드 호출
    void run(){
        frontLeft.roll();
        frontRight.roll();
        backLeft.roll();
        backRight.roll();
    }
}

public class Ch7_5 {
    public static void main(String[] args) {
        Car2 c = new Car2();

        c.run();

        c.frontLeft = new KumhoTire2();
        c.frontRight = new KumhoTire2();

        c.run();
    }
}
