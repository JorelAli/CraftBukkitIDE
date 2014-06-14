package cbde.windows;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTree;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
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
		mntmProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newProjectDialog dia = new newProjectDialog();
				dia.setVisible(true);
			}
		});
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
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new java.awt.event.ActionListener() {
			@Override
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				closeApplication();
			}
		});
		mntmClose.setIcon(new ImageIcon(MainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/paletteClose.gif")));
		mnCbide.add(mntmClose);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenu mnSettingsDialog = new JMenu("Settings Dialog");
		mnSettings.add(mnSettingsDialog);
		
		JTree tree = new JTree();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		
		JTextPane txtpncraftbukkitideReady = new JTextPane();
		txtpncraftbukkitideReady.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 12));
		txtpncraftbukkitideReady.setEditable(false);
		txtpncraftbukkitideReady.setText("[CraftBukkitIDE]>> Ready!");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tree, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
						.addComponent(txtpncraftbukkitideReady))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tree, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtpncraftbukkitideReady, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		getContentPane().setLayout(groupLayout);
	}
	
	
	public void closeApplication(){
		dispose();
	}
}
