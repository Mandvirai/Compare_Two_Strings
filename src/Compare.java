//Little Petya loves presents. His mum bought him two strings s1 & s2 of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.
//Input Format
//Each of the first two lines contains s1 & s2. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.
//Constraints, 1 < |s1|,|s2| <= 100
//Output Format, If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.
//Sample Input 0,  aaaa
                //aaaA
//Sample Output 0
//0
import java.util.Scanner;
public class Compare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("0");
        }
        else if(s1.compareToIgnoreCase(s2) < 0){
            System.out.println("-1");
        }
        else if(s1.compareToIgnoreCase(s2) > 0){
            System.out.println("1");
        }
    }
}
