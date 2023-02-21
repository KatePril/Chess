import java.util.ArrayList;

public class King extends Piece {
    public King(String color, int positionX, int positionY) {
        super(color, (int) Double.POSITIVE_INFINITY, positionX, positionY, "king");
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

        if (getPositionY() > 0) {
            if (chessBoard[getPositionY() - 1][getPositionX()].isEmpty()) {
                if (chessBoard[getPositionY() - 1][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX()].getName());
                }
            } else if (!chessBoard[getPositionY() - 1][getPositionX()].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() - 1][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() - 1][getPositionX()].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX()].getName());
                }
            }
            if (getPositionX() > 0) {
                if (chessBoard[getPositionY() - 1][getPositionX() - 1].isEmpty()) {
                    if (chessBoard[getPositionY() - 1][getPositionX() - 1].getName().equals(squireName)) {
                        return messagePossible.toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() - 1].getName());
                    }
                } else if (!chessBoard[getPositionY() - 1][getPositionX() - 1].getPiece().getColor().equals(color)) {
                    if (chessBoard[getPositionY() - 1][getPositionX() - 1].getName().equals(squireName)) {
                        return messagePossible.append("(").append(chessBoard[getPositionY() - 1][getPositionX() - 1].getPiece().getName()).append("will be killed)").toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() - 1].getName());
                    }
                }
            }
            if (getPositionX() < chessBoard[0].length - 1) {
                if (chessBoard[getPositionY() - 1][getPositionX() + 1].isEmpty()) {
                    if (chessBoard[getPositionY() - 1][getPositionX() + 1].getName().equals(squireName)) {
                        return messagePossible.toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() + 1].getName());
                    }
                } else if (!chessBoard[getPositionY() - 1][getPositionX() + 1].getPiece().getColor().equals(color)) {
                    if (chessBoard[getPositionY() - 1][getPositionX() + 1].getName().equals(squireName)) {
                        return messagePossible.append("(").append(chessBoard[getPositionY() - 1][getPositionX() + 1].getPiece().getName()).append("will be killed)").toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() - 1][getPositionX() + 1].getName());
                    }
                }
            }
        }
        if (getPositionY() < chessBoard.length - 1) {
            if (chessBoard[getPositionY() + 1][getPositionX()].isEmpty()) {
                if (chessBoard[getPositionY() + 1][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[positionY + 1][getPositionX()].getName());
                }
            } else if (!chessBoard[getPositionY() + 1][getPositionX()].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY() + 1][getPositionX()].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() + 1][getPositionX()].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX()].getName());
                }
            }
            if (getPositionX() > 0) {
                if (chessBoard[getPositionY() + 1][getPositionX() - 1].isEmpty()) {
                    if (chessBoard[getPositionY() + 1][getPositionX() - 1].getName().equals(squireName)) {
                        return messagePossible.toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() - 1].getName());
                    }
                } else if (!chessBoard[getPositionY() + 1][getPositionX() - 1].getPiece().getColor().equals(color)) {
                    if (chessBoard[getPositionY() + 1][getPositionX() - 1].getName().equals(squireName)) {
                        return messagePossible.append("(").append(chessBoard[getPositionY() + 1][getPositionX() - 1].getPiece().getName()).append("will be killed)").toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() - 1].getName());
                    }
                }
            }
            if (getPositionX() < chessBoard[0].length - 1) {
                if (chessBoard[getPositionY() + 1][getPositionX() + 1].isEmpty()) {
                    if (chessBoard[getPositionY() + 1][getPositionX() + 1].getName().equals(squireName)) {
                        return messagePossible.toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() + 1][positionX + 1].getName());
                    }
                } else if (!chessBoard[getPositionY() + 1][getPositionX() + 1].getPiece().getColor().equals(color)) {
                    if (chessBoard[getPositionY() + 1][getPositionX() + 1].getName().equals(squireName)) {
                        return messagePossible.append("(").append(chessBoard[getPositionY() + 1][getPositionX() + 1].getPiece().getName()).append("will be killed)").toString();
                    } else {
                        possibleMoves.add(chessBoard[getPositionY() + 1][getPositionX() + 1].getName());
                    }
                }
            }
        }
        if (getPositionX() > 0) {
            if (chessBoard[getPositionY()][getPositionX() - 1].isEmpty()) {
                if (chessBoard[getPositionY()][getPositionX() - 1].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][getPositionX() - 1].getName());
                }
            } else if (!chessBoard[getPositionY()][getPositionX() - 1].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY()][getPositionX() - 1].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY()][getPositionX() - 1].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][getPositionX() - 1].getName());
                }
            }
        }
        if (getPositionX() < chessBoard[0].length - 1) {
            if (chessBoard[getPositionY()][getPositionX() + 1].isEmpty()) {
                if (chessBoard[getPositionY()][getPositionX() + 1].getName().equals(squireName)) {
                    return messagePossible.toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][getPositionX() + 1].getName());
                }
            } else if (!chessBoard[getPositionY()][getPositionX() + 1].getPiece().getColor().equals(color)) {
                if (chessBoard[getPositionY()][getPositionX() + 1].getName().equals(squireName)) {
                    return messagePossible.append("(").append(chessBoard[getPositionY() - 1][getPositionX() + 1].getPiece().getName()).append("will be killed)").toString();
                } else {
                    possibleMoves.add(chessBoard[getPositionY()][getPositionX() + 1].getName());
                }
            }
        }


        if (possibleMoves.size() == 0) {
            return messageImpossible.append("king").toString();
        } else {
            for (String possibleMove : possibleMoves) {
                messageAdviseMoves.append(possibleMove).append(" ");
            }
        }

        return messageAdviseMoves.toString();
    }

    /**
     * This method makes the king's move
     *
     * @param squireName
     * @param chessBoard
     * @return
     */

    @Override
    public String move(String squireName, Square[][] chessBoard) {
        String message = checkMovePossibility(squireName, chessBoard);
        if (message.contains(messagePossible.toString())) {
            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard[0].length; j++) {
                    if (chessBoard[i][j].getName().equals(squireName)) {
                        if (!chessBoard[i][j].isEmpty() && !chessBoard[i][j].getPiece().getColor().equals(color)) {
                            System.out.println(chessBoard[i][j].getPiece().getName() + "was killed");
                        }
                        chessBoard[i][j].setPiece(chessBoard[positionY][positionX].getPiece());
                        chessBoard[i][j].getPiece().setPositionY(i);
                        chessBoard[i][j].getPiece().setPositionX(j);
                        chessBoard[positionY][positionX].setPiece(null);
                        return "Move was made";
                    }
                }
            }
        }

        return message;
    }
}
