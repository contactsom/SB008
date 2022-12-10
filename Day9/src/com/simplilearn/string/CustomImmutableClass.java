package com.simplilearn.string;

import java.util.Objects;

public final class CustomImmutableClass {
	// 1. all the member in side the class should be private 
	// 2. there is no setter methods
	// 3. Class should be final
	
	private String atmcardName ;
	private int atmcardNo ;
	
	
	public String getAtmcardName() {
		return atmcardName;
	}
	
	public int getAtmcardNo() {
		return atmcardNo;
	}

	
	@Override
	public String toString() {
		return "CustomImmutableClass [atmcardName=" + atmcardName + ", atmcardNo=" + atmcardNo + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(atmcardName, atmcardNo);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomImmutableClass other = (CustomImmutableClass) obj;
		return Objects.equals(atmcardName, other.atmcardName) && atmcardNo == other.atmcardNo;
	}
	
	
	
	
}
