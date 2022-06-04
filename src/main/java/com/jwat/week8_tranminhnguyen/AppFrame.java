package com.jwat.week8_tranminhnguyen;

import com.jwat.week8_tranminhnguyen.DataHandler.DataStorage;
import com.jwat.week8_tranminhnguyen.AddForm.AddForm;
import com.jwat.week8_tranminhnguyen.UpdateForm.UpdateForm;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AppFrame extends javax.swing.JFrame {

    public AppFrame() {
        initComponents();
        configureComponents();
        initTableData();
        initStatistic();
    }
    // ------------ Custom code ----------------
    
    private void configureComponents() {
        table.getTableHeader().setReorderingAllowed(false);
    }

    private void initStatistic() {
        amtEmp.setText(Integer.toString(DataStorage.getVolume()));
    }

    private void initTableData() {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        List<List<String>> data = DataStorage.getData();
        for (List<String> row : data) {
            tblModel.addRow(row.toArray());
        }
    }
    
    
    // ------------ Auto generated code ---------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        SideMenu = new javax.swing.JPanel();
        AddButton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        UploadButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GenralInfo = new javax.swing.JPanel();
        GeneralTitle = new javax.swing.JLabel();
        TotalEmp = new javax.swing.JPanel();
        amtEmp = new javax.swing.JLabel();
        AmtEmp_title = new javax.swing.JLabel();
        TotalDept = new javax.swing.JPanel();
        amtDept = new javax.swing.JLabel();
        AmtDept_title = new javax.swing.JLabel();
        UserTitle = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TableContainer = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        SideMenu.setBackground(new java.awt.Color(51, 51, 51));
        SideMenu.setPreferredSize(new java.awt.Dimension(250, 720));

        AddButton.setBackground(new java.awt.Color(102, 102, 102));
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N

        javax.swing.GroupLayout AddButtonLayout = new javax.swing.GroupLayout(AddButton);
        AddButton.setLayout(AddButtonLayout);
        AddButtonLayout.setHorizontalGroup(
            AddButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddButtonLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddButtonLayout.setVerticalGroup(
            AddButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(AddButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        CloseButton.setBackground(new java.awt.Color(255, 51, 51));
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.setFocusable(false);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Close");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout-icon.png"))); // NOI18N

        javax.swing.GroupLayout CloseButtonLayout = new javax.swing.GroupLayout(CloseButton);
        CloseButton.setLayout(CloseButtonLayout);
        CloseButtonLayout.setHorizontalGroup(
            CloseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseButtonLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CloseButtonLayout.setVerticalGroup(
            CloseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CloseButtonLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(CloseButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34))
        );

        UpdateButton.setBackground(new java.awt.Color(102, 102, 102));
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandleUpdate(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update-icon.png"))); // NOI18N

        javax.swing.GroupLayout UpdateButtonLayout = new javax.swing.GroupLayout(UpdateButton);
        UpdateButton.setLayout(UpdateButtonLayout);
        UpdateButtonLayout.setHorizontalGroup(
            UpdateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateButtonLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpdateButtonLayout.setVerticalGroup(
            UpdateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateButtonLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(UpdateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24))
        );

        RemoveButton.setBackground(new java.awt.Color(102, 102, 102));
        RemoveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Remove");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandleDelete(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-icon.png"))); // NOI18N

        javax.swing.GroupLayout RemoveButtonLayout = new javax.swing.GroupLayout(RemoveButton);
        RemoveButton.setLayout(RemoveButtonLayout);
        RemoveButtonLayout.setHorizontalGroup(
            RemoveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoveButtonLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        RemoveButtonLayout.setVerticalGroup(
            RemoveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemoveButtonLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(RemoveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24))
        );

        SaveButton.setBackground(new java.awt.Color(105, 105, 105));
        SaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveButton.setPreferredSize(new java.awt.Dimension(0, 73));
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandleSave(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Save");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon.png"))); // NOI18N

        javax.swing.GroupLayout SaveButtonLayout = new javax.swing.GroupLayout(SaveButton);
        SaveButton.setLayout(SaveButtonLayout);
        SaveButtonLayout.setHorizontalGroup(
            SaveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaveButtonLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SaveButtonLayout.setVerticalGroup(
            SaveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveButtonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(SaveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23))
        );

        UploadButton.setBackground(new java.awt.Color(102, 102, 102));
        UploadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UploadButton.setPreferredSize(new java.awt.Dimension(0, 73));
        UploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandleUpload(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Upload");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upload-icon.png"))); // NOI18N

        javax.swing.GroupLayout UploadButtonLayout = new javax.swing.GroupLayout(UploadButton);
        UploadButton.setLayout(UploadButtonLayout);
        UploadButtonLayout.setHorizontalGroup(
            UploadButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadButtonLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel12)
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UploadButtonLayout.setVerticalGroup(
            UploadButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadButtonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(UploadButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout SideMenuLayout = new javax.swing.GroupLayout(SideMenu);
        SideMenu.setLayout(SideMenuLayout);
        SideMenuLayout.setHorizontalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CloseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SaveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(UploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        SideMenuLayout.setVerticalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GenralInfo.setBackground(new java.awt.Color(255, 255, 255));

        GeneralTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GeneralTitle.setForeground(new java.awt.Color(51, 51, 51));
        GeneralTitle.setText("Companies");

        TotalEmp.setBackground(new java.awt.Color(255, 255, 255));

        amtEmp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        amtEmp.setForeground(new java.awt.Color(102, 102, 102));
        amtEmp.setText("50");

        AmtEmp_title.setBackground(new java.awt.Color(102, 102, 102));
        AmtEmp_title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AmtEmp_title.setText("Total employees");

        javax.swing.GroupLayout TotalEmpLayout = new javax.swing.GroupLayout(TotalEmp);
        TotalEmp.setLayout(TotalEmpLayout);
        TotalEmpLayout.setHorizontalGroup(
            TotalEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalEmpLayout.createSequentialGroup()
                .addGroup(TotalEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TotalEmpLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(amtEmp))
                    .addGroup(TotalEmpLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(AmtEmp_title)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        TotalEmpLayout.setVerticalGroup(
            TotalEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(amtEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmtEmp_title)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        TotalDept.setBackground(new java.awt.Color(255, 255, 255));

        amtDept.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        amtDept.setForeground(new java.awt.Color(102, 102, 102));
        amtDept.setText("4");

        AmtDept_title.setBackground(new java.awt.Color(102, 102, 102));
        AmtDept_title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AmtDept_title.setText("Total departments");

        javax.swing.GroupLayout TotalDeptLayout = new javax.swing.GroupLayout(TotalDept);
        TotalDept.setLayout(TotalDeptLayout);
        TotalDeptLayout.setHorizontalGroup(
            TotalDeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalDeptLayout.createSequentialGroup()
                .addGroup(TotalDeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TotalDeptLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(amtDept))
                    .addGroup(TotalDeptLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(AmtDept_title)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        TotalDeptLayout.setVerticalGroup(
            TotalDeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalDeptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(amtDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmtDept_title)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        UserTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UserTitle.setForeground(new java.awt.Color(51, 51, 51));
        UserTitle.setText("Employees");

        searchButton.setBackground(new java.awt.Color(153, 153, 153));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-icon.png"))); // NOI18N
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleSearch(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh-icon.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                handleRefresh(evt);
            }
        });

        javax.swing.GroupLayout GenralInfoLayout = new javax.swing.GroupLayout(GenralInfo);
        GenralInfo.setLayout(GenralInfoLayout);
        GenralInfoLayout.setHorizontalGroup(
            GenralInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenralInfoLayout.createSequentialGroup()
                .addComponent(GeneralTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GenralInfoLayout.createSequentialGroup()
                .addComponent(TotalEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TotalDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GenralInfoLayout.createSequentialGroup()
                .addComponent(UserTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        GenralInfoLayout.setVerticalGroup(
            GenralInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenralInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(GeneralTitle)
                .addGap(18, 18, 18)
                .addGroup(GenralInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(GenralInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenralInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GenralInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GenralInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );

        TableContainer.setBackground(new java.awt.Color(255, 255, 255));
        TableContainer.setBorder(null);
        TableContainer.setForeground(new java.awt.Color(255, 255, 255));
        TableContainer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        table.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "DOB", "Role", "Department", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setDragEnabled(true);
        table.setRowHeight(30);
        table.setShowGrid(true);
        TableContainer.setViewportView(table);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(SideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GenralInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TableContainer))
                .addGap(40, 40, 40))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(GenralInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TableContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        this.setVisible(false);
        this.dispose();
        new AddForm(this, this.table).setVisible(true);

    }//GEN-LAST:event_AddButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void HandleDelete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandleDelete
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        try {
            int selectedRowIndex = table.getSelectedRow();
            tblModel.removeRow(selectedRowIndex);
            DataStorage.remove(selectedRowIndex);
            initStatistic();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_HandleDelete

    private void HandleUpdate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandleUpdate
        try {
            this.setVisible(false);
            this.dispose();
            new UpdateForm(this, this.table).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_HandleUpdate

    private void handleSearch(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleSearch
        String nameToSearch = searchBar.getText();
        List<List<String>> matchedData = DataStorage.searchByName(nameToSearch);

        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        tblModel.setRowCount(0);
        for (List<String> row : matchedData) {
            tblModel.addRow(row.toArray());
        }
    }//GEN-LAST:event_handleSearch

    private void handleRefresh(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleRefresh
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        tblModel.setRowCount(0);
        List<List<String>> data = DataStorage.getData();
        for (List<String> row : data) {
            tblModel.addRow(row.toArray());
        }
    }//GEN-LAST:event_handleRefresh

    private void HandleSave(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandleSave

    }//GEN-LAST:event_HandleSave

    private void HandleUpload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandleUpload
       
    }//GEN-LAST:event_HandleUpload


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddButton;
    private javax.swing.JLabel AmtDept_title;
    private javax.swing.JLabel AmtEmp_title;
    private javax.swing.JPanel CloseButton;
    private javax.swing.JLabel GeneralTitle;
    private javax.swing.JPanel GenralInfo;
    private javax.swing.JPanel RemoveButton;
    private javax.swing.JPanel SaveButton;
    private javax.swing.JPanel SideMenu;
    private javax.swing.JScrollPane TableContainer;
    private javax.swing.JPanel TotalDept;
    private javax.swing.JPanel TotalEmp;
    private javax.swing.JPanel UpdateButton;
    private javax.swing.JPanel UploadButton;
    private javax.swing.JLabel UserTitle;
    private javax.swing.JLabel amtDept;
    private javax.swing.JLabel amtEmp;
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
