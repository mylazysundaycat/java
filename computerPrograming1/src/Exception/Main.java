package Exception;

public class Main {
    public static void main(String[] args) {
        try{
            MyException e = new MyException("고장남요");
            throw e;
        } catch(MyException e){
            e.printStackTrace();
            System.out.println(e.getErrCode());
        } finally {
            System.out.println("무조건 실행되는 파이널리문");
        }
        System.out.println("정상 종료됨");
    }
}
