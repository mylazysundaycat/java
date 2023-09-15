package Exception2;

public class Main {
    public static void main(String[] args) {
        try{
            bell();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void bell() throws Exception{
        try {
            Exception e = new Exception("일부러 고장냄 bell");
            throw e;
        }catch (Exception e){
            throw e;
        }
    }
}
