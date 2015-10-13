/**
 * 
 */
package domain;

import java.sql.Date;
/**
 * @Description TODU
 * @author Administrator
 * @date 2015��10��11�� ����9:07:01
 */
/**
 *�̳���Ʒ���ʳƷ����
 */
public class Foodstuff extends Commodity{
	//����
	String area;
	//�¶�
	private double temperature;
	//��ʳ������ʳ
	private boolean isRaw;
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	/**
	 * @return the isRaw
	 */
	public boolean isRaw() {
		return isRaw;
	}
	/**
	 * @param isRaw the isRaw to set
	 */
	public void setRaw(boolean isRaw) {
		this.isRaw = isRaw;
	}
	public Foodstuff() {
		
	}
	/**
	 * @param area
	 * @param temperature
	 * @param isRaw
	 */
	public Foodstuff(String area,
			double temperature,
			boolean isRaw){
		super();
		this.area = area;
		this.temperature = temperature;
		this.isRaw = isRaw;
	}
	/**
	 * @param name
	 * @param price
	 * @param bid
	 * @param iSN
	 * @param manuDate
	 * @param mass
	 * @param qgp
	 * @param brand
	 * @param remark
	 * @param area
	 * @param temperature
	 * @param isRaw
	 */
	public Foodstuff(String name,
			double price,
			double bid,
			String iSN,
			String manuDate,
			double mass,
			String qgp,
			String brand,
			String remark,
			String area,
			double temperature,
			boolean isRaw){
		super();
		this.area = area;
		this.temperature = temperature;
		this.isRaw = isRaw;
	}

}
