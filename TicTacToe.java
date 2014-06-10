//TicTacToe game using java swing
//@author Conor Hughes

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class TicTacToe
{
	private String player1title = "Turn: Player 1";
	private String player2title = "Turn: Player 2";
	//tracks player's turn
	private int playermove = 0;
	//displays who's turn it is
	private JLabel playerturn = new JLabel();
	//keeps track of button clicks
	private int [] clicked = new int [9];
	//each button
	private JButton sqr1 = new JButton();	
	private JButton sqr2 = new JButton();	
	private JButton sqr3 = new JButton();	
	private JButton sqr4 = new JButton();	
	private JButton sqr5 = new JButton();	
	private JButton sqr6 = new JButton();	
	private JButton sqr7 = new JButton();	
	private JButton sqr8 = new JButton();	
	private JButton sqr9 = new JButton();	
	//contains which buttons each player has clicked
	private ArrayList <Integer> player1 = new ArrayList<Integer>();
	private ArrayList <Integer> player2 = new ArrayList<Integer>();
	
    public JPanel createContentPane ()
	{
        JPanel panel = new JPanel();
        JPanel buttons = new JPanel(new GridLayout(4, 3, 5, 5));
		Border lineBorder = BorderFactory.createLineBorder(Color.black);
		JPanel screen = new JPanel();
		screen.add(playerturn);
		playerturn.setText(new String(player1title)); //changes according to which player's turn it is
			
			//all 9 buttons using ActionListener
			//check which players turn it is and display X or O accordingly
			//int array clicked makes sure buttons cannot be clicked twice and overwritten
			sqr1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[0] == 1)
					{
						clicked();
					}
					else
					{
						clicked[0]++;
						
						if(playermove == 0)
						{
							sqr1.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(1);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr1.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(1);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
						
			sqr2.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[1] == 1)
					{
						clicked();
					}
					else
					{
						clicked[1]++;
						
						if(playermove == 0)
						{
							sqr2.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(2);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr2.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(2);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
					
			sqr3.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[2] == 1)
					{
						clicked();
					}
					else
					{
						clicked[2]++;
						
						if(playermove == 0)
						{
							sqr3.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(3);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr3.setText(new String("O")); 
							playerturn.setText(new String(player1title));
							player2.add(3);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
					
			sqr4.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[3] == 1)
					{
						clicked();
					}
					else
					{
						clicked[3]++;
						
						if(playermove == 0)
						{
							sqr4.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(4);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr4.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(4);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
				
			sqr5.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[4] == 1)
					{
						clicked();
					}
					else
					{
						clicked[4]++;
						
						if(playermove == 0)
						{
							sqr5.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(5);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr5.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(5);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
					
			sqr6.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[5] == 1)
					{
						clicked();
					}
					else
					{
						clicked[5]++;
						
						if(playermove == 0)
						{
							sqr6.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(6);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr6.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(6);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
					
			sqr7.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[6] == 1)
					{
						clicked();
					}
					else
					{
						clicked[6]++;
						
						if(playermove == 0)
						{
							sqr7.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(7);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr7.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(7);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
						
			sqr8.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[7] == 1)
					{
						clicked();
					}
					else
					{
						clicked[7]++;
						
						if(playermove == 0)
						{
							sqr8.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(8);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr8.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(8);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
					
			sqr9.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(clicked[8] == 1)
					{
						clicked();
					}
					else
					{
						clicked[8]++;
						
						if(playermove == 0)
						{
							sqr9.setText(new String("X")); 
							playerturn.setText(new String(player2title)); 
							player1.add(9);
							playermove = 1;
							winOrDraw(player1, playermove);
						}
						
						else
						{
							sqr9.setText(new String("O")); 
							playerturn.setText(new String(player1title)); 
							player2.add(9);
							playermove = 0;
							winOrDraw(player2, playermove);
						}
					}
				}
			}); 
		
		sqr1.setPreferredSize(new Dimension(70, 70)); 

		buttons.add(sqr1);
		buttons.add(sqr2);
		buttons.add(sqr3);
		buttons.add(sqr4);
		buttons.add(sqr5);
		buttons.add(sqr6);
		buttons.add(sqr7);
		buttons.add(sqr8);
		buttons.add(sqr9);
      
        panel.add(screen);
		panel.add(buttons);
        panel.setOpaque(true);
        return panel;
    }
	
	//displays pop up if player tries to click on an already clicked button
	void clicked()
	{
		JOptionPane.showMessageDialog (null, "That Button Has Already Been Clicked\nPlease Click Another!", "Error", 1);
	}
	
	//checks each turn if the player has a winning combination aka 3 in a row or if the game is a draw
	void winOrDraw(ArrayList player, int playermove)
	{
		//2d int arrray contains all winning combinations
		int combos [] [] = {{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};
		int count = 0;
		
		for(int j = 0; j < 8; j++)
		{
			for(int k = 0; k < 3; k++)
			{
				if(player.contains(combos[j][k]))
				{
					count++;	//increment if player's move contains a winning square
				}
				
				if(count == 3)//if 3 winning squares are contains that player wins
				{
					if(playermove == 1)
					{
						JOptionPane.showMessageDialog (null, "Player 1 Wins", "Game Over", 1);
						System.exit(0);
					}
						
					else
					{
						JOptionPane.showMessageDialog (null, "Player 2 Wins", "Game Over", 1);
						System.exit(0);
					}
				}
			}
			count = 0;
		}
		if(player.size() == 5 && playermove == 1)//if player one has had 5 turns and hasn't won, the game is a draw
		{
			JOptionPane.showMessageDialog (null, "It A Draw!", "Game Over", 1);
			System.exit(0);
		}
	}

    private static void createAndShowGUI() //display Jframe with buttons
	{
        JFrame frame = new JFrame("Tic Tac Toe");

		TicTacToe demo = new TicTacToe();
        frame.setContentPane(demo.createContentPane());
		frame.setPreferredSize(new Dimension(300,320));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
	{
        SwingUtilities.invokeLater(new Runnable() 
		{
            public void run() 
			{
                createAndShowGUI();
            }
        });
    }
}