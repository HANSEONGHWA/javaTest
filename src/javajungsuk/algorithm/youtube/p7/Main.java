package javajungsuk.algorithm.youtube.p7;

import java.util.Scanner;

/**
 * 소수 판별 - 입력된 수가 소수인지 판별하시오.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("검색은 y, 종료는 n");
            String input = scan.next();

            if (input.equals("y")) {
                System.out.println("숫자를 입력하세요.");
                int num = scan.nextInt();


                boolean isPrimeNumber = true;
                for (int i = 2; i < num - 1; i++) {
                    if (num % i == 0) {
                        isPrimeNumber = false;
                    }
                }

                if (isPrimeNumber) {
                    System.out.println(num + "은 소수입니다.");
                } else {
                    System.out.println(num + "은 소수가 아닙니다.");
                }
            } else if (input.equals("n")) {
                break;
            }
        }
        System.out.println("검색 종료");

    }
}
