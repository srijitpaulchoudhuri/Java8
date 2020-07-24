import java.util.*;
class average {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list size");
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<Integer>();
        System.out.println("Enter the elements");
        for(int i =0;i<n;i++) 
        {
            int x = sc.nextInt();
            l1.add(x);
        }
        System.out.println("Average = " + getAverage(n,l1));
        //double avg = (l1.stream().reduce(0,(ans,i)->ans+i))/n;
        //System.out.println(avg);
    }
    static double getAverage(int n,List<Integer> l1){
        double avg = (l1.stream().reduce(0,(ans,i)->ans+i))/n;
        //System.out.println(avg);
        return avg;
    }
}