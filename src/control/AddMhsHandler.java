/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Aplikasi;
import model.Mahasiswa;
import view.AddMhs;

/**
 *
 * @author Anditya
 */
public class AddMhsHandler implements ActionListener{
    
    private AddMhs view;
    private Aplikasi model;

    public AddMhsHandler(Aplikasi model) {
        view = new AddMhs();
        view.setVisible(true);
        view.addActionListener(this);
        this.model = model;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object yangdiklik = ae.getSource();
        if(yangdiklik.equals(view.getBtnAdd())){
            
            String nim = view.getNim();
            String nama = view.getNama();
            double nilai = view.getNilai();
            Mahasiswa m = new Mahasiswa(nim, nama, nilai);
            model.addMhs(m);
            view.reset();
//            JOptionPane.showMessageDialog(view, model.viewMhs());
            
        }else if(yangdiklik.equals(view.getBtnBack())){
            new MainMenuHandler(model);
            view.dispose();
        }
    }
    
}
