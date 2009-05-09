
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BlackJackGUI.java
 *
 * Created on May 8, 2009, 11:48:32 PM
 */

/**
 *
 * @author bryan
 */
public class BlackJackGUI extends javax.swing.JFrame {
	Game game;

    /** Creates new form BlackJackGUI */
    public BlackJackGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLayeredPane4 = new javax.swing.JLayeredPane();
                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jPanel3 = new javax.swing.JPanel();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jLayeredPane1 = new javax.swing.JLayeredPane();
                jLayeredPane2 = new javax.swing.JLayeredPane();
                jPanel4 = new javax.swing.JPanel();
                jLayeredPane3 = new javax.swing.JLayeredPane();
                newGamePrompt = new javax.swing.JInternalFrame();
                humanPlayers = new javax.swing.JTextField();
                computerPlayers = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                decks = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                newGameOK = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
                jLayeredPane5 = new javax.swing.JLayeredPane();
                jTextField3 = new javax.swing.JTextField();
                menuBar = new javax.swing.JMenuBar();
                fileMenu = new javax.swing.JMenu();
                newMenuItem = new javax.swing.JMenuItem();
                exitMenuItem = new javax.swing.JMenuItem();
                editMenu = new javax.swing.JMenu();
                cutMenuItem = new javax.swing.JMenuItem();
                copyMenuItem = new javax.swing.JMenuItem();
                pasteMenuItem = new javax.swing.JMenuItem();
                deleteMenuItem = new javax.swing.JMenuItem();
                helpMenu = new javax.swing.JMenu();
                contentsMenuItem = new javax.swing.JMenuItem();
                aboutMenuItem = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setLayout(new java.awt.BorderLayout());

                jPanel2.setLayout(new java.awt.GridLayout());

                jButton1.setText("Spit");
                jPanel2.add(jButton1);

                jButton2.setText("Double Down");
                jPanel2.add(jButton2);

                jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

                jPanel3.setLayout(new java.awt.GridLayout());

                jButton3.setText("Hit");
                jPanel3.add(jButton3);

                jButton4.setText("Stay");
                jPanel3.add(jButton4);

                jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

                getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);
                getContentPane().add(jLayeredPane1, java.awt.BorderLayout.LINE_START);
                getContentPane().add(jLayeredPane2, java.awt.BorderLayout.LINE_END);

                jPanel4.setLayout(new java.awt.GridLayout(2, 0));

                newGamePrompt.setClosable(true);
                newGamePrompt.setTitle("New Game");
                newGamePrompt.setVisible(true);

                humanPlayers.setText("1");

                computerPlayers.setText("3");

                jLabel1.setText("Human Players:");

                jLabel2.setText("Computer Players:");

                decks.setText("6");

                jLabel3.setText("Decks:");

                newGameOK.setText("OK");
                newGameOK.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                newGameOKActionPerformed(evt);
                        }
                });

                jButton6.setText("Cancel");

                javax.swing.GroupLayout newGamePromptLayout = new javax.swing.GroupLayout(newGamePrompt.getContentPane());
                newGamePrompt.getContentPane().setLayout(newGamePromptLayout);
                newGamePromptLayout.setHorizontalGroup(
                        newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(newGamePromptLayout.createSequentialGroup()
                                .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(newGamePromptLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(42, 42, 42)
                                                .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(decks, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(computerPlayers, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(humanPlayers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(newGamePromptLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(newGameOK, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(40, Short.MAX_VALUE))
                );
                newGamePromptLayout.setVerticalGroup(
                        newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(newGamePromptLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(humanPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1))
                                        .addGroup(newGamePromptLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(computerPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(decks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(newGamePromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton6)
                                        .addComponent(newGameOK))
                                .addContainerGap())
                );

                newGamePrompt.setBounds(100, 30, 230, 150);
                jLayeredPane3.add(newGamePrompt, javax.swing.JLayeredPane.DEFAULT_LAYER);

                jPanel4.add(jLayeredPane3);

                jTextField3.setText("jTextField1");
                jTextField3.setBounds(230, 10, 82, 27);
                jLayeredPane5.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

                jPanel4.add(jLayeredPane5);

                getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

                fileMenu.setText("File");

                newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
                newMenuItem.setText("New Game");
                newMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                newMenuItemActionPerformed(evt);
                        }
                });
                fileMenu.add(newMenuItem);

                exitMenuItem.setText("Exit");
                exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exitMenuItemActionPerformed(evt);
                        }
                });
                fileMenu.add(exitMenuItem);

                menuBar.add(fileMenu);

                editMenu.setText("Edit");

                cutMenuItem.setText("Cut");
                editMenu.add(cutMenuItem);

                copyMenuItem.setText("Copy");
                editMenu.add(copyMenuItem);

                pasteMenuItem.setText("Paste");
                editMenu.add(pasteMenuItem);

                deleteMenuItem.setText("Delete");
                editMenu.add(deleteMenuItem);

                menuBar.add(editMenu);

                helpMenu.setText("Help");

                contentsMenuItem.setText("Contents");
                helpMenu.add(contentsMenuItem);

                aboutMenuItem.setText("About");
                helpMenu.add(aboutMenuItem);

                menuBar.add(helpMenu);

                setJMenuBar(menuBar);

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
	    newGamePrompt.show();
    }//GEN-LAST:event_newMenuItemActionPerformed

    private void newGameOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameOKActionPerformed
	    int numPlayers = Integer.parseInt(humanPlayers.getText());
	    int numComputers = Integer.parseInt(computerPlayers.getText());
	    int numDecks = Integer.parseInt(decks.getText());
	    game = new Game(numPlayers,numComputers,numDecks);
		try {
			newGamePrompt.setClosed(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(BlackJackGUI.class.getName()).log(Level.SEVERE, null, ex);
		}
}//GEN-LAST:event_newGameOKActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJackGUI().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JMenuItem aboutMenuItem;
        private javax.swing.JTextField computerPlayers;
        private javax.swing.JMenuItem contentsMenuItem;
        private javax.swing.JMenuItem copyMenuItem;
        private javax.swing.JMenuItem cutMenuItem;
        private javax.swing.JTextField decks;
        private javax.swing.JMenuItem deleteMenuItem;
        private javax.swing.JMenu editMenu;
        private javax.swing.JMenuItem exitMenuItem;
        private javax.swing.JMenu fileMenu;
        private javax.swing.JMenu helpMenu;
        private javax.swing.JTextField humanPlayers;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton6;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLayeredPane jLayeredPane1;
        private javax.swing.JLayeredPane jLayeredPane2;
        private javax.swing.JLayeredPane jLayeredPane3;
        private javax.swing.JLayeredPane jLayeredPane4;
        private javax.swing.JLayeredPane jLayeredPane5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JMenuBar menuBar;
        private javax.swing.JButton newGameOK;
        private javax.swing.JInternalFrame newGamePrompt;
        private javax.swing.JMenuItem newMenuItem;
        private javax.swing.JMenuItem pasteMenuItem;
        // End of variables declaration//GEN-END:variables

}