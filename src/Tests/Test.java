package Tests;

import static java.lang.Integer.signum;

public class Test {
    public static void main(String[] args){
        System.out.println(signum(5)+ " : " + signum(0) + " : " + signum((-100)));
    }
}
