import java.util.Scanner;
public class L4Password {
    public static boolean isValid(String p){
        boolean valid = true;
        if(p.length()<=5 || p.length()>=12){
            valid = false;
            System.out.println("It's length is not between 5 & 12!");
            return valid;
        }
        if(!p.toLowerCase().equals(p)){
            valid = false;
            System.out.println("It has an uppercase letter!");
            return valid;
        }
        boolean hasDigit = false;
        for(int i = 0;i<p.length();i++){
            if((int)p.charAt(i)>=48 && (int)p.charAt(i)<=57){
                hasDigit = true;
            }
            if(((int)p.charAt(i)>=33 && (int)p.charAt(i)<=47) || ((int)p.charAt(i)>=58 && (int)p.charAt(i)<=64)){
                valid = false;
                System.out.println("It has a special character!");
                return valid;
            }
        }
        if(hasDigit==false){
            valid = false;
            System.out.println("It does not have a digit!");
            return valid;
        }
        return valid;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the password: ");
            String p = sc.nextLine();
            System.out.println(isValid(p));
        }
    }
}