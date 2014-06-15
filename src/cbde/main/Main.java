package cbde.main;


import cbde.windows.LoadingWindow;
import cbde.windows.MainWindow;
import cbde.windows.warning;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoadingWindow load = new LoadingWindow();
		load.setVisible(true);
		load.setLocationRelativeTo(null);
		warning dialog = new warning();
		dialog.setVisible(true);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MainWindow Main = new MainWindow();
		load.setVisible(false);
		Main.setVisible(true);
		
		
	}

}
