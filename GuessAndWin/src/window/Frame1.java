package window;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JSpinner;
import javax.swing.JList;

public class Frame1 {

	private JFrame frame;
	private JTextField txt1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}
	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}
	int pnum1,cnum1,num1f,c=0,p=0;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 458, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Player = new JLabel("You");
		Player.setForeground(new Color(255, 102, 255));
		Player.setHorizontalAlignment(SwingConstants.CENTER);
		Player.setFont(new Font("Arial Black", Font.BOLD, 30));
		Player.setBounds(29, 56, 116, 45);
		frame.getContentPane().add(Player);
		
		JLabel Computer = new JLabel("Com");
		Computer.setForeground(new Color(255, 102, 255));
		Computer.setHorizontalAlignment(SwingConstants.CENTER);
		Computer.setFont(new Font("Arial Black", Font.BOLD, 30));
		Computer.setBounds(291, 56, 116, 45);
		frame.getContentPane().add(Computer);
		
		txt1 = new JTextField();
		txt1.setSelectionColor(Color.WHITE);
		txt1.setSelectedTextColor(Color.WHITE);
		txt1.setForeground(Color.WHITE);
		txt1.setCaretColor(Color.WHITE);
		txt1.setBackground(Color.BLACK);
		txt1.setHorizontalAlignment(SwingConstants.CENTER);
		txt1.setFont(new Font("Rockwell", Font.BOLD, 20));
		txt1.setBounds(29, 111, 116, 35);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lblcom1 = new JLabel("");
		lblcom1.setOpaque(true);
		lblcom1.setForeground(Color.WHITE);
		lblcom1.setIcon(null);
		lblcom1.setBackground(Color.BLACK);
		lblcom1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblcom1.setHorizontalAlignment(SwingConstants.CENTER);
		lblcom1.setBounds(290, 111, 117, 35);
		frame.getContentPane().add(lblcom1);
		
		JButton btnSet1 = new JButton("Set");
		btnSet1.setBorderPainted(false);
		btnSet1.setForeground(new Color(255, 255, 51));
		btnSet1.setBackground(new Color(255, 0, 51));
		btnSet1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSet1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	 			try {
					pnum1=Integer.parseInt(txt1.getText());
									
					if(pnum1 > 3) {
						JOptionPane.showMessageDialog(null,"Please enter an intenger less than 4");
						txt1.setText(null);
						txt1.requestFocusInWindow();
					}else {
						//do nothing 
						do {	
		     				Random rn1 = new Random();
		     				cnum1=rn1.nextInt(3)+1 ;					
			 				}while(cnum1 == pnum1);
							lblcom1.setText(Integer.toString(cnum1));							
					}
					
					
															
				}catch(Exception ex){
 				JOptionPane.showMessageDialog(null, "Please enter an intenger");
 				txt1.requestFocusInWindow();
					} 
			}
		});
		btnSet1.setFont(new Font("Cooper Black", Font.BOLD, 20));
		btnSet1.setBounds(69, 176, 94, 35);
		frame.getContentPane().add(btnSet1);
		
		JLabel Pstar1 = new JLabel("");
		Pstar1.setIcon(new ImageIcon(this.getClass().getResource("/img/1.png")));
		Pstar1.setBounds(34, 366, 65, 65);
		frame.getContentPane().add(Pstar1);
		Pstar1.setVisible(false);
		
		JLabel Pstar2 = new JLabel("");
		Pstar2.setIcon(new ImageIcon(this.getClass().getResource("/img/2.png")));
		Pstar2.setBounds(99, 366, 65, 65);
		frame.getContentPane().add(Pstar2);
		Pstar2.setVisible(false);
		
		JLabel Pstar3 = new JLabel("");
		Pstar3.setIcon(new ImageIcon(this.getClass().getResource("/img/3.png")));
		Pstar3.setBounds(34, 430, 65, 65);
		frame.getContentPane().add(Pstar3);
		Pstar3.setVisible(false);
		
		JLabel Pstar4 = new JLabel("");
		Pstar4.setIcon(new ImageIcon(this.getClass().getResource("/img/4.png")));
		Pstar4.setBounds(99, 430, 65, 65);
		frame.getContentPane().add(Pstar4);
		Pstar4.setVisible(false);
		
		JLabel Cstar1 = new JLabel("");
		Cstar1.setIcon(new ImageIcon(this.getClass().getResource("/img/1.png")));
		Cstar1.setBounds(282, 366, 65, 65);
		frame.getContentPane().add(Cstar1);
		Cstar1.setVisible(false);
		
		JLabel Cstar2 = new JLabel("");
		Cstar2.setIcon(new ImageIcon(this.getClass().getResource("/img/2.png")));
		Cstar2.setBounds(346, 366, 65, 65);
		frame.getContentPane().add(Cstar2);
		Cstar2.setVisible(false);
		
		JLabel Cstar3 = new JLabel("");
		Cstar3.setIcon(new ImageIcon(this.getClass().getResource("/img/3.png")));
		Cstar3.setBounds(282, 430, 65, 65);
		frame.getContentPane().add(Cstar3);
		Cstar3.setVisible(false);
		
		JLabel Cstar4 = new JLabel("");
		Cstar4.setIcon(new ImageIcon(this.getClass().getResource("/img/4.png")));
		Cstar4.setBounds(346, 430, 65, 65);
		frame.getContentPane().add(Cstar4);
		Cstar4.setVisible(false);
		
		JLabel lblresultText = new JLabel("");
		lblresultText.setFont(new Font("Cooper Black", Font.BOLD, 35));
		lblresultText.setHorizontalAlignment(SwingConstants.CENTER);
		lblresultText.setForeground(Color.WHITE);
		lblresultText.setBounds(77, 268, 286, 100);
		frame.getContentPane().add(lblresultText);
		
		JLabel lblresetMsg = new JLabel("Press \"Reset\" Button to Play Again");
		lblresetMsg.setForeground(new Color(255, 0, 0));
		lblresetMsg.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
		lblresetMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblresetMsg.setBounds(54, 352, 341, 35);
		frame.getContentPane().add(lblresetMsg);
		lblresetMsg.setVisible(false);
		
		JLabel lblwonback = new JLabel("");
		lblwonback.setIcon(new ImageIcon(this.getClass().getResource("/img/Won_back.png")));
		lblwonback.setBounds(0, 0, 457, 584);
		frame.getContentPane().add(lblwonback);
		lblwonback.setVisible(false);
				
		JButton btnreset = new JButton("Reset");
		btnreset.setBackground(new Color(255, 0, 102));
		btnreset.setForeground(new Color(255, 255, 51));
		btnreset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnreset.setVisible(false);
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt1.setText(null);
				lblcom1.setText(null);
				
				Pstar1.setVisible(false);
				Pstar2.setVisible(false);
				Pstar3.setVisible(false);
				Pstar4.setVisible(false);
				
				Cstar1.setVisible(false);
				Cstar2.setVisible(false);
				Cstar3.setVisible(false);
				Cstar4.setVisible(false);
				
				btnreset.setVisible(false);
				lblresetMsg.setVisible(false);
				lblwonback.setVisible(false);	
				lblresultText.setVisible(false);
				
				p = 0;
				c = 0;
				
			}
		});
		
		btnreset.setBounds(150, 514, 122, 35);
		frame.getContentPane().add(btnreset);
							
		JButton btnplay1 = new JButton("Play");
		btnplay1.setForeground(new Color(255, 255, 51));
		btnplay1.setBorderPainted(false);
		btnplay1.setBackground(new Color(255, 0, 51));
		btnplay1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnplay1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				pnum1=Integer.parseInt(txt1.getText());
				
				Random rn1final = new Random();
 				num1f=rn1final.nextInt(3)+1 ;	
				JOptionPane.showMessageDialog(null,"Number is "+num1f);
						
				 if(pnum1==num1f && p==0) {
					p=p+1;
					Pstar1.setVisible(true);
				}else if(cnum1==num1f && c==0) {
					c=c+1;
					Cstar1.setVisible(true);
				}else if(pnum1==num1f && p==1) {
					p=p+1;
					Pstar2.setVisible(true);
				}else if(cnum1==num1f && c==1) {
					c=c+1;
					Cstar2.setVisible(true);
				}else if(pnum1==num1f && p==2) {
					p=p+1;
					Pstar3.setVisible(true);
				}else if(cnum1==num1f && c==2) {
					c=c+1;
					Cstar3.setVisible(true);
				}else if(pnum1==num1f && p==3) {
					Pstar4.setVisible(true);
					lblresultText.setText("YOU WON!!!");
					lblwonback.setVisible(true);
					btnreset.setVisible(true);
				}else if(cnum1==num1f && c==3) {
					Cstar4.setVisible(true);
					lblresultText.setText("YOU LOST");
					btnreset.setVisible(true);
					lblresetMsg.setVisible(true);
					
				}
			    
				txt1.setText(null);
				lblcom1.setText(null);
				txt1.requestFocusInWindow();													
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter an intenger");
					txt1.requestFocusInWindow();
				}	
		}
			});
		
		btnplay1.setFont(new Font("Cooper Black", Font.BOLD, 20));
		btnplay1.setBounds(272, 176, 100, 35);
		frame.getContentPane().add(btnplay1);
		
		JLabel lblback = new JLabel("");
		lblback.setIcon(new ImageIcon(this.getClass().getResource("/img/backblue.jpg")));
		lblback.setBounds(-28, -112, 496, 711);
		frame.getContentPane().add(lblback);
	}
}