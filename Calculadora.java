package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Calculadora {

	private JFrame frame;
	private JTextArea txtVisor;
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JButton btnSoma, btnSubtrair, btnMulti, btnDiv;
	double numeroA, numeroB, resultadoFinal;
	int operacao;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
		
		JButton btnPonto = new JButton(".");
		btnPonto.setBounds(232, 158, 117, 25);
		frame.getContentPane().add(btnPonto);
		
		JTextArea txtVisor = new JTextArea();
		txtVisor.setBounds(0, 26, 349, 15);
		frame.getContentPane().add(txtVisor);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == btnSoma) {
			            numeroA = Double.parseDouble(txtVisor.getText());
			            txtVisor.setText("");
			            operacao = 1;
			        }
			}
		});
		btnSoma.setBounds(343, 53, 84, 25);
		frame.getContentPane().add(btnSoma);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 numeroA = Double.parseDouble(txtVisor.getText());
		            txtVisor.setText(null);
		            operacao = 2;
			}
		});
		btnSubtrair.setBounds(343, 90, 84, 25);
		frame.getContentPane().add(btnSubtrair);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numeroA = Double.parseDouble(txtVisor.getText());
	            txtVisor.setText(null);
	            operacao = 3;
			}
		});
		btnMulti.setBounds(343, 127, 84, 25);
		frame.getContentPane().add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numeroA = Double.parseDouble(txtVisor.getText());
	            txtVisor.setText(null);
	            operacao = 4;
			}
		});
		btnDiv.setBounds(343, 158, 84, 25);
		frame.getContentPane().add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn4)
		            txtVisor.append("4");
			}
		});
		btn4.setBounds(0, 90, 117, 25);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn5)
		            txtVisor.append("5");
			}
		});
		btn5.setBounds(115, 90, 117, 25);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn6)
		            txtVisor.append("6");
			}
		});
		btn6.setBounds(232, 90, 117, 25);
		frame.getContentPane().add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn8)
		            txtVisor.append("8");
			}
		});
		btn8.setBounds(115, 53, 117, 25);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn7)
		            txtVisor.append("7");
			}
		});
		btn7.setBounds(0, 53, 117, 25);
		frame.getContentPane().add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn9)
		            txtVisor.append("9");
			}
		});
		btn9.setBounds(232, 53, 117, 25);
		frame.getContentPane().add(btn9);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn3)
		            txtVisor.append("3");
			}
		});
		btn3.setBounds(0, 127, 117, 25);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn2)
		            txtVisor.append("2");
			}
		});
		btn2.setBounds(115, 127, 117, 25);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == btn1)
			            txtVisor.append("1");
			}
		});
		btn1.setBounds(232, 127, 117, 25);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn3)
		            txtVisor.append("3");
			}
		});
		btn0.setBounds(115, 158, 117, 25);
		frame.getContentPane().add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		        if (e.getSource() == btnIgual) {
		            numeroB = Double.parseDouble(txtVisor.getText());
		            switch (operacao) {
		            case 1:
		                resultadoFinal = numeroA + numeroB;
		                break;
		 
		            case 2:
		                resultadoFinal = numeroA - numeroB;
		                break;
		 
		            case 3:
		                resultadoFinal = numeroA * numeroB;
		                break;
		 
		            case 4:
		                resultadoFinal = numeroA / numeroB;
		                break;
		            }
		 
		            txtVisor.setText(null);
		            txtVisor.append(String.valueOf(resultadoFinal));
		        }
			}
		});
		btnIgual.setBounds(0, 158, 117, 25);
		frame.getContentPane().add(btnIgual);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
