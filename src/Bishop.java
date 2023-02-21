import java.util.ArrayList;

class Bishop extends Piece {
    public Bishop(String color, int positionX, int positionY) {
        super(color, 3, positionX, positionY, "bishop");
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

        if (getPositionY() < getPositionX()) {
            int l = getPositionY();
            for (int k = getPositionX() - 1; k > -1; k--) {
                if (l > 1) {
                    l--;
                    if (chessBoard[k][l].isEmpty()) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else if (!chessBoard[k][l].getPiece().getColor().equals(color)) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            if (chessBoard[k][l].getPiece().getName().equals("king")) {
                                return messagePossible.append(" (it's  check)").toString();
                            } else {
                                return messagePossible.append(" (").append(chessBoard[k][l].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
            l = getPositionX();
            for (int k = getPositionY() - 1; k > -1; k--) {
                if (l < chessBoard[0].length - 1) {
                    l++;
                    if (chessBoard[k][l].isEmpty()) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else if (!chessBoard[k][l].getPiece().getColor().equals(color)) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            if (chessBoard[k][l].getPiece().getName().equals("king")) {
                                return messagePossible.append(" (it's  check)").toString();
                            } else {
                                return messagePossible.append(" (").append(chessBoard[k][l].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
            l = getPositionY();
            for (int k = getPositionX() - 1; k > -1; k--) {
                if (l < chessBoard[0].length - 1) {
                    l++;
                    if (chessBoard[k][l].isEmpty()) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else if (!chessBoard[k][l].getPiece().getColor().equals(color)) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            if (chessBoard[k][l].getPiece().getName().equals("king")) {
                                return messagePossible.append(" (it's  check)").toString();
                            } else {
                                return messagePossible.append(" (").append(chessBoard[k][l].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
            l = getPositionX();
            for (int k = getPositionY() + 1; k < chessBoard.length; k++) {
                if (l < chessBoard[0].length - 1) {
                    l++;
                    if (chessBoard[k][l].isEmpty()) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else if (!chessBoard[k][l].getPiece().getColor().equals(color)) {
                        if (chessBoard[k][l].getName().equals(squireName)) {
                            if (chessBoard[k][l].getPiece().getName().equals("king")) {
                                return messagePossible.append(" (it's  check)").toString();
                            } else {
                                return messagePossible.append(" (").append(chessBoard[k][l].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[k][l].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
        } else {
            int l = getPositionY();
            for (int k = getPositionX() - 1; k > -1; k--) {
                if (l > 0) {
                    l--;
                    if (chessBoard[l][k].isEmpty()) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else if (!chessBoard[l][k].getPiece().getColor().equals(color)) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            if (chessBoard[l][k].getPiece().getName().equals("king")) {
                                return messagePossible.append(" (it's  check)").toString();
                            } else {
                                return messagePossible.append(" (").append(chessBoard[l][k].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
            l = getPositionY();
            for (int k = getPositionX() - 1; k > -1; k--) {
                if (l < chessBoard[0].length - 1) {
                    l++;
                    if (chessBoard[l][k].isEmpty()) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else if (!chessBoard[l][k].getPiece().getColor().equals(color)) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            if (chessBoard[l][k].getPiece().getName().equals("king")) {
                                return messagePossible.append("(it's  check)").toString();
                            } else {
                                return messagePossible.append("(").append(chessBoard[l][k].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
            l = getPositionX();
            for (int k = getPositionY() - 1; k > -1; k--) {
                if (l < chessBoard[0].length - 1) {
                    l++;
                    if (chessBoard[l][k].isEmpty()) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else if (!chessBoard[l][k].getPiece().getColor().equals(color)) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            if (chessBoard[l][k].getPiece().getName().equals("king")) {
                                return messagePossible.append("(it's  check)").toString();
                            } else {
                                return messagePossible.append("(").append(chessBoard[l][k].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
            l = getPositionX();
            for (int k = getPositionY() + 1; k < chessBoard.length; k++) {
                if (l < chessBoard[0].length - 1) {
                    l++;
                    if (chessBoard[l][k].isEmpty()) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            return messagePossible.toString();
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else if (!chessBoard[l][k].getPiece().getColor().equals(color)) {
                        if (chessBoard[l][k].getName().equals(squireName)) {
                            if (chessBoard[l][k].getPiece().getName().equals("king")) {
                                return messagePossible.append("(it's  check)").toString();
                            } else {
                                return messagePossible.append("(").append(chessBoard[l][k].getPiece().getName()).append("will be killed)").toString();
                            }
                        } else {
                            possibleMoves.add(chessBoard[l][k].getName());
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        if (possibleMoves.size() == 0) {
            return messageImpossible.append("selected bishop").toString();
        } else {
            for (String possibleMove : possibleMoves) {
                messageAdviseMoves.append(possibleMove).append(" ");
            }
        }

        return messageAdviseMoves.toString();
    }
}
