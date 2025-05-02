package view;

import javax.swing.*;
import presenter.MostraIscrittiPresenter;

public class MostraIscritti extends javax.swing.JPanel {

    private MostraIscrittiPresenter presenter;

    public MostraIscritti() {
        initComponents();
        presenter = new MostraIscrittiPresenter(this);

        jButton1.addActionListener(e -> presenter.mostraIscritti());
    }

    public JButton getMostraButton() {
        return jButton1;
    }

    public JTextArea getTextArea() {
        return jTextArea1;
    }

    // initComponents() generato automaticamente
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Mostra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addComponent(jButton1)))
                    .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(jButton1)
                    .addContainerGap(56, Short.MAX_VALUE))
        );
    }

    // Variables declaration - non modificare
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
}
