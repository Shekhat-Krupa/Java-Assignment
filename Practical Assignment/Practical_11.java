//Created by Shekhat Krupa (21CE133)
/*
* Practical 11
* Create a Triplet class that encapsulates three objects of the same data type in a given  instance of Triplet.
*/
import java.util.*;
import java.util.concurrent.ExecutionException;
public class Practical_11 {
    public static void main(String[] args) throws ExecutionException {
        Triplet<String, String, String> p11 = Triplet.of("Krupa", "Dhruv", "Abhi");
        Triplet<String, String, String> p12= Triplet.of("Anirudh", "Yash", "Avinash");
        Triplet<Integer, Integer, Integer> p21 = Triplet.of( 18, 22, 56);
        Triplet<Integer, Integer, Integer> p22 = Triplet.of( 8, 28, 16);
        Triplet<Character, Character, Character> p31 = Triplet.of('F', 'A', 'D');
        Triplet<Character, Character, Character> p32 = Triplet.of('B', 'd', 'X');
        List<Triplet<String, String, String>> pairs1 = new ArrayList<>();
        List<Triplet<Integer, Integer, Integer>> pairs2 = new ArrayList<>();
        List<Triplet<Character, Character, Character>> pairs3 = new ArrayList<>();
        pairs1.add(p11);
        pairs1.add(p12);
        pairs2.add(p21);
        pairs2.add(p22);
        pairs3.add(p31);
        pairs3.add(p32);
        System.out.println("Before applying the HashSet : ");
        System.out.println(pairs1);
        System.out.println(pairs2);
        System.out.println(pairs3);
        System.out.println("After applying the HashSet : ");
        Set<Triplet<String, String, String>> distinctTriplets1 = new HashSet<>(pairs1);
        Set<Triplet<Integer, Integer, Integer>> distinctTriplets2 = new HashSet<>(pairs2);
        Set<Triplet<Character, Character, Character>> distinctTriplets3 = new HashSet<>(pairs3);
        System.out.println(distinctTriplets1);
        System.out.println(distinctTriplets2);
        System.out.println(distinctTriplets3);
        System.out.println("By Shekhat Krupa 21CE133");
    }

}
