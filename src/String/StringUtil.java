package String;

public class StringUtil {

	public static boolean isEmpty(String str) {//定义一个boolean类型的方法 以便后期制作可以运用
        if("".equals(str)||str ==null) {
			return true; //输入有内容 则输出为真
		}else
         return false;//输入无内容 则输出为假
	}

}
