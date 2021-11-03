package p8.e3;

import java.util.concurrent.TimeUnit;

public enum Monitor{
    INSTANCE;

    public synchronized void permiso(String s) {
        System.out.println(s);
        try {
            TimeUnit.MILLISECONDS.sleep(25);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

}