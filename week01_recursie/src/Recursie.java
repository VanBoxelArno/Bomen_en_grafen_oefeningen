import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursie {


    // Oefening 1: n-de Fibonacci-getal

    public static int fibonacci(int getal) {
        if(getal<=0){
            throw new IllegalArgumentException("Je kan hier geen negatieve fibonacci maken.");
        }
        if(getal==1){
            return 1;
        }
        else if(getal==2){
            return 1;
        }
        return fibonacci(getal-1)+fibonacci(getal-2);
    }

    // Oefening 2 : som van cijfers

    public static int somVanCijfers(int getal) {
        getal=Math.abs(getal);
        if(getal < 10){
            return getal;
        }else{
            return getal % 10 + somVanCijfers(getal/10);
        }
    }

    // Oefening 3: keer een string om
    public static String keerOm(String s) {
    if (s == null){
        throw new IllegalArgumentException("Bruh its NULL");
    }
    if (s.isEmpty()){
            return s;}
        return keerOm(s.substring(1)) + s.charAt(0);

    }

    //oefening 4: countX

    public static int countX(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Dis bench empty YEET");
        }
        if (s.isEmpty()) {
            return 0;
        }
        if(s.charAt(0)=='x'){
            return 1 + countX(s.substring(1));
        }
        else {
            return countX(s.substring(1));
        }
    }

    //oefening 5 : countHi
    public static int countHi(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Dis bench empty YEET");
        }
        if (s.length() < 2) return 0;

        if (s.substring(0,2).equals("hi")) return 1 + countHi(s.substring(1));

	  else return countHi(s.substring(1));
	  /*
	  * else if (s.charAt(0)=='h'){if(s.charAt(1)=='i'){return 1 + countHi(s.substring(2));}}return countHi(s.substring(1));
	  *
	  * */
    }

    // oefening 6
    public static String changeXY(String s) {
        if(s==null){
            throw new IllegalArgumentException("Epmty");
        }
        if (s.equals("")) {return s;}
        if (s.charAt(0) == 'x') {return "y" + changeXY(s.substring(1));}
        return s.charAt(0) + changeXY(s.substring(1));
        /*
        if (s.length() == 1) {
            return s;
        }
        if(s.charAt(0)=='x'){
            return 'y'+changeXY(s.substring(1));
        }else {
            return changeXY(s.substring(1));
        }*/
    }

    // oefening 7

    /*public static String changePi(String s) {
        if(s == null){
            throw new IllegalArgumentException("Er moet iets in de string staan.");
        }
        if (s.equals("")) {return s;}
        if (s.contains("pi")) {return "3.14" + changePi(s.substring(1));}
        return s.charAt(0) + changePi(s.substring(1));
    }*/
    public static String changePi(String s) {
        if(s == null){
            throw new IllegalArgumentException("Er moet iets in de string staan.");
        }
        if (s.equals("") || s.length() < 2) return s;
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i')
        return "3.14" + changePi(s.substring(2));
        return s.charAt(0) + changePi(s.substring(1));

    }
    
    // oefening 8:
    public static int tweelog(int getal) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // oefening 9;
    public static double findMaximum(List<Double> lijst) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // oefening 10;
    public static ArrayList<String> findSubstrings(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}