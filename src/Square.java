class Square {
    private String name;
    private String color;

    private Piece piece;

    public Square(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public boolean isEmpty(){
        return piece == null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
