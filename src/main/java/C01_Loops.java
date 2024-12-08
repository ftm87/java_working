import java.util.Scanner;

public class C01_Loops {
    public static void main(String[] args) {

        //LOOPS;Belirli bir kosul saglandigi surece tekrarlanmasi gereken isler icin kullanilan kod bloklarina denir

   /*
        1. for-loop
        2. while-loop
        3. do-while-loop
        4. for-each-loop (Collections’larda)*/


        //for_loop


        //soru1;ekrana 5 kez java guzeldir yazdirin

        for (int i = 1; i <6 ; i++) {
            System.out.println("java guzeldir");
        }


        //soru2: 10 ile 30 arasindaki (10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <31 ; i++) {
          if (i==30){
              System.out.println(i);
          }else {
              System.out.print(i+",");
          }
        }

        //soru3:120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        // ardısık tam sayı arasında bosluk bırakarak yazınız


        for (int i =120; i >10 ; i--) {
            if (i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }


        System.out.println("----------");


        //soru4:Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //ornek;accessories = ces

       String s="accessories";
        String tekrar="";
        for (int i =0; i <s.length() ; i++) {

            String s1=s.substring(i,i+1);

            if (s.indexOf(s1)!=s.lastIndexOf(s1)){

                if (!tekrar.contains(s1)){

                    tekrar=tekrar+s1;
                }
            }
        }
        System.out.println(tekrar);





        //soru5:Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 = 37

        int num=223878;
        String sayi=String.valueOf(num);
        String a="";

        for (int i =0; i <sayi.length() ; i++) {
            String b=sayi.substring(i,i+1);

            if (sayi.indexOf(b)==sayi.lastIndexOf(b)){
                a=a+b;
            }
        }
        System.out.println(a);





        //soru6;  A            bu goruntuyu for dongusu kullanarak yapin
        //        A A
        //        A A A
        //        A A A A


        int satir=4;

        for (int i =1; i <=satir ; i++) {

            for (int j =1; j <=i ; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }






        //soru7:Asagıdaki çarpım tablosunu olusturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int n=3;

        for (int i =1; i <11 ; i++) {
            System.out.println(n+"x" +i +"="+n*i);
        }






        //soru8:Bir String’ i tersine çevirmek için kod yazınız.
        // Örnek; Mark ==> kraM

        String w="Mark";
        String reverse="";

        for (int i =w.length()-1; i >-1 ; i--) {
            reverse=reverse+w.charAt(i);
        }
        System.out.println(reverse);
    }

}