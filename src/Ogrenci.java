public class Ogrenci {
    // Encapsukation (Bilgi gizleme-Information Hiding)
    // Degiskenler private yaparak gizlenir,get-setlerle işlem yapılır
    private int no;
    private String ad;
    private String soyad;
    private String dogumYeri;
    private double harc;

    public Ogrenci() {
    }

    public Ogrenci(int no, String ad, String soyad, String dogumYeri, double harc) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.dogumYeri = dogumYeri;
        this.harc = harc;
    }

    public double getHarc() {
        return harc;
    }

    public void setHarc(double harc) {
        if (harc >0)
            this.harc = harc;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "no=" + no +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumYeri='" + dogumYeri + '\'' +
                ", harc=" + harc +
                '}';
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;


        //Sağ tık generate constrcutor ad soyad hepsini sec isimleri yazman yeterli





    }
}
