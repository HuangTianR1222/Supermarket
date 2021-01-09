package model;
/*package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import lib.Base;

public class 数据 extends Base{
	private static String firstName="赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤滕殷罗毕郝邬安常乐于时傅皮卞齐康伍余元卜顾孟平黄和穆萧尹姚邵湛汪祁毛禹狄米贝明臧计伏成戴谈宋茅庞熊纪舒屈项祝董梁杜阮蓝闵席季麻强贾路娄危江童颜郭梅盛林刁钟徐邱骆高夏蔡田樊胡凌霍虞万支柯咎管卢莫经房裘缪干解应宗宣丁贲邓郁单杭洪包诸左石崔吉钮龚程嵇邢滑裴陆荣翁荀羊於惠甄魏加封芮羿储靳汲邴糜松井段富巫乌焦巴弓牧隗山谷车侯宓蓬全郗班仰秋仲伊宫宁仇栾暴甘钭厉戎祖武符刘姜詹束龙叶幸司韶郜黎蓟薄印宿白怀蒲台从鄂索咸籍赖卓蔺屠蒙池乔阴郁胥能苍双闻莘党翟谭贡劳逄姬申扶堵冉宰郦雍却璩桑桂濮牛寿通边扈燕冀郏浦尚农温别庄晏柴瞿阎充慕连茹习宦艾鱼容向古易慎戈廖庚终暨居衡步都耿满弘匡国文寇广禄阙东殴殳沃利蔚越夔隆师巩厍聂晁勾敖融冷訾辛阚那简饶空曾毋沙乜养鞠须丰巢关蒯相查后江红游竺权逯盖益桓公万俟司马上官欧阳夏侯诸葛闻人东方赫连皇甫尉迟公羊澹台公冶宗政濮阳淳于仲孙太叔申屠公孙乐正轩辕令狐钟离闾丘长孙慕容鲜于宇文司徒司空亓官司寇仉督子车颛孙端木巫马公西漆雕乐正壤驷公良拓拔夹谷宰父谷粱晋楚阎法汝鄢涂钦段干百里东郭南门呼延归海羊舌微生岳帅缑亢况后有琴梁丘左丘东门西门商牟佘佴伯赏南宫墨哈谯笪年爱阳佟第五言福百家姓续";
	private static String price="11111111111111111111111111111111111111111122222222222222222222222222222222222222223333333333333333333333333333333333333333333333344444444444444444444444444444444444444444444444444555555555555555555555555555555555555555555555555555555555555555555566666666666666666666666666666666666666666666666666666777777777777777777777777777777777777777777777777777777778888888888888888888888888888888888888888888888888888888888899999999999999999999999999999999999999999999999999999999999999999999999";
	public static int getNum(int start,int end) {//随机返回返回指定范围间的整数
    	//Math.random()随机返回0.0至1.0之间的数
        return (int)(Math.random()*(end-start+1)+start);
    }
    //随机返回价格
    public static String getPrice() {//不使用String，因为需要大量拼接字符串
    	int index1=getNum(0, price.length()-1);//随机取姓氏字符串中的任意位置
        String first=price.substring(index1, index1+1);//获取该位置的姓氏
        String second=price.substring(index1, index1+1);
        String third=price.substring(index1, index1+1);
        String price1 =first+second+third;
        return price1;//返回姓名
    }
    //随机返回名称 
    public static String getName() {
        int index=getNum(0, firstName.length()-1);//随机取姓氏字符串中的任意位置
        String first=firstName.substring(index, index+1);//获取该位置的姓氏
        String second=firstName.substring(index, index+1);
        String third=firstName.substring(index, index+1);
        String name =first+second+third;
        return name;//返回姓名
    }
    public static int getNum() {
    	int num;
    	return (int)(Math.random()*1000+1);
    }
    public static void main(String[] args) {
    	addCJ();
    }
    public static void addCJ() {//增加成绩
    	String sql="insert into shangpin values(null,?,?,?)";//使用占位符定义插入语句
    	try(
    		java.sql.PreparedStatement pstmt=con.prepareStatement(sql);){//实例化PreparedStatement
    		for(int i=1;i<=2000;i++) {
    				pstmt.setString(1,getName());//定义第1个占位符的内容
    	    		pstmt.setString(2, getPrice());//定义第2个占位符的内容
    	    		pstmt.setInt(3, getNum());//定义第3个占位符的内容
    	    		pstmt.addBatch();//加入批处理等待执行
    				i++;
    		}
    		pstmt.executeBatch();//批量执行插入操作
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    
}*/

