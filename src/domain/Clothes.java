/**
 * 
 */
package domain;

import java.sql.Date;
/**
 * @Description �̳���Ʒ����·�����
 * @author ChengGang
 * @date 2015��10��14�� ����7:24:56
 */
public class Clothes extends Commodity{
	//�����
	private int ageRange;
	//��ʽ
	private String style;
	//�Ա�
	private char sex;
	/**
	 * @return the ageRange
	 */
	public int getAgeRange() {
		return ageRange;
	}
	/**
	 * @param ageRange the ageRange to set
	 */
	public void setAgeRange(int ageRange) {
		this.ageRange = ageRange;
	}
	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}
	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Clothes(){
		
	}
	/**
	 * @param ageRange
	 * @param style
	 * @param sex
	 */
	public Clothes(int ageRange,String style,char sex)
	{
		super();
		this.ageRange = ageRange;
		this.style = style;
		this.sex = sex;
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
	 * @param ageRange
	 * @param style
	 * @param sex
	 */
	public Clothes(String name,
			double price,
			double bid,
			String iSN,
			String manuDate,
			double mass,
			String qgp,
			String brand,
			String remark,
			int ageRange,
			String style,
			char sex){
		super();
		this.ageRange = ageRange;
		this.style = style;
		this.sex = sex;
	}
	
}
