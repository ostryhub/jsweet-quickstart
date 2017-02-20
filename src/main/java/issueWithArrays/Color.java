package issueWithArrays;

import java.util.Arrays;

public class Color {

    static {
        Color[] array = new Color[10];

        // this fails
        Color[] copied = Arrays.copyOf(array, array.length);

        // and this also fails
        Color[] copied2 = Arrays.<Color>copyOf(array, array.length);
    }

}
