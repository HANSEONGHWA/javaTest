package javajungsuk.ch8;

/**
 * 사용자 정의와 예외 발생시키기
 */
//사용자 정의 예외 클래스 선언 >> 컴파일러 일반 예외 선언 시 Exception 상속, 실행 예외 선언 시 RuntimeException 상속.
    //Exception를 상속받아 컴파일러에 의해 체크되는 예외이기때문에 소스 작성 시 try-catch블록으로 예외처리 필요.
class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException(){ }    // 기본생성자
    public BalanceInsufficientException(String message){    // 에러 메세지 엄겨주는 생성자.
        super(message);

    }
}

//예외 발생시키기
//은행 계좌 class
class Account{
    private long balance;   // 잔액

    public Account(){ }
    
    public long getBalance(){
        return balance;
    }
    //예금
    public void deposit(int money){
        balance += money;
    }
    //출금
    // 잔고가 부족하면 BalanceInsufficientException을 발생시킴
    public void withdraw(int money) throws BalanceInsufficientException {   // 사용자 정의 예외 떠넘기기(자신을 호출한 곳에서 예외를 처리하도록)
        if(balance < money){
            throw new BalanceInsufficientException("잔고부족: " + (money - balance) + "원 모자람");   // 사용자 정의 예외 발행
        }
        balance -= money;
    }
}
public class Ch8_5 {
    public static void main(String[] args) throws BalanceInsufficientException {
       //사용자 정의 예외 발생시키기
        Account account = new Account();
        //예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());
        //출금하기
        try{
            account.withdraw(30000);    //throws를 한 withdraw 메소드를 호출했기 때문에 try-catch 블록으로 예외 처리를 해야함.
        }catch (BalanceInsufficientException e){
            String message = e.getMessage(); // 예외 메세지 얻기
            System.out.println(message);
            System.out.println();
            e.printStackTrace();    //예외 추적 후 출력
        }
    }
}
