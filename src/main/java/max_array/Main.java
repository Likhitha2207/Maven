package max_array;
public class Main {
	public int max_array(int[] a) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			if(temp<a[i]) {
				temp = a[i];
			}
		}
		return temp;
	}

}
