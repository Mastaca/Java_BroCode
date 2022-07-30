
public class MyGenericClass <Thing extends Number, V extends Number> {
	Thing x;
	V y;
	
	MyGenericClass(Thing x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public V getValue() {
		return y;
	}
}
