
public class First {

	int num = 100;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + num;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		First f = (First)obj;
		return num == f.num;
	}
}
