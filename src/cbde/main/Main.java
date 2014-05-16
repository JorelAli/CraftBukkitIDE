package cbde.main;


import cbde.windows.LoadingWindow;
import cbde.windows.MainWindow;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoadingWindow load = new LoadingWindow();
		load.setVisible(true);
		MainWindow Main = new MainWindow();
		load.setVisible(false);
		Main.setVisible(true);
		
		
	}

}
