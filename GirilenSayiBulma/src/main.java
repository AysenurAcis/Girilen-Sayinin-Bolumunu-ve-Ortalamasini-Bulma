import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int n;
        int loop = 0;
        int average = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        n = sc.nextInt();

        for(int i=0; i<=n; i++){
            if(i % 3 == 0 && i % 4 == 0){
                loop++;
                average += i;
            }
        }
        average /= loop;

        System.out.println("3 & 4 İle Bölünen Sayıların Ortalaması: " + average);
    }
}