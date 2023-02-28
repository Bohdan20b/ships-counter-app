package service;

public class ShipsCounter {

    public static int countShips(int[][] field) {
        int shipCount = 0;
        int shipLength = 0;
        for (int[] ints : field) {
            for (int j = 0; j < ints.length; j++) {
                switch (ints[j]) {
                    case 1:
                        if (shipLength == 0) {
                            shipCount++;
                        }
                        shipLength++;
                        continue;
                    case 0:
                        if (shipLength > 0) {
                            shipLength = 0;
                        }
                        continue;
                    default:
                        throw new RuntimeException("Wrong input type. It should be either 0 or 1.");
                }
            }
            shipLength = 0;
        }
        return shipCount;
    }
}

