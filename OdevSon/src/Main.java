import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kediadi, TC, isim;
        int baliksayisi,tercih,azalt;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz : ");
        isim = klavye.nextLine();
        System.out.print("TC Kimlik Numaranızı Giriniz : ");
        TC = klavye.nextLine();
        System.out.print("Lütfen Kedinizin Adını Giriniz : ");
        kediadi = klavye.nextLine();
        System.out.print("Lütfen Akvaryumunuzda Kaç Balık Olduğunu Yazınız : ");
        baliksayisi = klavye.nextInt();
        Insan insan = new Insan(isim, TC);
        Akvaryum akvaryum = new Akvaryum(baliksayisi);
        Kedi kedi = new Kedi(kediadi);
        insan.kendiniTanit();
        while (true) {
            System.out.println("Balık azaltmak için 0, eklemek için ise 1, değişiklik yapmayacaksanız 2 yazınız.");
            tercih = klavye.nextInt();
            if(tercih==0){
                System.out.println("Azaltmak istediğiniz balık sayısı : ");
                azalt = klavye.nextInt();
                Akvaryum.balikSil(azalt);
                insan.kendiniTanit();
            }
            if(tercih==1){
                Akvaryum.balikEkle();
                insan.kendiniTanit();
            }
            if(tercih==2){
                System.exit(0);
            }
        }
    }
}
