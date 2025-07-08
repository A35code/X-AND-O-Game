import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class x_and_o {
    ArrayList<Integer> playerOne = new ArrayList<>();
    ArrayList<Integer> playerTwo = new ArrayList<>();

    String playerOneName = "Player One";
    String playerTwoName = "Player Two";

    JFrame window = new JFrame("X AND O Game");

    int gameCount = 0;
    int playerOneWins = 0;
    int playerTwoWins = 0;
    int playerOneLosses = 0;
    int playerTwoLosses = 0;
    int draw = 0;

    JLabel scoreboard = new JLabel();
    JPanel title_panel = new JPanel();
    JTextField textField = new JTextField();

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

    final Color X_COLOR = new Color(220, 20, 60);

    final Color O_COLOR = new Color(0, 70, 190);

    boolean startWithX = true;

    boolean player1_turn;

    boolean roundOver = false;


    int flag = 0;

    public static void main(String[] args) {
        x_and_o xandO = new x_and_o();
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
        welcomeDialog.setLocationRelativeTo(null);
        welcomeDialog.setVisible(true);
    }

    void drawgame() {
        showWelcomeDialog();

        myPanel.add(btn1); myPanel.add(btn2); myPanel.add(btn3);
        myPanel.add(btn4); myPanel.add(btn5); myPanel.add(btn6);
        myPanel.add(btn7); myPanel.add(btn8); myPanel.add(btn9);

        scoreboard.setHorizontalAlignment(SwingConstants.CENTER);
        scoreboard.setFont(new Font("Arial", Font.BOLD, 14));
        window.add(scoreboard, BorderLayout.SOUTH);
        updateBoard();

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("X");
                    btn1.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn1.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("O");
                    btn1.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn1.setBackground(O_COLOR);
                    flag = 0;
                }
                btn1.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(2);
                    btn2.setEnabled(false);
                    btn2.setText("X");
                    btn2.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn2.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(2);
                    btn2.setEnabled(false);
                    btn2.setText("O");
                    btn2.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn2.setForeground(new Color(0, 0, 255));
                    btn2.setBackground(O_COLOR);
                    flag = 0;
                }
                btn2.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(3);
                    btn3.setEnabled(false);
                    btn3.setText("X");
                    btn3.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn3.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(3);
                    btn3.setEnabled(false);
                    btn3.setText("O");
                    btn3.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn3.setBackground(O_COLOR);
                    flag = 0;
                }
                btn3.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(4);
                    btn4.setEnabled(false);
                    btn4.setText("X");
                    btn4.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn4.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(4);
                    btn4.setEnabled(false);
                    btn4.setText("O");
                    btn4.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn4.setBackground(O_COLOR);
                    flag = 0;
                }
                btn4.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(5);
                    btn5.setEnabled(false);
                    btn5.setText("X");
                    btn5.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn5.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(5);
                    btn5.setEnabled(false);
                    btn5.setText("O");
                    btn5.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn5.setBackground(O_COLOR);
                    flag = 0;
                }
                btn5.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(6);
                    btn6.setEnabled(false);
                    btn6.setText("X");
                    btn6.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn6.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(6);
                    btn6.setEnabled(false);
                    btn6.setText("O");
                    btn6.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn6.setBackground(O_COLOR);
                    btn6.setForeground(new Color(0, 0, 255));
                    flag = 0;
                }
                btn6.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(7);
                    btn7.setEnabled(false);
                    btn7.setText("X");
                    btn7.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn7.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(7);
                    btn7.setEnabled(false);
                    btn7.setText("O");
                    btn7.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn7.setBackground(O_COLOR);
                    flag = 0;
                }
                btn7.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(8);
                    btn8.setEnabled(false);
                    btn8.setText("X");
                    btn8.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn8.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(8);
                    btn8.setEnabled(false);
                    btn8.setText("O");
                    btn8.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn8.setBackground(O_COLOR);
                    flag = 0;
                }
                btn8.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(9);
                    btn9.setEnabled(false);
                    btn9.setText("X");
                    btn9.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn9.setBackground(X_COLOR);
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(9);
                    btn9.setEnabled(false);
                    btn9.setText("O");
                    btn9.setFont(new Font("MV Boli", Font.BOLD, 120));
                    btn9.setBackground(O_COLOR);
                    flag = 0;
                }
                btn9.setEnabled(false);
                checkwinner();
                if (!roundOver) updateTurnIndicator();
            }
        });


        window.add(myPanel);
        window.setSize(800, 800);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        firstTurn();

        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 25, 25));
        textField.setFont(new Font("Arial", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("X-AND-O");
        textField.setForeground(new Color(140, 0, 140));
        textField.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);
        title_panel.add(textField);
        window.add(title_panel, BorderLayout.NORTH);
        window.add(myPanel);

    }

    void checkwinner() {
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)) {
            highlightWinningButtons(btn1, btn2, btn3);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(1, 2, 3);
            roundOver = true;
            disable_buttons();
            showScoreboardFrame();
        }

        if (playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8)) {
            highlightWinningButtons(btn2, btn5, btn8);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(2, 5, 8);
            roundOver = true;
            disable_buttons();
            showScoreboardFrame();
        }

        if (playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9)) {
            highlightWinningButtons(btn3, btn6, btn9);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(3, 6, 9);
            roundOver = true;
            disable_buttons();
            showScoreboardFrame();
        }

        if (playerOne.contains(3) && playerOne.contains(5) && playerOne.contains(7)) {
            highlightWinningButtons(btn3, btn5, btn7);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(3, 5, 7);
            roundOver = true;
            disable_buttons();
            showScoreboardFrame();

        }

        if (playerOne.contains(1) && playerOne.contains(4) && playerOne.contains(7)) {
            highlightWinningButtons(btn1, btn4, btn7);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(1, 4, 7);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9)) {
            highlightWinningButtons(btn7, btn8, btn9);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(7, 8, 9);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6)) {
            highlightWinningButtons(btn4, btn5, btn6);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(4, 5, 6);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9)) {
            highlightWinningButtons(btn1, btn5, btn9);
            playerOneWins++;
            playerTwoLosses++;
            gameCount++;
            xWins(1, 5, 9);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(1) && playerTwo.contains(2) && playerTwo.contains(3)) {
            highlightWinningButtons(btn1, btn2, btn3);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(1, 2, 3);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(2) && playerTwo.contains(5) && playerTwo.contains(8)) {
            highlightWinningButtons(btn2, btn5, btn8);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(2, 5, 8);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(3) && playerTwo.contains(6) && playerTwo.contains(9)) {
            highlightWinningButtons(btn3, btn6, btn9);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(3, 6, 9);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(3) && playerTwo.contains(5) && playerTwo.contains(7)) {
            highlightWinningButtons(btn3, btn5, btn7);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(3, 5, 7);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(1) && playerTwo.contains(4) && playerTwo.contains(7)) {
            highlightWinningButtons(btn1, btn4, btn7);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(1, 4, 7);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(7) && playerTwo.contains(8) && playerTwo.contains(9)) {
            highlightWinningButtons(btn7, btn8, btn9);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(7, 8, 9);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(4) && playerTwo.contains(5) && playerTwo.contains(6)) {
            highlightWinningButtons(btn4, btn5, btn6);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(4, 5, 6);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerTwo.contains(1) && playerTwo.contains(5) && playerTwo.contains(9)) {
            highlightWinningButtons(btn1, btn5, btn9);
            playerTwoWins++;
            playerOneLosses++;
            gameCount++;
            oWins(1, 5, 9);
            roundOver = true;
            showScoreboardFrame();
            disable_buttons();
        }

        if (playerOne.size() + playerTwo.size() == 9) {
            gameCount++;
            draw++;
            nowin();
            roundOver = true;
            disable_buttons();
            showScoreboardFrame();
        }

    }

    void disable_buttons() {
        JButton[] buttons = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 };
        for (JButton b : buttons)
            b.setEnabled(false);
    }

    void highlightWinningButtons(JButton b1, JButton b2, JButton b3) {
        Color winColor = new Color(144, 238, 144);
        b1.setBackground(winColor);
        b2.setBackground(winColor);
        b3.setBackground(winColor);

    }



    void showScoreboardFrame() {
    JFrame scoreboardFrame = new JFrame("Scoreboard");
    scoreboardFrame.setSize(400, 400);
    scoreboardFrame.setLocationRelativeTo(null);
    scoreboardFrame.setLayout(new GridLayout(6, 1));

    JLabel gameCountLabel = new JLabel("Games Played: " + gameCount, JLabel.CENTER);
    JLabel player1Stats = new JLabel(playerOneName + " - Wins: " + playerOneWins
            + " | Losses: " + playerOneLosses, JLabel.CENTER);
    JLabel player2Stats = new JLabel(playerTwoName + " - Wins: " + playerTwoWins
            + " | Losses: " + playerTwoLosses, JLabel.CENTER);
    JLabel draw_game = new JLabel("Games Drawn: " + draw, JLabel.CENTER);
    JButton restartBtn = new JButton("Restart Round");
    restartBtn.addActionListener(e -> {
        scoreboardFrame.dispose();
        resetGame();
    });

    JButton closeButton = new JButton("Exit");
    closeButton.addActionListener(e -> System.exit(0));

    scoreboardFrame.add(gameCountLabel);
    scoreboardFrame.add(player1Stats);
    scoreboardFrame.add(player2Stats);
    scoreboardFrame.add(draw_game);
    scoreboardFrame.add(restartBtn);
    scoreboardFrame.add(closeButton);

    scoreboardFrame.setVisible(true);
}

