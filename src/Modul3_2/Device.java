package Modul3_2;
import Modul3_1_1.*;

public class Device {
    String name;
    public Device(){

    }
    public Device(String name){
        System.out.println(name);
    }
    public Device(String name, String abc){
        abc = "Smartphone";
        this.name = name;
        System.out.println(abc);
        System.out.println(name);
    }
}

class drivers{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=========================================================");
        new Device("\t\t\tSmartphone Specifications");
        new Model("Apple Iphone 11");
        System.out.println();
        new Specs("Apple A13 Bionic","12MP Main and Selfie Camera");
        System.out.println();
        new Color("Red","Purple","Black","Yellow","White","Green");
        System.out.println();
        new Features("IP68 Water Resistant");
        System.out.println();
        new Prices("6.500.000");
        System.out.println("=========================================================");

    }
}