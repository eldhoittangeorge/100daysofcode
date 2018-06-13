import java.util.Random;
import java.util.Scanner;

public class battleship{

    public static void main(String args[]){
        int i,j,m,n;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        battleship battleship = new battleship();
        String ground[][] = new String[10][10];
        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                ground[k][l] = " ";
            }
        }
        battleship.layout(ground);

        for (int k = 0; k < 5; k++) {
            do {
                System.out.println("enter the x coordinate");
                i = input.nextInt();
                System.out.println("enter the y coordinate");
                j = input.nextInt();
            } while (ground[i][j] != " " && i > 9 && j > 9 && i < 0 && j < 0);
            ground[i][j] = "1";
            System.out.print("Compute is deploying!!!");
            do {
                m = random.nextInt(10);
                n = random.nextInt(10);
            }while (ground[m][n] != " " && m > 9 && n > 9 && m < 0 && n < 0);
            System.out.println("Computer Deployed");
            ground[m][n] = "2";
        }
        battleship.layout(ground);

        System.out.println("Game Begins!!!");
        int playerShips=5,computesShips=5;

        while(playerShips!=0 || computesShips != 0) {
            do {
                System.out.println("enter the x coordinate");
                i = input.nextInt();
                System.out.println("enter the y coordinate");
                j = input.nextInt();
            } while (i > 9 && j > 9 && i < 0 && j < 0);
            if(ground[i][j] == "2"){
                System.out.println("You sinked an enemy ship");
                ground[i][j] = "!";
                computesShips--;
            }
            else if(ground[i][j] == "1"){
                System.out.println("You sinked your own ship");
                ground[i][j] = "x";
                playerShips--;
            }
            else{
                System.out.println("You missed");
            }

            do {
                m = random.nextInt(10);
                n = random.nextInt(10);
            }while (ground[m][n] != "2" && m > 9 && n > 9 && m < 0 && n < 0);
            if(ground[i][j] == "1"){
                System.out.println("Computer sinked your ship");
                playerShips--;
                ground[i][j] = "!";
            }
            else if(ground[i][j] == "2"){
                System.out.println("Computer sinked it's own ship");
                ground[i][j] = "x";
                computesShips--;
            }
            else{
                System.out.println("Computer missed");
            }


        }
        battleship.layout(ground);


    }


    public void layout(String[][] battleGround){
      System.out.print("   ");
      for(int i=0;i<10;i++)
          System.out.print(i);
      System.out.print("\n");
        for (int i = 0; i < 10; i++) {
          System.out.print(i+" |");
            for (int j = 0; j < 10; j++) {
                if(battleGround[i][j] == "1")
                    System.out.print("@");
                else if(battleGround[i][j] == "2")
                    System.out.print("@");
                else
                    System.out.print(battleGround[i][j]);
            }
            System.out.print("| "+i+"\n");
        }
        System.out.print("   ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

}