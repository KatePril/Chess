import java.util.ArrayList;

class Knight extends Piece {
    public Knight(String color, int positionX, int positionY) {
        super(color, 3, positionX, positionY, "knight");
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

        if (getPositionY() >= 2 && getPositionX() >= 1) {
            if (chessBoard[getPositionY() - 2][getPositionX() - 1].isEmpty()) {
                if (chessBoard[getPositionY() - 2][getPositionX() - 1].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 2][getPositionX() - 1].getName());
                }
            } else if (!chessBoard[getPositionY() - 2][getPositionX() - 1].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() - 2][getPositionX() - 1].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() - 2][getPositionX() - 1].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 2][getPositionX() - 1].getName());
                }
            }
        }
        if (getPositionY() >= 2 && getPositionX() < chessBoard[0].length - 1) {
            if (chessBoard[getPositionY() - 2][getPositionX() + 1].isEmpty()) {
                if (chessBoard[getPositionY() - 2][getPositionX() + 1].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 2][getPositionX() + 1].getName());
                }
            } else if (!chessBoard[getPositionY() - 2][getPositionX() + 1].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() - 2][getPositionX() + 1].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() - 2][getPositionX() + 1].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 2][getPositionX() + 1].getName());
                }
            }
        }
        if (getPositionY() >= 1 && getPositionX() >= 2) {
            if (chessBoard[getPositionY() - 1][getPositionX() - 2].isEmpty()) {
                if (chessBoard[getPositionY() - 1][getPositionX() - 2].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() - 2].getName());
                }
            } else if (!chessBoard[getPositionY() - 1][getPositionX() - 2].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() - 1][getPositionX() - 2].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() - 1][getPositionX() - 2].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() - 2].getName());
                }
            }
        }
        if (getPositionY() >= 1 && getPositionX() < chessBoard[0].length - 2) {
            if (chessBoard[getPositionY() - 1][getPositionX() + 2].isEmpty()) {
                if (chessBoard[getPositionY() - 1][getPositionX() + 2].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() + 2].getName());
                }
            } else if (!chessBoard[getPositionY() - 1][getPositionX() + 2].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() - 1][getPositionX() + 2].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() - 1][getPositionX() + 2].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() + 2].getName());
                }
            }
        }
        if (getPositionY() < chessBoard[0].length - 1 && getPositionX() >= 2) {
            if (chessBoard[getPositionY() + 1][getPositionX() - 2].isEmpty()) {
                if (chessBoard[getPositionY() + 1][getPositionX() - 2].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() - 2].getName());
                }
            } else if (!chessBoard[getPositionY() + 1][getPositionX() - 2].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() + 1][getPositionX() - 2].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() + 1][getPositionX() - 2].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() - 2].getName());
                }
            }
        }
        if (getPositionY() < chessBoard[0].length - 1 && getPositionX() < chessBoard[0].length - 2) {
            if (chessBoard[getPositionY() + 1][getPositionX() + 2].isEmpty()) {
                if (chessBoard[getPositionY() + 1][getPositionX() + 2].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() + 2].getName());
                }
            } else if (!chessBoard[getPositionY() + 1][getPositionX() + 2].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() + 1][getPositionX() + 2].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() + 1][getPositionX() + 2].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() + 2].getName());
                }
            }
        }
        if (getPositionY() < chessBoard[0].length - 2 && getPositionX() >= 1) {
            if (chessBoard[getPositionY() + 2][getPositionX() - 1].isEmpty()) {
                if (chessBoard[getPositionY() + 2][getPositionX() - 1].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 2][getPositionX() - 1].getName());
                }
            } else if (!chessBoard[getPositionY() + 2][getPositionX() - 1].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() + 2][getPositionX() - 1].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() + 2][getPositionX() - 1].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 2][getPositionX() - 1].getName());
                }
            }
        }
        if (getPositionY() < chessBoard[0].length - 2 && getPositionX() < chessBoard[0].length - 1) {
            if (chessBoard[getPositionY() + 2][getPositionX() + 1].isEmpty()) {
                if (chessBoard[getPositionY() + 2][getPositionX() + 1].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 2][getPositionX() + 1].getName());
                }
            } else if (!chessBoard[getPositionY() + 2][getPositionX() + 1].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() + 2][getPositionX() + 1].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() + 2][getPositionX() + 1].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 2][getPositionX() + 1].getName());
                }
            }
        }

        if (possibleMoves.size() == 0) {
            return messageAdviseMoves.append("selected knight").toString();
        } else {
            for (String possibleMove : possibleMoves) {
                messageAdviseMoves.append(possibleMove).append(" ");
            }
        }

        return messageAdviseMoves.toString();
    }
}
