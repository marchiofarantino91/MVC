/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aplikasi;
import view.MainMenu;

/**
 *
 * @author Anditya
 */
public class MainMenuHandler implements ActionListener {
    
    private Aplikasi model;
    private MainMenu view;

    public MainMenuHandler(Aplikasi model) {
        view = new MainMenu();
        view.setVisible(true);
        view.addActionListener(this);
        this.model = model;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnAdd())){
            //pindah view ke add mhs
            new AddMhsHandler(model);
            view.dispose();
            
        }else if(source.equals(view.getBtnView())){
            //pindah ke view mhs
            new ViewMhsHandler(model);
            view.dispose();
        }
    }
    
}
