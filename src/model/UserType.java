package model;

public enum UserType {
     ADMIN("系统管理员",0),CUS("顾客",1);
	private String name;
	private int index;
	private UserType(String name,int index) {
		this.name=name;
		this.index=index;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getIndex() {
		return index;
	}
	private void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
