# TicTacToe

                        Welcome to Tic Tac Toe
position of locations are here!
-------------
| 1 | 2 | 3 | 
-------------
| 4 | 5 | 6 | 
-------------
| 7 | 8 | 9 | 
-------------

i have taken 2d array to make a board . in that bloard,i have taken the positions listed above. i will update the values everytime for both of mentioned functions.and there are 2 methods which will confirm win and draw of both opponents.and a method to generate place when computer needs a place.
In both methods, win methods checks every row, every column, and diagnols for sequential x or o. if present ,then it will return 10 for x case and -10 for o case to win
and in draw method, i will check that all positions are completely placed or not.
and find bestmove and min max are for computer generated positions. 
and last function, Display to display the board at that particular point of time.
there are 2 functions available here
1) one is player vs player 
2) another is player vs Computer

1)in player vs player , both players will enter their places sequentially. and the first player symbol will be x and second player symbol will be o .
and every time i will check win and draw case and go for next . 
Next -method does change of current player character.
at anypoint of time, if anyone wins or draw then it will exit with sending that response. 

2)player vs computer , in this one player will enter values and then computer needs to generate positions for counteracting (semi counteraction) to atleast defend the opponent.and position will be taken player 2 input , so that it replicates the player vs player version

in generating position, i will check sequentially possibilities to defend and winning the game . i will take the first one using min max algorithm recursively
