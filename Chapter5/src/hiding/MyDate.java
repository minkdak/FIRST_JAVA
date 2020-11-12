package hiding;

public class MyDate {

	// 패키지가 다르면 public 선언 해야함.
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
	// set은 못하고 get 만하는 경우 read-only
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
			System.out.println( year + "년 " + month + "월 " + day + "일");	
		} else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
		
	}

}
