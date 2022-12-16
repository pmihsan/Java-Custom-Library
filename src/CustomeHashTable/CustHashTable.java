package CustomeHashTable;

public class CustHashTable {

    private static class keyVal{
        private final int key;
        private int data;

        public keyVal(int k, int d){
            this.key = k;
            this.data = d;
        }

        public int getKey(){
            return key;
        }

        public int getData(){
            return data;
        }

        public void setData(int data){
            this.data = data;
        }
    }

    private final int size;
    private final keyVal[] hashTable;
    private final keyVal dummy;

    public CustHashTable(int size){
        this.size = size;
        hashTable = new keyVal[size];
        dummy = new keyVal(-1, -1);
    }

    public int hashCode(int key){
        return key % size;
    }

    public void insert(int key, int val){
        int hashInd = hashCode(key);

        while(hashTable[hashInd] != null && hashTable[hashInd].getKey() != -1){
            ++hashInd;
            hashInd %= size;
        }
        hashTable[hashInd] = new keyVal(key, val);
    }

    public void delete(int key){
        int hashInd = hashCode(key);

        while(hashTable[hashInd] != null) {
            if(hashTable[hashInd].getKey() == key) {
//                keyVal temp = hashTable[hashInd];
                hashTable[hashInd] = dummy;
                return ;
            }
            ++hashInd;
            hashInd %= size;
        }
    }

    public boolean search(int key){
        int hashInd = hashCode(key);
        while(hashTable[hashInd] != null && hashTable[hashInd].getKey() != -1){
            if(hashTable[hashInd].getKey() == key){
//                keyVal temp = hashTable[hashInd];
                return true;
            }
            ++hashInd;
            hashInd %= size;
        }
        return false;
    }

    public boolean update(int key, int upVal){
        int hashInd = hashCode(key);
        while(hashTable[hashInd] != null && hashTable[hashInd].getKey() != -1){
            if(hashTable[hashInd].getKey() == key){
                hashTable[hashInd].setData(upVal);
                return true;
            }
            ++hashInd;
            hashInd %= size;
        }
        return false;
    }

    public void display(){
        System.out.println("{");
        for(int i=0;i < size;i++){
            if(hashTable[i] != null && hashTable[i].getKey() != -1){
                System.out.printf("\t(" + hashTable[i].getKey() + ", " + hashTable[i].getData() + ")\n");
            }
            else{
                System.out.print("\t(~, ~)\n");
            }
        }
        System.out.println(" }");
    }
}
