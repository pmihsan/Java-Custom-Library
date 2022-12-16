package CustomeHashTable;

public class Main {
    public static void main(String[] args) {
        CustHashTable ht = new CustHashTable(10);
        ht.insert(1,20);
        ht.insert(2,70);
        ht.insert(44,80);
        ht.insert(4,440);
        ht.insert(18,11);

        ht.display();

        ht.delete(4);

        System.out.println("After Deleting");
        ht.display();

        if(ht.search(44))
            System.out.println("Key(44) Pair Found");
        else
            System.out.println("Key(44) Pair Not Found");

        if(ht.search(4))
            System.out.println("Key(4) Pair Found");
        else
            System.out.println("Key(4) Pair Not Found");

        if(ht.update(44, 8800))
            System.out.println("Key(44) Pair Updated");
        else
            System.out.println("Key(44) Pair Not Updated");

        System.out.println("After Updating");
        ht.display();
    }
}
