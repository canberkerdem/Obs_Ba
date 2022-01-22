public class OgrenciTest {
    public static void main(String[] args) {

        // Java'da obje oluşturma bu şekilde
        Ogrenci ogr =new Ogrenci();

        ogr.setNo(1);
        ogr.setAd("Canberk");
        ogr.setSoyad("Erdem");
        ogr.setDogumYeri("İstanbul");
        ogr.setHarc(2000);

        System.out.println(ogr.getNo() +"-" +ogr.getAd()+" "+ogr.getSoyad()+" "+ogr.getHarc());

        ogr.setHarc(2500);

        System.out.println(ogr.getNo() +"-" +ogr.getAd()+" "+ogr.getSoyad()+" "+ogr.getHarc());

        Ogrenci ogr2 = new Ogrenci(2,"Hasan" ,"Erdem" , "Türkiye" , 4000);

        System.out.println(ogr2);

    }
}
