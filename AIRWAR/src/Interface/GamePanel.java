package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Logic.Cannon;
import javax.swing.UIManager;

public class GamePanel extends JPanel {
	
	private JLabel _gameCannon;
	
	private Cannon _cannon;
	
	private boolean _isAlive = true;
	
	private JFrame frame;
	
	private GamePanel panel = this;

	/**
	 * Create the panel.
	 */
	public GamePanel(MainWindow frame) {
		setBackground(UIManager.getColor("CheckBox.focus"));

		_cannon = new Cannon(50,1000,650);
		setLayout(null);
		
		_gameCannon = new JLabel();
		_gameCannon.setBackground(Color.BLACK);
		_gameCannon.setBounds(_cannon.getX_pos(), 650, 30, 50);
		add(_gameCannon);
		_gameCannon.setOpaque(true);
		_gameCannon.setVisible(true);
		
		Thread t_cannon = new Thread(){
			
			public void run(){
				while(_isAlive){
					try {
						Thread.sleep(16);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					_gameCannon.setBounds(_cannon.getX_pos(), 650, 30, 50);
					frame.setVisible(true);
					_gameCannon.repaint();
					_gameCannon.revalidate();
					_gameCannon.setVisible(true);
					_gameCannon.setOpaque(true);
					 panel.revalidate();
					 panel.repaint();
			}
				
			}
		};
		t_cannon.start();
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				_cannon.setX_pos(e.getX());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.changeContentPane(new MainPanel(frame));
			}
		});
		btnReturn.setBounds(5, 650, 117, 25);
		add(btnReturn);
		
	}

}
