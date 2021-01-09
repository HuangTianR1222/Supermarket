package model;
//商品信息
public class shangpin {
    private int id ;
    private  String name;
    private String price;
    private int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public   String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(int  num) {
		this.num = num;
	}
    
}
