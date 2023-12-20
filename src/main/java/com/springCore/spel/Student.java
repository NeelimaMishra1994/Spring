package com.springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("#{22+5}")
	private int x;
	@Value("#{22+5+3}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")//this is the format to invoke static method in spel
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double t;
	
	public double getT() {
		return t;
	}
	public void setT(double t) {
		this.t = t;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", t=" + t + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
