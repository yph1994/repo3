package object;
/**
 * 使用当前测试0bject中的相关方法重写
 * @author Administrator
 *
 */
public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * 重写toString方法
	 * 返回的字符串没有格式上的要求，将来可结合实际开发属性而定，
	 * 但是通常包含的应当是当前对象的属性内容
	 */
	public String toString(){
		//(1,2)
		return"("+x+","+y+")";
	}
	/**
	 * 重写equals方法，目的：判断当前对象与参数对象的内容是否相同
	 * java没有严格要求必须两个对象的所有内容（即所有属性的值）都相同
	 * 可以结合实际需求
	 */
//	public boolean equals(Object obj){
//		if(obj==null){
//			return false;
//		}
//		if(obj==this){
//			return true;
//		}
//		if(obj instanceof Point){
//			Point p=(Point)obj;
//			return this.x==p.x&&this.y==p.y;
//		} 
//		return false;
//
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}