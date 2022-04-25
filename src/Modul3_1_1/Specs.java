package Modul3_1_1;
import Modul3_2.Device;

public class Specs extends Device{
    String md;

    public Specs(String specs1){
        md = "Specification Smartphone";
        System.out.println(md);
        System.out.println("- "+specs1);

    }

    public Specs(String specs1, String specs2){
//        super();
        md = "Specification Smartphone";
        System.out.println(md);
        System.out.println("- "+specs1);
        System.out.println("- "+specs2);
    }

    public Specs(String specs1, String specs2, String specs3){
        md = "Specification Smartphone";
        System.out.println(md);
        System.out.println("- "+specs1);
        System.out.println("- "+specs2);
        System.out.println("- "+specs3);
    }

    public Specs(String specs1, String specs2, String specs3,String specs4){
        md = "Specification Smartphone";
        System.out.println(md);
        System.out.println("- "+specs1);
        System.out.println("- "+specs2);
        System.out.println("- "+specs3);
        System.out.println("- "+specs4);
    }

}
