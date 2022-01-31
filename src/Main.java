import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Test first = new Test(1, "First");
        Test second = new Test(1, "First");
        Test third = new Test(3, "Third");
        Set<Test> hashTable = new HashSet<>();
        System.out.println(hashTable.add(first));
        System.out.println(hashTable.add(second));
        System.out.println(hashTable.add(third));
        for (Test test : hashTable){
            System.out.println(test.getNAME());
        }

        //Check how index is calculated in hashMap
        System.out.println(first.hashCode()% hashTable.size());


    }
}
