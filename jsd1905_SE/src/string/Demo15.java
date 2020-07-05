package string;
/**
 * 和谐用语
 * @author Administrator
 *
 */
public class Demo15 {
public static void main(String[] args) {
	String regex="(waqnmlgb|dsb|mszz|tmd|cnm|djb)";
	String message="waqnmlgb/!你个dsb!你就是个djb!";
	message=message.replaceAll(regex, "***");
	System.out.println(message);
}
}
