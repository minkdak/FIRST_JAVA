package hiding;

public class MyDate {

	// ��Ű���� �ٸ��� public ���� �ؾ���.
	private int day;
	private int year;
	private int month;
	
	private boolean isValid = true;
	public void setDay(int day) {
	this.day = day;
	
	}	
//	public void setDay(int day) {
//		this.day = day;
//		
//	}
	// set�� ���ϰ� get ���ϴ� ��� read-only
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		} else {
			this.month = month;	
		}
		
	}

	public void showDate() {
		if (isValid) {
			System.out.println( year + "�� " + month + "�� " + day + "��");	
		} else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
		}
		
	}

}