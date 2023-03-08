package javajungsuk.ch6;

public class Ch6_4 {
    public static void main(String[] args) {

        /**
         * 순서 2. MyMath 객체 생성
         */
        MyMath mm = new MyMath();

        /**
         * 순서 3. MyMath 객체 사용
         */
        int m1 = mm.add(5, 6);
        int m2 = mm.subtract(9, 5);
        int m3 = mm.multiplay(4, 5);
        double m4 = mm.divide(8, 2);
        int m5 = mm.max(15, 6);
        System.out.println("m1 + = " + m1);
        System.out.println("m2 - = " + m2);
        System.out.println("m3 * = " + m3);
        System.out.println("m4 / = " + m4);
        System.out.println("m5 > = " + m5);
    }
}

/**
 * 사칙연산을 수행하는 메서드를 가진 MyMath class
 * 메서드는 클래스 영역에 정의 가능
 * 순서 1. MyMath class 작성
 */
class MyMath {
    int add(int a, int b) {

        int result = a + b;
        return result;

//        간단히 출력 가능
//        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiplay(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    /**
     * 큰 수 구하기
     */
    int max(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;

        // 삼항연산자 사용(a가 b보다 크면 a를 반환, 아니면 b를 반환.)
//        a > b ? a: b;
    }
}
