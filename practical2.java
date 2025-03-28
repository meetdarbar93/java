
public class practical2 {

    public static void main(String[] args) {
        String str = "This is some sample string with some words that have been repeated sometime";
        System.out.println("Length of String : " + str.length());
        System.out.println("To Uppercase String : " + str.toUpperCase());
        System.out.println("Original String : " + str);
        System.out.println("Subtract part of String : " + str.substring(8));
        System.out.println("Substract some part from string String : " + str.substring(8,17));
        System.out.println("Index of Some : " + str.indexOf("some"));
        System.out.println("Replace s with $$##: " + str.replace("s","$$##"));
    }
}
