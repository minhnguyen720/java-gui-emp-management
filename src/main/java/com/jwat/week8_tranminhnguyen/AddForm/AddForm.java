package com.jwat.week8_tranminhnguyen.AddForm;

import com.jwat.week8_tranminhnguyen.connection.controller.Controller;
import com.jwat.week8_tranminhnguyen.dataHandler.DataStorage;
import com.jwat.week8_tranminhnguyen.dataHandler.DataValidator;
import com.jwat.week8_tranminhnguyen.AppFrame;
import com.jwat.week8_tranminhnguyen.model.Employee;

import javax.swing.JOptionPane;

public class AddForm extends javax.swing.JFrame {

    private DataValidator dataValidator;
    private Controller controller;

    public AddForm(Controller controller) {
        initComponents();
        this.controller = controller;
    }

    private Employee getNewEmployee() {
        String name = nameField.getText();
        String gender = genderOption.getSelectedItem().toString();
        String dob = dobField.getText();
        String mobile = mobileField.getText();
        String email = emailField.getText();
        String role = roleOption.getSelectedItem().toString();
        String dept = deptOption.getSelectedItem().toString();
        String salary = salaryField.getText();
        String type = typeOption.getSelectedItem().toString();

        return new Employee(name, gender, dob, mobile, email, role, dept, salary, type);
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
        backButton = new javax.swing.JButton();
        mobileField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        typeOption = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AddingFormTitle.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        AddingFormTitle.setText("Adding employee");

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

        submitButton.setBackground(new java.awt.Color(255, 51, 51));
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

        backButton.setBackground(new java.awt.Color(105, 105, 105));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back to dashboard");
        backButton.setBorderPainted(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        backButton.setPreferredSize(new java.awt.Dimension(111, 38));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandleReturn(evt);
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
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(typeOption, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AddingFormTitle)
                .addGap(30, 30, 30)
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
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(mobileField))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roleOption, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(deptOption)
                    .addComponent(typeOption))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(this, "Please enter all data");
        } else {
            dataValidator = new DataValidator();
            // adding data to list
            Employee preAuthenticatedEmp = getNewEmployee();

            if (dataValidator.validateRole(preAuthenticatedEmp) && dataValidator.validateDataFormat(preAuthenticatedEmp)) {
                // add data to storage
//                DataStorage.addData(preAuthenticatedEmp);
//                DataStorage.addDataByDept(preAuthenticatedEmp);

                // --------------- add new emp to DB ---------------

                controller.addEmployee(preAuthenticatedEmp);


                // -------------------------------------------------

                // Send success message and reset data field
                JOptionPane.showMessageDialog(this, "Success");
                nameField.setText("");
                dobField.setText("");
                salaryField.setText("");
                emailField.setText("");
                mobileField.setText("");
                typeOption.setSelectedIndex(0);
                genderOption.setSelectedIndex(0);
                roleOption.setSelectedIndex(0);
                deptOption.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Violate role constraint or Invalid data type. Please check again");
            }
        }
    }//GEN-LAST:event_HandleSubmit

    private void HandleReturn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandleReturn
        var demo = new AppFrame(new Controller());
        demo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HandleReturn


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddingFormTitle;
    private javax.swing.JButton backButton;
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
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> roleOption;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> typeOption;
    // End of variables declaration//GEN-END:variables
}
