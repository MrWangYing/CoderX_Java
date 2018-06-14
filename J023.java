
public class J023 {
    public static void main(String args[]) {  
        boolean b = true;  
        while (b) {  
            System.out.println("请输入年份：");  
            Scanner s = new Scanner(System.in);  
            long date = s.nextLong();  
            String string_year = String.valueOf(date);  
            int year = Integer.parseInt(string_year.substring(0, 4));  
            int month = Integer.parseInt(string_year.substring(4, 6));  
            int day = Integer.parseInt(string_year.substring(6));  
  
            if ((month < 1 || month > 12) || (day < 1 || day > 31)) {  
                System.out.println("输入年份有错误，请重新输入");  
                b = true;  
  
            } else {  
                System.out.println("年份输入正确");  
                b = false;  
                System.out.println("输入的年份"+date+"是该年的第"+caculate(year,month,day)+"天");  
            }  
        }  
          
    } 
}
