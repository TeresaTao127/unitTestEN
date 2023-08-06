package L4Triangle;

public class Triangle {
    int width;
    int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=<" + width +
                ">, height=<" + height +
                ">}";
    }


}
