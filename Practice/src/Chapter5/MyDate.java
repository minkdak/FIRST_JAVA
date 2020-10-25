package Chapter5;

import java.util.Calendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		} else {
			this.year = year;	
		}
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
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch (month) {
		case 1:	case 3: case 5:	case 7:	case 8:	case 10: case 12:
			if(day < 0 || day > 31) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;
		case 4: case 6:	case 9:	case 11:
			if(day < 0 || day > 30) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if(day < 0 || day > 29) {
					isValid = false;
				} else {
					this.day = day;
				}
				
			} else {
				if(day < 0 || day > 28) {
					isValid = false;
				} else {
					this.day = day;
				}
			}
			break;
		default:
			break;
		}
	}
	
	public String isValid() {
		if(isValid) {
			return "날짜형식이 올바릅니다.";
		}
		
		return "날짜 형식이 올바르지 않습니다.";
	}

	
	
	
}
