import java.util.*;

public class CollectionsDriver {

    public static void main(String[] args) {

        // TODO: create a HashMap with the following associations:
        // 511:Joe, 923:Carla, 728:Paula, 298:Zion
        // print the HashMap using its toString implementation
        // note that the order or insertion (or of the keys) is not preserved
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(511, "Joe");
        hashMap.put(923, "Carla");
        hashMap.put(728, "Paula");
        hashMap.put(298, "Zion");
        System.out.println("HashMap: " + hashMap);


        // TODO: now create a LinkedHashMap with the same associations
        // note than now the order of insertion is preserved
        Map<Integer, String> linkHash = new LinkedHashMap<>();
        linkHash.put(511, "Joe");
        linkHash.put(923, "Carla");
        linkHash.put(728, "Paula");
        linkHash.put(298, "Zion");
        System.out.println("LinkedHashMap: " + linkHash);

        // TODO: now create a TreeMap with the same associations
        // note that the order of the keys is now preserved
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(511,"Joe");
        treeMap.put(923,"Carla");
        treeMap.put(728,"Paula");
        treeMap.put(298,"Zion");
        System.out.println("TreeMap: " + treeMap);


        // TODO: create a LinkedList with the following elements:
        // Joe, Carla, Paula, Zion, Paula
        // print the LinkedList using its toString implementation
        // note that duplicates are allowed
        LinkedList<String> ll = new LinkedList<>();
        String joe = "Joe";
        String carla = "Carla";
        String paula = "Paula";
        String zion = "Zion";
        ll.add(joe);
        ll.add(carla);
        ll.add(paula);
        ll.add(zion);
        ll.add(paula);
        System.out.println("LinkedList: " + ll);


        // TODO: now create a HashSet with the same elements
        // note that duplicates are not allowed anymore
        // also note that the order or insertion (or of the keys) is not preserved
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Joe");
        hashSet.add("Carla");
        hashSet.add("Paula");
        hashSet.add("Zion");
        hashSet.add("Paula");
        System.out.println("HashSet: " + hashSet);


        // TODO: now create a LinkedHashSet with the same elements
        // note that duplicates are still not allowed
        // also note that now the order of insertion is preserved
        Set<String> lhSet = new LinkedHashSet<>();
        lhSet.add("Joe");
        lhSet.add("Carla");
        lhSet.add("Paula");
        lhSet.add("Zion");
        lhSet.add("Paula");
        System.out.println("LinkedHashSet: " + lhSet);

        // TODO: finally create a TreeSet with the same elements
        // note that duplicates are still not allowed
        // also note that now the elements are sorted
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Joe");
        treeSet.add("Carla");
        treeSet.add("Paula");
        treeSet.add("Zion");
        treeSet.add("Paula");
        System.out.println("TreeSet: " + treeSet);

    }
}
