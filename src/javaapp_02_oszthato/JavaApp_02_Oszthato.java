package javaapp_02_oszthato;

public class JavaApp_02_Oszthato {

    public static void main(String[] args) {
        for (int i = 15; i < 1000; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(i);
            }
        }
    }
    
}
