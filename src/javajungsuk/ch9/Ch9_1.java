package javajungsuk.ch9;

/**
 * equals() - 객체 동등비교
 */

class Member{
    public String id;
    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){          //매개값이 Member타입인지 확인
            Member member = (Member) obj;   //Member타입으로 강제 타입 변환하고 id필드 값이 동일한지 검사한 후, 동일하다면 true 리턴.
            if (id.equals(member.id)){
                return true;
            }
        }
        return false;                       //매개값이 Member타입이 아니거나 id필드값이 다른 경우 false를 리턴
    }

}
public class Ch9_1 {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다.");
        }else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)){
            System.out.println("obj1과 obj3는 동등합니다.");
        }else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }
    }
}
