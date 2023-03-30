package javajungsuk.ch7;

/**
 * 호출되는 생성자 순서
 */
class Parent{
    private String nation;

    public Parent(){
        this("대한민국"); // 자기 생성자 호출시킴 2번째로 호출
        System.out.println("Parent() call");
    }

    public Parent(String nation) { // 1번으로 호출 후 위의 생성자 호출. 
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}

class Child extends Parent{
    private String name;

    public Child(){
        this("홍길동"); // 자기 생성자 호출시킴. this(), super() 모두 첫 줄에 작성되야함. 4번째 호출
        System.out.println("Child() call");
    }

    public Child(String name){      //부모의 생성자를 먼저 호출함. 3번째 호출
        this.name = name;
        System.out.println("Child(String name) call");

    }

}
public class Ch7_4 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
