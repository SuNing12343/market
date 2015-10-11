/**
 * 
 */
package operatorManagement;

import domain.Clerk;
import domain.Manager;
import domain.Person;
import domain.StockManager;

/**
 * ������Ա���в����ӿ�
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015��10��11�� ����7:44:38
 */
public interface OperatorManagement {
	/**
	 * ��������Ԫ
	 * 
	 * @param clerk
	 * @return
	 */
	public boolean addClerk(Clerk clerk);

	/**
	 * ��������Ա
	 * 
	 * @param manager
	 * @return
	 */
	public boolean addManagr(Manager manager);

	/**
	 * ����������Ա
	 * 
	 * @param stockManager
	 * @return
	 */
	public boolean addStockManager(StockManager stockManager);

	/**
	 * �����û���Ϣ
	 * 
	 * @param person
	 * @return
	 */
	public boolean changePersonInfo(Person person);

	/**
	 * ɾ������Ա
	 * 
	 * @param clerkId
	 *            ����Աid
	 * @return
	 */
	public boolean removeClerk(String clerkId);

	/**
	 * ɾ������Ա
	 * 
	 * @param clerk
	 * @return
	 */
	public boolean removeClerk(Clerk clerk);

	/**
	 * ɾ������Ա
	 * 
	 * @param managerId
	 *            ����Աid
	 * @return
	 */
	public boolean removeManager(String managerId);

	/**
	 * ɾ������Ա
	 * 
	 * @param manager
	 * @return
	 */
	public boolean removeManager(Manager manager);

	/**
	 * ɾ��������Ա
	 * 
	 * @param managerId
	 *            ������Աid
	 * @return
	 */
	public boolean removeStockManager(String managerId);

	/**
	 * ɾ��������Ա
	 * 
	 * @param stockManager
	 * @return
	 */
	public boolean removeStockManager(StockManager stockManager);

}
