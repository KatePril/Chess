class ChessBoard {
    private Square[][] chessBoard;

    /**
     * Creates chess board
     */

    private void createChessBoard() {
        Square[][] tmpBoard = new Square[8][8];
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String tmp = letters[j] + numbers[i];
                if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                    tmpBoard[i][j] = new Square(tmp, "black");
                } else {
                    tmpBoard[i][j] = new Square(tmp, "white");
                }
            }
        }

        chessBoard = tmpBoard;
    }

    /**
     * Sets start positions of pieces
     */

    public void setStartPositionOfPeaces() {
        createChessBoard();
        System.out.println("Chess board is created...");

        setPlayersPosition("black", 0, 1);
        System.out.println("Position of black pieces is set...");
        setPlayersPosition("white", 7, 6);
        System.out.println("Position of white pieces is set...");
    }

    /**
     * Sets start positions of pieces of each player
     *
     * @param color
     * @param firstRow
     * @param secondRow
     */

    private void setPlayersPosition(String color, int firstRow, int secondRow) {
        chessBoard[firstRow][0].setPiece(new Rook(color, 0, firstRow));
        chessBoard[firstRow][1].setPiece(new Knight(color, 1, firstRow));
        chessBoard[firstRow][2].setPiece(new Bishop(color, 2, firstRow));
        chessBoard[firstRow][4].setPiece(new Queen(color, 3, firstRow));
        chessBoard[firstRow][3].setPiece(new King(color, 4, firstRow));
        chessBoard[firstRow][5].setPiece(new Bishop(color, 5, firstRow));
        chessBoard[firstRow][6].setPiece(new Knight(color, 6, firstRow));
        chessBoard[firstRow][7].setPiece(new Rook(color, 7, firstRow));

        for (int i = 0; i < 8; i++) {
            chessBoard[secondRow][i].setPiece(new Pawn(color, i, secondRow));
        }
    }

    public Square[][] getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(Square[][] chessBoard) {
        this.chessBoard = chessBoard;
    }
}
