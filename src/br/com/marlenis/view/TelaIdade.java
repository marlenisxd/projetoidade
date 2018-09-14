package br.com.marlenis.view;

import br.com.marlenis.model.ModelIdade;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lukas
 */
public class TelaIdade extends JFrame implements ActionListener {

    private ModelIdade modeloIdade;

    private JTextField edNascimento, edAtual, edIdade;
    private JButton btCalcular;

    public TelaIdade() {
        super("Idadedade");
        this.setLayout(new BorderLayout());
        JLabel titulo = new JLabel("CALCULO DE IDADE");
        JPanel norte = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.add(norte, BorderLayout.NORTH);
        norte.setBackground(Color.RED);
        titulo.setForeground(Color.white);
        Font f = new Font("SansSerif", Font.BOLD, 20);
        titulo.setFont(f);
        norte.add(titulo);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void init() {
        JPanel centro = new JPanel(new GridLayout(0, 2));
        

        edNascimento = new JTextField();
        edAtual = new JTextField();
        edIdade = new JTextField();

        edIdade.setEditable(false);

        btCalcular = new JButton("Calcular");
        btCalcular.setActionCommand("idade.calcular");
        this.add(centro, BorderLayout.CENTER);
        centro.add(new JLabel("Ano Nascimento: "));
        centro.add(edNascimento);
        centro.add(new JLabel("Ano Atual: "));
        centro.add(edAtual);
        centro.add(new JLabel("Idade: "));
        centro.add(edIdade);
        centro.add(btCalcular);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public ModelIdade getModeloIdade() {
        if (!edNascimento.getText().isEmpty() && !edAtual.getText().isEmpty()) {
            modeloIdade.setAnoNascimento(Integer.parseInt(edNascimento.getText()));
            modeloIdade.setAnoAtual(Integer.parseInt(edAtual.getText()));
            return modeloIdade;
        }
        return null;
    }

    public void setModeloIdade(ModelIdade modeloIdade) {
        if (modeloIdade.getAnoAtual() > modeloIdade.getAnoNascimento()) {
            edIdade.setText(Integer.toString(modeloIdade.getIdade()));
        }
        this.modeloIdade = modeloIdade;
    }

    public void addControllerActionListener(ActionListener al) {
        btCalcular.addActionListener(al);
    }

}
