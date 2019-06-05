
package analizador.sintactico;

import javax.swing.JOptionPane;


public class Interfaz extends javax.swing.JFrame {

   
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_expresion.setText("{3*(7-6)-{3*7}-[6-3]}");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_expresion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_expresion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setText("Validar Expresion");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_expresion, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_expresion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ValidarExpresion()) {
            JOptionPane.showMessageDialog(null, "esta correctamente escrita");
            
        } else {
            JOptionPane.showMessageDialog(null, "esta mal escrita");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txt_expresion;
    // End of variables declaration//GEN-END:variables

    
    public boolean ValidarExpresion(){
        Pila pila = new Pila();
        String cadena = txt_expresion.getText();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i)== '[' || cadena.charAt(i) == '{' ) {
                
                pila.Insertar(cadena.charAt(i));
                
            }else{
                if (cadena.charAt(i)== ')') {
                    if(pila.Extraer()!= '('){
                        return false;
                    }
                    
                }else{
                    if(cadena.charAt(i)== ']'){
                        if (pila.Extraer()!= '[') {
                            return false;
                            
                        }
                    }else{
                        if(cadena.charAt(i)=='}'){
                            if(pila.Extraer()!='{'){
                                return false;
                            
                            }
                        
                        }
                    
                    }
                       
                }
            }
            
        }
    return pila.PilaVacia();
    }
}
