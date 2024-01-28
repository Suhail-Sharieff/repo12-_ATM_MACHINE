import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * SuhailSharieff
 */
public class SuhailSharieff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times u wanna test my code: ");
        int t = sc.nextInt();
        for (int v = 0; v < t; v++) {
            System.out.println("enter number of people waiting to draw money: ");
            int n=sc.nextInt();
            System.out.println("enter the total amount in the ATM: ");
            int k=sc.nextInt();
            int []arr=new int[n];
            int []ans=new int[n];
            String[]anss=new String[n];
            
            for (int i = 0; i < arr.length; i++) {
                
                System.out.println("Dear person "+(i+1)+", please enter the amount u wanna draw: ");
                arr[i]=sc.nextInt();
                if(arr[i]<=k){
                    k=k-arr[i];
                    ans[i]=1;
                    anss[i]="YES";
                }else{
                    ans[i]=0;
                    anss[i]="NO";
                }
                
                
            }
            System.out.println("the foloowing persons with 'YES' can withdraw money ...else no: ");
            for (int i = 0; i < ans.length; i++) {
               System.out.println("Person "+(i+1)+": "+anss[i]);
            }
            
            
        
            


            
        }
    }
}
