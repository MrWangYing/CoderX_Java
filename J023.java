
public class J023 {
    public static void main(String args[]) {  
        boolean b = true;  
        while (b) {  
            System.out.println("��������ݣ�");  
            Scanner s = new Scanner(System.in);  
            long date = s.nextLong();  
            String string_year = String.valueOf(date);  
            int year = Integer.parseInt(string_year.substring(0, 4));  
            int month = Integer.parseInt(string_year.substring(4, 6));  
            int day = Integer.parseInt(string_year.substring(6));  
  
            if ((month < 1 || month > 12) || (day < 1 || day > 31)) {  
                System.out.println("��������д�������������");  
                b = true;  
  
            } else {  
                System.out.println("���������ȷ");  
                b = false;  
                System.out.println("��������"+date+"�Ǹ���ĵ�"+caculate(year,month,day)+"��");  
            }  
        }  
          
    } 
}
