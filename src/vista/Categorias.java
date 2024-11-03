/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.AuCategorias;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

/**
 *
 * @author Ayair Martin
 */
public class Categorias extends javax.swing.JPanel {
    
    //instanciando las clases
    Categoria ct = new Categoria();
    AuCategorias auCt=new AuCategorias();
    DefaultTableModel modeloCategoria = new DefaultTableModel();
    
    

    /**
     * Creates new form Categorias
     */
    public Categorias() {
        initComponents();
        listarCategorias();
    }
    
    //metodo para listar
    private void listarCategorias(){
        List<Categoria> lista = auCt.Listar();
        modeloCategoria = (DefaultTableModel) tbCategorias.getModel();
        Object[] ob = new Object[2];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getIdCategoria();
            ob[1]=lista.get(i).getNomCategoria();
            modeloCategoria.addRow(ob);
            
            
        }
        tbCategorias.setModel(modeloCategoria);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidcategoria = new javax.swing.JTextField();
        txtnombreCategoria = new javax.swing.JTextField();
        btn_guardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCategorias = new javax.swing.JTable();
        btneditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btneliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnbuscar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 740));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de Categorias");

        jPanel1.setBackground(new java.awt.Color(171, 180, 186));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        txtnombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreCategoriaActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btn_guardar.setRound(25);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txtidcategoria)
                        .addComponent(txtnombreCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tbCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoria"
            }
        ));
        tbCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCategorias);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btneditar.setText("Editar");
        btneditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btneditar.setRound(25);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btneliminar.setRound(25);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnbuscar.setRound(25);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreCategoriaActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        ct.setNomCategoria(txtnombreCategoria.getText());
        if(auCt.insertar(ct)){
            JOptionPane.showMessageDialog(null, "Categoria insertada con éxito");
           
        }else{
            JOptionPane.showMessageDialog(null, "No se registró la categoria");
        }
        limpiarTablaCategoria();
        listarCategorias();
        limpiarCampos();//llamamos al metodo limpiar
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        int fila = tbCategorias.getSelectedRow();
        if(fila==-1 && txtidcategoria.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        }
        else{
            ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
            ct.setNomCategoria(txtnombreCategoria.getText());
            if (auCt.editar(ct)) {
                JOptionPane.showMessageDialog(null, "Se modificó con éxito");
                limpiarTablaCategoria();
                listarCategorias();
                limpiarCampos();
            }
        }
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidcategoria.getText().isEmpty()) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la categoria?","Confirmar",2);
            if(confirmacion == 0){
                ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
                auCt.eliminar(ct);
                limpiarTablaCategoria();
                listarCategorias();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Se eliminó con éxito");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        }
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // BUSCAR
        ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        if(auCt.buscar(ct)){
            txtidcategoria.setText(ct.getIdCategoria()+"");
            txtnombreCategoria.setText(ct.getNomCategoria()+"");
            
        }else{
            JOptionPane.showMessageDialog(null, "La categoria no existe");
            limpiarCampos();
        }
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void tbCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCategoriasMouseClicked
        // TODO add your handling code here:
        int fila=tbCategorias.getSelectedRow();
        txtidcategoria.setText(tbCategorias.getValueAt(fila, 0).toString());
        txtnombreCategoria.setText(tbCategorias.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tbCategoriasMouseClicked

    
    
    //creando un metodo limpiar al momento de registrar
    void limpiarCampos(){
        txtidcategoria.setText("");
        txtnombreCategoria.setText("");
    }
    
    void limpiarTablaCategoria(){
        for(int i=0;i<modeloCategoria.getRowCount();i++){
            modeloCategoria.removeRow(i);
            i=0-1;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btn_guardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnbuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btneditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCategorias;
    private javax.swing.JTextField txtidcategoria;
    private javax.swing.JTextField txtnombreCategoria;
    // End of variables declaration//GEN-END:variables
}