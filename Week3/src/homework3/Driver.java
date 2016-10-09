package homework3;

public class Driver {
    public static void main(String[] args) {

        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        ArrayofNumbers x = new ArrayofNumbers(4);
        ArrayofNumbers y = new ArrayofNumbers(array);

        x.setElement(0, 3);
        x.setElement(1, 1);
        x.setElement(2, 5);
        x.setElement(3, 6);

        x.addObject(y);

        for (int counter = 0; counter < x.array.length; counter++) {
            x.returnElement(counter);
        }

    }
}
