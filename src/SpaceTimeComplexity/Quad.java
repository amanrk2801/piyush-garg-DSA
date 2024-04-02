package SpaceTimeComplexity;

public class Quad {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,10,0,5,6,25,30};
        int target = 9;

        // Find the pairs whose sum is = target (10)

        for(int i=0; i<arr.length; i++){ // O(n) Linear T.C
            for(int j=i+1; j<arr.length; j++){ // O(n)
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair: " + arr[i] + " " + arr[j]);
                }
            }
        }

        // O(n) * O(n) -> O(n^2) -> Quadratic
    }
}
