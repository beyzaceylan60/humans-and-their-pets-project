public class Akvaryum {
    private static int balikSayisi;
    public Akvaryum(int balikSayisi){
        Akvaryum.balikSayisi = balikSayisi;
    }

    public static int getBalikSayisi() {
        return balikSayisi;
    }
    public static void setBalikSayisi(int yeniBalikSayisi){
        balikSayisi = yeniBalikSayisi;
    }
    public static void balikEkle() {
        Akvaryum.balikSayisi++;
    }
    public static void balikSil(int adet){
        if (getBalikSayisi()>=adet){
            setBalikSayisi((getBalikSayisi()-adet));
        }
        else {
            System.out.println(" ***********************************************************\n Mevcut balık sayınız "+ getBalikSayisi()+". Lütfen tekrar deneyiniz.\n***********************************************************");
        }

    }

}
