package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Logic.Player;
import Logic.PlayerScore;

public class ScoresPanel extends JPanel {
	
	private static Player _finalPlayer [] = new Player [10];
	
	private static int _pointer = 0;
	
	private JFrame frame;
	

	/**
	 * Create the panel.
	 */
	public ScoresPanel(MainWindow frame) {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/SCORES.png")));
		lblNewLabel.setBounds(0, 0, 1000, 700);
		add(lblNewLabel);
		
		JLabel [] players = new JLabel[10];
		JLabel [] scores = new JLabel [10];
		
		int y_lblPos = 40;
		
		for(int i = 0; i < _pointer; i++){
			players[i] = new JLabel();
			players[i].setBounds(110,y_lblPos + 10, 70, 15);
			players[i].setOpaque(true);
			players[i].setText(_finalPlayer[i].get_player());
			players[i].setBackground(new Color(255, 235, 205));
			add(players[i]);
			y_lblPos = y_lblPos + 35;
		}
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.changeContentPane(new MainPanel(frame));
			}
		});
		btnReturn.setBounds(10, 650, 82, 25);
		add(btnReturn);
	}
	
	public static void addPlayer(String pPlayer){
		_finalPlayer[_pointer] = new Player(pPlayer);
	}
	
	public static void setScore(int score){
		_finalPlayer[_pointer].set_finalScore(score);
		_pointer++;
	}

}
