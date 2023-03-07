package javajungsuk.ch5;

import java.util.Scanner;

/**
 * 2차원 배열 단어맞추기 게임
 * 추가하고 싶은 것, 단어를 틀렸을 경우 다시 풀 수 있도록 하기
 */
public class Ch5_11 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d %s의 뜻은?", i + 1, words[i][0]);

            String tmp = scanner.nextLine();
            if (tmp.equals(words[i][1])) {
                System.out.println("정답입니다^^");
            } else {
                System.out.println("틀렸습니다ㅜㅜ 정답은 " + words[i][1] + "입니다.");
            }
        }
    }


}
