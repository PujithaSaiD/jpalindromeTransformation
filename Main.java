import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            if(n%2!=0){
               int k1=0;
               int p=n-1;
               for(int j=0;j<n;j++){
                if(s.charAt(j)!=s.charAt(p) && j!=p){
                   k1+=1;
                }
                p--;
               }
               if(k1>k){
                System.out.println("0");
               }
               else{
                System.out.println("1");
               }
            }
            else{
                int k1=0;
                int p=n-1;
                for(int j=0;j<n/2;j++){
                    if(s.charAt(j)!=s.charAt(n-j-1)){
                        k1+=1;
                    }
                }
            if(k1>k){
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }

        }
    }
}