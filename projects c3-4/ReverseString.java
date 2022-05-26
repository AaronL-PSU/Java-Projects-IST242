package project.c34;
import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class ProjectC34 {

public static void main(String[] args) {
    System.out.println("Enter a word to be reversed");
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    System.out.println(new StringBuilder(word).reverse().toString());
 }   
}