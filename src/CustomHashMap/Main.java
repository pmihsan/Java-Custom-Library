package CustomHashMap;

public class Main {
    public static void main(String[] args) {
        CustHashMap chm = new CustHashMap();

        System.out.println("Size " + chm.getSize());
        System.out.println("Hashcode " + chm.hashCode());
        System.out.println(chm);
        System.out.println();

        chm.put(23,45);
        chm.put(45,36);
        chm.put(12, 70);

        System.out.println("Size " + chm.getSize());
        System.out.println("Hashcode " + chm.hashCode());
        System.out.println(chm);
        System.out.println();

        chm.put(12, 90);
        chm.put(10, 22);
        System.out.println("Size " + chm.getSize());
        System.out.println("Hashcode " + chm.hashCode());
        System.out.println(chm);
        System.out.println();

        if(chm.containsKey(12)) System.out.println("FOUND 12");
        else System.out.println("NOT FOUND");

        chm.updateKey(10, 2222);
        System.out.println(chm);
        System.out.println();

        chm.remove(10);
        chm.remove(45);
        System.out.println("Size " + chm.getSize());
        System.out.println("Hashcode " + chm.hashCode());
        System.out.println(chm);

    }
}
