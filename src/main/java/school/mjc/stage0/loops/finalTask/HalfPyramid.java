package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int whitespace = cathetusLength - 1;
        for (int i = 0; i < cathetusLength; i++) {
            int numbersToPrint = cathetusLength - whitespace;
            for (int j = 0; j < whitespace; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numbersToPrint; j++) {
                System.out.print("*");
            }

            System.out.println();
            whitespace -= 1;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
