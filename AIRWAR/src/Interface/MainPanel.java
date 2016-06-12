package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Interface.MainWindow;
import Interface.ScoresPanel;

public class MainPanel extends JPanel {
	

	private JFrame frame;

	/**
	 * Create the panel.
	 */
	public MainPanel(MainWindow frame) {

		super();
		this.frame = frame;
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/StartPanel.png")));
		lblNewLabel.setBounds(0, 0, 1000, 700);
		add(lblNewLabel);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String newPlayer = JOptionPane.showInputDialog("Ingrese un nombre de 7 caracteres:");
				
				int confirm = JOptionPane.showConfirmDialog(frame,"¿Confirma este nombre de usuario?", newPlayer, JOptionPane.YES_NO_OPTION);
				if (confirm == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(null, "Bienvenido: " + newPlayer);
					frame.changeContentPane(new GamePanel(frame));
				}
				
			}
			
		});
		btnStart.setBounds(450, 360, 117, 25);
		add(btnStart);
		

		JButton btnScores = new JButton("Scores");
		btnScores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.changeContentPane(new ScoresPanel(frame));
			}
		});
		btnScores.setBounds(450, 460, 117, 25);
		add(btnScores);
		
		//Botón de salida
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		btnExit.setBounds(450, 560, 117, 25);
		add(btnExit);
	}
	}
