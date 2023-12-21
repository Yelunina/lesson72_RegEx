package ait.regex;

public class RegexAppl {
    public static void main(String[] args) {
        String str = "           Java50";
        String pattern = " *(J|j)ava([1-9]|[1-4][0-9]\\d|50[0+5])?";
        boolean check = str.matches(pattern);
        System.out.println(check);
        String domain = "abra-kadabra.com";///com,.org,.de,.il
        pattern = "\\w+-?\\w+\\.(com|org|de|il)";
        check = domain.matches(pattern);
        System.out.println(check);
        /*
    1) @ exists and only one (done)
    2) dot after @ (done)
    3) 2 or more symbols after last dot (done)
    4) alphabetic, digits, '_', '-', '.', '@'
     */
        String email ="peter-1.1@gmail.com";
        pattern ="(\\w|-|\\.)+@[A-Za-z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        check =email.matches(pattern);
        System.out.println(check);

    }


}
