package enums;

import java.util.Scanner;

public class EnumBasics {
    enum Status {EATING, SLEEPING, CODING, GAMING};
    public static void main(String[] args) {

        Status s = Status.EATING;
        checkStatus(s);

        Things t = Things.THING_ONE;
    }


    public static void checkStatus(Status s){

        switch(s){
            case SLEEPING:
                System.out.println("Go away! Sleeping!");
                break;
            case CODING:
                System.out.println("Can't talk! Coding!");
                break;
            case EATING:
                System.out.println("Leave me alone! Eating!");
                break;
            case GAMING:
                System.out.println("Not now! Gaming!");
                break;
        }
    }


}
