package maxelmikari.ac.uk.cornwallcollege;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxelMikari {

    public static void main(String[] args) {

        //String[] myArray = new String[];
        System.out.println("Hello " + args[0] + " " + args[1]);

        String MaxelMikari = "Maxel Mikari";
        String Maxel = MaxelMikari.substring (0, 6);
        System.out.println(Maxel);

        String Surname = MaxelMikari.substring (6, 12);
        System.out.println(Surname);

        List<String> MyList= new ArrayList<>();
        List<String> MyList2= new ArrayList<>();

        MyList.add("Maxel Mikari");
        MyList.add("Ellie Mikari");
        MyList.add("Eclipse Constell");
        MyList.add("Shelby Taylor");
        for (var s : MyList){
            Name cur = new Name(s);
            String reversed = cur.reverseOrder();
            MyList.add(reversed);
        }
        Collections.sort(MyList);
        for (var s : MyList){
            System.out.println(s);
        }
        MyList2.add("Mikari, Lumi");
        MyList2.add("Viar, Crystal");
        MyList2.add("Fang, Ellie");
        Collections.sort(MyList2);
        for (var s : MyList2) {
            System.out.println(s);
        }
    }
}
