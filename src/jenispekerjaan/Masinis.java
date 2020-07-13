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
public class Masinis extends JenisPekerjaan implements Ipendapatan {
    private String jurusanKereta;
    private String tipeKereta;
    
    public Masinis(String _nama,String _jurusan,String _tipe)
    {
        super(_nama);
        setJurusanKereta(_jurusan);
        setTipeKereta(_tipe);
    }
    
    public void setJurusanKereta(String _jurusan)
    {
        jurusanKereta=_jurusan;
    }
    public void setTipeKereta(String _tipe)
    {
        tipeKereta=_tipe;
    }
    public void cuti()
    {
        System.out.println("Tidak Ada Cuti");
    }
    public void Pendapatan()
    {
       System.out.println("Pendapatan Masinis : 13jt/bulan");
    }
    
    public String getJurusanKereta()
    {
        return jurusanKereta;
    }
    public String getTipeKereta()
    {
        return tipeKereta;
    }
    public void cetakInfo()
    {
        System.out.println("Nama Jenis Pekerjaan : "+super.getNamaPekerjaan());
        System.out.println("Jurusan Kereta       : "+getJurusanKereta());
        System.out.println("Tipe Kereta          : "+getTipeKereta());
        cuti();
        Pendapatan();
        System.out.println("");
    }
}

