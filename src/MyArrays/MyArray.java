package MyArrays;

public class MyArray {
    private int[] items;
    private int currentIndex;

    public MyArray(int initialSize) {
        this.items = new int[initialSize];
    }

    public void insert(int value) {
        if (currentIndex >= items.length) {
            // Resize the array if it's full
            int[] temp = new int[items.length * 2];
            for(int i = 0; i<currentIndex; i++){
                temp[i] = items[i];
            }
            items = temp;
        }
        this.items[currentIndex] = value;
        currentIndex++;
    }

    public int indexOf(int value) {
        // Linear Search
        for (int i = 0; i < this.currentIndex; i++) {
            if (this.items[i] == value)
                return i;
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= this.currentIndex)
            throw new IllegalArgumentException("Index out of bounds");

        for (int i = index; i < this.currentIndex - 1; i++) {
            this.items[i] = this.items[i + 1];
        }
        currentIndex--;
    }

    public int max(){
        int result = this.items[0];
        for(int i=1; i<this.currentIndex;i++){
            if (items[i]>result)
                result = items[i];
        }
        return result;
    }

    public int min(){
        int result = this.items[0];
        for(int i=1; i<this.currentIndex;i++){
            if (items[i]<result)
                result = items[i];
        }
        return result;
    }

    public void reverse(){
        int i=0;
        int j=this.currentIndex-1;

        while (i<j){
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            i++;
            j--;
        }
    }

    @Override
    public String toString() {
        if (currentIndex == 0)
            return "[]";

        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < this.currentIndex - 1; i++) {
            str.append(items[i]).append(", ");
        }
        str.append(items[currentIndex - 1]).append("]");
        return str.toString();
    }
}
