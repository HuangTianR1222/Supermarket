package model;
/*package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import lib.Base;

public class ���� extends Base{
	private static String firstName="��Ǯ��������֣��������������������������ʩ�ſײ��ϻ���κ�ս���л������ˮ��������˸��ɷ�����³Τ������ﻨ������Ԭ��ۺ��ʷ�Ʒ����Ѧ�׺����������ޱϺ�����������ʱ��Ƥ���뿵����Ԫ������ƽ�ƺ�������Ҧ��տ����ë����ױ���갼Ʒ��ɴ�̸��é���ܼ�������ף������������ϯ����ǿ��·¦Σ��ͯ�չ�÷ʢ�ֵ�����������Ĳ��﷮���������֧�¾̹�¬Ī�������Ѹɽ�Ӧ�������ڵ��������������ʯ�޼�ť�������ϻ���½��������춻���κ�ӷ����ഢ���������ɾ��θ����ڽ��͹�����ɽ�ȳ������ȫۭ�����������������ﱩ�����������������ղ����Ҷ��˾��۬�輻��ӡ�ް׻���̨�Ӷ����̼���׿�����ɳ����������ܲ�˫��ݷ����̷�����̼������Ƚ��۪Ӻȴ�ɣ���ţ��ͨ�����༽ۣ����ũ�±�ׯ�̲����ֳ�Ľ����ϰ�°���������������θ����߾Ӻⲽ�����������Ŀܹ�»�ڶ�Ź�����εԽ��¡ʦ�������˹��������������Ǽ��Ŀ�����ɳؿ������ᳲ�������󽭺�����Ȩ�ָ��滸����ٹ˾���Ϲ�ŷ���ĺ�������˶��������ʸ�ξ�ٹ����̨��ұ���������������̫����������������ԯ�������������Ľ����������˾ͽ˾������˾���붽�ӳ�����ľ����������������ṫ���ذμй��׸����������ַ���۳Ϳ�նθɰ��ﶫ�����ź��ӹ麣����΢����˧�ÿ�������������������������Ĳ��٦�����Ϲ�ī�������갮��١�����Ը��ټ�����";
	private static String price="11111111111111111111111111111111111111111122222222222222222222222222222222222222223333333333333333333333333333333333333333333333344444444444444444444444444444444444444444444444444555555555555555555555555555555555555555555555555555555555555555555566666666666666666666666666666666666666666666666666666777777777777777777777777777777777777777777777777777777778888888888888888888888888888888888888888888888888888888888899999999999999999999999999999999999999999999999999999999999999999999999";
	public static int getNum(int start,int end) {//������ط���ָ����Χ�������
    	//Math.random()�������0.0��1.0֮�����
        return (int)(Math.random()*(end-start+1)+start);
    }
    //������ؼ۸�
    public static String getPrice() {//��ʹ��String����Ϊ��Ҫ����ƴ���ַ���
    	int index1=getNum(0, price.length()-1);//���ȡ�����ַ����е�����λ��
        String first=price.substring(index1, index1+1);//��ȡ��λ�õ�����
        String second=price.substring(index1, index1+1);
        String third=price.substring(index1, index1+1);
        String price1 =first+second+third;
        return price1;//��������
    }
    //����������� 
    public static String getName() {
        int index=getNum(0, firstName.length()-1);//���ȡ�����ַ����е�����λ��
        String first=firstName.substring(index, index+1);//��ȡ��λ�õ�����
        String second=firstName.substring(index, index+1);
        String third=firstName.substring(index, index+1);
        String name =first+second+third;
        return name;//��������
    }
    public static int getNum() {
    	int num;
    	return (int)(Math.random()*1000+1);
    }
    public static void main(String[] args) {
    	addCJ();
    }
    public static void addCJ() {//���ӳɼ�
    	String sql="insert into shangpin values(null,?,?,?)";//ʹ��ռλ������������
    	try(
    		java.sql.PreparedStatement pstmt=con.prepareStatement(sql);){//ʵ����PreparedStatement
    		for(int i=1;i<=2000;i++) {
    				pstmt.setString(1,getName());//�����1��ռλ��������
    	    		pstmt.setString(2, getPrice());//�����2��ռλ��������
    	    		pstmt.setInt(3, getNum());//�����3��ռλ��������
    	    		pstmt.addBatch();//����������ȴ�ִ��
    				i++;
    		}
    		pstmt.executeBatch();//����ִ�в������
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    
}*/

