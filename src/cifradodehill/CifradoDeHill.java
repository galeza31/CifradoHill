/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradodehill;

public class CifradoDeHill extends javax.swing.JFrame {

static final int n = 2;
    public CifradoDeHill() {
        initComponents();
        this.inicializar();  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCifrado = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtDescifrado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCifrar = new javax.swing.JButton();
        btnDescifrar = new javax.swing.JButton();
        txtLlave = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane4.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        txtMensaje.setName("txtMensaje"); // NOI18N
        jScrollPane3.setViewportView(txtMensaje);

        txtCifrado.setColumns(20);
        txtCifrado.setRows(5);
        txtCifrado.setName("txtCifrado"); // NOI18N
        jScrollPane6.setViewportView(txtCifrado);

        txtDescifrado.setColumns(20);
        txtDescifrado.setRows(5);
        txtDescifrado.setName("txtDescifrado"); // NOI18N
        jScrollPane7.setViewportView(txtDescifrado);

        jLabel1.setText("  Matriz Llave");

        jLabel2.setText(" Mensaje");

        jLabel3.setText("Cifrado");

        jLabel4.setText("Descifrado");

        btnCifrar.setText("Cifrar");
        btnCifrar.setName("btnCifrar"); // NOI18N
        btnCifrar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnCifrarStateChanged(evt);
            }
        });
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });

        btnDescifrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnDescifrar.setText("Descrifrar");
        btnDescifrar.setName("btnDescifrar"); // NOI18N
        btnDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescifrarActionPerformed(evt);
            }
        });

        txtLlave.setEditable(false);
        txtLlave.setColumns(20);
        txtLlave.setRows(5);
        txtLlave.setName("txtLlave"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDescifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addGap(196, 196, 196)
                                .addComponent(jLabel4)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCifrar)
                    .addComponent(btnDescifrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String mensaje,cifrado,descifrado;
    StringBuffer strBuff;
    int llave[][] = new int[n][n];
    int matrizMensaje[][];
    int divCad;
    int matrizInversa[][] = new int[n][n];
    int resultado[][];
    
  
    public void inicializar(){
        llave[0][0]=1;
        llave[0][1]=2;
                 llave[1][0]=6;
                 llave[1][1]=19;
                          matrizInversa[0][0]=19;
                          matrizInversa[0][1]=-2;
                          matrizInversa[1][0]=-6;
                          matrizInversa[1][1]=1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 matrizInversa[i][j] = matrizInversa[i][j]*73;
                 
                 if(matrizInversa[i][j]<0){
                      matrizInversa[i][j]=(matrizInversa[i][j]%255)+255;
                 }
                 else{
                matrizInversa[i][j]=matrizInversa[i][j]%255;
                 }
            }
        }  
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               txtLlave.setText(txtLlave.getText()+ String.valueOf(llave[i][j]) + "  ");
            }
             txtLlave.setText(txtLlave.getText()+ "\n");
        }
    }
    
          
        
  
    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed
        
        
        btnDescifrar.enable(true);
        txtCifrado.setText("");
        strBuff= new StringBuffer(10000);
        int contCad=0;
        mensaje = txtMensaje.getText();
        int longCad = mensaje.length();
        divCad = longCad/n;
        int mod = longCad%2;
        if(mod!=0){
        divCad = divCad+1;
        }
        matrizMensaje = new int [n][divCad];
        resultado = new int [n][divCad];
       for(int i=0;i<divCad;i++){
           for(int j=0;j<n;j++){
                if(contCad<longCad){
                matrizMensaje[j][i] = mensaje.charAt(contCad);
                }
                else{
                    matrizMensaje[j][i]=0;
                }
                contCad++;
           }
       }
       
     int acum;
     for(int i=0;i<n;i++){
           
            for(int j=0;j<divCad;j++){
                acum=0;
                for(int k=0;k<n;k++){
                    acum=acum+(llave[i][k]*matrizMensaje[k][j]);
                }
              resultado[i][j]=acum;
                resultado[i][j]=resultado[i][j]%255;
            

            }
         }
     
     for(int j=0;j<divCad;j++){
         for(int i=0;i<n;i++){
             cifrado=strBuff.append((char)resultado[i][j]).toString();
         }
     }
     
     
     txtCifrado.setText(cifrado);
               
    }//GEN-LAST:event_btnCifrarActionPerformed
//************************************************************************************
    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed

        txtDescifrado.setText("");
         strBuff = new StringBuffer(10000);
        int contCad = 0;
        descifrado="";
        mensaje = txtMensaje.getText();
        int longCad = mensaje.length();
        divCad=longCad/n;
        int mod=longCad%2;
        if(mod!=0){
        divCad=divCad+1;
        }
        matrizMensaje = new int[n][divCad];
        resultado=new int[n][divCad];
       for(int i=0;i<divCad;i++){
           for(int j=0;j<n;j++){
                if(contCad<longCad){
                matrizMensaje[j][i]=mensaje.charAt(contCad);
                }
                else{
                    matrizMensaje[j][i]=0;
                }
                contCad++;
           }
       }
        
       
         int acum;
     for(int i=0;i<n;i++){
           
            for(int j=0;j<divCad;j++){
                acum=0;
                for(int k=0;k<n;k++){
                    acum=acum+(matrizInversa[i][k]*matrizMensaje[k][j]);
                    
                }
               resultado[i][j]=acum;   
                resultado[i][j]=resultado[i][j]%255;
            }
         }
     for(int j=0;j<divCad;j++){
         for(int i=0;i<n;i++){
             descifrado=strBuff.append((char)resultado[i][j]).toString();
         }
     }
         txtDescifrado.setText(descifrado);
    }//GEN-LAST:event_btnDescifrarActionPerformed

    private void btnCifrarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnCifrarStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCifrarStateChanged

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CifradoDeHill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CifradoDeHill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CifradoDeHill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CifradoDeHill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CifradoDeHill ch = new CifradoDeHill();
                ch.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextArea txtCifrado;
    private javax.swing.JTextArea txtDescifrado;
    private javax.swing.JTextArea txtLlave;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
