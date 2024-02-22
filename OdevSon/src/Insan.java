public class Insan {
    private String isim;
    private String TCKimlik;
    public Insan(){
        isim="Bilgi Yok";
        TCKimlik="Bilgi Yok";
    }
    public Insan(String isim,String TCKimlik){
        setIsim(isim);
        setTCKimlik(TCKimlik);
    }
    public String getIsim() {
        return isim;
    }
    public String getTCKimlik() {
        return TCKimlik;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void setTCKimlik(String TCKimlik) {
        this.TCKimlik = TCKimlik;
    }
    public void kendiniTanit(){
        System.out.println("Benim adım "+ getIsim()+". TC kimlik numaram  "+ getTCKimlik());
        System.out.println("Kedimin adı "+Kedi.getIsim()+". Akvaryumumda "+Akvaryum.getBalikSayisi()+" adet balık var.");
    }
}