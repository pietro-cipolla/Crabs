package modulo5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Craps {
	
	static int dado1, dado2;

	public static void main(String[] args) {
		
		int risultatoLancio; 
		int punteggio = 0;
		
		String output = "";
		
		JTextArea outputArea;
		outputArea = new JTextArea(7, 20);
		
		boolean primoLancio = true; 
		
		while(true) {
			risultatoLancio = lancia2Dadi();
			
			if(primoLancio == true) {
				JOptionPane.showMessageDialog(null, "Clicca su 'OK' per iniziare a giocare");
				
				switch(risultatoLancio) {
				case 7: case 11:
					output = ("Dado 1 = " +dado1
							 +"\tDado 2 = " +dado2
							 +"\nSomma = " +risultatoLancio
							 +"\n\nHai vinto!");
					break;
				case 2: case 3: case 12:
					output = ("Dado 1 = " +dado1
							 +"\tDado 2 = " +dado2
							 +"\nSomma = " +risultatoLancio
							 +"\n\nHai perso!");
					break;
				default:
					output = ("Dado 1 = " +dado1
							 +"\tDado 2 = " +dado2
							 +"\nSomma = " +risultatoLancio
							 +"\n\nRitenta!");
					punteggio = risultatoLancio;
					primoLancio = false;
					break;
				}//fine	switch(risultato)
				
			}//fine if (primoLancio == true)
			
			else {
				if (risultatoLancio == punteggio) {
					output = ("Dado 1 = " +dado1
		 					+"\tDado 2 = " +dado2
		 					+"\nSomma = " +risultatoLancio
		 					+"\nIl punteggio per vincere è "+punteggio 
		 					+"\n\nHai vinto!");
					primoLancio = true;
				}//fine if (risultatoLancio == punteggio)
				else if (risultatoLancio == 7)
				{
					output = ("Dado 1 = " +dado1
		 					+"\tDado 2 = " +dado2
		 					+"\nE' uscito 7 " 
		 					+"\n\nHai perso!");
					primoLancio = true;
				}//fine else if (risultaoLancio == 7)
				else
					output = ("Dado 1 = " +dado1
		 					+"\tDado 2 = " +dado2
		 					+"\nSomma = " +risultatoLancio
		 					+"\nIl punteggio per vincere è " +punteggio 
		 					+"\n\nRitenta!");
				}//fine else
			
			outputArea.setText(output);
			outputArea.setEditable(false);
			JOptionPane.showMessageDialog(null, outputArea);
			
					
		}//fine while (statoGioco == CONTINUA) 
		
			
	}//fine metodo main/////////////////////////////////////////////////////

	public static int lancia2Dadi() {

		int risultatoLancio;

		dado1 = 1 + (int) (Math.random() * 6);
		dado2 = 1 + (int) (Math.random() * 6);
		risultatoLancio = dado1 + dado2;

		return risultatoLancio;

	}// fine metodo lancia2dadi()///////////////
	
}// fine classe Crabs
