package group25;

public abstract class StringTools {

    public  static String FirstToUpperCase(String str) {

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static boolean isStartingFromCapital(String str) {

        return  str.substring(0, 1).toUpperCase().equals(str.substring(0, 1));
    }

}
