package DynamicStack;

public class DynamicStackClass<T> {
	T data;
	DynamicStackClass<T> next;
	public DynamicStackClass(T data){
		this.data = data;
		next = null;
	}
}
