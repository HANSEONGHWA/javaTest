package javajungsuk.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 익명 객체
 */
//1회성 코드
//class EventHandler implements ActionListener{       //1번 클래스 정의
//    public void actionPerformed(ActionEvent e){
//        System.out.println("ActionEvent occurred");
//    }
//}




public class Ch7_11 {
    public static void main(String[] args) {
        Button b = new Button("Start");
//        b.addActionListener(new EventHandler());    //2번 객체생성

        /**
         * 익명클래스로 변경
         */
        b.addActionListener(new ActionListener(){
//            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });
    }
}
