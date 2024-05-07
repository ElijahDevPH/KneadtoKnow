
//import com.sun.jdi.connect.spi.Connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        try {
            Connection();
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Connection con; //connecttion
    Statement st; //sql statement
    
    public static final String DbName = "pointofsale";
    
    public static final String DbDriver = "com.mysql.cj.jdbc.Driver";
    
    public static final String DbUrl = "jdbc:mysql://localhost:3306/" + DbName;
    
    public static final String DbUsername = "root";
    
    public static final String DbPassword = "";
    
    
    public void Connection() throws SQLException{
        try {
            Class.forName(DbDriver);
            con = DriverManager.getConnection(DbUrl,DbUsername,DbPassword);
            st = con.createStatement();
            if (con != null){
                System.out.println("Connection Successful");
            }
         
            
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelReg1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbRegLogo = new javax.swing.JLabel();
        jPanelReg2 = new javax.swing.JPanel();
        lbRegTitle = new javax.swing.JLabel();
        lbRegPassword = new javax.swing.JLabel();
        lbRegUsername = new javax.swing.JLabel();
        txtRegUsername = new javax.swing.JTextField();
        btnRegSubmit = new javax.swing.JButton();
        lbRegQuestion = new javax.swing.JLabel();
        btnRegLogin = new javax.swing.JButton();
        txtRegPassword = new javax.swing.JPasswordField();
        regViewPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanelReg1.setBackground(new java.awt.Color(80, 43, 15));
        jPanelReg1.setPreferredSize(new java.awt.Dimension(250, 350));

        lbRegLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/knead to know (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanelReg1Layout = new javax.swing.GroupLayout(jPanelReg1);
        jPanelReg1.setLayout(jPanelReg1Layout);
        jPanelReg1Layout.setHorizontalGroup(
            jPanelReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReg1Layout.createSequentialGroup()
                .addGroup(jPanelReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReg1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelReg1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbRegLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelReg1Layout.setVerticalGroup(
            jPanelReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReg1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lbRegLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(429, 429, 429)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelReg2.setBackground(new java.awt.Color(251, 238, 215));
        jPanelReg2.setPreferredSize(new java.awt.Dimension(450, 0));

        lbRegTitle.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        lbRegTitle.setForeground(new java.awt.Color(80, 43, 15));
        lbRegTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegTitle.setText("REGISTER");
        lbRegTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbRegPassword.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbRegPassword.setForeground(new java.awt.Color(80, 43, 15));
        lbRegPassword.setText("Password");

        lbRegUsername.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbRegUsername.setForeground(new java.awt.Color(80, 43, 15));
        lbRegUsername.setText("Username");

        txtRegUsername.setBackground(new java.awt.Color(251, 238, 215));
        txtRegUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRegUsername.setForeground(new java.awt.Color(80, 43, 15));
        txtRegUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegUsernameActionPerformed(evt);
            }
        });

        btnRegSubmit.setBackground(new java.awt.Color(80, 43, 15));
        btnRegSubmit.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnRegSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnRegSubmit.setText("Submit");
        btnRegSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSubmitActionPerformed(evt);
            }
        });

        lbRegQuestion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRegQuestion.setForeground(new java.awt.Color(80, 43, 15));
        lbRegQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegQuestion.setText("Already have an acount?");

        btnRegLogin.setBackground(new java.awt.Color(80, 43, 15));
        btnRegLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnRegLogin.setText("Login");
        btnRegLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLoginActionPerformed(evt);
            }
        });

        txtRegPassword.setBackground(new java.awt.Color(251, 238, 215));
        txtRegPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRegPassword.setForeground(new java.awt.Color(80, 43, 15));
        txtRegPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegPasswordActionPerformed(evt);
            }
        });

        regViewPassword.setBackground(new java.awt.Color(251, 238, 215));
        regViewPassword.setForeground(new java.awt.Color(80, 43, 15));
        regViewPassword.setText("View Password");
        regViewPassword.setOpaque(true);
        regViewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regViewPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelReg2Layout = new javax.swing.GroupLayout(jPanelReg2);
        jPanelReg2.setLayout(jPanelReg2Layout);
        jPanelReg2Layout.setHorizontalGroup(
            jPanelReg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRegTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(jPanelReg2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanelReg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReg2Layout.createSequentialGroup()
                        .addComponent(btnRegLogin)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbRegQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbRegPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRegUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRegUsername, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRegPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regViewPassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelReg2Layout.setVerticalGroup(
            jPanelReg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReg2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbRegTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(lbRegUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRegPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regViewPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRegQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegLogin)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReg1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelReg1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegUsernameActionPerformed

    private void btnRegLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegLoginActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegLoginActionPerformed

    private void btnRegSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSubmitActionPerformed
        // TODO add your handling code here:
        String username, password;
        
        if ("".equals(txtRegUsername.getText())&&"".equals(txtRegPassword.getText())){
            JOptionPane.showMessageDialog(this, "Username and Password are required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if ("".equals(txtRegUsername.getText())){
            JOptionPane.showMessageDialog(this, "Username is required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if ("".equals(txtRegPassword.getText())){
            JOptionPane.showMessageDialog(this, "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            username = txtRegUsername.getText();
            password = txtRegPassword.getText();

            String queryCheckUsername = "SELECT * FROM accountdetails WHERE accUsername = ?";

            try {
                PreparedStatement pst = con.prepareStatement(queryCheckUsername);
                pst.setString(1, username);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Username is already taken", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    String queryRegister = "INSERT INTO accountdetails (accUsername, accPassword) " + 
                    "VALUES ('" + username + "', '" + password + "')";
                    st.execute(queryRegister);
                    JOptionPane.showMessageDialog(this, "Data added successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    txtRegUsername.setText("");
                    txtRegPassword.setText("");
                    System.out.println("Username and password successfully registered.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnRegSubmitActionPerformed

    private void txtRegPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegPasswordActionPerformed

    private void regViewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regViewPasswordActionPerformed
        // TODO add your handling code here:
        if (regViewPassword.isSelected()){
            txtRegPassword.setEchoChar((char)0);
        }else{
            txtRegPassword.setEchoChar('*');
        }
        
    }//GEN-LAST:event_regViewPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegLogin;
    private javax.swing.JButton btnRegSubmit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelReg1;
    private javax.swing.JPanel jPanelReg2;
    private javax.swing.JLabel lbRegLogo;
    private javax.swing.JLabel lbRegPassword;
    private javax.swing.JLabel lbRegQuestion;
    private javax.swing.JLabel lbRegTitle;
    private javax.swing.JLabel lbRegUsername;
    private javax.swing.JCheckBox regViewPassword;
    private javax.swing.JPasswordField txtRegPassword;
    private javax.swing.JTextField txtRegUsername;
    // End of variables declaration//GEN-END:variables
}
