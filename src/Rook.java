import java.util.ArrayList;

class Rook extends Piece {
    public Rook(String color, int positionX, int positionY) {
        super(color, 5, positionX, positionY, "rook");
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
        StringBuilder message = new StringBuilder("Move is possible");
        ArrayList<String> possibleMoves = new ArrayList<String>();

        for (int k = getPositionY() - 1; k > -1; k--) {
            if (chessBoard[k][getPositionX()].isEmpty()) {
                if (chessBoard[k][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[k][getPositionX()].getName());
                }
            } else if (!chessBoard[k][getPositionX()].getPiece().getColor().equals(color)) {
                if (chessBoard[k][getPositionX()].getName().equals(squireName)) {
                    if (chessBoard[k][getPositionX()].getPiece().getName().equals("king")) {
                        return messagePossible.append("(it's  check)").toString();
                    } else {
                        return messagePossible.append("(").append(chessBoard[k][getPositionX()].getPiece().getName()).append("will be killed)").toString();
                    }
                } else {
                    possibleMoves.add(chessBoard[k][getPositionX()].getName());
                }
            } else {
                break;
            }
        }
        for (int k = getPositionY() + 1; k < chessBoard.length; k++) {
            if (chessBoard[k][getPositionX()].isEmpty()) {
                if (chessBoard[k][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[k][getPositionX()].getName());
                }
            } else if (!chessBoard[k][getPositionX()].getPiece().getColor().equals(color)) {
                if (chessBoard[k][getPositionX()].getName().equals(squireName)) {
                    if (chessBoard[k][getPositionX()].getPiece().getName().equals("king")) {
                        return messagePossible.append("(it's  check)").toString();
                    } else {
                        return messagePossible.append("(").append(chessBoard[k][getPositionX()].getPiece().getName()).append("will be killed)").toString();
                    }
                } else {
                    possibleMoves.add(chessBoard[k][getPositionX()].getName());
                }
            } else {
                break;
            }
        }
        for (int k = getPositionX() - 1; k > -1; k--) {
            if (chessBoard[getPositionY()][k].isEmpty()) {
                if (chessBoard[getPositionY()][k].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][k].getName());
                }
            } else if (!chessBoard[getPositionY()][k].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY()][k].getName().equals(squireName)) {
                    if (chessBoard[getPositionY()][k].getPiece().getName().equals("king")) {
                        return messagePossible.append("(it's  check)").toString();
                    } else {
                        return messagePossible.append("(").append(chessBoard[getPositionY()][k].getPiece().getName()).append("will be killed)").toString();
                    }
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][k].getName());
                }
            } else {
                break;
            }
        }
        for (int k = getPositionX() + 1; k < chessBoard[0].length; k++) {
            if (chessBoard[getPositionY()][k].isEmpty()) {
                if (chessBoard[getPositionY()][k].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][k].getName());
                }
            } else if (!chessBoard[getPositionY()][k].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY()][k].getName().equals(squireName)) {
                    if (chessBoard[getPositionY()][k].getPiece().getName().equals("king")) {
                        return messagePossible.append("(it's  check)").toString();
                    } else {
                        return messagePossible.append("(").append(chessBoard[getPositionY()][k].getPiece().getName()).append("will be killed)").toString();
                    }
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][k].getName());
                }
            } else {
                break;
            }
        }

        if (possibleMoves.size() == 0) {
            return messageImpossible.append("selected rook").toString();
        } else {
            for (String possibleMove : possibleMoves) {
                messageAdviseMoves.append(possibleMove).append(" ");
            }
        }

        return messageAdviseMoves.toString();
    }
}
