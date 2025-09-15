import java.util.*;

public class calcAvgTemp {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days' temp ? : ");
        int numDays = sc.nextInt();
        int[] temps = new int[numDays];
        //record temperatures and find average
        int sum = 0;
        
        for(int i = 0;i<temps.length;i++){
            System.out.print("Day "+ (i+1) + "'s' high temp : ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }

        double avg = sum / numDays;
        // count days above average
        int above= 0;

        for(int i = 0;i<temps.length;i++){
            if(temps[i] > avg)
                above++;
        }

        System.out.println("");
        System.out.println("Average Temperature : " + avg);
        System.out.println(above + " days above temperature");
    }
}
