public class assignment6Script {
    public static void main(String[] args) {
        System.out.println("behold, the number of numbers for numbers 0-9");
        generatePyramid(9);
    }

    public static void generatePyramid(int n) {
        String pyramid = "";
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                pyramid += i;
            }
            pyramid += "\n";
        }
        System.out.println(pyramid);
    }
}

