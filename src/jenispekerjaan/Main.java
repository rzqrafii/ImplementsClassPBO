/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenispekerjaan;
import java.util.Scanner;

/**
 *
 * @author RIZQULLAH
 */
public class Main {
    public static void main(String args[])
    {
        int menu = 0;
        Scanner input = new Scanner(System.in);
        while (menu==0){   
            System.out.println("INFO JENIS PEKERJAAN");
            System.out.println("------------------");
            System.out.println("1.Pilot");
            System.out.println("2.Polisi");
            System.out.println("3.Dokter");
            System.out.println("4.Masinis");
            System.out.println("5.Programmer");
            System.out.println("0.Exit");
            System.out.println("Masukkan Pilihan : ");
            int pilih = input.nextInt(); 
            
            switch(pilih){
                case 1:
                    Pilot pilotbaru= new Pilot ("Pilot","RafiiRizqullah","Garuda Indonesia");
                    pilotbaru.cetakInfo();
                    break;
                
                case 2:
                    Polisi polisibaru=new Polisi("Polisi","Rafi Amar","Jendral","Perwira Tinggi");
                    polisibaru.cetakInfo();
                    break;
                    
                case 3:
                    Dokter dokterbaru= new Dokter("Dokter","Umum");
                    dokterbaru.cetakInfo();
                    break;
                
                case 4:
                    Masinis masinisbaru = new Masinis("Masinis","Dalam Kota/ Luar Kota","Bisnis");
                    masinisbaru.cetakInfo();
                    break;
                
                case 5:
                    Programmer programmerbaru=new Programmer("Programmer","C,JAVA,PASCAL","Sesuai Project");
                    programmerbaru.cetakInfo();
                    break;
                
                case 0:System.exit(0);
                    
            }
        }
    }
}