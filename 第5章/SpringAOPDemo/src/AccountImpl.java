public class AccountImpl implements Account {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(int money) {
		
		System.out.println("��" +name+ "�˻���Ǯ " + money + "Ԫ");
	}

	public void minus(int money) {
		System.out.println("��"+name+"�˻���Ǯ: " + money + "Ԫ");
	}
}
