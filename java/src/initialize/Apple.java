package initialize;

public class Apple {
	Apple getPeeled(){
		return Peeler.peel(this);
	}
}
