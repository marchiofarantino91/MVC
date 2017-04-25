/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import control.AddMhsHandler;
import control.MainMenuHandler;
import model.Aplikasi;
import model.Mahasiswa;

/**
 *
 * @author Anditya
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Mahasiswa m1 = new Mahasiswa("113", "Budi", 75);
//        Mahasiswa m2 = new Mahasiswa("116", "Eko", 75);
////        System.out.println(m1);
////        System.out.println(m2);
//        
//        Aplikasi a = new Aplikasi();
//        a.addMhs(m1);
//        a.addMhs(m2);
//        a.deleteMhs("113");
//        System.out.println(a.viewMhs());
        
        Aplikasi app = new Aplikasi();
        MainMenuHandler view = new MainMenuHandler(app);
        
    }

}
