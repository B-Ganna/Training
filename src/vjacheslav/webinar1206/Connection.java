package vjacheslav.webinar1206;


import java.util.concurrent.TimeUnit;

public class Connection {
    public String getConnecion(int count) {
        String result = "BAD";
        for (int i = 0; i < count; i++) {
            try {
                if (i == 0)
                    throw new Exception("Bad channel");
                result = "OK";
                break;
            } catch (Exception e) {
                System.out.println("Try " + (i + 1) + " , Error: " + e.getMessage());
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(5));
                } catch (InterruptedException e1) {
                    System.out.println("Errrooor!");
                }
                System.out.println("line2");
            }
        }
        return result;
    }
}
