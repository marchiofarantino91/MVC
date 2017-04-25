/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.Database;
import java.util.ArrayList;

/**
 *
 * @author Anditya
 */
public class Aplikasi {

    ArrayList<Mahasiswa> daftarMhs;
    private Database db;

    public Aplikasi() {
        daftarMhs = new ArrayList();
        db = new Database();
        db.connect();
    }

    public void addMhs(Mahasiswa m) {
        daftarMhs.add(m);
        db.saveMhs(m);
        
    }

    public Mahasiswa getMhs(String nim) {
        for (Mahasiswa m : daftarMhs) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return db.getMhs(nim);
    }

    public void deleteMhs(String nim) {
        Mahasiswa m = getMhs(nim);
        daftarMhs.remove(m);
    }

    public String viewMhs() {
        String s = "";
        for (int i = 0; i < daftarMhs.size(); i++) {
            Mahasiswa m = daftarMhs.get(i);
            s += "Mahasiswa " + i + "\n" + m + "\n\n";
        }
        return s;
    }

}
