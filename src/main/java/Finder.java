public class Finder {
    public Finder() {System.out.println("Initializing Max and Min operations on the array...");}

    public Integer findMax(int[] intArray) {
        if(intArray == null || intArray.length == 0) {

            return null;
        }

        int max = intArray[0];

        for(int i = 0;i < intArray.length;i++ ) {
            if (intArray[i] > max) {
                max = intArray[i];
            }


        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        if(intArray == null || intArray.length == 0) {
            return null;
        }
        int min = intArray[0];

        for(int i = 0 ;i < intArray.length; i++) {
            if(min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }

}
