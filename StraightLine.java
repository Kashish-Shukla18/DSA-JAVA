package DSA;

public class StraightLine {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(checkStraightLine(arr));

    }

    static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2)
            return true;
        int x0 = coordinates[0][0], x1 = coordinates[1][0];
        int y0 = coordinates[0][1], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0], y = coordinates[i][1];
            if (dy * (x - x0) != dx * (y - y0))
                return false;
        }
        return true;
    }
}
