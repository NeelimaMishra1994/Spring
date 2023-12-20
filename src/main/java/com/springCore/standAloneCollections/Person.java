package com.springCore.standAloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> names;
	private Map<String, Integer> feeStructure;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Person [names=" + names + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}

}
