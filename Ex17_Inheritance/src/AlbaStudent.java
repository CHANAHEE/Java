// 14_ Alba 클래스 생성 생성자 생성, show 오버라이드!ㄴ
public class AlbaStudent extends Student {

	private String task;
	
	public AlbaStudent() {
		// TODO Auto-generated constructor stub
	}
	public AlbaStudent(String name,int age, String major, String task) {
		// TODO Auto-generated constructor stub
		super(name,age,major);
		this.task = task;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("task : " + task);
	}
	
}
