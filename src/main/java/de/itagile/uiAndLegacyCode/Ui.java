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

	private TextMunger textMunger = new TextMunger();

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
				String inputText = input.getText();
				String outputText = "Result: ";
				outputText += textMunger.reverseText(inputText);
				label.setText(outputText);
			}
		});

		mainPanel.add(doItButton, BorderLayout.CENTER);
	}

}
