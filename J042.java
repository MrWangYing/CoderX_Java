
public class J042 {
	public static int getNum(int month) {
	    int rabbitNum = 1;
	    if(month > 0 && month < 3){
	        return rabbitNum;
	    } else {
	        return getNum(month - 1) + getNum(month - 2);
	    }
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.println("第" + i + "个月的兔子对数：" + getNum(i));
		}
	}
}
