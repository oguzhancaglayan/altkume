import java.util.Scanner;
public class forfaktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n,r;
       System.out.print("kümenin eleman sayısını yazınız : ");
       n = input.nextInt();
       System.out.print("altkümenin eleman sayısını yazınız : ");
       r = input.nextInt();
       int total1 = 1, total2 =1,total3=1;
       for(int i=1;i<=n;i++){
           total1 =total1*i;
       }
       for(int j=1;j<=r;j++){
           total2 =total2*j;
       }
       int m= n-r;
       for(int k=1;k<=m;k++){
           total3=total3*k;
       }
       int c = total1/(total2*total3);
       System.out.print(n+" elemanlı bir kümenin elemanları farklı "+r+" elemanlı alt küme sayısı : "+c);

    }
}
