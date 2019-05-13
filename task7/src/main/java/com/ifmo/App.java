package com.ifmo;

public class App {

    public static void main(String[] args) {
        try{
            switch (args[0]) {
                case "browse":
                    new SimpleBrowse().Browse();
                    break;
                case "publish":
                    new SimplePublish().publish(args[1], args[2], args[3]);
                    break;
                default:
                    System.out.println("Undefined operation");
            }
        } catch (Exception e) {
            System.out.println("something wrong");
        }
    }
}
