/**
 * 
 */
package viewTransition;

/**
 * ��ͼ�л�ģ�飬�������¼�ǳ��ȷ���
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015��10��11�� ����7:54:26
 */
public interface ViewTransition {
	/**
	 * ����½��Ա���
	 * 
	 * @param username
	 * @param password
	 * @return ���ر�ʶ��0ʧ�ܣ�1�ɹ�
	 */
	public int checkStatus(String username, String password);

	/**
	 * @param username
	 * @return ���ر�ʶ��0ʧ�ܣ�1�ɹ�
	 */
	public int logout(String username);

}
