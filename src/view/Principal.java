package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) throws Exception {
		FatController fc = new FatController();
		int N = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N: "));
		if (N < 0 || N > 10) {
			while (N < 0 || N > 10) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
				N = Integer.parseInt(JOptionPane.showInputDialog("Insira novamente o valor de N: "));
			}
		}
		
		System.out.println("O fatorial de "+N+" é igual a: "+fc.Fat(N, 1));

	}

}
