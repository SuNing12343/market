/**
 * 
 */
package domain;

import java.sql.Date;
import java.util.Map;

/**
 * ����
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015��10��11�� ����7:59:56
 */
public class Order {
	// ��¼��Ʒ��Ϣ��map��������Ʒ��������
	private Map<Commodity, Integer> order;
	// ������
	private int totalCount;
	// �ܼ�
	private double totalPrize;
	// ����ʱ��
	private Date time;

	/**
	 * ��Ʒ����
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ���ι��캯��
	 * 
	 * @param order
	 * @param totleCount
	 * @param totlePrize
	 * @param time
	 */
	public Order(Map<Commodity, Integer> order, int totleCount,
			double totlePrize, Date time) {
		super();
		this.order = order;
		this.totalCount = totleCount;
		this.totalPrize = totlePrize;
		this.time = time;
	}

	/**
	 * @return the order
	 */
	public Map<Commodity, Integer> getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Map<Commodity, Integer> order) {
		this.order = order;
	}

	/**
	 * @return the totleCount
	 */
	public int getTotleCount() {
		return totalCount;
	}

	/**
	 * @param totleCount
	 *            the totleCount to set
	 */
	public void setTotleCount(int totleCount) {
		this.totalCount = totleCount;
	}

	/**
	 * @return the totlePrize
	 */
	public double getTotlePrize() {
		return totalPrize;
	}

	/**
	 * @param totlePrize
	 *            the totlePrize to set
	 */
	public void setTotlePrize(double totlePrize) {
		this.totalPrize = totlePrize;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

}
