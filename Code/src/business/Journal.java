package business;


public class Journal {
	private String rank;
	private String title;
	private String foR1;
	private String foR1Name;
	private String foR2;
	private String foR2Name;
	private String foR3;
	private String foR3Name;
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}
	
	public String toString(){
		return title+": "+rank+", "+foR1Name+"("+foR1+")"+", "+foR2Name +"("+foR2+")"+", "+foR3Name +"("+foR3+")";
	}
	
	
	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the foR1
	 */
	public String getFoR1() {
		return foR1;
	}
	/**
	 * @param foR1 the foR1 to set
	 */
	public void setFoR1(String foR1) {
		this.foR1 = foR1;
	}
	/**
	 * @return the foR1Name
	 */
	public String getFoR1Name() {
		return foR1Name;
	}
	/**
	 * @param foR1Name the foR1Name to set
	 */
	public void setFoR1Name(String foR1Name) {
		this.foR1Name = foR1Name;
	}
	/**
	 * @return the foR2
	 */
	public String getFoR2() {
		return foR2;
	}
	/**
	 * @param foR2 the foR2 to set
	 */
	public void setFoR2(String foR2) {
		this.foR2 = foR2;
	}
	/**
	 * @return the foR2name
	 */
	public String getFoR2Name() {
		return foR2Name;
	}
	/**
	 * @param foR2name the foR2name to set
	 */
	public void setFoR2Name(String foR2name) {
		this.foR2Name = foR2name;
	}
	/**
	 * @return the foR3
	 */
	public String getFoR3() {
		return foR3;
	}
	/**
	 * @param foR3 the foR3 to set
	 */
	public void setFoR3(String foR3) {
		this.foR3 = foR3;
	}
	/**
	 * @return the foR3Name
	 */
	public String getFoR3Name() {
		return foR3Name;
	}
	/**
	 * @param foR3Name the foR3Name to set
	 */
	public void setFoR3Name(String foR3Name) {
		this.foR3Name = foR3Name;
	}
	
}

