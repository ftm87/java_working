import java.util.Scanner;

public class C02_DoWhile {


    public static void main(String[] args) {


        //while


       /*  baslangic degeri
                while (loop calisma kurali){
                    calisacak kodlar
                    artirma/azaltma
                }                      */


        //soru1;Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
        //ornek String s = "Christmas";

        String s="Christmas";
        String result="";

        int i=0;
       while (i<s.length()){

            String a=s.substring(i,i+1);

            if (a.equals("m")){
                break;
            }
            result=result+a;
            i++;
        }
        System.out.println(result);


        //2.yol do_while

        do {

            String a=s.substring(i,i+1);
            if (a.equals("m")){
                break;
            }
            result=result+a;
            i++;

        }while (i<s.length());

        System.out.println(result);


        //soru2;Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
        //ornek;758=7+5+8=20

        int num=758;
        int sum=0;

        while (num>0){

            sum=sum+num%10;

            num=num/10;
        }

        System.out.println(sum);



        //soru3;Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındak! karakterleri yazdırmak için
        //kod yazınız.

        char ch='C';
        String result1="";


        do {
         result1=result1+ch;
         ch--;
        }while (ch>='A');

        System.out.println(result1);

        //soru4;Kullanicidan toplamak uzere pozitif sayilar isteyin,islemi bitirmek icin 0 'a basamasini soyleyin
        //kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        int nm;
        int sum1=0;
        int count=0;
        System.out.println("Lutfen pozitif sayi giriniz,islemi bitirmek icin 0'a basiniz");

        while (true){
          nm= scan.nextInt();

            if (nm==0){
                break;
            }

            if (nm>0){
               sum1 = sum1+nm;
               count++;
            }else {
                System.out.println("lutfen pozitif bir sayi giriniz");
            }
        }
        System.out.println("toplam"+count+"pozitif sayi giriniz");
        System.out.println("pozitif sayi toplami;"+sum1);


    }

    }

