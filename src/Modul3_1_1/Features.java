package Modul3_1_1;
import Modul3_2.Device;

public class Features extends Device{
    String sa;
    public Features(String features1){
        sa = "Smartphone Features";
        System.out.println(sa);
        System.out.println("- " +features1);
    }

    public Features(String features1, String features2){
        sa = "Smartphone Features";
        System.out.println(sa);
        System.out.println("- " +features1);
        System.out.println("- " +features2);
    }

    public Features(String features1, String features2, String features3){
        sa = "Smartphone Features";
        System.out.println(sa);
        System.out.println("- " +features1);
        System.out.println("- " +features2);
        System.out.println("- " +features3);
    }

    public Features(String features1, String features2, String features3, String features4){
        sa = "Smartphone Features";
        System.out.println(sa);
        System.out.println("- " +features1);
        System.out.println("- " +features2);
        System.out.println("- " +features3);
        System.out.println("- " +features4);
    }

}
