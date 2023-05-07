package CustomHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustHashMap {
    class keyPair implements Comparable<keyPair> {
        private int key, val;

        keyPair(){
            key = -1;
            val = -1;
        }
        keyPair(int k, int v){
            key = k;
            val = v;
        }
        public int getKey() {
            return key;
        }
        public int getValue() {
            return val;
        }
        public void setValue(int v) {
            val = v;
        }

        public int compareTo(keyPair kp){
            if(this.key > kp.getKey()) return 1;
            else if(this.key < kp.getKey()) return -1;
            return 0;
        }
    }

    private int size;
    private int sortSize;
    List<keyPair> l;

    public CustHashMap(){
        this.size = 0;
        this.sortSize = 0;
        this.l = new ArrayList<>();
    }

    public int getSize(){
        return size;
    }


    public int hashCode(){
        int hashcode = -1;
        for(keyPair kp : l){
                hashcode += (kp.hashCode());
        }
        return hashcode;
    }

    public keyPair search(int key){
        for(int i=0;i<size;i++){
            if(l.get(i).getKey() == key) return l.get(i);
        }
        return new keyPair();
    }

    public void put(int key, int val){
        if(!containsKey(key)) {
            keyPair temp = new keyPair(key, val);
            l.add(temp);
            this.size++;
        }
        else{
            updateKey(key, val);
        }
    }

    public void remove(int key){
        keyPair temp = search(key);
        if(temp.getKey() != -1) {
            l.remove(temp);
            this.size--;
        }
    }

    public boolean containsKey(int key){
        keyPair temp = search(key);
        if(temp.getKey() != -1) {
            return true;
        }
        return false;
    }

    public boolean updateKey(int key, int data){
        keyPair temp = search(key);
        if(temp.getKey() != -1) {
            temp.setValue(data);
            return true;
        }
        return false;
    }

    public String toString(){
        if(size != sortSize) {
            Collections.sort(l);
            this.sortSize = this.size;
        }
        String s = "{";
        if(size > 0) {
            for (int i = 0; i < size-1; i++) {
                if(i == 0) s += " ";
                s += l.get(i).getKey() + "=" + l.get(i).getValue() + ", ";
            }
            s += l.get(size - 1).getKey() + "=" + l.get(size - 1).getValue();
        }
        return s + " }";
    }


}
