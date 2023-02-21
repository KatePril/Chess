import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Square[][] chessBoard;

    /**
     * Constants are used to communicate with user
     */

    private final String messageIntroduction = "Welcome to the chess game.\n" +
            "Due to the absence of GUI it's better to prepare piece of paper to track pieces' moves";

    private final String messageRules = "Before game begins here are rules:\n" +
            "- Before each turn position of player's pieces will be announced (not the opponent's ones).\n" +
            "- You'll be asked to enter name of the squire where selected piece is located and name of the squire where you want to move it\n" +
            "(If entered name is incorrect, you are given a chance to enter it again, but if entered name is correct," +
            "there is NO CHANCE to cancel it).\n" + "- If you want to stop game before its end, type \"stop\" in any input.\n" +
            "To start the game enter \"start\" in the input below";

    private final String selectColor = "Choose which color will start the game (type \"black\" or \"white\") ";

    private final String selectPiece = "Which piece would you like to move? (type the name of squire where it is located) ";
    private final String selectMove = "Where would you like to move? (type the name of this squire) ";

    /**
     * This method is used to receive information from user
     *
     * @param messageToPlayer
     * @return
     */

    private String setString(String messageToPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(messageToPlayer);
        return scanner.nextLine();
    }

    /**
     * Prints introduction and rules
     */

    private void writeIntroductionAndRules() {
        System.out.println(messageIntroduction);
        System.out.println(messageRules);
    }

    /**
     * Announces whose turn is it
     *
     * @param color
     */

    private void announceTurn(String color) {
        System.out.println("It is " + color + "'s turn");
    }

    /**
     * Announces which pieces user still has on board and their positions
     *
     * @param color
     * @return
     */

    private ArrayList<String> announcePieces(String color) {
        ArrayList<String> piecesPositions = new ArrayList<>();

        System.out.println("Here are your positions");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if (chessBoard[i][j].getPiece() != null) {
                    if (chessBoard[i][j].getPiece().getColor().equals(color)) {
                        piecesPositions.add(chessBoard[i][j].getName());
                        System.out.println(chessBoard[i][j].getPiece().getName() + " on " + chessBoard[i][j].getName());
                    }
                }
            }
        }

        return piecesPositions;
    }

    /**
     * Receives position of piece selected by user and checks it
     *
     * @param piecesPositions
     * @param message
     * @return
     */

    private String checkUserSelectedPiece(ArrayList<String> piecesPositions, String message) {
        boolean choose = true;
        String selected = "";
        while (choose) {
            String tmp = setString(message);
            if (tmp.equals("stop")) {
                return "game over";
            }
            for (int i = 0; i < piecesPositions.size(); i++) {
                if (piecesPositions.get(i).equals(tmp)) {
                    selected = tmp;
                    choose = false;
                    break;
                }
            }
            if(choose) {
                System.out.println("Try again");
            }
        }

        return selected;
    }

    /**
     * Receives name of squire where user wants to move piece and checks it
     *
     * @param message
     * @return
     */

    private String checkUserSelectedMove(String message) {
        boolean choose = true;
        String selected = "";
        while (choose) {
            String tmp = setString(message);
            if (tmp.equals("stop")) {
                return "game over";
            }
            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard[0].length; j++) {
                    if (chessBoard[i][j].getName().equals(tmp)) {
                        selected = tmp;
                        choose = false;
                        break;
                    }
                }
            }
            if(choose) {
                System.out.println("Try again");
            }
        }

        return selected;
    }

    /**
     * Makes move on board
     *
     * @param chessBoard
     * @param selectedPiece
     * @param selectedMove
     * @return
     */

    private String makeMove(Square[][] chessBoard, String selectedPiece, String selectedMove) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if (chessBoard[i][j].getName().equals(selectedPiece)) {
                    return chessBoard[i][j].getPiece().move(selectedMove, chessBoard);
                }
            }
        }
        return null;
    }

    /**
     * Controls user's turn using previous methods
     *
     * @param color
     * @return
     */

    private String makeTurn(String color) {
        announceTurn(color);
        boolean isMoved = true;
        String message = "";

        while (isMoved) {
            String selectedPiece = checkUserSelectedPiece(announcePieces(color), selectPiece);
            if (selectedPiece.equals("game over")) {
                return selectedPiece;
            }
            String selectedMove = checkUserSelectedMove(selectMove);
            if (selectedMove.equals("game over")) {
                return selectedMove;
            }

            message = makeMove(chessBoard, selectedPiece, selectedMove);
            if (message.equals("Move was made") || message.contains("is the winner")) {
                isMoved = false;
            } else {
                System.out.println(message);
                System.out.println("Try again");
            }
        }

        return message;
    }

    /**
     * Creates game itself and controls it
     *
     * @return
     */

    public String createGame() {
        writeIntroductionAndRules();
        if (setString(" ").equals("start")) {
            boolean chooseColor = true;
            String selectedColor = "";
            String otherColor = "";
            while (chooseColor) {
                String tmpColor = setString(selectColor);
                if (tmpColor.equals("black")) {
                    selectedColor = "black";
                    otherColor = "white";
                    chooseColor = false;
                } else if (tmpColor.equals("white")) {
                    selectedColor = "white";
                    otherColor = "black";
                    chooseColor = false;
                } else if (tmpColor.equals("stop")) {
                    return "game over";
                }
                if(chooseColor) {
                    System.out.println("Try again");
                }
            }

            ChessBoard chess = new ChessBoard();
            chess.setStartPositionOfPeaces();
            setChessBoard(chess.getChessBoard());

            System.out.println("Here are positions of coordinates on the board:");
            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard[0].length; j++) {
                    System.out.print(chessBoard[i][j].getName() + " ");
                }
                System.out.println();
            }
            System.out.println();

            int countMoves = 0;
            boolean gameState = true;

            System.out.println("Game begins");
            System.out.println();

            while (gameState) {
                if (countMoves % 2 == 0) {
                    String message = makeTurn(selectedColor);
                    System.out.println(message);
                    System.out.println();
                    if (message.contains("is the winner") || message.equals("game over")) {
                        gameState = false;
                    }

                    ++countMoves;
                } else {
                    String message = makeTurn(otherColor);
                    System.out.println(message);
                    System.out.println();
                    if (message.contains("is the winner") || message.equals("game over")) {
                        gameState = false;
                    }

                    ++countMoves;
                }
            }

        } else {
            System.out.println("try again next time");
        }

        return "game over";
    }

    public Square[][] getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(Square[][] chessBoard) {
        this.chessBoard = chessBoard;
    }
}
