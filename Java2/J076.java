
public class J076 {
	private static  J076 newInstance = null;
	private J076() {
	}
	public static J076 getNewInstance() {
		if (newInstance == null) {
			newInstance = new J076();
		}
		return newInstance;
	}
}
