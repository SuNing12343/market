/**
 * 
 */
package associatorManagement;

import domain.Associator;
import domain.Order;

/**
 * ��Ա����ģ��
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015��10��11�� ����7:47:45
 */
public interface AssociatorManagement {
	/**
	 * ���ӻ���
	 * 
	 * @param associator
	 *            ��Ա
	 * @param order
	 *            ����
	 * @return �ɹ���ʶ
	 */
	public boolean addScore(Associator associator, Order order);

	/**
	 * ���ӻ���
	 * 
	 * @param associatorId
	 *            ��Աid
	 * @param order
	 *            ����
	 * @return
	 */
	public boolean addScore(String associatorId, Order order);

	/**
	 * ���ӻ���
	 * 
	 * @param associator
	 *            ��Ա
	 * @param prize
	 *            ���ѽ��
	 * @return
	 */
	public boolean addScore(Associator associator, double prize);

	/**
	 * ���ӻ���
	 * 
	 * @param associatorId
	 *            ��Աid
	 * @param prize
	 *            ���ѽ��
	 * @return
	 */
	public boolean addScore(String associatorId, double prize);

	/**
	 * �۳�����
	 * 
	 * @param associator
	 * @param prize
	 *            �۳����
	 * @return
	 */
	public boolean removeScore(Associator associator, double prize);

	/**
	 * �۳�����
	 * 
	 * @param associatorId
	 *            ��Աid
	 * @param prize
	 *            �۳����
	 * @return
	 */
	public boolean removeScore(String associatorId, double prize);

	/**
	 * ע���Ա
	 * 
	 * @param associator
	 * @return
	 */
	public boolean registerAssociator(Associator associator);

	/**
	 * ɾ����Ա
	 * 
	 * @param associator
	 * @return
	 */
	public boolean deleteAssociator(Associator associator);

	/**
	 * ����idɾ����Ա
	 * 
	 * @param associatorId
	 *            ��Աid
	 * @return
	 */
	public boolean deleteAssociator(String associatorId);

}
