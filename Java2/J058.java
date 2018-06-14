
class Mytime {
	private int hour, minute, second;
	public  Mytime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void display() {
		System.out.println(hour + ":" + minute + ":" + second);
	}
	public int addSecond (int sec) {
		second += sec;
		return second;
	}
	public int addMinute (int min) {
		minute += min;
		return minute;
	}
	public int addHour (int hou) {
		hour += hou;
		return hour;
	}
	public int subSecond (int sec) {
		second -= sec;
		return second;
	}
	public int subMinute (int min) {
		minute -= min;
		return minute;
	}
	public int subHour (int hou) {
		hour -= hou;
		return hour;
	}
}
public class J058 {

}
