class TicTacToe{
    char[][] Board;

    public TicTacToe(){
        Board = new char[3][3];
        initBoard();
    }

    void initBoard(){
        for(int i = 0; i < Board.length; i++){
            for(int j = 0; j < Board[i].length; j++){
                Board[i][j] = ' ';
            }
        }

    };

    
    void dispBoard(){
        System.out.println("-------------");
        for (int i = 0; i < Board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < Board[i].length; j++) {
                System.out.print(Board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    };




    public class LaunchGame{
        public static void main(String[] args) {
            TicTacToe t = new TicTacToe();
            t.dispBoard();
        }
    }
}