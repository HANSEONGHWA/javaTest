package javajungsuk.ch6;

public class Ch6_3 {
    public static void main(String[] args) {
        //Card.width, Card.height 클래스변수여서 객체 생성없이 사용 가능.
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        //객체 생성 후 참조변수 c1을 사용.
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 5;

        System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 " + c1.width+ ", " + c1.height);
        System.out.println("c2는 " + c2.kind + "," + c2.number + "이며, 크기는 " + c2.width+ ", " + c2.height);

        System.out.println("c1의 width값과 height값을 50, 80으로 변경합니다.");
//        c1.width = 50;
//        c1.height = 80;
        Card.width = 50;
        Card.height = 80;
        //이렇게 바꿔야함.

        System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 " + c1.width+ ", " + c1.height);
        System.out.println("c2는 " + c2.kind + "," + c2.number + "이며, 크기는 " + c2.width+ ", " + c2.height);
        System.out.println("클래스영역의 공통 값이기 떄문에 c1을 변경하면 c2도 함께 변경됨.");


    }
}

class Card{
    String kind;
    int number;
    //공통으로 적용할 때 static 사용.
    static int width = 100;
    static int height = 80;
}
