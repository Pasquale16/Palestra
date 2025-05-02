package view;

import javax.swing.*;
import presenter.TerminaAbbonamentoPresenter;

public class TerminaAbbonamento extends javax.swing.JPanel {

    private TerminaAbbonamentoPresenter presenter;

    public TerminaAbbonamento() {
        initComponents();
        presenter = new TerminaAbbonamentoPresenter(this);

        // Aggiungi l'azione per il bottone
        jButton1.addActionListener(e -> presenter.terminaAbbonamento());
    }

    // Getter per ottenere l'ID
    public String getId() {
        return jTextField1.getText();
    }

    // Getter per ottenere il tipo di abbonamento
    public String getTipoAbbonamento() {
        return jTextField2.getText();
    }

    // Metodo per visualizzare il risultato (ad esempio un messaggio di conferma)
    public void setMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    // Inizializzazione degli elementi della view (non modificare)
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("ID");

        jLabel2.setText("Tipo abbonamento");

        jButton1.setText("TERMINA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
    }

    // Variables declaration - non modificare
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration
}
