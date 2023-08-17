import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StaticBlockSyntax {

    int kan;

    {
        kan = 10;
        System.out.println("This Instance block is executed");
    }

    public StaticBlockSyntax() {
        System.out.println("Constructor Called");
    }

    static  int myStaticVariable;

    static {
        myStaticVariable = 40;
        System.out.println("This block is executed");
    }

    public static void main(String[] args) {
        System.out.println("Value of my static Variable: "+ myStaticVariable);

        StaticBlockSyntax staticBlockSyntax = new StaticBlockSyntax();

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        // filter the even  numbers

        List<Integer> filteredEvenNumbers = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++){

            int number = arr.get(i);

            if (number % 2 == 0){
                filteredEvenNumbers.add(number);
            }
        }



    }
}
