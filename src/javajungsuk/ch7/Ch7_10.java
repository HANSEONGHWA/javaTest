package javajungsuk.ch7;

/**
 * 중첩 인터페이스
 */
class Button1{
    interface OnClickListener{
        void onClick();
    }
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }

}

class CallListener implements Button1.OnClickListener{

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}

class MessageListener implements Button1.OnClickListener{

    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}


public class Ch7_10 {
    public static void main(String[] args) {

        Button1 bnt = new Button1();

        bnt.setOnClickListener(new CallListener());
        bnt.touch();

        bnt.setOnClickListener(new MessageListener());
        bnt.touch();
    }



}
