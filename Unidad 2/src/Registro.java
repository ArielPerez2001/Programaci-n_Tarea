import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JList;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.green);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setBounds(25, 20, 182, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(25, 65, 451, 368);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		lblNewLabel_1.setBounds(10, 10, 131, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Nombres:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(42, 68, 131, 22);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Apellido Paterno:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(42, 122, 161, 13);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Apellido Materno:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(42, 177, 171, 13);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(42, 232, 171, 13);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Sexo: ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(42, 278, 84, 13);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Nacionalidad: ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_10.setBounds(42, 321, 111, 13);
		panel.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(237, 73, 131, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(237, 122, 131, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(237, 177, 131, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(237, 232, 131, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(Color.CYAN);
		rdbtnNewRadioButton.setBounds(237, 270, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(Color.CYAN);
		rdbtnNewRadioButton_1.setBounds(237, 293, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		String nacionalidad [] = {"Perú", "Mexico","Argentina","Salvador"};
		
		JComboBox comboBox = new JComboBox(nacionalidad);
		comboBox.setBounds(237, 320, 131, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(205, 92, 92));
		panel_1.setBounds(25, 453, 451, 238);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Datos Opcionales");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 10, 139, 22);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_11 = new JLabel("Descripción");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(72, 50, 117, 22);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Preferencias ");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_12.setBounds(260, 54, 98, 14);
		panel_1.add(lblNewLabel_12);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(35, 82, 154, 90);
		panel_1.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(253, 78, 123, 133);
		panel_1.add(editorPane_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(188, 82, 21, 90);
		panel_1.add(scrollPane_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane_1.setViewportView(scrollBar);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(375, 78, 21, 133);
		panel_1.add(scrollPane_2);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_2.setViewportView(scrollBar_1);
		
	
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 192, 203));
		panel_2.setBounds(500, 65, 270, 368);
		contentPane.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Perfil de Usuario");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridheight = 2;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 4;
		panel_2.add(panel_4, gbc_panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("IMAGEN");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_4.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 192, 203));
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 9;
		panel_2.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha Nacimiento");
		chckbxNewCheckBox_1.setBackground(new Color(255, 192, 203));
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 0;
		gbc_chckbxNewCheckBox_1.gridy = 12;
		panel_2.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(486, 453, 270, 238);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(92, 37, 97, 21);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(92, 106, 97, 21);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(92, 180, 97, 21);
		panel_3.add(btnNewButton_2);
		
		
	}
}
