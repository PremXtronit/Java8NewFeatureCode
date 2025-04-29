package CollectionMyHashMap;

public class MyHashMap<K, V> {

    private Entry<K, V>[] buckets;

    public MyHashMap() {
        this.buckets = new Entry[4];
    }

    public void put(K key, V value) {
        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V> entry = buckets[bucketIndex];
        if (entry == null) {
            buckets[bucketIndex] = new Entry<K, V>(key, value);
        } else {
            boolean done = false;
            while (!done) {
                if (key.equals(entry.getKey())) {
                    entry.setValue(value);
                    done = true;
                } else if (entry.getNext() == null) {
                    entry.setNext(new Entry<K, V>(key, value));
                    done = true;
                }
                entry = entry.getNext();
            }
        }
    }

    public V get(K key) {
        Entry<K, V> entry = buckets[key.hashCode() % buckets.length];
        while (entry != null && !key.equals(entry.getKey())) {
            entry = entry.getNext();
        }
        return entry != null ? entry.getValue() : null;
    }
}
