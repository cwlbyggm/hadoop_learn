import java.util.Date;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(("Hello World!"));
        } catch (Exception e) {
            e.printStackTrace( );
        }
        Date date1 = new Date( );
        System.out.println(date1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String hehe = dateFormat.format(date1);
        System.out.println(hehe);

        System.out.println("自动对齐ctrl+alt+l");
    }
}
