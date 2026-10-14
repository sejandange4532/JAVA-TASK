public class Assignment5 {

    static int rectangleArea() {
        return rectangleArea(5, 4);
    }

    static int rectangleArea(int length, int width) {
        return length * width;
    }

    interface AreaCalculator {
        int calculate(int length, int width);
    }

    public static void main(String[] args) {

        System.out.println(
                "Standard Function Area (Default 5x4): "
                        + rectangleArea());

        AreaCalculator area = (length, width) -> length * width;

        System.out.println(
                "Arrow Function Area (Custom 10x3): "
                        + area.calculate(10, 3));

        {
            int blockVar = 100;
            System.out.println("Inside Block: " + blockVar);
        }

        try {
            throw new IllegalStateException(
                    "blockVar is not accessible outside its block");
        } catch (IllegalStateException e) {
            System.out.println("Scope Test Error: " + e.getMessage());
        }
    }
}