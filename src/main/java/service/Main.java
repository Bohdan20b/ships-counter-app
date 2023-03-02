package service;

public class Main {
    public static void main(String[] args) {
        int[][] ships = {
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1}
        };
        System.out.println(ShipsCounter.countShips(ships));
    }
}
