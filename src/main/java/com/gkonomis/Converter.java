package com.gkonomis;

public class Converter {

	String femalename;
	int asciiValue;

	public String getFemalename() {
		return femalename;
	}

	public void setFemalename(String femalename) {
		this.femalename = femalename;
	}

	public int getAsciiValue() {
		return asciiValue;
	}

	public void setAsciiValue(int asciiValue) {
		this.asciiValue = asciiValue;
	}

	@Override
	public String toString() {
		return "Converter [femalename=" + femalename + ", asciiValue=" + asciiValue + "]";
	}

}
