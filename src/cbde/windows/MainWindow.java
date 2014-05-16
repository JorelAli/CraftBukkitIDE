package cbde.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JTree;
import java.awt.GridLayout;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 508);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCbide = new JMenu("CBIDE");
		menuBar.add(mnCbide);
		
		JMenu mnNewMenu = new JMenu("New");
		mnNewMenu.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mnCbide.add(mnNewMenu);
		
		JMenuItem mntmProject = new JMenuItem("Project");
		mnNewMenu.add(mntmProject);
		
		JMenuItem mntmFile = new JMenuItem("File");
		mnNewMenu.add(mntmFile);
		
		JMenuItem mntmOpenProject = new JMenuItem("Open Project");
		mntmOpenProject.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		mnCbide.add(mntmOpenProject);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mnCbide.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save as");
		mntmSaveAs.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/upFolder.gif")));
		mnCbide.add(mntmSaveAs);
		
		JMenuItem mntmExportCraftbukkitPlugin = new JMenuItem("Export CraftBukkit Plugin");
		mntmExportCraftbukkitPlugin.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize-pressed.gif")));
		mnCbide.add(mntmExportCraftbukkitPlugin);
		
		JMenu mnExportAs = new JMenu("Export as..");
		mnExportAs.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/iconify.gif")));
		mnCbide.add(mnExportAs);
		
		JMenuItem mntmEclipseProject = new JMenuItem("Eclipse Project");
		mnExportAs.add(mntmEclipseProject);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
	}
}
