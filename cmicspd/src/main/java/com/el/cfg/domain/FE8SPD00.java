package com.el.cfg.domain;

public class FE8SPD00 {
	
	//配送机构erp编号
	private String LSCO;
	
	//appKey
	private String LSE8APPK;
	
	//password
	private String 	LSEPAPSD;
	
	private String LSUSER;
	
	private String LSDL01;
	
	public String getLSCO() {
		return LSCO;
	}

	public void setLSCO(String lSCO) {
		LSCO = lSCO;
	}

	public String getLSE8APPK() {
		return LSE8APPK;
	}

	public void setLSE8APPK(String lSE8APPK) {
		LSE8APPK = lSE8APPK;
	}

	public String getLSEPAPSD() {
		return LSEPAPSD;
	}

	public void setLSEPAPSD(String lSEPAPSD) {
		LSEPAPSD = lSEPAPSD;
	}

	public String getLSUSER() {
		return LSUSER;
	}

	public void setLSUSER(String lSUSER) {
		LSUSER = lSUSER;
	}

	public String getLSDL01() {
		return LSDL01;
	}

	public void setLSDL01(String lSDL01) {
		LSDL01 = lSDL01;
	}

	@Override
	public String toString() {
		return "FE8SPD00 [LSCO=" + LSCO + ", LSE8APPK=" + LSE8APPK
				+ ", LSEPAPSD=" + LSEPAPSD + ", LSUSER=" + LSUSER + "]";
	}
	
	

}
