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
public class Dokter extends JenisPekerjaan implements Ipendapatan{
    
    private String spesialis;
    
    public Dokter(String _nama,String _spesialis)
    {
        super(_nama);
        setSpesialis(_spesialis);
    }
    
    public void setSpesialis(String _spesialis)
    {
        spesialis=_spesialis;
    }
    public void cuti()
    {
        System.out.println("Cuti sebanyak 3x Sebulan");
    }
    public void Pendapatan()
    {
       System.out.println("Pendapatan Dokter : 10jt/bulan");
    }
    
    public String getSpesialis()
    {
        return spesialis;
    }
    public void cetakInfo()
    {
        System.out.println("Nama Jenis Pekerjaan : "+super.getNamaPekerjaan());
        System.out.println("Spesialis            : "+getSpesialis());
        cuti();
        Pendapatan();
        System.out.println("");
    }
}
