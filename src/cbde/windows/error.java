package cbde.windows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class error extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			error dialog = new error();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public error(String ErrorText, String ErrorInfo) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(error.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		setTitle("Error");
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblFatalError = new JLabel("Fatal Error: " + ErrorText);
			lblFatalError.setForeground(new Color(204, 0, 0));
			lblFatalError.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblFatalError.setBounds(10, 11, 186, 26);
			contentPanel.add(lblFatalError);
		}
		{
			JTextPane txtpnprintstacktrace = new JTextPane();
			txtpnprintstacktrace.setBounds(10, 48, 464, 169);
			txtpnprintstacktrace.setText(ErrorInfo);
			contentPanel.add(txtpnprintstacktrace);
		}
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
		}
	}

}
