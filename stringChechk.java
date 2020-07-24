import java.util.*;
import java.util.stream.Collectors;
class stringCheck {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list size");
        int n = sc.nextInt();
        List<String> l1 = new ArrayList<String>();
        sc.nextLine();
        System.out.println("Enter the elements");
        for(int i =0;i<n;i++) 
        {
            String x = sc.nextLine();
            l1.add(x);
        }
        System.out.println("The Final List : " + checkPalindrome(l1));
        
    }
    static List checkPalindrome (List<String> list){
        List <String> finalList = new ArrayList<String>();

        list.forEach(str-> { if(Palindrome(str)) finalList.add(str); }  );
        return finalList;
    }

    static boolean Palindrome (String s){
        String str = "";
        for(int i=s.length()-1 ; i>=0 ; i--){
            char c = s.charAt(i);
            str += c;
        }
        if(str.equals(s))
            return true;
        else 
            return false;
    }
}