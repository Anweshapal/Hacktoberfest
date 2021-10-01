import java.util.*;
public class Main
{
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
int n=Integer.parseInt(sc.next());
        int k=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               System.out.print("* ");
            }
            System.out.println();
            k--;
       }
	}
}

