package exception;
/**
 * ���䲻�Ϸ�
 * �Զ����쳣��ͨ��������������е�ҵ���߼�����
 * �Զ����쳣������Ҫ�����¼����£�
 * 1.����Ҫ����֪��
 * 2.��Ҫ�̳���Exception��ֱ�ӻ��Ӽ̳о��ɣ�
 * 3.����Exception�ж���ĸ��ֹ��췽��
 * 4.�ṩ���л��汾�ţ���ΪExceptionʵ�������л��ӿڣ�
 * @author Administrator
 *
 */
public class IllegalAgeException  extends Exception{

	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
