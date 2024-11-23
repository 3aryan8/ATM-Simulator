public class L4Matrix {

    // Method to calculate 1D index for a 3D array
    static int calculateIndex(int x, int y, int z, int sizeY, int sizeZ) {
        return x * sizeY * sizeZ + y * sizeZ + z;
    }

    // Method to set a value in the 1D array
    static void set(int value, int indexX, int indexY, int indexZ, int[] oneDArray, int sizeY, int sizeZ) {
        int index = calculateIndex(indexX, indexY, indexZ, sizeY, sizeZ);
        oneDArray[index] = value;
    }

    // Method to get a value from the 1D array
    static int get(int indexX, int indexY, int indexZ, int[] oneDArray, int sizeY, int sizeZ) {
        int index = calculateIndex(indexX, indexY, indexZ, sizeY, sizeZ);
        return oneDArray[index];
    }

    public static void main(String[] args) {
        // Dimensions of the 3D matrix
        int sizeX = 2, sizeY = 2, sizeZ = 2;

        // Create a 1D array to represent the 3D matrix
        int[] oneDArray = new int[sizeX * sizeY * sizeZ];

        // Set values in the 3D matrix
        set(10, 0, 0, 0, oneDArray, sizeY, sizeZ);
        set(20, 0, 0, 1, oneDArray, sizeY, sizeZ);
        set(30, 0, 1, 0, oneDArray, sizeY, sizeZ);
        set(40, 0, 1, 1, oneDArray, sizeY, sizeZ);

        // Get values from the 3D matrix
        System.out.println("Value at (0, 0, 0): " + get(0, 0, 0, oneDArray, sizeY, sizeZ));
        System.out.println("Value at (0, 0, 1): " + get(0, 0, 1, oneDArray, sizeY, sizeZ));
        System.out.println("Value at (0, 1, 0): " + get(0, 1, 0, oneDArray, sizeY, sizeZ));
        System.out.println("Value at (0, 1, 1): " + get(0, 1, 1, oneDArray, sizeY, sizeZ));
    }
}
