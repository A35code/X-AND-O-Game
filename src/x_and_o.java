package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class XandO {
    ArrayList<Integer> playerOne = new ArrayList<>();
    ArrayList<Integer> playerTwo = new ArrayList<>();

    String playerOneName = "Player One";
    String playerTwoName = "Player Two";

    JFrame window = new JFrame("X AND O Game");

    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();

    JPanel myPanel = new JPanel(new GridLayout(3, 3));

    int flag = 0;

    public static void main(String[] args) {
        XandO xandO = new XandO();
        xandO.drawgame();
    }

    void showWelcomeDialog() {
        JDialog welcomeDialog = new JDialog(window, "Welcome", true);
        welcomeDialog.setLayout(new BorderLayout());

        JLabel title = new JLabel("🎮 Welcome to Tic-Tac-Toe!", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        JPanel formPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));

        JTextField player1Field = new JTextField();
        JTextField player2Field = new JTextField();

        formPanel.add(new JLabel("Enter Player 1 name:"));
        formPanel.add(player1Field);
        formPanel.add(new JLabel("Enter Player 2 name:"));
        formPanel.add(player2Field);

        JPanel buttonPanel = new JPanel();
        JButton startBtn = new JButton("Start Game");
        startBtn.setBackground(new Color(0, 123, 255));
        startBtn.setForeground(Color.WHITE);
        startBtn.setFocusPainted(false);
        startBtn.setFont(new Font("Arial", Font.BOLD, 14));
        buttonPanel.add(startBtn);

        startBtn.addActionListener(e -> {
            String name1 = player1Field.getText().trim();
            String name2 = player2Field.getText().trim();
            if (!name1.isEmpty()) playerOneName = name1;
            if (!name2.isEmpty()) playerTwoName = name2;
            welcomeDialog.dispose();
        });

        welcomeDialog.add(title, BorderLayout.NORTH);
        welcomeDialog.add(formPanel, BorderLayout.CENTER);
        welcomeDialog.add(buttonPanel, BorderLayout.SOUTH);
        welcomeDialog.setSize(400, 400);
        welcomeDialog.setLocationRelativeTo(null); // Center on screen
        welcomeDialog.setVisible(true);
    }

    void drawgame() {
        showWelcomeDialog();

        myPanel.add(btn1); myPanel.add(btn2); myPanel.add(btn3);
        myPanel.add(btn4); myPanel.add(btn5); myPanel.add(btn6);
        myPanel.add(btn7); myPanel.add(btn8); myPanel.add(btn9);

        addAction(btn1, 1);
        addAction(btn2, 2);
        addAction(btn3, 3);
        addAction(btn4, 4);
        addAction(btn5, 5);
        addAction(btn6, 6);
        addAction(btn7, 7);
        addAction(btn8, 8);
        addAction(btn9, 9);

        window.add(myPanel);
        window.setSize(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    void addAction(JButton button, int position) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(position);
                    button.setText("X");
                    flag = 1;
                } else {
                    playerTwo.add(position);
                    button.setText("O");
                    flag = 0;
                }
                button.setEnabled(false);
                checkwinner();
            }
        });
    }

    void checkwinner() {
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3) ||
                playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6) ||
                playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9) ||
                playerOne.contains(1) && playerOne.contains(4) && playerOne.contains(7) ||
                playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8) ||
                playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9) ||
                playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9) ||
                playerOne.contains(3) && playerOne.contains(5) && playerOne.contains(7)) {
            JOptionPane.showMessageDialog(null, playerOneName + " Wins!");
            disable_buttons();
            return;
        }

        if (playerTwo.contains(1) && playerTwo.contains(2) && playerTwo.contains(3) ||
                playerTwo.contains(4) && playerTwo.contains(5) && playerTwo.contains(6) ||
                playerTwo.contains(7) && playerTwo.contains(8) && playerTwo.contains(9) ||
                playerTwo.contains(1) && playerTwo.contains(4) && playerTwo.contains(7) ||
                playerTwo.contains(2) && playerTwo.contains(5) && playerTwo.contains(8) ||
                playerTwo.contains(3) && playerTwo.contains(6) && playerTwo.contains(9) ||
                playerTwo.contains(1) && playerTwo.contains(5) && playerTwo.contains(9) ||
                playerTwo.contains(3) && playerTwo.contains(5) && playerTwo.contains(7)) {
            JOptionPane.showMessageDialog(null, playerTwoName + " Wins!");
            disable_buttons();
            return;
        }

        if (playerOne.size() + playerTwo.size() == 9) {
            JOptionPane.showMessageDialog(null, "It's a Draw!");
            disable_buttons();
        }
    }

    void disable_buttons() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
}
