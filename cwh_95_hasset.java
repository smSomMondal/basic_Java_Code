package cwh_full_2023;

import java.util.HashSet;

public class cwh_95_hasset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet =new HashSet<>(6,.5f);
        myHashSet.add(2);
        myHashSet.add(11);
        myHashSet.add(23);
        myHashSet.add(56);
        System.out.println(myHashSet);
    }
}
