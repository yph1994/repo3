package socket;

import java.util.Arrays;

/*
 * ���Դ�������ɾ��ָ��Ԫ��
 */
public class Demo {
public static void main(String[] args) {
	int [] allout ={11,32,1,5,4854,8,48,484};
	int pw=5;
	//��pw��������ɾ����
	System.out.println(Arrays.toString(allout));
	for (int i = 0; i < allout.length; i++) {
		if(allout[i]==pw){
			allout[i]=allout[allout.length-1];
			allout=Arrays.copyOf(allout, allout.length-1);
			break;
		}
	}
	System.out.println(Arrays.toString(allout));
	
}
}
