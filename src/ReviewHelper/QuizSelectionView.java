package ReviewHelper;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnhill1202
 */
public class QuizSelectionView extends javax.swing.JFrame {

    /**
     * Creates new form OldQuizView
     */
    Controll c=new Controll();
    public static int quizno;
    public QuizSelectionView() {
        initComponents();
    }
    public void SetButtons(int input){
        if(input==1){
            NewButton.setEnabled(true);
            OpenButton.setEnabled(false);
            DeleteButton.setEnabled(false);
        }else{
            NewButton.setEnabled(false);
            OpenButton.setEnabled(true);
            DeleteButton.setEnabled(true);    
        }
    }
    
    public void Check_Status(String name){
        if("EMPTY   ".equals(name))
            SetButtons(1);
        else
            SetButtons(0);
    }
    public void Set_Title(){
        Quiz1.setText(c.Show_title(0));
        Quiz2.setText(c.Show_title(1));
        Quiz3.setText(c.Show_title(2));
        Quiz4.setText(c.Show_title(3));
        Quiz5.setText(c.Show_title(4));
        Quiz6.setText(c.Show_title(5));
        Quiz7.setText(c.Show_title(6));
        Quiz8.setText(c.Show_title(7));
        Quiz9.setText(c.Show_title(8));
        Quiz10.setText(c.Show_title(9));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Quiz1 = new javax.swing.JLabel();
        Quiz2 = new javax.swing.JLabel();
        Quiz3 = new javax.swing.JLabel();
        Quiz4 = new javax.swing.JLabel();
        Quiz5 = new javax.swing.JLabel();
        Quiz6 = new javax.swing.JLabel();
        Quiz7 = new javax.swing.JLabel();
        Quiz8 = new javax.swing.JLabel();
        Quiz9 = new javax.swing.JLabel();
        Quiz10 = new javax.swing.JLabel();
        NewButton = new javax.swing.JButton();
        OpenButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Quiz1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz1.setText("EMPTY   ");
        Quiz1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Quiz1FocusGained(evt);
            }
        });
        Quiz1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz1MouseClicked(evt);
            }
        });

        Quiz2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz2.setText("EMPTY   ");
        Quiz2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz2MouseClicked(evt);
            }
        });

        Quiz3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz3.setText("EMPTY   ");
        Quiz3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz3MouseClicked(evt);
            }
        });

        Quiz4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz4.setText("EMPTY   ");
        Quiz4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz4MouseClicked(evt);
            }
        });

        Quiz5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz5.setText("EMPTY   ");
        Quiz5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz5MouseClicked(evt);
            }
        });

        Quiz6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz6.setText("EMPTY   ");
        Quiz6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz6MouseClicked(evt);
            }
        });

        Quiz7.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz7.setText("EMPTY   ");
        Quiz7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz7MouseClicked(evt);
            }
        });

        Quiz8.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz8.setText("EMPTY   ");
        Quiz8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz8MouseClicked(evt);
            }
        });

        Quiz9.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz9.setText("EMPTY   ");
        Quiz9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz9MouseClicked(evt);
            }
        });

        Quiz10.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Quiz10.setText("EMPTY   ");
        Quiz10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quiz10MouseClicked(evt);
            }
        });

        NewButton.setText("NEW");
        NewButton.setEnabled(false);
        NewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewButtonActionPerformed(evt);
            }
        });

        OpenButton.setText("OPEN");
        OpenButton.setEnabled(false);
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("DELETE");
        DeleteButton.setEnabled(false);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Back To Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Quiz9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Quiz10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Quiz7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Quiz8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Quiz1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Quiz2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Quiz3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Quiz4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Quiz5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Quiz6)))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton4)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quiz2)
                    .addComponent(Quiz1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quiz4)
                    .addComponent(Quiz3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quiz6)
                    .addComponent(Quiz5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quiz7)
                    .addComponent(Quiz8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quiz9)
                    .addComponent(Quiz10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewButton)
                    .addComponent(OpenButton)
                    .addComponent(DeleteButton))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomeView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Quiz1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Quiz1FocusGained

    }//GEN-LAST:event_Quiz1FocusGained

    private void Quiz1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz1MouseClicked
        Check_Status(Quiz1.getText());
        quizno=0;
    }//GEN-LAST:event_Quiz1MouseClicked

    private void NewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewButtonActionPerformed
        Quiz1.setText(JOptionPane.showInputDialog("Enter name"));
        
    }//GEN-LAST:event_NewButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Set_Title();
    }//GEN-LAST:event_formWindowOpened

    private void Quiz2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz2MouseClicked
        Check_Status(Quiz2.getText());
        quizno=1;

    }//GEN-LAST:event_Quiz2MouseClicked

    private void Quiz3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz3MouseClicked
        Check_Status(Quiz3.getText());
        quizno=2;

    }//GEN-LAST:event_Quiz3MouseClicked

    private void Quiz4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz4MouseClicked
        Check_Status(Quiz4.getText());
        quizno=3;
    }//GEN-LAST:event_Quiz4MouseClicked

    private void Quiz5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz5MouseClicked
        Check_Status(Quiz5.getText());
        quizno=4;
    }//GEN-LAST:event_Quiz5MouseClicked

    private void Quiz6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz6MouseClicked
        Check_Status(Quiz6.getText());
        quizno=5;
    }//GEN-LAST:event_Quiz6MouseClicked

    private void Quiz7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz7MouseClicked
        Check_Status(Quiz7.getText());
        quizno=6;
    }//GEN-LAST:event_Quiz7MouseClicked

    private void Quiz8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz8MouseClicked
        Check_Status(Quiz8.getText());
        quizno=7;
    }//GEN-LAST:event_Quiz8MouseClicked

    private void Quiz9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz9MouseClicked
        Check_Status(Quiz9.getText());
        quizno=8;
    }//GEN-LAST:event_Quiz9MouseClicked

    private void Quiz10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quiz10MouseClicked
        Check_Status(Quiz10.getText());
        quizno=9;
    }//GEN-LAST:event_Quiz10MouseClicked

    private void OpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonActionPerformed
        new MenuView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OpenButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        c.delete_quiz(quizno);
        Set_Title();
        System.out.print("Hello");
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QuizSelectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizSelectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizSelectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizSelectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizSelectionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton NewButton;
    private javax.swing.JButton OpenButton;
    private javax.swing.JLabel Quiz1;
    private javax.swing.JLabel Quiz10;
    private javax.swing.JLabel Quiz2;
    private javax.swing.JLabel Quiz3;
    private javax.swing.JLabel Quiz4;
    private javax.swing.JLabel Quiz5;
    private javax.swing.JLabel Quiz6;
    private javax.swing.JLabel Quiz7;
    private javax.swing.JLabel Quiz8;
    private javax.swing.JLabel Quiz9;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
