/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aplikasi;
import model.Mahasiswa;
import view.ViewMhs;

/**
 *
 * @author Anditya
 */
public class ViewMhsHandler implements ActionListener {

    private Aplikasi model;
    private ViewMhs view;

    public ViewMhsHandler(Aplikasi model) {
        this.model = model;
        view = new ViewMhs();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSearch())) {
            String nim = view.getNim();
            Mahasiswa m = model.getMhs(nim);
            if (m != null) {
                view.setText(m.toString());
            } else {
                view.setText("not found");
            }
        } else if (source.equals(view.getBtnBack())) {
            new MainMenuHandler(model);
            view.dispose();
        }
    }

}
