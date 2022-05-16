package DataStructures.hashTable;

public class SimpleHashTable {
    private Employee[] hashtable;


    SimpleHashTable(){
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey==hashtable.length-1){
                hashedKey=0;
            }
            else{
                hashedKey++;
            }
            // looping till it reaches stopIndex.
            // If hashedKey = 9 | hashedKey = 10%10 = 0

            while(occupied(hashedKey)&&hashedKey!=stopIndex)
                hashedKey = (hashedKey+1)%hashtable.length;
        }
        if(occupied(hashedKey))
            System.out.println("Space Occupied");
        else
            hashtable[hashedKey] = employee;
    }

    public Employee get(String key){
        int hashKey = hashKey(key);
        return hashtable[hashKey];
    }

    public boolean occupied(int hashKey){
        return hashtable[hashKey]!=null;
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashTable(){
        System.out.println("*****************");
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
