// Erweiterte Version des Hauptprogramms
package oop_thema1_bank;

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Hauptprogramm {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// Zufällige Kontogenerierung
		for (int i = 0; i < 5; i++) {
			String kontonummer = String.valueOf(100000 + random.nextInt(900000));
			double startguthaben = 1000 + random.nextDouble() * 9000;
			if (random.nextBoolean()) {
				bank.kontoHinzufuegen(new SparKonto(kontonummer, startguthaben, 2.0));
			} else {
				bank.kontoHinzufuegen(new GiroKonto(kontonummer, startguthaben, 500.0));
			}
		}

		// Konsolenmenü
		while (true) {
			System.out.println("Willkommen beim Banksystem");
			System.out.println("1. Konto hinzufügen");
			System.out.println("2. Konto anzeigen");
			System.out.println("3. Alle Konten anzeigen");
			System.out.println("4. Konto löschen");
			System.out.println("5. Beenden");
			System.out.print("Wählen Sie eine Option: ");
			
			int option = scanner.nextInt();
			scanner.nextLine(); // Puffer leeren
			
			System.out.println();
			
			switch (option) {
			case 1:
				System.out.print("Geben Sie die Kontonummer ein: ");
				String kontonummer = scanner.nextLine();
				System.out.print("Geben Sie den Kontostand ein: ");
				double kontostand = scanner.nextDouble();
				System.out.print("Ist es ein SparKonto (true/false)? ");
				boolean isSparKonto = scanner.nextBoolean();
				if (isSparKonto) {
					bank.kontoHinzufuegen(new SparKonto(kontonummer, kontostand, 2.0));
				} else {
					bank.kontoHinzufuegen(new GiroKonto(kontonummer, kontostand, 500.0));
				}
				break;
			case 2:
				System.out.print("Geben Sie die Kontonummer ein: ");
				String suchKontonummer = scanner.nextLine();
				Bankkonto konto = bank.getKonto(suchKontonummer);
				if (konto != null) {
					System.out.println("Gefundenes Konto:");
					System.out.println(konto);
				} else {
					System.out.println("Konto nicht gefunden.");
				}
				break;
			case 3:
				System.out.println("Alle Konten:");
				bank.zeigeAlleKonten();
				break;
			case 4:
				System.out.print("Geben Sie die Kontonummer ein: ");
				String loeschKontonummer = scanner.nextLine();
				bank.kontoEntfernen(loeschKontonummer);
				break;
			case 5:
				System.out.println("Programm beendet.");
				scanner.close();
				return;
			default:
				System.out.println("Ungültige Option.");
			}
		}
	}

	// GUI-Erstellung
	public static void startGUI(Bank bank) {
		JFrame frame = new JFrame("Banksystem");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		JTextField textField = new JTextField();
		JButton showAllButton = new JButton("Alle Konten anzeigen");
		JButton showOneButton = new JButton("Konto anzeigen");

		showAllButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder builder = new StringBuilder();
				for (Bankkonto konto : bank.getKonten()) {
					builder.append(konto).append("\n");
				}
				textArea.setText(builder.toString());
			}
		});

		showOneButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String kontonummer = textField.getText();
				Bankkonto konto = bank.getKonto(kontonummer);
				if (konto != null) {
					textArea.setText(konto.toString());
				} else {
					textArea.setText("Konto nicht gefunden.");
				}
			}
		});

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(textField, BorderLayout.NORTH);
		panel.add(showOneButton, BorderLayout.WEST);
		panel.add(showAllButton, BorderLayout.EAST);
		panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

		frame.add(panel);
		frame.setVisible(true);
	}
}
