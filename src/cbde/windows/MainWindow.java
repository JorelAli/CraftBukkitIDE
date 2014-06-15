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
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.JProgressBar;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

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
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Help") {
				{
					add(new DefaultMutableTreeNode("Website"));
					add(new DefaultMutableTreeNode("Bukkit Forums"));
				}
			}
		));
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(192, 192, 192), Color.DARK_GRAY));
		panel_2.setBackground(Color.GRAY);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Leo\\BukkitPlugin-Workbench\\CBDE\\craftbukkit_icon.png"));
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Prestige Elite Std", Font.BOLD, 32));
		label.setBounds(82, 86, 48, 64);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Leo\\BukkitPlugin-Workbench\\CBDE\\gear_icon.png"));
		label_1.setBounds(11, 22, 128, 128);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("CraftBukkit\r");
		label_2.setFont(new Font("Dotum", Font.PLAIN, 25));
		label_2.setBounds(169, 61, 136, 24);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Plugin-Maker");
		label_3.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 20));
		label_3.setBounds(179, 86, 152, 24);
		panel_2.add(label_3);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblV = new JLabel("v 0.0.1");
		lblV.setForeground(Color.LIGHT_GRAY);
		lblV.setBounds(11, 6, 55, 16);
		panel_2.add(lblV);
		
		JLabel lblBeta = new JLabel("Beta");
		lblBeta.setForeground(Color.YELLOW);
		lblBeta.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 15));
		lblBeta.setBounds(255, 111, 55, 16);
		panel_2.add(lblBeta);
		panel.setLayout(gl_panel);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
		);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		panel_1.setLayout(gl_panel_1);
		getContentPane().setLayout(groupLayout);
		jsyntaxpane.DefaultSyntaxKit.initKit();
		editorPane.setContentType("text/java");
	}
	
	
	public void closeApplication(){
		dispose();
	}
}