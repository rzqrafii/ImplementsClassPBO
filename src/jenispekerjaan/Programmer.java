/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenispekerjaan;

/**
 *
 * @author RIZQULLAH
 */
public class Programmer extends JenisPekerjaan implements Ipendaftaran,Ipendapatan {
    private String bahasaProg;
    private String lamaWaktu;
    
    public Programmer(String _nama,String _bahasa,String _lama)
    {
        super(_nama);
        setBahasaProg(_bahasa);
        setLamaWaktu(_lama);
    }
    
    public void Pendaftaran()
    {
        System.out.println("===CARA PENDAFTARAN===");
        System.out.println("1.Menguasai Bahasa C/JAVA");
        System.out.println("2.Minimal Umur 17thn");
        System.out.println("3.Disiplin");
        System.out.println("");
    }
    public void setBahasaProg(String _bahasa)
    {
        bahasaProg=_bahasa;
    }
    public void setLamaWaktu(String _lama)
    {
        lamaWaktu=_lama;
    }
    public void cuti()
    {
        System.out.println("Cuti ditentukan Proggrammer");
    }
    public void Pendapatan()
    {
       System.out.println("Pendapatan Programmer : 5jt-20jt");
    }
    
    public String getBahasaProg()
    {
        return bahasaProg;
    }
    public String getLamaWaktu()
    {
        return lamaWaktu;
    }
    public void cetakInfo()
    {
        System.out.println("Nama Jenis Pekerjaan : "+super.getNamaPekerjaan());
        System.out.println("Bahasa Pemrograman   : "+getBahasaProg());
        System.out.println("Lama Waktu Pengerjaan: "+getLamaWaktu());
        cuti();
        Pendaftaran();
        Pendapatan();
        System.out.println("");
        
    }
}
