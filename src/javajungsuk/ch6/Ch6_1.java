package javajungsuk.ch6;

public class Ch6_1 {
    public static void main(String[] args) {
        Tv t = new Tv(); //Tv인스턴스(객체)를 참조하기 위한 참조변수 t선언, 생성
        t.channel = 7;   //Tv인스턴스(객체)의 멤버변수 channel의 변수 값을 7로 함.
        t.channelUp();   //Tv인스턴스(객체)의 메서드 channelUp()을 호출.
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

    class Tv{
        //Tv의 속성 (멤버 변수)
        String color;
        boolean power;
        int channel;

        //Tv의 기능 (메서드)
        void power(){
            power = !power;
        }

        void channelUp(){
            ++channel;
        }

        void channelDown(){
            --channel;
        }
    }