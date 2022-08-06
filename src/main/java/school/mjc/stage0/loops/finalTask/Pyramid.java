package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int whitespace = cathetusLength - 1;
        int number = 1;
        boolean increase = true;
        for (int i = 0; i < cathetusLength; i++) {
            int numbersToPrint = cathetusLength - whitespace + i;
            for (int j = 0; j < whitespace; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numbersToPrint; j++) {
                System.out.print(number);

                if (number == i + 1 && j != numbersToPrint-1) {
                    increase = false;
                }

                if (number == 1) {
                    increase = true;
                }

                if (increase) {
                    number++;
                } else {
                    number--;
                }
            }

            System.out.println();
            whitespace -= 1;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }
}
