/**
 * 
 */
package orderForm;

import domain.Order;

/**
 * ��Ʒ��������ģ��
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015��10��11�� ����7:51:15
 */
public abstract class OrderForm extends Order {
	/**
	 * �����Ʒ������
	 * 
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean addItem();

	/**
	 * �����Ʒ������
	 * 
	 * @param isn
	 *            ��Ʒ������
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean addItem(String isn);

	/**
	 * �����Ʒ������
	 * 
	 * @param isn
	 *            ��Ʒ������
	 * @param count
	 *            ����
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean addItem(String isn, int count);

	/**
	 * �Ӷ������Ƴ�ָ����Ʒ
	 * 
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean removeItem();

	/**
	 * �Ӷ������Ƴ�һ��ָ����Ʒ
	 * 
	 * @param isn
	 *            ��Ʒ������
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean removeItem(String isn);

	/**
	 * �Ӷ������Ƴ�ָ��������Ʒ
	 * 
	 * @param isn
	 *            ��Ʒ������
	 * @param count
	 *            ����
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean removeItem(String isn, int count);

	/**
	 * ��ոö���
	 * 
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean clearItem();

	/**
	 * �����ӡ�ö���
	 * 
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean printOrder();

	/**
	 * �ύ�ö���
	 * 
	 * @return �ɹ�����ʧ��
	 */
	public abstract boolean submit();

}
