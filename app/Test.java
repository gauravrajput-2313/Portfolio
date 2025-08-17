import java.util.regex.*;

public class Test {
    public static void main(String[] args) {
        // String line="8";
        // String pattern="^\\d$";
        // String line="878966";
        // String pattern="(^\\d{1,6}$)";
        // String line="86745213987";
        // String pattern="(^\\d{6,6}$)";
        // String line="gtrwwe";
        // String pattern="([a-z]+$)";
        // String line="AAGDAHDGAH";
        // String pattern="([A-Z]+$)";
        // String line="65754";
        // String pattern="(^\\d*)+$";
        // String line="657";
        // String pattern="(^\\d{0,5}$)";
        // String line="";
        // String pattern="(^\\d{0,5}$)";
        // String line="654.65";
        // String pattern="^\\d*\\.\\d{2,2}$";
        // String line="2201640100155";
        // String pattern="(^\\d{13,13}$)";
        // String line="10-01-2004";
        // String pattern="^\\d{2}-\\d{2}-\\d{4}$";
        String line = "gauravrajput2313@gmail.com";
        String pattern = "^[a-z0-9_-]+@[a-z].*\\.(com)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        if (m.matches()) {
            System.out.println("Match Found: " + line);
        } else {
            System.out.println("No Match");
        }
    }
}