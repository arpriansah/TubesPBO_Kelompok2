/*
Topik   : Sekolah
Ketua   : Arpriansah Yonathan (1301194112)
Anggota : Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah3;

public class matapelajaran {
   private String nama_mapel;
   private float kkm;
   public void setMataPelajaran(String a){
       this.nama_mapel = a;
   }
   public void setKKM(float a){
       this.kkm = a;
   }
   public String getMataPelajaran(){
       return nama_mapel;
   }
   public float getKKM(){
       return kkm;
   }
}
