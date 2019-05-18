import java.util.Arrays;

public class ArrayOfNames {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Anna";
        names[1] = "Maria";
        names[2] = "Krystyna";
        System.out.printf("%s %s %s \n", names[0], names[1], names [2]);
        System.out.println(names[0] +" " +names[1] +" " +names[2]);
//albo jako ArrayString, czyli [Anna, Maria, Krystyna].
        String arrayInString = Arrays.toString(names);
        System.out.println(arrayInString);
    }
}
