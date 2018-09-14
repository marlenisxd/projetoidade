package br.com.marlenis.controller;

import br.com.marlenis.model.ModelIdade;
import br.com.marlenis.view.TelaIdade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerIdade implements ActionListener {

    private TelaIdade minhaView;

    public ControllerIdade() {
        minhaView = new TelaIdade();
        ModelIdade model = new ModelIdade();
        minhaView.setModeloIdade(model);
        this.minhaView.addControllerActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (minhaView != null) {
            this.calcularIdade();
        }
    }

    private void calcularIdade() {
        ModelIdade modeloIdade = minhaView.getModeloIdade();
        if (modeloIdade != null) {
            minhaView.setModeloIdade(modeloIdade);
        }
    }

}
