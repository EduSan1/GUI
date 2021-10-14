package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameNewClient {

	public void criarTela() {

		JFrame frameOne = new JFrame();
		Color corFrame = new Color(235, 255, 255);
//		frameOne.setSize(400, 600);
		frameOne.setPreferredSize(new Dimension(400, 600));
		frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameOne.getContentPane().setBackground(corFrame);
		frameOne.pack();
		frameOne.setTitle("Minha Janela");
		frameOne.setLayout(null);

		// Criar os componentes de tela1

		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual sua idade?");
		lblIdade.setBounds(25, 25, 150, 20);

		// Criar textField

		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(25, 50, 200, 20);
		frameOne.getContentPane().add(txtIdade);

		// Criar um button

		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(230, 50, 100, 20);

		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultado");
		lblResultado.setBounds(25, 80, 150, 20);

		JLabel lblMaior = new JLabel();
		lblMaior.setText("Você é maior de idade!");
		lblMaior.setBounds(125, 400, 150, 20);

		frameOne.getContentPane().add(btnVerificar);
		frameOne.getContentPane().add(lblResultado);
		frameOne.getContentPane().add(lblIdade);

		// ********** Listener de eventos ***********
		// --- Mouse

		txtIdade.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				
				System.out.println("soltei o botão");

			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				System.out.println("apertei o botão");

			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				System.out.println("sai o botão");

			}

			@Override
			public void mouseEntered(MouseEvent e) {

				System.out.println("CHEGUEI");
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				System.out.println("clicou");
				
			}
		});

		frameOne.setVisible(true);

	}

}
