public class Position
{
    private int row;
    private int column;
    /** Constructs a Position object with row r and column c.
     */
    public Position(int r, int c)
    {
        row = r;
        column = c;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "(" + row + "," + column + ")";
    }
}