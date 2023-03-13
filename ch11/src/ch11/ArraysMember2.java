package ch11;
import java.util.*;

public class ArraysMember2 {
    public static void main(String[] args) {
        Member2 m1 = new Member2("Jason", 24);
        Member2 m2 = new Member2("Jason", 28);
        Member2 m3 = new Member2("Jason", 32);
        Member2 m4 = new Member2("Jason", 23);
        Member2 m5 = new Member2("Jason", 34);
        Member2[] members = {m1, m2, m3, m4, m5};
        System.out.println(Arrays.toString(members));
        Arrays.sort(members);
        System.out.println(Arrays.toString(members));
        Arrays.sort(members, Collections.reverseOrder());
        System.out.println(Arrays.toString(members));
        
    }
}
