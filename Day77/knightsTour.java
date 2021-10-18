import java.util.*;
public class knightTourRecBacktrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of chess board: ");
        int n = sc.nextInt();
        int[][] chess = new int[n][n];

        System.out.print("Enter start row :");
        int r = sc.nextInt();

        System.out.print("Enter start column :");
        int c = sc.nextInt();

        tour(chess,r,c,1);
    }

    // 2s array containing all possible Knight moves
    // col 1 = row movemnt & col 2 = column movemnt
    static int[][] moves = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};

    static int counter = 0;

    public static void tour(int[][] chess, int r, int c, int moveNumber){

        // base case : last position filled
        if(moveNumber == chess.length*chess.length){

            // filling last position
            chess[r][c] = moveNumber;
            // displaying result
            displayBoard(chess);
            // removing knight for next tour
            chess[r][c] = 0;
            return;
        }
        
        // placing the moveNumber in it's position
        chess[r][c] = moveNumber;

        for(int i=0; i<8; i++){
            int rm = r + moves[i][0]; // row move
            int cm = c + moves[i][1]; // col move

            // condtions to actually make this move
            // 1.rm should lie inside chess
            // 2.cm should lie inside chess
            // 3. positon made using rm & cm must be empty}<chess.length && chess[rm][cm] == 0){
                
            if(rm>=0 && rm<chess.length && cm>=0 && cm<chess.length && chess[rm][cm]==0){ 
                tour(chess,rm,cm,moveNumber+1);
            }
        }
        // removing the knight while backtrack
        chess[r][c] = 0;

    }

    public static void displayBoard(int[][] chess){

        counter++;
        System.out.println("Tour Number ~" + counter +": ");

        for(int r = 0; r < chess.length; r++){
            for(int c = 0; c < chess.length; c++){
                System.out.print(chess[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
