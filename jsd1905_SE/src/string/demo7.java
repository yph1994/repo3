package string;

/**
 * char charAt(int index)
 * ��ȡ��ǰ�ַ�����ָ��λ�ö�Ӧ���ַ�
 */
public class demo7 {
	public static void main(String[] args) {
		String str="thinking in java";
		char c= str.charAt(9);
		System.out.println(c);	
		
		//������
		String line="�Ϻ�����ˮ���Ժ���";
		for (int i = 0; i < line.length()/2; i++) {
			char c1=line.charAt(i);
			char c2=line.charAt(line.length()-1-i);
			if(c1!=c2){
				System.out.println("��");
				break;
				/*
				 * System.out.println("���ǻ��ģ�");
				 * return;
				 */
				
			}
		}
		System.err.println("�ǻ��ģ�");
	
	}
}
