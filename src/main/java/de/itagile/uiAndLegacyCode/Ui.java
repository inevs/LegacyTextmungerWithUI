package de.itagile.uiAndLegacyCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JTextField input;
	private JButton doItButton;
	private JLabel label;

	public Ui() {
		initUI();
	}

	public final void initUI() {
		setTitle("Legacy Code and Ui");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		getContentPane().add(mainPanel);
		addTextField();
		addButton();
		addLabel();
	}

	private void addLabel() {
		label = new JLabel("Result:");
		mainPanel.add(label, BorderLayout.SOUTH);
	}

	private void addTextField() {
		input = new JTextField();
		mainPanel.add(input, BorderLayout.NORTH);
	}

	private void addButton() {
		doItButton = new JButton("Do it!");
		doItButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// 1. change point start, add ability to handle multiple words
				// 2. find test points: test this functionality
				String inputText = input.getText();
				String outputText = "Result: ";
				if (inputText.length() >= 4) {
					outputText += inputText.charAt(0) +
							new StringBuffer(inputText.substring(1, inputText.length() - 1)).reverse().toString() +
							inputText.charAt(inputText.length() - 1);
				} else {
					outputText += inputText;
				}
				label.setText(outputText);
				// 1. change point end
			}
		});

		mainPanel.add(doItButton, BorderLayout.CENTER);
	}

}
