/**
 * 
 */
package domain;

/**
 * @Description TODO �ֿ������
 * @author Tianxin
 * @date 2015��10��11�� ����7:33:53
 */
public class Stock {
	// ��Ʒ
	private Commodity commodity;
	// ��Ӧ��Ʒ������
	private int count;

	/**
	 * �޲ι��캯��
	 */
	public Stock() {
		super();
	}

	/**
	 * @param commodity
	 * @param count
	 */
	public Stock(Commodity commodity, int count) {
		super();
		this.commodity = commodity;
		this.count = count;
	}

	/**
	 * @return the commodity
	 */
	public Commodity getCommodity() {
		return commodity;
	}

	/**
	 * @param commodity
	 *            the commodity to set
	 */
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

}
