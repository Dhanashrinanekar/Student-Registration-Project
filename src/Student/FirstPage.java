/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import javax.swing.JOptionPane;
import com.github.sarxos.webcam.Webcam;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;


public class FirstPage extends javax.swing.JFrame implements Runnable
{
    Webcam webcam;
    Thread t;
    volatile boolean flag;
    public FirstPage()
    {
        initComponents();
        flag= true;
        webcam= Webcam.getDefault();
        webcam.open();
        t = new Thread(this);
        t.start();
        JScrollPane scrollPane = new JScrollPane(this.getContentPane());
        this.setContentPane(scrollPane);
        checkbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkbox.isSelected()) {
                    
                    txtpermnentaddress.setText(txtlocaladdress.getText());
                } else {
                   
                    txtpermnentaddress.setText("");
                }
            }
        });
}   
    public void run(){
        while (flag){
            try{
                lblphoto.setIcon(new ImageIcon(webcam.getImage()));
            }
            catch(Exception e){
            }
        }
    }

      

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        comboboxhome = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();
        btnfp1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnclick = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboboxcollege = new javax.swing.JComboBox<>();
        jcalender = new com.toedter.calendar.JDateChooser();
        txtlocaladdress = new javax.swing.JTextField();
        txtpermnentaddress = new javax.swing.JTextField();
        checkbox = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnradiof = new javax.swing.JRadioButton();
        btnradiom = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        ckboxjava = new javax.swing.JCheckBox();
        ckboxds = new javax.swing.JCheckBox();
        ckboxads = new javax.swing.JCheckBox();
        ckboxcpp = new javax.swing.JCheckBox();
        ckboxc = new javax.swing.JCheckBox();
        btncancel1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        calenderenquiry = new com.toedter.calendar.JDateChooser();

        jList1.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("college name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Birthdate");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Hometown");

        comboboxhome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PUNE", "NASHIK", "NAGPUR", " " }));
        comboboxhome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comboboxhomeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Registration");

        lblphoto.setOpaque(true);

        btnfp1.setBackground(new java.awt.Color(153, 153, 153));
        btnfp1.setText("ADD NEW ??");
        btnfp1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnfp1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Phone no.");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Local Address");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Email ID");

        btnsubmit.setBackground(new java.awt.Color(153, 153, 153));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsubmitActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Permnent address");

        btnclick.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclick.setText("CLICK");
        btnclick.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclick.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnclickActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsaveActionPerformed(evt);
            }
        });

        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncancel.setText("CANCEL");
        btncancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Name");

        comboboxcollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PICT", "BVCOEW", "SINHGAD", "OTHER" }));
        comboboxcollege.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comboboxcollegeActionPerformed(evt);
            }
        });

        jLabel18.setText("Permnent address same as Local Adress");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Gender");

        btnradiof.setText("Female");

        btnradiom.setText("Male");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Subjects");

        ckboxjava.setText("JAVA");

        ckboxds.setText("DS");

        ckboxads.setText("ADS");

        ckboxcpp.setText("CPP");

        ckboxc.setText("C");

        btncancel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncancel1.setText("OPEN");
        btncancel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancel1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncancel1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Enquiry Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlocaladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpermnentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ckboxjava, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(ckboxds, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(ckboxads, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ckboxcpp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnfp1)
                                            .addComponent(checkbox, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckboxc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(218, 218, 218)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jcalender, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(comboboxcollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(btnradiof)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(btnradiom))))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtname))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(calenderenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(128, 128, 128)))
                                        .addGap(110, 110, 110)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnclick, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                .addComponent(btncancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblphoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboboxhome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(606, 606, 606))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncancel1)
                        .addComponent(btnclick)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsave)
                        .addComponent(btncancel)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jcalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(calenderenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnradiof)
                            .addComponent(btnradiom))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxcollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlocaladdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addComponent(checkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpermnentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboboxhome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfp1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckboxjava)
                    .addComponent(ckboxds)
                    .addComponent(ckboxads)
                    .addComponent(ckboxcpp)
                    .addComponent(ckboxc))
                .addGap(53, 53, 53)
                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfp1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnfp1ActionPerformed
    {//GEN-HEADEREND:event_btnfp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfp1ActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsubmitActionPerformed
    {//GEN-HEADEREND:event_btnsubmitActionPerformed
                                                  
                                              
    String name = txtname.getText();
    String phoneNumber = txtphone.getText();
    String email = txtemail.getText();
    Date birthDate = jcalender.getDate(); 
    Date calenderenquiry = jcalender.getDate(); 
    String localAddress = txtlocaladdress.getText();
    String permanentAddress = txtpermnentaddress.getText();
    String hometown = comboboxhome.getSelectedItem().toString();
    String collegeName = comboboxcollege.getSelectedItem().toString();
    
    // Assuming you have radio buttons for gender
    String gender = "";
    if (btnradiom.isSelected()) {
        gender = "Male";
    } else if (btnradiof.isSelected()) {
        gender = "Female";
    }

    // Assuming subjects can be selected from a combo box or a list
    String subjects = "";
    if (ckboxjava.isSelected()) {
        subjects += "JAVA, ";
    }
    if (ckboxads.isSelected()) {
        subjects += "ADS, ";
    }
    if (ckboxcpp.isSelected()) {
        subjects += "cpp, ";
    }
    if (ckboxc.isSelected()) {
        subjects += "C, ";
    }
    if (ckboxds.isSelected()) {
        subjects += "DS, ";
    }
    // Trim the trailing comma and space
    if (!subjects.isEmpty()) {
        subjects = subjects.substring(0, subjects.length() - 2);
    }
    
    // Validation
    if (name.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() 
            || localAddress.isEmpty() || permanentAddress.isEmpty() || hometown.isEmpty() 
            || collegeName.isEmpty() || gender.isEmpty() || subjects.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return; 
    }
    
    if (!email.contains("@") || !email.contains(".")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address.");
        return;
    }
    
    if (phoneNumber.length() != 10 || !phoneNumber.matches("[0-9]+")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid 10-digit phone number.");
        return;
    }
    
    if (birthDate == null) {
        JOptionPane.showMessageDialog(this, "Please select a birth date.");
        return;
    }
    if (calenderenquiry == null) {
        JOptionPane.showMessageDialog(this, "Please select a enquiry date.");
        return;
    }
    
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "dhanu@123");
        
        String sql = "INSERT INTO students (Name, PhoneNumber, EmailID, BirthDate, LocalAddress, PermanentAddress, Hometown, CollegeName, Gender, Subjects,EnquiryDate) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.setString(1, name);
        pstmt.setString(2, phoneNumber);
        pstmt.setString(3, email);
        pstmt.setDate(4, new java.sql.Date(birthDate.getTime())); 
        pstmt.setString(5, localAddress);
        pstmt.setString(6, permanentAddress);
        pstmt.setString(7, hometown);
        pstmt.setString(8, collegeName); 
        pstmt.setString(9, gender);
        pstmt.setString(10, subjects);
        pstmt.setDate(11, new java.sql.Date(calenderenquiry.getTime())); 
        
        
        
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Student details saved successfully!");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saving student details: " + e.getMessage());
        e.printStackTrace();
    }




    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncancelActionPerformed
    {//GEN-HEADEREND:event_btncancelActionPerformed
      flag=true;
       t=new Thread(this);
       t.start();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsaveActionPerformed
    {//GEN-HEADEREND:event_btnsaveActionPerformed
       flag=true;
       t=new Thread(this);
       t.start();
       try{
           
       FileInputStream fin= new FileInputStream("C:\\Users\\dhana\\OneDrive\\Documents\\NetBeansProjects\\employeee\\images\\photo.jpg");
  
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "dhanu@123");
       PreparedStatement pst= con.prepareStatement("insert into students (Photo) values (?)");
       pst.setBlob(1, fin);
       pst.executeUpdate();
       JOptionPane.showMessageDialog(this, "Photo Saved!!!");

       
       }
       
       catch(Exception e){
       
       JOptionPane.showMessageDialog(this, "error"+e);
       }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclickActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclickActionPerformed
    {//GEN-HEADEREND:event_btnclickActionPerformed
        flag = false; // This stops the webcam capturing thread if necessary
        try
        {
          ImageIO.write(webcam.getImage(), "JPG", new File("C:\\Users\\dhana\\OneDrive\\Documents\\NetBeansProjects\\employeee\\images\\photo.jpg"));
          Image image = webcam.getImage();
          lblphoto.setIcon(new ImageIcon(image));
     
          JOptionPane.showMessageDialog(this, "CLICKED");

        } 
        
        catch (IOException ex)
        {
             JOptionPane.showMessageDialog(this, "ErroR "+ex);
        }
      
      

    }//GEN-LAST:event_btnclickActionPerformed

    private void comboboxcollegeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboboxcollegeActionPerformed
    {//GEN-HEADEREND:event_comboboxcollegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxcollegeActionPerformed

    private void comboboxhomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboboxhomeActionPerformed
    {//GEN-HEADEREND:event_comboboxhomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxhomeActionPerformed

    private void btncancel1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncancel1ActionPerformed
    {//GEN-HEADEREND:event_btncancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancel1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncancel1;
    private javax.swing.JButton btnclick;
    private javax.swing.JButton btnfp1;
    private javax.swing.JRadioButton btnradiof;
    private javax.swing.JRadioButton btnradiom;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsubmit;
    private com.toedter.calendar.JDateChooser calenderenquiry;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JCheckBox ckboxads;
    private javax.swing.JCheckBox ckboxc;
    private javax.swing.JCheckBox ckboxcpp;
    private javax.swing.JCheckBox ckboxds;
    private javax.swing.JCheckBox ckboxjava;
    private javax.swing.JComboBox<String> comboboxcollege;
    private javax.swing.JComboBox<String> comboboxhome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcalender;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlocaladdress;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpermnentaddress;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
