package homework3;

public class ArrayofNumbers {
    int array[];

    public ArrayofNumbers(int a) {
        array = new int[a];

        for (int x = 0; x < array.length; x++) {
            array[x] = 0;
        }
    }

    public ArrayofNumbers(int x[]) {
        array = new int[x.length];

        for (int y = 0; y < x.length; y++) {
            array[y] = x[y];
        }

    }

    public void returnElement(int a) {

        System.out.println("Element: " + a + " -> " + array[a]);

    }

    public void setElement(int a, int b) {
        array[a] = b;
    }

    public int max() {
        int max = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x] > max) {
                max = array[x];
            }
        }
        return max;
    }

    public int gcd(int a, int b) {

        int x = array[a];
        int y = array[b];

        do {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        } while (x != y);

        return x;
    }

    public int count() {

        int count = 0;

        for (int x = 0; x < array.length; x++) {
            count++;
        }

        return count;
    }

    public int sum() {
        int sum = 0;

        for (int x = 0; x < array.length; x++) {
            sum = sum + array[x];
        }

        return sum;
    }

    public int average() {
        int average = this.sum() / this.count();
        return average;
    }

    public void scalarMultiply(int a) {

        for (int x = 0; x < array.length; x++) {
            array[x] = array[x] * a;
        }
    }

    public void addConstant(int a) {
        for (int x = 0; x < array.length; x++) {
            array[x] = array[x] + a;
        }
    }

    public void addObject(ArrayofNumbers x) {
        if (x.array.length > this.array.length) {
            int i = 0;
            int placementArray[] = new int[x.array.length];
            do {
                placementArray[i] = this.array[i];
                i++;
            } while (i != this.array.length);

            for (i = this.array.length; i < x.array.length; i++) {
                placementArray[i] = 0;
            }
            int array[] = new int[placementArray.length];
            for (int counter = 0; counter < placementArray.length; counter++) {
                array[counter] = x.array[counter] + placementArray[counter];
            }
            this.array = new int[placementArray.length];
            for (int y = 0; y < placementArray.length; y++) {

                this.array[y] = array[y];
            }
        } else if (x.array.length < this.array.length) {
            int i = 0;
            int placementArray[] = new int[this.array.length];
            do {
                placementArray[i] = x.array[i];
                i++;
            } while (i != x.array.length);

            for (i = x.array.length; i < this.array.length; i++) {
                placementArray[i] = 0;
            }
            for (int counter = 0; counter < placementArray.length; counter++) {
                this.array[counter] = this.array[counter] + placementArray[counter];
            }
        } else {
            for (int counter = 0; counter < this.array.length; counter++) {
                this.array[counter] = this.array[counter] + x.array[counter];
            }
        }

    }
}
