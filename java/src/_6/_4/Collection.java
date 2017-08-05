package _6._4;

public interface Collection {
	int size();
	default boolean isEmpty(){
		return size() == 0;
	}
}
