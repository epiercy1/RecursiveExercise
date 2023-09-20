
public class BaseCase {
	public static void main(String[]args) {
        BaseCase bc = new BaseCase();
        int[]array = {10, 30, 50, 40, 20};
        int large = bc.largest(array, array.length);
        System.out.println(large);
    }
    public int largest(int[]array, int n) {
        if(n == 1)
        	return array[0];
        int r = largest(array, n - 1);
        if(r > array[n - 1])
        	return r;
       return array[n - 1];
    }
}
