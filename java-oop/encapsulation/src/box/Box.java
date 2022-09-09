package box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double calculateSurfaceArea() {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }

    public double calculateLateralSurfaceArea() {
        return (2 * length * height) + (2 * width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }

    private void setLength(double length) {
        ensureFieldsData(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        ensureFieldsData(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        ensureFieldsData(height, "Height");
        this.height = height;
    }

    private void ensureFieldsData(double value, String fieldType) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldType + " cannot be zero or negative.");
        }
    }
}
