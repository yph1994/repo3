package string;
/**
 * ��г����
 * @author Administrator
 *
 */
public class Demo15 {
public static void main(String[] args) {
	String regex="(waqnmlgb|dsb|mszz|tmd|cnm|djb)";
	String message="waqnmlgb/!���dsb!����Ǹ�djb!";
	message=message.replaceAll(regex, "***");
	System.out.println(message);
}
}
