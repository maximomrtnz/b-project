package maximomartinezgonzalez.modelo;

import android.graphics.drawable.Drawable;

public class Money {
	
	private String country;
	private float dolarConvertion;
	private String moneyName;
	private String moneySymbol;
	private Drawable countryFlag;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public float getDolarConvertion() {
		return dolarConvertion;
	}
	public void setDolarConvertion(float dolarConvertion) {
		this.dolarConvertion = dolarConvertion;
	}
	public String getMoneyName() {
		return moneyName;
	}
	public void setMoneyName(String moneyName) {
		this.moneyName = moneyName;
	}
	public String getMoneySymbol() {
		return moneySymbol;
	}
	public void setMoneySymbol(String moneySimbol) {
		this.moneySymbol = moneySimbol;
	}
	public Drawable getCountryFlag() {
		return countryFlag;
	}
	public void setCountryFlag(Drawable countryFlag) {
		this.countryFlag = countryFlag;
	}
	
	
	
	
}
