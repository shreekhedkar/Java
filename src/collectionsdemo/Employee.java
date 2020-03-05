package collectionsdemo;

public class Employee extends Object {

	private int eno;
	private String ename;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {

		return this.eno + " " + this.ename;
	}

}
