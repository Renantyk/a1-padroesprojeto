package qt5;

public class Main {
    public static void main(String[] args) {
        
        Logging log = Logging.getInstance("123");
        System.out.println(log.getMensagem());
        Logging log2 = Logging.getInstance("1231212412412");
        System.out.println(log2.getMensagem());

    }
    
}
