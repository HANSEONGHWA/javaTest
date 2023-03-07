package javajungsuk.ch6;

public class Ch6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); //t1, t2 별도의 저장공간을 가짐.
        Tv t2 = new Tv();

        System.out.println("t1의 채널 값은 "+ t1.channel + "입니다.");
        System.out.println("t2의 채널 값은 "+ t2.channel + "입니다.");

        t1.channel = 7; // t1의 값은 7로 함.
        System.out.println("t1.channl의 값을 7로 변경하였습니다.--> " + t1.channel);

        t2= t1;
        System.out.println("t1.channel의 값을 t2.channel에 저장했습니다. -->" + t1.channel + ", " + t2.channel);

        System.out.println("t1의 채널 값은 "+ t1.channel + "입니다.");
        System.out.println("t2의 채널 값은 "+ t2.channel + "입니다.");


    }
}

