
package Formularios;
import java.util.Date;
import Desarrollo.Turnos;
import java.time.LocalTime;

public class FormTurnos extends javax.swing.JInternalFrame {

    public FormTurnos() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SpHora = new javax.swing.JSpinner();
        SpMinutos = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(SpMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton1)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Time hormin;
        int h, m;
        h = Integer.parseInt(this.SpHora.getValue().toString());
        m = Integer.parseInt(this.SpMinutos.getValue().toString());
        LocalTime h1 = LocalTime.of(15, 45); 
       // Turnos hor = new Turnos(h,m);
        //hor.Mostrar();
    }//GEN-LAST:event_jButton1ActionPerformed

 private java.sql.Date ConvertirASql(java.util.Date fecha) 
    {
        java.sql.Date SqlFechaConvertida;
        SqlFechaConvertida = new java.sql.Date(fecha.getTime()); 
        return SqlFechaConvertida;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpHora;
    private javax.swing.JSpinner SpMinutos;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
