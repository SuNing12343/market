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
	 * @return ���ر�ʶ��ʧ�ܣ��ɹ�
	 */
	public boolean checkStatus(String username, String password);

	/**
	 * @param username
	 * @return ���ر�ʶ��ʧ�ܣ��ɹ�
	 */
	public boolean logout(String username);

}
