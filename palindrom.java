import java.util.Scanner;
class palidrom{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check");
        String aa = sc.nextLine();
        System.out.println("This is palindrom?");
        System.out.println(ispalindrome(aa));
        }
    static boolean ispalindrome(String aa){
        for(int i=0; i<=aa.length()/2; i++){
            aa = aa.toLowerCase();
            char start = aa.charAt(i);
            char end = aa.charAt(aa.length()-i-1);
            if(start!=end){
                return false;
            }

    }
        return true;
}}