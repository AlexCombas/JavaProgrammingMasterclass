package section.five;

public class DiagonalStar {
    public static void main(String[] args) {
//        printSquareStar(5);
        printSquareStar(-5);
    }

    public static void printSquareStar(int number) {
        int rowNumber = 1;
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (rowNumber == 1 || rowNumber == number) {
                    for (int j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    for (int j = 1; j <= number; j++) {
                        if (j == 1 || j == number) {
                            System.out.print("*");
                        } else if (j == rowNumber || j == (number - rowNumber + 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                rowNumber++;
            }
        }
    }
}

