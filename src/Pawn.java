import java.util.ArrayList;
import java.util.Scanner;

class Pawn extends Piece {
    public Pawn(String color, int positionX, int positionY) {
        super(color, 1, positionX, positionY, "pawn");
    }

    /**
     * This method checks possibility of the selected move
     *
     * @param squireName
     * @param chessBoard
     * @return
     */

    @Override
    public String checkMovePossibility(String squireName, Square[][] chessBoard) {
        ArrayList<String> possibleMoves = new ArrayList<String>();

        if (color.equals("black")) {
            if (getPositionY() < chessBoard.length - 2) {
                if (chessBoard[getPositionY() + 1][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else if (chessBoard[getPositionY() + 1][getPositionX()].isEmpty()) {
                    possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX()].getName());
                }
                if (getPositionY() < chessBoard.length / 2 - 2) {
                    if (chessBoard[getPositionY() + 2][getPositionX()].getName().equals(squireName)) {
                        return messagePossible.toString();
                    } else if (chessBoard[getPositionY() + 2][getPositionX()].isEmpty()) {
                        possibleMoves.add(chessBoard[getPositionY() + 2][getPositionX()].getName());
                    }
                }
                if (getPositionX() > 0 && getPositionX() < chessBoard[0].length - 1) {
                    if (chessBoard[getPositionY() + 1][getPositionX() + 1].getPiece() != null) {
                        if (chessBoard[getPositionY() + 1][getPositionX() + 1].getPiece().getColor().equals("white")) {
                            if (chessBoard[getPositionY() + 1][getPositionX() + 1].getName().equals(squireName)) {
                                if (chessBoard[getPositionY() + 1][getPositionX() + 1].getPiece().getName().equals("king")) {
                                    return messagePossible.append(" (it's  check)").toString();
                                } else {
                                    return messagePossible.append(" (").append(chessBoard[getPositionY() + 1][getPositionX() + 1].getPiece().getName()).append(" will be killed)").toString();
                                }
                            } else {
                                possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() + 1].getName());
                            }
                        }
                    }
                    if (chessBoard[getPositionY() + 1][getPositionX() - 1].getPiece() != null) {
                        if (chessBoard[getPositionY() + 1][getPositionX() - 1].getPiece().getColor().equals("white")) {
                            if (chessBoard[getPositionY() + 1][getPositionX() - 1].getName().equals(squireName)) {
                                if (chessBoard[getPositionY() + 1][getPositionX() - 1].getPiece().getName().equals("king")) {
                                    return messagePossible.append(" (it's  check)").toString();
                                } else {
                                    return messagePossible.append(" (").append(chessBoard[getPositionY() + 1][getPositionX() - 1].getPiece().getName()).append("will be killed)").toString();
                                }
                            } else {
                                possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() - 1].getName());
                            }
                        }
                    }
                }
            } else {
                if (chessBoard[getPositionY() + 1][getPositionX()].isEmpty()) {
                    if (chessBoard[getPositionY() + 1][getPositionX()].getName().equals(squireName)) {
                        return messagePossible.append(announcePieceForReturn(chessBoard, color)).toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX()].getName());
                    }
                }
            }
        } else {
            if (getPositionY() > 1) {
                if (chessBoard[getPositionY() - 1][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else if (chessBoard[getPositionY() - 1][getPositionX()].isEmpty()) {
                    possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX()].getName());
                }
                if (getPositionY() > chessBoard.length / 2 - 2) {
                    if (chessBoard[getPositionY() - 2][getPositionX()].getName().equals(squireName)) {
                        return messagePossible.toString();
                    } else if (chessBoard[getPositionY() - 2][getPositionX()].isEmpty()) {
                        possibleMoves.add(chessBoard[getPositionY() - 2][getPositionX()].getName());
                    }
                }
                if (getPositionX() > 0 && getPositionX() < chessBoard[0].length - 1) {
                    if (chessBoard[getPositionY() - 1][getPositionX() + 1].getPiece() != null) {
                        if (chessBoard[getPositionY() - 1][getPositionX() + 1].getPiece().getColor().equals("white")) {
                            if (chessBoard[getPositionY() - 1][getPositionX() + 1].getName().equals(squireName)) {
                                if (chessBoard[getPositionY() - 1][getPositionX() + 1].getPiece().getName().equals("king")) {
                                    return messagePossible.append(" (it's  check)").toString();
                                } else {
                                    return messagePossible.append(" (").append(chessBoard[getPositionY() - 1][getPositionX() + 1].getPiece().getName()).append("will be killed)").toString();
                                }
                            } else {
                                possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() + 1].getName());
                            }
                        }
                    }
                    if (chessBoard[getPositionY() - 1][getPositionX() - 1].getPiece() != null) {
                        if (chessBoard[getPositionY() - 1][getPositionX() - 1].getPiece().getColor().equals("white")) {
                            if (chessBoard[getPositionY() - 1][getPositionX() - 1].getName().equals(squireName)) {
                                if (chessBoard[getPositionY() - 1][getPositionX() - 1].getPiece().getName().equals("king")) {
                                    return messagePossible.append(" (it's  check)").toString();
                                } else {
                                    return messagePossible.append(" (").append(chessBoard[getPositionY() - 1][getPositionX() - 1].getPiece().getName()).append("will be killed)").toString();
                                }
                            } else {
                                possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() - 1].getName());
                            }
                        }
                    }
                }
            } else if (getPositionY() == 1) {
                if (chessBoard[getPositionY() - 1][getPositionX()].isEmpty()) {
                    if (chessBoard[getPositionY() - 1][getPositionX()].getName().equals(squireName)) {
                        return messagePossible.append(announcePieceForReturn(chessBoard, color)).toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX()].getName());
                    }
                }
            }
        }

        if (possibleMoves.size() == 0) {
            return messageImpossible.append("selected pawn").toString();
        } else {
            for (String possibleMove : possibleMoves) {
                messageAdviseMoves.append(possibleMove).append(" ");
            }
        }

        return messageAdviseMoves.toString();
    }

    /**
     * Makes pawn's moves, regarding piece's particular abilities
     *
     * @param squireName
     * @param chessBoard
     * @return
     */

    @Override
    public String move(String squireName, Square[][] chessBoard) {
        String message = checkMovePossibility(squireName, chessBoard);
        if (message.contains(messagePossible.toString())) {
            if (message.contains("(it's  check)")) {
                return color + "is the winner";
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

                            if (message.contains("You can return")) {
                                String chosenPiece = choosePieceForReturn(message);
                                switch (chosenPiece) {
                                    case "knight" -> chessBoard[i][j].setPiece(new Knight(color, j, i));
                                    case "rook" -> chessBoard[i][j].setPiece(new Rook(color, j, i));
                                    case "bishop" -> chessBoard[i][j].setPiece(new Bishop(color, j, i));
                                    case "queen" -> chessBoard[i][j].setPiece(new Queen(color, j, i));
                                    default -> System.out.println("Nothing was returned");
                                }
                                if (!(chessBoard[i][j].getPiece() instanceof Pawn)) {
                                    System.out.println(chessBoard[i][j].getPiece().getName() + " was returned");
                                }
                            }

                            return "Move was made";
                        }
                    }
                }
            }
        }

        return message;
    }

    /**
     * Announces which piece can be returned, if pawn reaches the end of the board
     *
     * @param chessBoard
     * @param color
     * @return
     */

    private String announcePieceForReturn(Square[][] chessBoard, String color) {
        StringBuilder message = new StringBuilder(" (You can return");
        int lengthOfMessage = message.length();
        int countKnights = 0;
        int countRooks = 0;
        int countBishops = 0;
        int countQueen = 0;
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if (!chessBoard[i][j].isEmpty()) {
                    if (chessBoard[i][j].getPiece().getColor() == color) {
                        switch (chessBoard[i][j].getPiece().getName()) {
                            case "knight" -> ++countKnights;
                            case "rook" -> ++countRooks;
                            case "bishop" -> ++countBishops;
                            case "queen" -> ++countQueen;
                        }
                    }
                }
            }
        }
        if (countKnights < 2) {
            message.append(" knight");
        }
        if (countRooks < 2) {
            message.append(" rook");
        }
        if (countBishops < 2) {
            message.append(" bishop");
        }
        if (countQueen < 1) {
            message.append(" queen");
        }
        if (message.length() == lengthOfMessage) {
            message.append(" nothing");
        }
        message.append(" in exchange of pawn)");

        return message.toString();
    }

    /**
     * Receives piece's name chosen by player and checks it
     *
     * @param message
     * @return
     */

    private String choosePieceForReturn(String message) {
        ArrayList<String> possibleReturns = new ArrayList<>();
            if (message.contains("knight")) {
                possibleReturns.add("knight");
            }
            if (message.contains("rook")) {
                possibleReturns.add("rook");
            }
            if (message.contains("bishop")) {
                possibleReturns.add("bishop");
            }
            if (message.contains("queen")) {
                possibleReturns.add("queen");
            }
        String chosenPiece = "";
        boolean ifChosen = true;
        while (ifChosen) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose which piece would you like to return (type name (\"stop\" doesn't work here)) ");
            String tmp = scanner.nextLine();
            for (int i = 0; i < possibleReturns.size(); i++) {
                if (possibleReturns.get(i).equals(tmp)) {
                    chosenPiece = tmp;
                    ifChosen = false;
                }
            }
            if (ifChosen) {
                System.out.println("Try again");
            }
        }

        return chosenPiece;
    }

}
