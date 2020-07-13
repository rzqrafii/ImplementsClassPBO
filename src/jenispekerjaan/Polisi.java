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
public class Polisi extends JenisPekerjaan implements Ipendapatan {
    private String namaPolisi;
    private String pangkat;
    private String jenisPolisi;
    
    public Polisi(String _nama,String _namaPolisi,String _pangkat,String _jenis)
    {
        super(_nama);
        setNamaPolisi(_namaPolisi);
        setPangkat(_pangkat);
        setJenisPolisi(_jenis);
    }
    
    public void setNamaPolisi(String _namaPolisi)
    {
        namaPolisi=_namaPolisi;
    }
    public void setPangkat(String _pangkat)
    {
        pangkat=_pangkat;
    }
    public void setJenisPolisi(String _jenis)
    {
        jenisPolisi=_jenis;
    }
    public void cuti()
    {
        System.out.println("Cuti Sebanyak 4x Setahun");
    }
    public void Pendapatan()
    {
       System.out.println("Pendapatan Polisi 1,5jt - 6jt/bulan");
    }
    
    public String getNamaPolisi()
    {
        return namaPolisi;
    }
    public String getPangkat()
    {
        return pangkat;
    }
    public String getJenisPolisi()
    {
        return jenisPolisi;
    }
    public void cetakInfo()
    {
        System.out.println("Nama Jenis Pekerjaan    : "+super.getNamaPekerjaan());
        System.out.println("Nama Polisi             : "+getNamaPolisi());
        System.out.println("Pangkat Polisi          : "+getPangkat());
        System.out.println("Jenis Polisi            : "+getJenisPolisi());
        cuti();
        Pendapatan();
        System.out.println("");
    }
}
