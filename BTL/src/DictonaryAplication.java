import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import com.sun.speech.freetts.*;
//import java.awt.Dialog;
//import java.awt.event.MouseEvent;
public class DictonaryAplication extends javax.swing.JFrame {
    Dictionary dic = new Dictionary();
    static DefaultListModel listEnglish = new DefaultListModel();
    public DictonaryAplication() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        dic.insert();
        for(Word ele : Dictionary.word){
            listEnglish.addElement(ele.getWord_target());
            jList1.setModel(listEnglish);
        }
        this.addWindowListener(new WindowAdapter() {
            public void windowColsing(WindowEvent e) {
                new DictionaryManagement().dictionaryExportToFile();
                System.exit(0);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seach = new javax.swing.JButton();
        suaTu = new javax.swing.JButton();
        phatAm = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        nhapES = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addW = new javax.swing.JButton();
        deleteW = new javax.swing.JButton();
        api = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        nghiaTV = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TU DIEN ANH - VIET");

        seach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        seach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/find.gif"))); // NOI18N
        seach.setText("Seach");
        seach.setPreferredSize(new java.awt.Dimension(95, 35));
        seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachActionPerformed(evt);
            }
        });

        suaTu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        suaTu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.gif"))); // NOI18N
        suaTu.setText("Edit");
        suaTu.setPreferredSize(new java.awt.Dimension(83, 35));
        suaTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaTuActionPerformed(evt);
            }
        });

        phatAm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phatAm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N
        phatAm.setText("UK");
        phatAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phatAmActionPerformed(evt);
            }
        });

        thoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.gif"))); // NOI18N
        thoat.setText("Exit");
        thoat.setPreferredSize(new java.awt.Dimension(83, 35));
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        nhapES.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nhapES.setMinimumSize(new java.awt.Dimension(5, 23));
        nhapES.setPreferredSize(new java.awt.Dimension(68, 20));
        nhapES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhapESMouseClicked(evt);
            }
        });
        nhapES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nhapESKeyReleased(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/be99a14c-40c5-4827-97c9-c09b25e403ed.png"))); // NOI18N
        jLabel1.setText("Nghĩa Tiếng Việt");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unnamed (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es.jpg"))); // NOI18N
        jLabel3.setText("Eng lish");

        addW.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.gif"))); // NOI18N
        addW.setText("Add");
        addW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWActionPerformed(evt);
            }
        });

        deleteW.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.gif"))); // NOI18N
        deleteW.setText("Delete");
        deleteW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWActionPerformed(evt);
            }
        });

        api.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        api.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GoogleTranslate1.png"))); // NOI18N
        api.setText("API");
        api.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apiActionPerformed(evt);
            }
        });

        nghiaTV.setColumns(20);
        nghiaTV.setRows(5);
        jScrollPane2.setViewportView(nghiaTV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nhapES, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(seach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(thoat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(api, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phatAm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteW, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suaTu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addW, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(suaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteW, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(phatAm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(api, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachActionPerformed
        for (Word ele : Dictionary.word) {
            if (ele.getWord_target().equals(nhapES.getText())) {
                nghiaTV.setText(ele.getWord_explain());
                return;
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Tu ban nhap khong co trong tu dien. Nhap lai...");
        //new addWord(this, true).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_seachActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        new DictionaryManagement().dictionaryExportToFile();
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_thoatActionPerformed

    private void nhapESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhapESMouseClicked
        nhapES.setText("");
        nghiaTV.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_nhapESMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        for (Word ele : Dictionary.word) {
            if (ele.getWord_target().equals(jList1.getSelectedValue())) {
                nghiaTV.setText(ele.getWord_explain());
                return;
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseClicked

    private void nhapESKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nhapESKeyReleased
        listEnglish.clear();
        String S = nhapES.getText().toLowerCase();
        Dictionary.word.stream().filter((ele) -> (ele.getWord_target().indexOf(S) == 0)).forEachOrdered((ele) -> {
            listEnglish.addElement(ele.getWord_target());
        });
        jList1.setModel(listEnglish);
        // TODO add your handling code here:
    }//GEN-LAST:event_nhapESKeyReleased

    private void addWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWActionPerformed
        new addWord().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_addWActionPerformed

    private void deleteWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWActionPerformed
        String es = JOptionPane.showInputDialog("Nhap tu can xoa");
        if ("".equals(es)) {
            JOptionPane.showMessageDialog(rootPane, "Hay nhap tu can xoa");
        } else {
            int i = 0;
            for (Word ele : Dictionary.word) {
                if (ele.getWord_target().equals(es)) {
                    dic.word.remove(i);
                    listEnglish.remove(i);
                    jList1.setModel(listEnglish);
                    nghiaTV.setText("");
                    return;
                }
                i++;
            }
            JOptionPane.showMessageDialog(rootPane, "Khong co tu can xoa");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteWActionPerformed

    private void suaTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaTuActionPerformed
        new editWord().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_suaTuActionPerformed

    private static final String VOICENAME = "kevin16";
    private void phatAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phatAmActionPerformed
//        Voice voice;
//        VoiceManager vm = VoiceManager.getInstance();
//        voice = vm.getVoice(VOICENAME);
//        
//        voice.allocate();
//        voice.speak(nhapES.getText());
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        
        voice.allocate();
        try {
            if(jList1.getSelectedValue().equals(""))
                return;
            else
            voice.speak(jList1.getSelectedValue());
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_phatAmActionPerformed

    private void apiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apiActionPerformed
        new API().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_apiActionPerformed

    public void addList(){
        this.jList1.setModel(listEnglish);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DictonaryAplication().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addW;
    private javax.swing.JButton api;
    private javax.swing.JButton deleteW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea nghiaTV;
    private javax.swing.JTextField nhapES;
    private javax.swing.JButton phatAm;
    private javax.swing.JButton seach;
    private javax.swing.JButton suaTu;
    private javax.swing.JButton thoat;
    // End of variables declaration//GEN-END:variables
}
