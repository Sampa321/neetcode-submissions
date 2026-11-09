class RandomizedSet {

    private HashMap<Integer, Integer> map;
    private int size;
    public RandomizedSet() {
        map = new HashMap<>();
        size = 0;
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
        {
            return false;
        }
        map.put(val, 1);
        size++;
        return true;
    }
    
    public boolean remove(int val) {
         if(!map.containsKey(val))
        {
            return false;
        }
        map.remove(val);
        size--;
        return true;
    }
    
    public int getRandom() {
        int idx = new Random().nextInt(size);
        Iterator<Integer> it = map.keySet().iterator();
        while (idx-- > 0) {
            it.next();
        }
        return it.next();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */