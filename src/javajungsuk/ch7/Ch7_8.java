package javajungsuk.ch7;

interface Action{
    void work();
}

public class Ch7_8 {
    public static void main(String[] args) {
        Action a = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };

        a.work();
    }
}
