package good;

public class GoodSquare implements Shape {
    private int latura;
    public GoodSquare(int i) {
        latura=i;
    }

    @Override
    public int getArea() {
        return latura*latura;
    }
}
