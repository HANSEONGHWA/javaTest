package javajungsuk.ch7;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

/**
 * 상속_ super().. 부모 메서드 호출
 */
class Airplane{
    void land(){
        System.out.println("착륙합니다.");
    }
    void fly(){
        System.out.println("일반 비행합니다.");
    }
    void takeOff(){
        System.out.println("이륙합니다.");
    }
}

class SupersonicAirplane extends Airplane{
    /**
     * final
     * - 값 변경할 수 없음.
     * - 클래스, 필드, 메소드 선언 시 사용
     * - 필드 선언 시 초기값 변경 x , 클래스, 메서드 선언 시 상속, 오버라이딩 안됨.
     */
    static final int NORMAL = 1;    // 고정 값은 상수 사용.. 가독성 높임.
    static final int SUPERSONIC = 2;

    int flyMode = NORMAL;

    @Override
    void fly() {
       if(flyMode == SUPERSONIC){
           System.out.println("초음속비행합니다.");
       }else{
           super.fly(); // 부모인 Airplane의 fly() 메소드 호출.
       }
    }
}

public class Ch7_1 {
    public static void main(String[] args) {
        SupersonicAirplane s = new SupersonicAirplane();
        s.takeOff();    //이륙합니다.
        s.fly();        // 일반비행합니다.
        s.flyMode = SupersonicAirplane.SUPERSONIC;
        s.fly();    //초음속 비행합니다.
        s.flyMode = SupersonicAirplane.NORMAL;
        s.fly();    // 일반비행합니다.
        s.land();   //착륙합니다.


    }
}
