package object;
/**
 * ʹ�õ�ǰ����0bject�е���ط�����д
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
	 * ��дtoString����
	 * ���ص��ַ���û�и�ʽ�ϵ�Ҫ�󣬽����ɽ��ʵ�ʿ������Զ�����
	 * ����ͨ��������Ӧ���ǵ�ǰ�������������
	 */
	public String toString(){
		//(1,2)
		return"("+x+","+y+")";
	}
	/**
	 * ��дequals������Ŀ�ģ��жϵ�ǰ�������������������Ƿ���ͬ
	 * javaû���ϸ�Ҫ���������������������ݣ����������Ե�ֵ������ͬ
	 * ���Խ��ʵ������
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