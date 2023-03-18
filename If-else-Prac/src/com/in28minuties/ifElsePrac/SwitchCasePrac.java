package com.in28minuties.ifElsePrac;

public class SwitchCasePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is week day?" + isWeekDay(0));
		System.out.println("The month you have chosen is?" + determineNameOfMonth("5"));
		System.out.println("The month you have chosen is?" + determineNameOfDay("4"));
	}

	public static String determineNameOfDay(String day) {
		String finalDay = "";
		switch (day) {
		case "0":
			finalDay = "Sunday";
			break;
		case "1":
			finalDay = "Monday";
			break;
		case "2":
			finalDay = "Tuesday";
			break;
		case "3":
			finalDay = "Wednesday";
			break;
		case "4":
			finalDay = "Thursday";
			break;
		case "5":
			finalDay = "Friday";
			break;
		case "6":
			finalDay = "Saturday";
		default:
			finalDay = "Invalid day sent";
		}
		return finalDay;
	}

	public static String determineNameOfMonth(String month) {
		String finalMonth = "";
		switch (month) {
		case "1":
			finalMonth = "January";
			break;
		case "2":
			finalMonth = "February";
			break;
		case "3":
			finalMonth = "March";
			break;
		case "4":
			finalMonth = "April";
			break;
		case "5":
			finalMonth = "May";
			break;
		case "6":
			finalMonth = "June";
			break;
		case "7":
			finalMonth = "July";
			break;
		case "8":
			finalMonth = "August";
			break;
		case "9":
			finalMonth = "September";
			break;
		case "10":
			finalMonth = "October";
			break;
		case "11":
			finalMonth = "November";
			break;
		case "12":
			finalMonth = "December";
			break;
		default:
			finalMonth = "Invalid month sent";
		}
		return finalMonth;
	}

	public static boolean isWeekDay(int dayNumber) {
		boolean day = false;
		switch (dayNumber) {
		case 0:
		case 6:
			day = false;
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			day = true;
			break;
		default:
			break;
		}
		return day;
	}

}
