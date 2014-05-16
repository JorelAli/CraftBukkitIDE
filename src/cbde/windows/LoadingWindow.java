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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCraftbukkit = new JLabel("CraftBukkit");
		lblCraftbukkit.setForeground(Color.BLUE);
		lblCraftbukkit.setFont(new Font("Prestige Elite Std", Font.BOLD, 32));
		lblCraftbukkit.setBounds(119, 50, 226, 33);
		contentPane.add(lblCraftbukkit);
		
		JLabel lblIntegratedDevelopmentEnvironment = new JLabel("Integrated Development Environment for Plugins");
		lblIntegratedDevelopmentEnvironment.setFont(new Font("Swiss921 BT", Font.PLAIN, 21));
		lblIntegratedDevelopmentEnvironment.setBounds(20, 115, 430, 33);
		contentPane.add(lblIntegratedDevelopmentEnvironment);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setBounds(0, 264, 450, 14);
		contentPane.add(progressBar);
	}
}
