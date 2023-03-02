package service;

public class ShipsCounter {

    public static int countShips(int[][] field) {
        int shipCount = 0;
        int[][] testField = new int[field.length + 1][field[0].length + 1];

        for (int i = 0; i < testField.length - 1; i++) {
            for (int j = 0; j < testField[0].length - 1; j++) {
                testField[i][j] = field[i][j];
            }
        }

        for (int i = testField.length - 1; i < testField.length; i++) {
            for (int j = testField[0].length - 1; j < testField.length; j++) {
                testField[i][j] = 0;
            }
        }

        for (int i = 0; i < testField.length; i++) {
            for (int j = 0; j < testField[0].length; j++) {
                if (testField[i][j] == 1 && testField[i + 1][j] == 0 && testField[i][j + 1] == 0) {
                    shipCount++;
                }
            }
        }
        return shipCount;
    }
}

