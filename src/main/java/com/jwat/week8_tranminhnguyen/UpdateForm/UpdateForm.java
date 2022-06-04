package com.jwat.week8_tranminhnguyen.UpdateForm;

import com.jwat.week8_tranminhnguyen.DataHandler.DataStorage;
import com.jwat.week8_tranminhnguyen.AppFrame;
import com.jwat.week8_tranminhnguyen.DataHandler.DataValidator;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UpdateForm extends javax.swing.JFrame {

    private JTable table;
    private int selectedRow;

    public UpdateForm(JFrame frame, JTable table) {
        this.table = table;
        initComponents();
        initForm();
    }

    private void initForm() {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        selectedRow = table.getSelectedRow();

        nameField.setText(tblModel.getValueAt(selectedRow, 0).toString());
        dobField.setText(tblModel.getValueAt(selectedRow, 2).toString());
        salaryField.setText(tblModel.getValueAt(selectedRow, 5).toString());
        genderOption.setSelectedItem(tblModel.getValueAt(selectedRow, 1).toString());
        roleOption.setSelectedItem(tblModel.getValueAt(selectedRow, 3).toString());
        deptOption.setSelectedItem(tblModel.getValueAt(selectedRow, 4).toString());
    }

    private List<String> addData() {
        List<String> data = new ArrayList<>();
        data.add(nameField.getText());
        data.add(genderOption.getSelectedItem().toString());
        data.add(dobField.getText());
        data.add(roleOption.getSelectedItem().toString());
        data.add(deptOption.getSelectedItem().toString());
        data.add(salaryField.getText());

        return data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddingFormTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        genderOption = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        roleOption = new javax.swing.JComboBox<>();
        deptOption = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AddingFormTitle.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        AddingFormTitle.setText("Update employee");

        jLabel2.setText("Name");

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setForeground(new java.awt.Color(51, 51, 51));
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.setPreferredSize(new java.awt.Dimension(71, 40));

        jLabel3.setText("Date of birth (DD-MM-YYYY)");

        dobField.setBackground(new java.awt.Color(255, 255, 255));
        dobField.setForeground(new java.awt.Color(51, 51, 51));
        dobField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dobField.setPreferredSize(new java.awt.Dimension(71, 40));

        genderOption.setBackground(new java.awt.Color(255, 255, 255));
        genderOption.setForeground(new java.awt.Color(51, 51, 51));
        genderOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genderOption.setOpaque(true);

        jLabel1.setText("Gender");

        roleOption.setBackground(new java.awt.Color(255, 255, 255));
        roleOption.setForeground(new java.awt.Color(51, 51, 51));
        roleOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Director", "Manager", "Staff" }));
        roleOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deptOption.setBackground(new java.awt.Color(255, 255, 255));
        deptOption.setForeground(new java.awt.Color(51, 51, 51));
        deptOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "Account", "Human Resources", "Sales" }));
        deptOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Role");

        jLabel5.setText("Department");

        salaryField.setBackground(new java.awt.Color(255, 255, 255));
        salaryField.setForeground(new java.awt.Color(51, 51, 51));
        salaryField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setText("Salary");

        submitButton.setBackground(new java.awt.Color(251, 51, 51));
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorderPainted(false);
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.setFocusPainted(false);
        submitButton.setFocusable(false);
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HandleSubmit(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(genderOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(salaryField)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(roleOption, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(deptOption, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AddingFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AddingFormTitle)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genderOption)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deptOption)
                    .addComponent(roleOption, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HandleSubmit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandleSubmit
        var dataValidator = new DataValidator();
        List<String> data = addData();
        String role = data.get(3);

        if (dataValidator.validateRole(role) && dataValidator.validateDataFormat(data)) {
            DataStorage.updateByIndex(data, selectedRow);
            var demo = new AppFrame();
            this.dispose();
            demo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Violate role constraint or Invalid data type. Please check again");
        }
    }//GEN-LAST:event_HandleSubmit


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddingFormTitle;
    private javax.swing.JComboBox<String> deptOption;
    private javax.swing.JTextField dobField;
    private javax.swing.JComboBox<String> genderOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> roleOption;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
