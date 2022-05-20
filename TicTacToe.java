import java.util.Scanner;

public class TicTacToe
{
public static void main(String args[])
{
    Board game = new Board();
    int x;
    Scanner in = new Scanner(System.in);
    System.out.print("enter 1 to plyr vs plyr 2 to plyr vs comp");
    x = in.nextInt();
    if(x==2){
    System.out.println("player  x    -   computer  o");
    while(true)
    {
        while(true)
        {
            System.out.print("player, Enter location :");
            x = in.nextInt();
            if(game.update((x-1)/3,(x-1)%3)==true)
            break;
            System.out.print("wrong choice enter again:");
        }
        game.Display();
        game.Next();

        if ((game.Win()==10)||(game.Win()==-10))
        {
            
            System.out.println("player wins");
            System.exit(0);
        }
        else if (game.Draw()==true)
        {
            System.out.println("Appears we have a draw!");
            System.exit(0);
        }
        
        int z=game.findBestMove();
        System.out.println("computer picked"+z);
        game.update((z-1)/3,(z-1)%3);
        game.Display();
        if ((game.Win()==10)||(game.Win()==-10))
        {
            char ab = game.pos();
            if(ab=='x')
            System.out.println("Player wins");
            else
            System.out.println("computer wins");
            System.exit(0);
        }
        else if (game.Draw()==true)
        {
            System.out.println("Appears we have a draw!");
            System.exit(0);
        }
        game.Next();
    }
    }
    if(x==1)
    {
        while(true)
    {
        if(game.pos()=='x')
        System.out.print("player 1, Enter location :");
        else
        System.out.print("player 2, Enter location :");
        
        while(true)
        {
            x = in.nextInt();
            if(game.update((x-1)/3,(x-1)%3)==true)
            break;
            System.out.print("wrong choice enter again:");
        }
        game.Display();
        if ((game.Win()==10)||(game.Win()==-10))
        {
            char ab = game.pos();
            if(ab=='x')
            System.out.println("Player1 wins");
            else
            System.out.println("Player2 wins");
            System.exit(0);
        }
        else if (game.Draw()==true)
        {
            System.out.println("Appears we have a draw!");
            System.exit(0);
        }
        game.Next();
    }
    }
}
}
