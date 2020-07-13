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
public class Pilot extends JenisPekerjaan implements Ipendapatan {
    private String namaPilot;
    private String maskapai;
    
    public Pilot(String _nama,String _namaPilot,String _maskapai)
    {
        super(_nama);
        setNamaPilot(_namaPilot);
        setMaskapai(_maskapai);
    }
    
    public void setNamaPilot(String _namaPilot)
    {
        namaPilot=_namaPilot;
    }
    public void setMaskapai(String _maskapai)
    {
        maskapai=_maskapai;
    }
    public void cuti()
    {
        System.out.println("Cuti Sebanyak 4x Setahun");
    }
    public void Pendapatan()
    {
       System.out.println("Pendapatan Pilot : 45jt/bulan");
    }
    
    public String getNamaPilot()
    {
        return namaPilot;
    }
    public String getMaskapai()
    {
        return maskapai;
    }
    public void cetakInfo()
    {
        System.out.println("Nama Jenis Pekerjaan    : "+super.getNamaPekerjaan());
        System.out.println("Nama Pilot              : "+getNamaPilot());
        System.out.println("Maskapai                : "+getMaskapai());
        cuti();
        Pendapatan();
        System.out.println("");
    }
}
