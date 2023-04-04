package javajungsuk.ch7;

/**
 * 중첩 클래스
 */

class A{
    //바깥 클래스
    A() {
        System.out.println("A객체가 생성됨.");
    }

        //인스턴스 멤버 클래스 - static선언없이 선언된 클래스
        class B{
            B(){
                System.out.println("B객체가 생성됨");
            }
            int field1;
//            static int field2;
            void method1(){}
//            static void method2(){}
        }

        //정적 멤버 클래스 - static클래스/ 모든 종류의 필드와 메소드를 선언할 수 있음.
        static class C{
            C(){
                System.out.println("C객체가 생성되었습니다.");
            }
            int field1;
            static int field2;
            void method1(){}
            static void method2(){}
        }

        //로컬클래스 - 메소드 내 선언, 접근제어자 사용 안함. 메소드 내부에서만 사용. 비동기객체, 스레드 객체 만들 때 사용
        void method(){
            class D{
                D(){
                    System.out.println("D객체가 생성되었습니다.");
                }
                int field1;
                void method1(){}
            }
            D d = new D();
            d.field1 = 3;
            d.method1();
        }

        void method1(){
            class DownloadThread extends Thread{ }
                DownloadThread thread = new DownloadThread();
//                Thread.State();
        }
    }


public class Ch7_9 {
    public static void main(String[] args) {
        //외부 클래스에서 인스턴스 멤버 클래스 사용 시 바깥 클래스 A객체 먼저 생성.
        A a = new A();
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        //정적 멤버 클래스 - A객체 생성 없이 C객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();
    }

}