private void resetGame() {
    playerOne.clear();
    playerTwo.clear();
    flag = 0;

    JButton[] buttons = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 };
    for (JButton b : buttons) {
        b.setText("");
        b.setEnabled(true);
        b.setBackground(null);
    }
    updateBoard();
    resetTitlePanel();
    roundOver = false;
    firstTurn();
}
    private void updateBoard() {
        scoreboard.setText(
            "Games: " + gameCount +
                    "   |   " + playerOneName + " – Wins: " + playerOneWins +
                    ", Losses: " + playerOneLosses +
                    "   |   " + playerTwoName + " – Wins: " + playerTwoWins +
                    ", Losses: " + playerTwoLosses);

        }

        String statsMessage() {
            return "Games Played: " + gameCount +
            "\n" + playerOneName + " – Wins: " + playerOneWins + ", Losses: " + playerOneLosses +
            "\n" + playerTwoName + " – Wins: " + playerTwoWins + ", Losses: " + playerTwoLosses;
            }

        private void endRound() {
            disable_buttons();
            updateBoard();
            resetTitlePanel();
        }

        public void xWins(int a, int c, int e) {
            JButton[] buttons = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 };

            for (JButton b : buttons) {
                b.setEnabled(false);
            }
            textField.setText(playerOneName + " wins");
            textField.setForeground(new Color(0, 210, 45));
        }

    public void oWins(int a, int c, int e) {
        JButton[] buttons = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 };

        for (JButton b : buttons) {
            b.setEnabled(false);
        }
        textField.setText(playerTwoName + " wins");
        textField.setForeground(new Color(0, 210, 45));

    }
        public void nowin(){
            textField.setText("Tie game!");
            textField.setForeground(new Color(255, 165, 0));
        }

    void resetTitlePanel() {
        textField.setText("X-AND-O");
        textField.setForeground(new Color(140,0,140));

    }

    void firstTurn() {

        new javax.swing.Timer(1000, e -> {

            player1_turn = startWithX;
            flag        = player1_turn ?  0 : 1;

            if (player1_turn) {
                textField.setForeground(X_COLOR);
            } else {
                textField.setForeground(O_COLOR);
            }
            updateTurnIndicator();

            startWithX = !startWithX;
            ((javax.swing.Timer) e.getSource()).stop();
        }).start();
    }

    void updateTurnIndicator() {
        if (flag == 0) {
            textField.setText(playerOneName + " Turn");
            textField.setForeground(X_COLOR);
        } else {
            textField.setText(playerTwoName + " Turn");
            textField.setForeground(O_COLOR);
        }

    }
}

