public class J039{
    public static void main(String[] args){
        int count = 4;
        int n = 8;
        int sum = 4;
        for (int i = 1; i <= 8; i++) {
        	System.out.println("0~7���" + i + "λ�����У�" + count + "��");
        	if (i <= 1) {
        		count *= 7;
        	}
        	else {
        		count *= 8;
        	}
        	sum += count;
        }
        System.out.println("�ܼ�Ϊ��" + sum);
    }
}