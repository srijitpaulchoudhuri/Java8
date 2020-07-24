import java.util.*;
import java.util.stream.Collectors;
class stringFilter {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list size");
        int n = sc.nextInt();
        List<String> l2 = new ArrayList<String>();
        sc.nextLine();
        System.out.println("Enter the elements");
        for(int i =0;i<n;i++) 
        {
            String x = sc.nextLine();
            l2.add(x);
        }
        List<String> resultList = l2.stream().
        filter(
            str -> str.indexOf('a') >= 0 && str.length() == 3
        )
        .collect(Collectors.toList()); 
        
        System.out.println("Results");
        resultList.forEach(str->System.out.println(str));
      
    }

}