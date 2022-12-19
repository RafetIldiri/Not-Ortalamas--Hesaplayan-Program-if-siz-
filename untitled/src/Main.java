import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
                int mat,fizik,kimya,cog,muzik,turkce;




                System.out.println("Matematik notunu gir:");

                mat = input.nextInt();

                System.out.println("Fizik notunu gir:");

                fizik = input.nextInt();

                System.out.println("Kimya notunu gir:");

                kimya = input.nextInt();

                System.out.println("Cografya notunu gir:");

                cog = input.nextInt();

                System.out.println("Muzik notunu gir:");

                muzik = input.nextInt();

                System.out.println("Turkce notunu gir:");

                turkce = input.nextInt();
                int  toplam = ( mat + fizik + kimya + cog + muzik + turkce );

                double ortalama = toplam  / 6;

                 String str = (ortalama>60)? "Gectiniz" : "Kaldiniz";
                  System.out.print("Sınıfı geçme durumunuz " + str + " Ortalamanız: "+ortalama);





    }
}