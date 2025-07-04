import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class x_and_o {
    ArrayList<Integer> playerOne = new ArrayList<>();
    ArrayList<Integer> playerTwo = new ArrayList<>();

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

    void drawgame() {
        myPanel.add(btn1);
        myPanel.add(btn2);
        myPanel.add(btn3);
        myPanel.add(btn4);
        myPanel.add(btn5);
        myPanel.add(btn6);
        myPanel.add(btn7);
        myPanel.add(btn8);
        myPanel.add(btn9);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("O");
                    flag = 0;
                }
                btn1.setEnabled(false);
                checkwinner();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(2);
                    btn2.setEnabled(false);
                    btn2.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(2);
                    btn2.setEnabled(false);
                    btn2.setText("O");
                    flag = 0;
                }
                btn2.setEnabled(false);
                checkwinner();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(3);
                    btn3.setEnabled(false);
                    btn3.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(3);
                    btn3.setEnabled(false);
                    btn3.setText("O");
                    flag = 0;
                }
                btn3.setEnabled(false);
                checkwinner();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(4);
                    btn4.setEnabled(false);
                    btn4.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(4);
                    btn4.setEnabled(false);
                    btn4.setText("O");
                    flag = 0;
                }
                btn4.setEnabled(false);
                checkwinner();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(5);
                    btn5.setEnabled(false);
                    btn5.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(5);
                    btn5.setEnabled(false);
                    btn5.setText("O");
                    flag = 0;
                }
                btn5.setEnabled(false);
                checkwinner();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(6);
                    btn6.setEnabled(false);
                    btn6.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(6);
                    btn6.setEnabled(false);
                    btn6.setText("O");
                    flag = 0;
                }
                btn6.setEnabled(false);
                checkwinner();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(7);
                    btn7.setEnabled(false);
                    btn7.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(7);
                    btn7.setEnabled(false);
                    btn7.setText("O");
                    flag = 0;
                }
                btn7.setEnabled(false);
                checkwinner();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(8);
                    btn8.setEnabled(false);
                    btn8.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(8);
                    btn8.setEnabled(false);
                    btn8.setText("O");
                    flag = 0;
                }
                btn8.setEnabled(false);
                checkwinner();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0) {
                    playerOne.add(9);
                    btn9.setEnabled(false);
                    btn9.setText("X");
                    flag = 1;
                } else if (flag == 1) {
                    playerTwo.add(9);
                    btn9.setEnabled(false);
                    btn9.setText("O");
                    flag = 0;
                }
                btn9.setEnabled(false);
                checkwinner();
            }
        });
//        playerOne.add(1);
//        playerOne.add(2);
//        playerOne.add(3);

        window.add(myPanel);
        window.setSize(300, 300);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        x_and_o xAndO = new x_and_o();
        xAndO.drawgame();
    }

    void checkwinner() {
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }


        if (playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }


        if (playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }


        if (playerOne.contains(3) && playerOne.contains(5) && playerOne.contains(7)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }


        if (playerOne.contains(1) && playerOne.contains(4) && playerOne.contains(7)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }


        if (playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }


        if (playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }


        if (playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9)) {
            JOptionPane.showMessageDialog(null, "Player One Wins!");
            disable_buttons();
        }



        if (playerTwo.contains(1) && playerTwo.contains(2) && playerTwo.contains(3)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }


        if (playerTwo.contains(2) && playerTwo.contains(5) && playerTwo.contains(8)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }


        if (playerTwo.contains(3) && playerTwo.contains(6) && playerTwo.contains(9)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }


        if (playerTwo.contains(3) && playerTwo.contains(5) && playerTwo.contains(7)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }


        if (playerTwo.contains(1) && playerTwo.contains(4) && playerTwo.contains(7)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }


        if (playerTwo.contains(7) && playerTwo.contains(8) && playerTwo.contains(9)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }

        if (playerTwo.contains(4) && playerTwo.contains(5) && playerTwo.contains(6)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }


        if (playerTwo.contains(1) && playerTwo.contains(5) && playerTwo.contains(9)) {
            JOptionPane.showMessageDialog(null, "Player Two Wins!");
            disable_buttons();
        }




    }

    void disable_buttons(){
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        btn4.setVisible(false);
        btn5.setVisible(false);
        btn6.setVisible(false);
        btn7.setVisible(false);
        btn8.setVisible(false);
        btn9.setVisible(false);
    }



}