import java.util.Scanner;

public class L4PerfectString {
    public static boolean checkPerfect(String s){
        for(int i = 0;i<s.length();i++){
            int count = 1;
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                return false;
            }
        }
        for(char i = 'a';i<='z';i++){
            if(!s.contains(Character.toString(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            System.out.println(checkPerfect(s));
        }
    }
}