import java.util.Arrays;

public class Main {

     public static void main(String[] args) {
         int[] numbers = { 0, 1, 2, 3, };
         System.out.println("numbers 길이 : " + numbers.length);

         String message = "Hello, Java!";

         System.out.println(message);
         System.out.println("길이 : " + message.length());
         System.out.println("대문자 변환 : " + message.toUpperCase());
         System.out.println("소문자 변환 : " + message.toLowerCase());

         System.out.println("순서 : " + message.indexOf("l"));

         for(int i = 0; i < message.length(); i++) {
             System.out.println(message.charAt(i));
             if(message.charAt(i) == 'l' ) {
                 System.out.println("순서2 : " + i);
                 break;
             }
         }

    }
}