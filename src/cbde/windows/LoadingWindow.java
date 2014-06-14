package cbde.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class LoadingWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadingWindow frame = new LoadingWindow();
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
	public LoadingWindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(192, 192, 192), Color.DARK_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCraftbukkit = new JLabel("");
		lblCraftbukkit.setIcon(new ImageIcon("C:\\Users\\Leo\\BukkitPlugin-Workbench\\CBDE\\craftbukkit_icon.png"));
		lblCraftbukkit.setForeground(Color.BLUE);
		lblCraftbukkit.setFont(new Font("Prestige Elite Std", Font.BOLD, 32));
		lblCraftbukkit.setBounds(91, 115, 48, 64);
		contentPane.add(lblCraftbukkit);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(5);
		progressBar.setIndeterminate(true);
		progressBar.setBounds(197, 192, 226, 9);
		contentPane.add(progressBar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Leo\\BukkitPlugin-Workbench\\CBDE\\gear_icon.png"));
		label.setBounds(30, 62, 128, 128);
		contentPane.add(label);
		
		JLabel lblCraftbukkit_1 = new JLabel("CraftBukkit\r");
		lblCraftbukkit_1.setFont(new Font("Dotum", Font.PLAIN, 25));
		lblCraftbukkit_1.setBounds(197, 110, 136, 24);
		contentPane.add(lblCraftbukkit_1);
		
		JLabel lblPluginmaker = new JLabel("Plugin-Maker");
		lblPluginmaker.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 20));
		lblPluginmaker.setBounds(197, 145, 152, 24);
		contentPane.add(lblPluginmaker);
	}
}
