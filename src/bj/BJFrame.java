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

public class BJFrame extends JFrame {

	private JPanel contentPane;
	private JPanel messageDialog = new JPanel();
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
	private JButton btnKnapp = new JButton("HIT");



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BJFrame frame = new BJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		btnKnapp.setForeground(new Color(0, 0, 0));
		btnKnapp.setBackground(new Color(255, 255, 255));
		btnKnapp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKnapp.setBounds(485, 315, 89, 23);
		contentPane.add(btnKnapp);
		
		
		dCard1.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard1.setBackground(new Color(255, 255, 255));
		dCard1.setBounds(26, 11, 66, 87);
		contentPane.add(dCard1);
		dCard1.setLayout(null);
		
	
		dType1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType1.setBounds(32, 39, 24, 37);
		dCard1.add(dType1);
		dType1.setText("\u2663");
		
		
		dValue1.setText("J");
		dValue1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dValue1.setBounds(15, 5, 24, 47);
		dCard1.add(dValue1);
		
		
		scoreBoard.setBackground(new Color(255, 250, 240));
		scoreBoard.setBorder(new LineBorder(new Color(0, 0, 0)));
		scoreBoard.setBounds(441, 11, 318, 208);
		contentPane.add(scoreBoard);
		scoreBoard.setLayout(null);
		scoreBoardTextD.setBackground(new Color(255, 250, 240));
		scoreBoardTextD.setBounds(10, 11, 139, 186);
		
		scoreBoard.add(scoreBoardTextD);
		scoreBoardTextP.setBackground(new Color(255, 250, 240));
		scoreBoardTextP.setBounds(169, 11, 139, 186);
		
		scoreBoard.add(scoreBoardTextP);
		
		
		btnStop.setBounds(611, 315, 89, 23);
		contentPane.add(btnStop);
		
		
		dCard2.setLayout(null);
		dCard2.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard2.setBackground(Color.WHITE);
		dCard2.setBounds(102, 11, 66, 87);
		contentPane.add(dCard2);
		
	
		dType2.setText("\u2666");
		dType2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType2.setBounds(32, 39, 24, 37);
		dCard2.add(dType2);
		
		JTextPane dValue2 = new JTextPane();
		dValue2.setText("J");
		dValue2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dValue2.setBounds(15, 5, 24, 47);
		dCard2.add(dValue2);
		
		
		dCard3.setLayout(null);
		dCard3.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard3.setBackground(Color.WHITE);
		dCard3.setBounds(178, 11, 66, 87);
		contentPane.add(dCard3);
		
		
		dType3.setText("\u2660");
		dType3.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType3.setBounds(32, 39, 24, 37);
		dCard3.add(dType3);
		
	
		dValue3.setText("J");
		dValue3.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dValue3.setBounds(15, 5, 24, 47);
		dCard3.add(dValue3);
		
	
		dCard4.setLayout(null);
		dCard4.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard4.setBackground(Color.WHITE);
		dCard4.setBounds(254, 11, 66, 87);
		contentPane.add(dCard4);
		
	
		dType4.setText("\u2665");
		dType4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType4.setBounds(32, 39, 24, 37);
		dCard4.add(dType4);
		

		dValue4.setText("J");
		dValue4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dValue4.setBounds(15, 5, 24, 47);
		dCard4.add(dValue4);
		
	
		dCard5.setLayout(null);
		dCard5.setBorder(new LineBorder(new Color(0, 0, 0)));
		dCard5.setBackground(Color.WHITE);
		dCard5.setBounds(330, 11, 66, 87);
		contentPane.add(dCard5);
		
		
		dType5.setText("\u2663");
		dType5.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dType5.setBounds(32, 39, 24, 37);
		dCard5.add(dType5);
		
		dValue5.setText("J");
		dValue5.setFont(new Font("Tahoma", Font.PLAIN, 34));
		dValue5.setBounds(15, 5, 24, 47);
		dCard5.add(dValue5);
		
		
		p1Card1.setLayout(null);
		p1Card1.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card1.setBackground(Color.WHITE);
		p1Card1.setBounds(26, 131, 66, 87);
		contentPane.add(p1Card1);
		
		
		p1Type1.setText("\u2663");
		p1Type1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type1.setBounds(32, 39, 24, 37);
		p1Card1.add(p1Type1);
		
		
		p1Value1.setText("J");
		p1Value1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Value1.setBounds(15, 5, 24, 47);
		p1Card1.add(p1Value1);
		

		p1Card2.setLayout(null);
		p1Card2.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card2.setBackground(Color.WHITE);
		p1Card2.setBounds(102, 131, 66, 87);
		contentPane.add(p1Card2);
		

		p1Type2.setText("\u2663");
		p1Type2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type2.setBounds(32, 39, 24, 37);
		p1Card2.add(p1Type2);
		

		p1Value2.setText("J");
		p1Value2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Value2.setBounds(15, 5, 24, 47);
		p1Card2.add(p1Value2);
		
		p1Card3.setLayout(null);
		p1Card3.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card3.setBackground(Color.WHITE);
		p1Card3.setBounds(178, 131, 66, 87);
		contentPane.add(p1Card3);

		
		p1Type3.setText("\u2663");
		p1Type3.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type3.setBounds(32, 39, 24, 37);
		p1Card3.add(p1Type3);

		p1Value3.setText("J");
		p1Value3.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Value3.setBounds(15, 5, 24, 47);
		p1Card3.add(p1Value3);
		
	
		p1Card4.setLayout(null);
		p1Card4.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card4.setBackground(Color.WHITE);
		p1Card4.setBounds(254, 131, 66, 87);
		contentPane.add(p1Card4);
		

		p1Type4.setText("\u2663");
		p1Type4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type4.setBounds(32, 39, 24, 37);
		p1Card4.add(p1Type4);
		

		p1Value4.setText("J");
		p1Value4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Value4.setBounds(15, 5, 24, 47);
		p1Card4.add(p1Value4);
		

		p1Card5.setLayout(null);
		p1Card5.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1Card5.setBackground(Color.WHITE);
		p1Card5.setBounds(330, 131, 66, 87);
		contentPane.add(p1Card5);
		
	
		p1Type5.setText("\u2663");
		p1Type5.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Type5.setBounds(32, 39, 24, 37);
		p1Card5.add(p1Type5);
		

		p1Value5.setText("J");
		p1Value5.setFont(new Font("Tahoma", Font.PLAIN, 34));
		p1Value5.setBounds(15, 5, 24, 47);
		p1Card5.add(p1Value5);
		

		messageDialog.setBorder(new LineBorder(new Color(0, 0, 0)));
		messageDialog.setBackground(new Color(255, 250, 240));
		messageDialog.setBounds(441, 236, 318, 57);
		contentPane.add(messageDialog);
		messageDialog.setLayout(null);
		messageText.setBackground(new Color(255, 250, 240));
		messageText.setBounds(10, 11, 298, 35);
		
		messageDialog.add(messageText);
	}

	public JPanel getMessageDialog() {
		return messageDialog;
	}

	public void setMessageDialog(JPanel messageDialog) {
		this.messageDialog = messageDialog;
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

	public JButton getBtnKnapp() {
		return btnKnapp;
	}

	public void setBtnKnapp(JButton btnKnapp) {
		this.btnKnapp = btnKnapp;
	}
	
	
	
	
	
}
