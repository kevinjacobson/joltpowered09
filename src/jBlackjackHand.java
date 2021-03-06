
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jBlackjackHand.java
 *
 * Created on May 9, 2009, 12:44:45 AM
 */

/**
 *
 * @author bryan
 */
public class jBlackjackHand extends javax.swing.JPanel {

    /** Creates new form jBlackjackHand */
    public jBlackjackHand(Hand hand) {
        initComponents();
	ArrayList<Card> cards = hand.getCards();
	String slice = "S";
	for (int i = 0; i<cards.size(); i++) {
		if (i+1==cards.size())
			slice = "";
		String path = "icons/"+cards.get(i).getSuit()+"/"+cards.get(i).getType()+slice+".jpg";
		if (cards.get(i).isFaceDown()) {
			path = "icons/back"+slice+".jpg";
		}
		javax.swing.ImageIcon cardIcon = new javax.swing.ImageIcon(path);
		javax.swing.JLabel cardLabel = new javax.swing.JLabel(cardIcon);
		cardLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		this.add(cardLabel);
		cardLabel.setVisible(true);
	}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                setMinimumSize(new java.awt.Dimension(120, 120));
                setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        // End of variables declaration//GEN-END:variables

}
