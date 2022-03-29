package block2.taskBlock.decomposition;

/**
 * 4. На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 */

public class Task04 {
    public static void main(String[] args) {
        double[][] coordinates = new double[][]{{5, 7}, {12, 18}, {4, 27}};
        double maxDistance = 0;
        for (int i = 0; i < coordinates.length - 1; i++) {
            for (int j = i + 1; j < coordinates.length; j++) {
                final double distance = getDistance(coordinates[i][0], coordinates[i][1], coordinates[j][0],
                        coordinates[j][1]);
                System.out.println(distance);
                if (maxDistance < distance) {
                    maxDistance = distance;
                }
            }
        }
        System.out.println("Max distance between specify points: " + maxDistance);
    }

    public static double getDistance(double aX, double aY, double bX, double bY) {
        return Math.sqrt(
                Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2)
        );
    }

}
