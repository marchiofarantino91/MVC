/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import model.Mahasiswa;

/**
 *
 * @author Anditya
 */
public class Database {
    public void connect(){
        
    }
    
    public void saveMhs(Mahasiswa m){
        //insert into mahasiswa values m.getnim
        //save to table
    }
    
    public Mahasiswa getMhs(String nim){
        //load from table
        // select * from mahasiswa where nim=nim
        //mahasiswa m = new mahasiswa();
        //return m;
        return null;
    }
}
