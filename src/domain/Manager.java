/**
 * 
 */
package domain;

import java.sql.Date;

/**
 * @Description TODO
 * @author Tianxin
 * @date 2015��10��11�� ����7:09:11
 */
public class Manager extends Person {
	private double salary;
	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param telphone
	 * @param birthday
	 * @param address
	 * @param inDate
	 * @param sex
	 */
	public Manager(String id, String name, String telphone, Date birthday,
			String address, Date inDate, String sex) {
		super(id, name, telphone, birthday, address, inDate, sex);
		// TODO Auto-generated constructor stub
	}
	/**
	 * ����ȫ�������Ĺ��췽��
	 * @param id
	 * @param name
	 * @param telphone
	 * @param birthday
	 * @param address
	 * @param inDate
	 * @param sex
	 * @param salary ����
	 */
	public Manager(String id, String name, String telphone, Date birthday,
			String address, Date inDate, String sex,double salary) {
		super(id, name, telphone, birthday, address, inDate, sex);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
