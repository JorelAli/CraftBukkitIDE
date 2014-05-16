package cbde.windows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;

public class newProjectDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			newProjectDialog dialog = new newProjectDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public newProjectDialog() {
		setResizable(false);
		setBounds(100, 100, 413, 277);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewProject = new JLabel("New Project");
		lblNewProject.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewProject.setBounds(10, 11, 104, 27);
		contentPanel.add(lblNewProject);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 65, 46, 14);
		contentPanel.add(lblName);
		
		JLabel lblFolder = new JLabel("Folder:");
		lblFolder.setBounds(10, 104, 46, 14);
		contentPanel.add(lblFolder);
		
		JLabel lblCraftbukkitVersion = new JLabel("CraftBukkit Version:");
		lblCraftbukkitVersion.setBounds(10, 140, 154, 14);
		contentPanel.add(lblCraftbukkitVersion);
		
		textField = new JTextField();
		textField.setBounds(123, 55, 274, 27);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 94, 239, 27);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("CraftBukkit 1.7.5");
		comboBox.setBounds(214, 137, 183, 27);
		contentPanel.add(comboBox);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(360, 94, 37, 27);
		contentPanel.add(btnNewButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
