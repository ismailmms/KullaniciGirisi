import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        String username, password, nwpassword;
        int select;
        Scanner info = new Scanner(System.in);

        System.out.println("Kullanici Adinizi Giriniz");
        username = info.nextLine();

        System.out.println("Sifrenizi Giriniz");
        password = info.nextLine();

        if (username.equals("nasirjones") && password.equals("biblohediyealmayin")){
            System.out.println("Giris Yapildi");
        }else{
            System.out.println("Sifreniz Hatali!");
            System.out.println("Sifrenizi Yenilemek Ister Misiniz?\n1-Y\n2-N");

            select =info.nextInt();


            if (select==1){
                System.out.println("Lutfen Yeni Sifrenizi Giriniz");
                nwpassword = info.next();
                if (nwpassword.equals("biblohediyealmayin")){
                    System.out.println("Yeni Sifreniz Eskisiyle Ayni Olamaz");
                }else {
                    System.out.println("Sifreniz Degistirildi, Yeni Sifreniz: " + nwpassword);
                }

                } else if (select==2) {
                System.out.println("Lütfen Bilgilerini Kontrol Edin ve Tekrar Deneyin");

            }
        }



        }

    }

