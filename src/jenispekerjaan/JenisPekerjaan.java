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
public abstract class JenisPekerjaan {
    private String namaPek;
    
    public JenisPekerjaan(String _nama){
        namaPek=_nama;                
    }
    
    public String getNamaPekerjaan()
    {
        return namaPek;
    }
    
    public abstract void cuti();
}

