package GuiConnection;

import java.awt.EventQueue;

import Interface.MainWindow;

public class GuiConnection {

	public GuiConnection(){
		
	}
	
	public void start(){
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					MainWindow panel = new MainWindow();
					panel.execute();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

}
