package javajungsuk.algorithm.youtube.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("손오공","1234");
        Student st2 = new Student("사오정","4567");
        Student st3 = new Student("저팔계","7894");

        //list에 정보 저장
        ArrayList<Student>list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);


        //정보가 잘 들어갔는지 list에서 꺼내 확인
        for (Student stu:list) {
            System.out.println(stu.getName());
            System.out.println(stu.getNo());
        }

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("계속 검색을 하고 싶으면 y, 종료하고 싶으면 n");
            String input = scan.next();
            if (input.equals("y")){
                System.out.println("검색을 시작합니다.");
                String name = scan.next();
                boolean flag = false;

                for (Student stu : list){
                    if (stu.getName().equals(name)){
                        System.out.println("해당하는 학생의 학번은: "+stu.getNo());
                        flag = true;
                    }
                }
                if (!flag){
                    System.out.println("해당하는 학생이름이 없습니다.");
                }

            }else if(input.equals("n")){
                break;
            }

        }
        System.out.println("프로그램을 종료합니다.");

    }
}
