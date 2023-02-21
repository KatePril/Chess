abstract class Piece implements FigureCheckMove {

    /**
     * Constants are used to create messages for user
     */

    protected final StringBuilder messagePossible = new StringBuilder("Move is possible");
    protected final StringBuilder messageAdviseMoves = new StringBuilder("Move to the selected squire isn't possible, but you can move to: ");
    protected final StringBuilder messageImpossible = new StringBuilder("There is no possible moves for ");

    protected String color;
    protected int strength;
    protected int positionX;
    protected int positionY;
    protected String name;

    public Piece(String color, int strength, int positionX, int positionY, String name) {
        this.color = color;
        this.strength = strength;
        this.positionX = positionX;
        this.positionY = positionY;
        this.name = name;
    }

    /**
     * This method moves piece to the selected squire after checking possibility of this move
     *
     * @param squireName
     * @param chessBoard
     * @return
     */

    public String move(String squireName, Square[][] chessBoard) {
        String message = checkMovePossibility(squireName, chessBoard);
        if (message.contains(messagePossible.toString())) {
            if (message.contains("(it's  check)")) {
                return color + " is the winner";
            } else {
                for (int i = 0; i < chessBoard.length; i++) {
                    for (int j = 0; j < chessBoard[0].length; j++) {
                        if (chessBoard[i][j].getName().equals(squireName)) {
                            if (!chessBoard[i][j].isEmpty() && !chessBoard[i][j].getPiece().getColor().equals(color)) {
                                System.out.println(chessBoard[i][j].getPiece().getName() + " was killed");
                            }
                            chessBoard[i][j].setPiece(chessBoard[getPositionY()][getPositionX()].getPiece());
                            chessBoard[getPositionY()][getPositionX()].setPiece(null);
                            setPositionY(i);
                            setPositionX(j);
                            return "Move was made";
                        }
                    }
                }
            }
        }

        return message;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
