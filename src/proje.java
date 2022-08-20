import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int n = input.nextInt();
        System.out.print("İkinci sayıyı girinz :");
        int m = input.nextInt();
        if(m>n){
            int k = 1;
            while(m%(n*k) != 0 || n*k<=m)k++;
            int ekok = n*k;
            System.out.println(ekok);
        }



    }
}
