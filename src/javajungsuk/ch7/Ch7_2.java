package javajungsuk.ch7;

/**
 * 필드의 다형성
 */

class Tire{
    int maxRotation;            //최대 회전수(타이어 수명)
    int accumulatedRotation;    //누적 회전수
    String location;            //타이어 위치

    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    /**
     * 타이어 1회전 시 누적 회전수 증가 및 저장메서드
     * @return
     */
    public boolean roll(){
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + "타이어 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }else {
            System.out.println("***" + location + "타이어 펑크");
            return false;
        }
    }
}

class Car{
    Tire frontLeft = new Tire(6, "앞왼쪽");
    Tire fontRight = new Tire(2, "앞오른쪽");
    Tire backLeft = new Tire(3, "뒤왼쪽");
    Tire backRight = new Tire(4, "뒤오른쪽");

    /**
     * 4개의 타이어를 1회전 시키는 메서드
     * @return
     */
    //모든 타이어를 1회 실행시키기 위해 각 Tire객체의 roll()메소드를 호출함. false를 리턴하는 roll()이 있을 경우 stop()메서드를 호출하고 해당 타이어 번호를 리턴.
    int run(){
        System.out.println("자동차가 달립니다.");
        if(frontLeft.roll()==false){stop(); return 1;}
        if (fontRight.roll() == false) {stop(); return 2;}
        if (backLeft.roll() == false) {stop(); return 3;}
        if(backRight.roll()==false) {stop(); return 4;}
        return 0;
    }
    //펑크 시 실행
    void stop(){
            System.out.println("자동차가 멈춥니다.");
        }
}

class HankookTire extends Tire{

    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);
    }
    //"한국타이어"라고 출력을 달리하기 위해 재정의 함.
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + "한국타이어 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }else {
            System.out.println("***" + location + "한국타이어 펑크");
            return false;
        }
    }
}

class  KumhoTire extends Tire{

    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }
    //"금호타이어"라고 출력을 달리하기 위해 재정의 함.
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + "금호타이어 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }else {
            System.out.println("***" + location + "금호타이어 펑크");
            return false;
        }
    }
}

public class Ch7_2 {
    public static void main(String[] args) {
        Car c = new Car();

        for (int i = 0; i < 5; i++) {       // Car객체의 run()메서드 5번 실행.
            int problemLocation = c.run();  //바퀴의 번호를 받음.

            switch (problemLocation){
                //앞왼쪽 타이어가 펑크났을 때 한국타이어로 교체
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
                    c.frontLeft = new HankookTire(15,"앞왼쪽"); //자동타입변환되어 재정의된 메서드 실행.
                    break;
                case 2:
                    System.out.println("앞오른쪽 한국타이어로 교체");
                    c.fontRight = new KumhoTire(15,"앞오른쪽");
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
                    c.backLeft = new HankookTire(15,"뒤왼쪽");
                    break;
                case 4:
                    System.out.println("뒤오른쪽 한국타이어로 교체");
                    c.backRight = new KumhoTire(15,"뒤오른쪽");
                    break;
            }
            System.out.println("-------------------------------"); // 1회전 시 출력되는 내용을 구분
        }
    }
}
