package music;

public class Box<T> {
	private T data;

	Box() {
	}

	Box(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
}
