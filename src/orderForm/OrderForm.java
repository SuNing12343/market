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
public abstract class OrderForm extends Order{
	/**
	 * �����Ʒ������
	 */
	public abstract void addItem();
	

	/**
	 * �����Ʒ������
	 * 
	 * @param isn ��Ʒ������
	 */
	public abstract void addItem(String isn);

	/**
	 * �����Ʒ������
	 * 
	 * @param isn ��Ʒ������
	 * @param count ����
	 */
	public abstract void addItem(String isn, int count);

	/**
	 * �Ӷ������Ƴ�ָ����Ʒ
	 */
	public abstract void removeItem();

	/**
	 * �Ӷ������Ƴ�һ��ָ����Ʒ
	 * 
	 * @param isn ��Ʒ������
	 */
	public abstract void removeItem(String isn);

	/**
	 * �Ӷ������Ƴ�ָ��������Ʒ
	 * 
	 * @param isn ��Ʒ������
	 * @param count ����
	 */
	public abstract void removeItem(String isn, int count);

	/**
	 * ��ոö���
	 */
	public abstract void clearItem();

	/**
	 * �����ӡ�ö���
	 */
	public abstract void printOrder();

	/**
	 * �ύ�ö���
	 */
	public abstract void submit();

}
