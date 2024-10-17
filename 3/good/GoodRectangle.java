package good;

public class GoodRectangle implements Shape {
    private int lungime;
    private int latime;
    public GoodRectangle(int i, int i1) {
     this.latime=i;
     this.lungime=i1;
    }

    @Override
    public int getArea() {
        return lungime*latime;
    }
}
