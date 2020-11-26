package bj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class BJFrame extends JFrame {

	private final JPanel contentPane;
	private final JPanel messageDialog = new JPanel();
	private JPanel scoreBoard = new JPanel();
	private JTextPane scoreBoardTextD = new JTextPane();
	private JTextPane messageText = new JTextPane();
	private JTextPane scoreBoardTextP = new JTextPane();
	private JPanel dCard1 = new JPanel();
	private JPanel dCard2 = new JPanel();
	private JPanel dCard3 = new JPanel();
	private JPanel dCard4 = new JPanel();
	private JPanel dCard5 = new JPanel();
	private JTextPane dType1 = new JTextPane();
	private JTextPane dType2 = new JTextPane();
	private JTextPane dType3 = new JTextPane();
	private JTextPane dType4 = new JTextPane();
	private JTextPane dType5 = new JTextPane();
	private JTextPane dValue1 = new JTextPane();
	private JTextPane dValue2 = new JTextPane();
	
	private JTextPane dValue3 = new JTextPane();
	private JTextPane dValue4 = new JTextPane();
	private JTextPane dValue5 = new JTextPane();
	private JPanel p1Card1 = new JPanel();
	private JPanel p1Card2 = new JPanel();
	private JPanel p1Card3 = new JPanel();
	private JPanel p1Card4 = new JPanel();
	private JPanel p1Card5 = new JPanel();
	private JTextPane p1Type1 = new JTextPane();
	private JTextPane p1Type2 = new JTextPane();
	private JTextPane p1Type3 = new JTextPane();
	private JTextPane p1Type4 = new JTextPane();
	private JTextPane p1Type5 = new JTextPane();
	private JTextPane p1Value1 = new JTextPane();
	private JTextPane p1Value2 = new JTextPane();
	private JTextPane p1Value3 = new JTextPane();
	private JTextPane p1Value4 = new JTextPane();
	private JTextPane p1Value5 = new JTextPane();
	
	private JButton btnStop = new JButton("STOP");
	private JButton btnHit = new JButton("HIT");
	private JButton btnStartNewGame = new JButton("Start new game");
	private final JTextPane txtpnDealer = new JTextPane();
	private final JTextPane txtpnPlayer = new JTextPane();




	 
	public BJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		btnHit.setForeground(new Color(0, 0, 0));
		btnHit.setBackground(new Color(255, 255, 255));
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHit.setBounds(484, 339, 89, 23);
		contentPane.add(btnHit);
		
		
		dCard1.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard1.setBackground(new Color(255, 255, 255));
		dCard1.setBounds(26, 35, 66, 87);
		contentPane.add(dCard1);
		dCard1.setVisible(false);
		dCard1.setLayout(null);
		dType1.setEditable(false);
		
	
		dType1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType1.setBounds(32, 39, 24, 37);
		dCard1.add(dType1);
		dValue1.setEditable(false);
		dValue1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dValue1.setBounds(15, 5, 34, 47);
		dCard1.add(dValue1);
		
		
		scoreBoard.setBackground(new Color(255, 250, 240));
		scoreBoard.setBorder(new LineBorder(new Color(0, 0, 0)));
		scoreBoard.setBounds(440, 35, 318, 208);
		contentPane.add(scoreBoard);
		scoreBoard.setLayout(null);
		scoreBoardTextD.setBackground(new Color(255, 250, 240));
		scoreBoardTextD.setBounds(10, 11, 139, 186);
		
		scoreBoard.add(scoreBoardTextD);
		scoreBoardTextP.setBackground(new Color(255, 250, 240));
		scoreBoardTextP.setBounds(169, 11, 139, 186);
		
		scoreBoard.add(scoreBoardTextP);
		
		
		btnStop.setBounds(610, 339, 89, 23);
		contentPane.add(btnStop);
		
		
		dCard2.setLayout(null);
		dCard2.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard2.setBackground(Color.WHITE);
		dCard2.setBounds(102, 35, 66, 87);
		contentPane.add(dCard2);
		dCard2.setVisible(false);
		dType2.setEditable(false);
		dType2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType2.setBounds(32, 39, 24, 37);
		dCard2.add(dType2);
		dType2.setVisible(false);
		
		
		dValue2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dValue2.setEditable(false);
		dValue2.setBounds(15, 5, 34, 47);
		dCard2.add(dValue2);
		dValue2.setVisible(false);
		
		
		
		dCard3.setLayout(null);
		dCard3.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard3.setBackground(new Color(255, 255, 255));
		dCard3.setBounds(178, 35, 66, 87);
		contentPane.add(dCard3);
		dCard3.setVisible(false);
		dType3.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType3.setBounds(32, 39, 24, 37);
		dCard3.add(dType3);
		dValue3.setEditable(false);
		dValue3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dValue3.setBounds(15, 5, 34, 47);
		dCard3.add(dValue3);
		
	
		dCard4.setLayout(null);
		dCard4.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard4.setBackground(Color.WHITE);
		dCard4.setBounds(254, 35, 66, 87);
		contentPane.add(dCard4);
		dCard4.setVisible(false);
		dCard4.setVisible(false);
		dType4.setEditable(false);
		dType4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType4.setBounds(32, 39, 24, 37);
		dCard4.add(dType4);
		dValue4.setEditable(false);
		dValue4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dValue4.setBounds(15, 5, 34, 47);
		dCard4.add(dValue4);
		
	
		dCard5.setLayout(null);
		dCard5.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard5.setBackground(Color.WHITE);
		dCard5.setBounds(330, 35, 66, 87);
		contentPane.add(dCard5);
		dCard5.setVisible(false);
		dType5.setEditable(false);
		dType5.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType5.setBounds(32, 39, 24, 37);
		dCard5.add(dType5);
		dValue5.setEditable(false);
		dValue5.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dValue5.setBounds(15, 5, 34, 47);
		dCard5.add(dValue5);
		
		
		p1Card1.setLayout(null);
		p1Card1.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card1.setBackground(Color.WHITE);
		p1Card1.setBounds(26, 155, 66, 87);
		contentPane.add(p1Card1);
		p1Card1.setVisible(false);
		p1Type1.setEditable(false);
		p1Type1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type1.setBounds(32, 39, 24, 37);
		p1Card1.add(p1Type1);
		p1Value1.setEditable(false);
		p1Value1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		p1Value1.setBounds(15, 5, 34, 47);
		p1Card1.add(p1Value1);
		

		p1Card2.setLayout(null);
		p1Card2.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card2.setBackground(Color.WHITE);
		p1Card2.setBounds(102, 155, 66, 87);
		contentPane.add(p1Card2);
		p1Card2.setVisible(false);
		p1Type2.setEditable(false);
		p1Type2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type2.setBounds(32, 39, 24, 37);
		p1Card2.add(p1Type2);
		p1Value2.setEditable(false);
		p1Value2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		p1Value2.setBounds(15, 5, 34, 47);
		p1Card2.add(p1Value2);
		
		p1Card3.setLayout(null);
		p1Card3.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card3.setBackground(Color.WHITE);
		p1Card3.setBounds(178, 155, 66, 87);
		contentPane.add(p1Card3);
		p1Card3.setVisible(false);
		p1Type3.setEditable(false);
		p1Type3.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type3.setBounds(32, 39, 24, 37);
		p1Card3.add(p1Type3);
		p1Value3.setEditable(false);
		p1Value3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		p1Value3.setBounds(15, 5, 34, 47);
		p1Card3.add(p1Value3);
		
	
		p1Card4.setLayout(null);
		p1Card4.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card4.setBackground(Color.WHITE);
		p1Card4.setBounds(254, 155, 66, 87);
		contentPane.add(p1Card4);
		p1Card4.setVisible(false);
		p1Type4.setEditable(false);
		p1Type4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type4.setBounds(32, 39, 24, 37);
		p1Card4.add(p1Type4);
		p1Value4.setEditable(false);
		p1Value4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		p1Value4.setBounds(15, 5, 34, 47);
		p1Card4.add(p1Value4);
		

		p1Card5.setLayout(null);
		p1Card5.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card5.setBackground(Color.WHITE);
		p1Card5.setBounds(330, 155, 66, 87);
		contentPane.add(p1Card5);
		p1Card5.setVisible(false);
		p1Type5.setEditable(false);
		p1Type5.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type5.setBounds(32, 39, 24, 37);
		p1Card5.add(p1Type5);
		p1Value5.setEditable(false);
		p1Value5.setFont(new Font("Tahoma", Font.PLAIN, 26));
		p1Value5.setBounds(15, 5, 34, 47);
		p1Card5.add(p1Value5);
		

		messageDialog.setBorder(new LineBorder(new Color(0, 0, 0)));
		messageDialog.setBackground(new Color(255, 250, 240));
		messageDialog.setBounds(440, 260, 318, 57);
		contentPane.add(messageDialog);
		messageDialog.setLayout(null);
		messageText.setBackground(new Color(255, 250, 240));
		messageText.setBounds(10, 11, 298, 35);
		
		messageDialog.add(messageText);
		btnStartNewGame.setBounds(26, 339, 109, 23);
		
		contentPane.add(btnStartNewGame);
		txtpnDealer.setBackground(new Color(0, 100, 0));
		txtpnDealer.setForeground(new Color(255, 255, 255));
		txtpnDealer.setEditable(false);
		txtpnDealer.setText("Dealer");
		txtpnDealer.setBounds(26, 11, 97, 20);
		
		contentPane.add(txtpnDealer);
		txtpnPlayer.setEditable(false);
		txtpnPlayer.setForeground(new Color(255, 255, 255));
		txtpnPlayer.setBackground(new Color(0, 100, 0));
		txtpnPlayer.setText("Player1");
		txtpnPlayer.setBounds(26, 243, 97, 20);
		
		contentPane.add(txtpnPlayer);
	


	}





	public JPanel getScoreBoard() {
		return scoreBoard;
	}





	public void setScoreBoard(JPanel scoreBoard) {
		this.scoreBoard = scoreBoard;
	}





	public JTextPane getScoreBoardTextD() {
		return scoreBoardTextD;
	}





	public void setScoreBoardTextD(JTextPane scoreBoardTextD) {
		this.scoreBoardTextD = scoreBoardTextD;
	}





	public JTextPane getMessageText() {
		return messageText;
	}





	public void setMessageText(JTextPane messageText) {
		this.messageText = messageText;
	}





	public JTextPane getScoreBoardTextP() {
		return scoreBoardTextP;
	}





	public void setScoreBoardTextP(JTextPane scoreBoardTextP) {
		this.scoreBoardTextP = scoreBoardTextP;
	}





	public JPanel getdCard1() {
		return dCard1;
	}





	public void setdCard1(JPanel dCard1) {
		this.dCard1 = dCard1;
	}





	public JPanel getdCard2() {
		return dCard2;
	}





	public void setdCard2(JPanel dCard2) {
		this.dCard2 = dCard2;
	}





	public JPanel getdCard3() {
		return dCard3;
	}





	public void setdCard3(JPanel dCard3) {
		this.dCard3 = dCard3;
	}





	public JPanel getdCard4() {
		return dCard4;
	}





	public void setdCard4(JPanel dCard4) {
		this.dCard4 = dCard4;
	}





	public JPanel getdCard5() {
		return dCard5;
	}





	public void setdCard5(JPanel dCard5) {
		this.dCard5 = dCard5;
	}





	public JTextPane getdType1() {
		return dType1;
	}





	public void setdType1(JTextPane dType1) {
		this.dType1 = dType1;
	}





	public JTextPane getdType2() {
		return dType2;
	}





	public void setdType2(JTextPane dType2) {
		this.dType2 = dType2;
	}





	public JTextPane getdType3() {
		return dType3;
	}





	public void setdType3(JTextPane dType3) {
		this.dType3 = dType3;
	}





	public JTextPane getdType4() {
		return dType4;
	}





	public void setdType4(JTextPane dType4) {
		this.dType4 = dType4;
	}





	public JTextPane getdType5() {
		return dType5;
	}





	public void setdType5(JTextPane dType5) {
		this.dType5 = dType5;
	}





	public JTextPane getdValue1() {
		return dValue1;
	}





	public void setdValue1(JTextPane dValue1) {
		this.dValue1 = dValue1;
	}





	public JTextPane getdValue2() {
		return dValue2;
	}





	public void setdValue2(JTextPane dValue2) {
		this.dValue2 = dValue2;
	}





	public JTextPane getdValue3() {
		return dValue3;
	}





	public void setdValue3(JTextPane dValue3) {
		this.dValue3 = dValue3;
	}





	public JTextPane getdValue4() {
		return dValue4;
	}





	public void setdValue4(JTextPane dValue4) {
		this.dValue4 = dValue4;
	}





	public JTextPane getdValue5() {
		return dValue5;
	}





	public void setdValue5(JTextPane dValue5) {
		this.dValue5 = dValue5;
	}





	public JPanel getP1Card1() {
		return p1Card1;
	}





	public void setP1Card1(JPanel p1Card1) {
		this.p1Card1 = p1Card1;
	}





	public JPanel getP1Card2() {
		return p1Card2;
	}





	public void setP1Card2(JPanel p1Card2) {
		this.p1Card2 = p1Card2;
	}





	public JPanel getP1Card3() {
		return p1Card3;
	}





	public void setP1Card3(JPanel p1Card3) {
		this.p1Card3 = p1Card3;
	}





	public JPanel getP1Card4() {
		return p1Card4;
	}





	public void setP1Card4(JPanel p1Card4) {
		this.p1Card4 = p1Card4;
	}





	public JPanel getP1Card5() {
		return p1Card5;
	}





	public void setP1Card5(JPanel p1Card5) {
		this.p1Card5 = p1Card5;
	}





	public JTextPane getP1Type1() {
		return p1Type1;
	}





	public void setP1Type1(JTextPane p1Type1) {
		this.p1Type1 = p1Type1;
	}





	public JTextPane getP1Type2() {
		return p1Type2;
	}





	public void setP1Type2(JTextPane p1Type2) {
		this.p1Type2 = p1Type2;
	}





	public JTextPane getP1Type3() {
		return p1Type3;
	}





	public void setP1Type3(JTextPane p1Type3) {
		this.p1Type3 = p1Type3;
	}





	public JTextPane getP1Type4() {
		return p1Type4;
	}





	public void setP1Type4(JTextPane p1Type4) {
		this.p1Type4 = p1Type4;
	}





	public JTextPane getP1Type5() {
		return p1Type5;
	}





	public void setP1Type5(JTextPane p1Type5) {
		this.p1Type5 = p1Type5;
	}





	public JTextPane getP1Value1() {
		return p1Value1;
	}





	public void setP1Value1(JTextPane p1Value1) {
		this.p1Value1 = p1Value1;
	}





	public JTextPane getP1Value2() {
		return p1Value2;
	}





	public void setP1Value2(JTextPane p1Value2) {
		this.p1Value2 = p1Value2;
	}





	public JTextPane getP1Value3() {
		return p1Value3;
	}





	public void setP1Value3(JTextPane p1Value3) {
		this.p1Value3 = p1Value3;
	}





	public JTextPane getP1Value4() {
		return p1Value4;
	}





	public void setP1Value4(JTextPane p1Value4) {
		this.p1Value4 = p1Value4;
	}





	public JTextPane getP1Value5() {
		return p1Value5;
	}





	public void setP1Value5(JTextPane p1Value5) {
		this.p1Value5 = p1Value5;
	}





	public JButton getBtnStop() {
		return btnStop;
	}





	public void setBtnStop(JButton btnStop) {
		this.btnStop = btnStop;
	}





	public JButton getBtnHit() {
		return btnHit;
	}





	public void setBtnHit(JButton btnKnapp) {
		this.btnHit = btnKnapp;
	}





	public JButton getBtnStartNewGame() {
		return btnStartNewGame;
	}





	public void setBtnStartNewGame(JButton btnStartNewGame) {
		this.btnStartNewGame = btnStartNewGame;
	}





	public JPanel getContentPane() {
		return contentPane;
	}





	public JPanel getMessageDialog() {
		return messageDialog;
	}
}
	
	

