package day6.reflection.matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matchers {

    /*

     */

    /*
    [\w\d_.]+@[\w\d_].com
     */
    public static void main(String[] args) {
        boolean b = new Matchers().test("test@gmail.com");
        System.out.println(b ? "Adres jest prawidłowy" : "Błędny adres");
    }
    public boolean test(String email){
        String matcher = "[\\w\\d_.]+@[\\w\\d_]+.com";
        Pattern pattern = Pattern.compile(matcher);
        Matcher m = pattern.matcher(email);
        //return m.find(); zwraca true jesli ciag występuje w środku
        return m.matches(); //zwraca true jesli caly ciag odpowiada matcherowi
    }
}