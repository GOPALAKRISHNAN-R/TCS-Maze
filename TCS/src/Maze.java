import java.util.Scanner;

/**
 * Simple Java program for Remove Duplicate Character/s from String(TCS Off-Campus Drive)
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1 = "topjavatutorial";
		String str1;
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
        System.out.println(removeDuplicateChars(str1));
		/*String str2;
		str2=sc.next();
//        String str2 = "hello";
        System.out.println(removeDuplicateChars(str2));
    */
        }
 
    private static String removeDuplicateChars(String sourceStr) {
        // Store encountered letters in this string.
        
    	char[] chrArray = sourceStr.toCharArray();
        String targetStr = "";
 
        // Loop over each character.
        for (char value : chrArray) {
            // See if character is in the target
            if (targetStr.indexOf(value) == -1) {
                targetStr += value; // Use StringBuilder as shown below
            }
        }
        return targetStr;
  

	}

}
