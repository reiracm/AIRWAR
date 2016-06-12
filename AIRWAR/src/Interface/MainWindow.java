package Interface;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ICommunication.ICommunicate;
import Interface.MainPanel;

public class MainWindow extends JFrame implements ICommunicate {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1000, 700);
		contentPane = new MainPanel(this);
		setContentPane(contentPane);
		setVisible(true);
	}
	/**
	 * Método para el cambio de ventana
	 * @param panel
	 */
	public void changeContentPane(JPanel panel){
		contentPane = panel;
		setContentPane(contentPane);
		setVisible(true);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		/**
		 * Launch the application.
		 */
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MainWindow frame = new MainWindow();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

