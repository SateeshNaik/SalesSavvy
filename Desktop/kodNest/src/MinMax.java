class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class MinMax {
    public static void main(String[] args) {
        System.out.println(getMinMax(new int[]{1,2,3,4,5}));

    }
    public static Pair<Integer, Integer> getMinMax(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        for(int i=1; i<arr.length; i++) {
            if(min>arr[i]){

                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        Pair<Integer,Integer> pair =new Pair<>(min,max);

        return pair;

    }

    public static Pair<Float, Float> getMinMax1(int[] arr) {
        return new Pair(1.0,1.0);

    }

    public static Pair<String , String> getMinMax2(int[] arr) {
        return new Pair("adfvv","acf");

    }

}
