import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Vista extends JFrame {

	private JPanel contentPane;
	private JLabel lblNumeroPiso;
	private JLabel lblSubeBaja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual = Integer.parseInt(lblNumeroPiso.getText());
				if(1<pisoactual){
					lblSubeBaja.setText("Baja");
				}else
						lblSubeBaja.setText("Piso Actual");
				        lblNumeroPiso.setText("1");
			}
		});
		btn1.setBounds(27, 190, 61, 45);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual = Integer.parseInt(lblNumeroPiso.getText());
				if(2<pisoactual){
					lblSubeBaja.setText("Baja");
				}else
					if(2>pisoactual){
						lblSubeBaja.setText("Sube");
					}else
						lblSubeBaja.setText("Piso Actual");
				        lblNumeroPiso.setText("2");
			}
		});
		btn2.setBounds(27, 133, 61, 45);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual = Integer.parseInt(lblNumeroPiso.getText());
				if(3<pisoactual){
					lblSubeBaja.setText("Baja");
				}else
					if(3>pisoactual){
						lblSubeBaja.setText("Sube");
					}else
						lblSubeBaja.setText("Piso Actual");
				        lblNumeroPiso.setText("3");
			}
		});
		btn3.setBounds(27, 69, 61, 45);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pisoactual = Integer.parseInt(lblNumeroPiso.getText());
				if(4<pisoactual){
					lblSubeBaja.setText("Baja");
				}else
					if(4>pisoactual){
						lblSubeBaja.setText("Sube");
					}else
						lblSubeBaja.setText("Piso Actual");
				        lblNumeroPiso.setText("4");
			}
		});
		btn4.setBounds(27, 11, 61, 45);
		contentPane.add(btn4);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(167, 42, 46, 14);
		contentPane.add(lblPiso);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(167, 121, 61, 14);
		contentPane.add(lblDireccion);
		
		lblNumeroPiso = new JLabel("1");
		lblNumeroPiso.setBounds(263, 42, 46, 14);
		contentPane.add(lblNumeroPiso);
		
		lblSubeBaja = new JLabel("Baja");
		lblSubeBaja.setBounds(252, 121, 172, 14);
		contentPane.add(lblSubeBaja);
	}
}
