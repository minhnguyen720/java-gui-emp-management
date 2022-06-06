package com.jwat.week8_tranminhnguyen.UpdateForm;

import com.jwat.week8_tranminhnguyen.DataHandler.DataStorage;
import com.jwat.week8_tranminhnguyen.AppFrame;
import com.jwat.week8_tranminhnguyen.DataHandler.DataValidator;
import com.jwat.week8_tranminhnguyen.model.Employee;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UpdateForm extends javax.swing.JFrame {

    private final JTable table;
    private int selectedRow;
    private DefaultTableModel tblModel;

    public UpdateForm(JFrame frame, JTable table) {
        this.table = table;
        initComponents();
        tblModel = (DefaultTableModel) table.getModel();
        initForm();
    }

    private void initForm() {
        selectedRow = table.getSelectedRow();

        String nameVal = tblModel.getValueAt(selectedRow, 1).toString();
        String dobVal = tblModel.getValueAt(selectedRow, 3).toString();
        String salaryVal = tblModel.getValueAt(selectedRow, 8).toString();
        String genderVal = tblModel.getValueAt(selectedRow, 2).toString();
        String roleVal = tblModel.getValueAt(selectedRow, 6).toString();
        String deptVal = tblModel.getValueAt(selectedRow, 7).toString();
        String mobileVal = tblModel.getValueAt(selectedRow, 4).toString();
        String emailVal = tblModel.getValueAt(selectedRow, 5).toString();
        String typeVal = tblModel.getValueAt(selectedRow, 9).toString();

        nameField.setText(nameVal);
        genderOption.setSelectedItem(genderVal);
        dobField.setText(dobVal);
        mobileField.setText(mobileVal);
        emailField.setText(emailVal);
        roleOption.setSelectedItem(roleVal);
        deptOption.setSelectedItem(deptVal);
        salaryField.setText(salaryVal);
        typeOption.setSelectedItem(typeVal);
    }

    private Employee updateEmployee() {
        String id = tblModel.getValueAt(selectedRow, 0).toString();
        String name = nameField.getText();
        String gender = genderOption.getSelectedItem().toString();
        String dob = dobField.getText();
        String mobile = mobileField.getText();
        String email = emailField.getText();
        String role = roleOption.getSelectedItem().toString();
        String dept = deptOption.getSelectedItem().toString();
        String salary = salaryField.getText();
        String type = typeOption.getSelectedItem().toString();

        return new Employee(id,name, gender, dob, mobile, email, role, dept, salary, type);
    }

    private boolean isFieldNotEmpty() {
        String name = nameField.getText();
        String dob = dobField.getText();
        String mobile = mobileField.getText();
        String email = emailField.getText();
        String salary = salaryField.getText();

        return (name.isEmpty()
                && dob.isEmpty()
                && mobile.isEmpty()
                && email.isEmpty()
                && salary.isEmpty());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        cancleBtn = new javax.swing.JButton();
        mobileField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        typeOption = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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

        cancleBtn.setBackground(new java.awt.Color(102, 102, 102));
        cancleBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cancleBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancleBtn.setText("Cancle update");
        cancleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancleBtnMouseClicked(evt);
            }
        });

        mobileField.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Mobile number");

        emailField.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Email");

        typeOption.setBackground(new java.awt.Color(255, 255, 255));
        typeOption.setForeground(new java.awt.Color(0, 0, 0));
        typeOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fulltime", "Part time" }));

        jLabel9.setText("Employee type");

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
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(emailField)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(AddingFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(roleOption, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deptOption, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(typeOption, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(mobileField)))
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typeOption, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(deptOption)
                    .addComponent(roleOption, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HandleSubmit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandleSubmit
        if (isFieldNotEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fulfil data all fields");
        } else {
            var dataValidator = new DataValidator();
            Employee preAuthenticatedEmp = updateEmployee();
            if (dataValidator.validateRole(preAuthenticatedEmp)) {
                DataStorage.updateByIndex(preAuthenticatedEmp, selectedRow);
                var demo = new AppFrame();
                this.dispose();
                demo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Violate role constraint or Invalid data type. Please check again");
            }
        }
    }//GEN-LAST:event_HandleSubmit

    private void cancleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancleBtnMouseClicked
        var demo = new AppFrame();
        this.dispose();
        demo.setVisible(true);
    }//GEN-LAST:event_cancleBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddingFormTitle;
    private javax.swing.JButton cancleBtn;
    private javax.swing.JComboBox<String> deptOption;
    private javax.swing.JTextField dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JComboBox<String> genderOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> roleOption;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> typeOption;
    // End of variables declaration//GEN-END:variables
}
