package pavi;

public class Student {
private int sno;
private String name;
public int getSno() {
	return sno;
}

public void setSno(int sno) {
	this.sno = sno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [sno=" + sno + ", name=" + name + ", getSno()=" + getSno() + ", getName()=" + getName()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}
