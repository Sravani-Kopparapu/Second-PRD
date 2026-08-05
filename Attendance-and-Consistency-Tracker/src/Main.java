
public class Main {

    public static void main(String[] args) {
        int day1 = 0;
        int day2 = 0;
        int day3 = 5;
        int day4 = 1;
        int day5 = 0;
        int day6 = 1;
        int day7 = 0;
        int day8 = 1;
        int day9 = 0;
        int day10 = 2;
        int totalWorkingDays = 10;
        int presentDays = 0;
        int absentDays = 0;
        if (day1 == 1) {
            presentDays++;
        } else if (day1 == 0) {
            absentDays++;
        }
        if (day2 == 1) {
            presentDays++;
        } else if (day2 == 0) {
            absentDays++;
        }
        if (day3 == 1) {
            presentDays++;
        } else if (day3 == 0) {
            absentDays++;
        }
        if (day4 == 1) {
            presentDays++;
        } else if (day4 == 0) {
            absentDays++;
        }
        if (day5 == 1) {
            presentDays++;
        } else if (day5 == 0) {
            absentDays++;
        }
        if (day6 == 1) {
            presentDays++;
        } else if (day6 == 0) {
            absentDays++;
        }
        if (day7 == 1) {
            presentDays++;
        } else if (day7 == 0) {
            absentDays++;
        }
        if (day8 == 1) {
            presentDays++;
        } else if (day8 == 0) {
            absentDays++;
        }
        if (day9 == 1) {
            presentDays++;
        } else if (day9 == 0) {
            absentDays++;
        }
        if (day10 == 1) {
            presentDays++;
        } else if (day10 == 0) {
            absentDays++;
        }
        double attendancePercentage = (double) presentDays / totalWorkingDays * 100;
        double requiredAttendance = 75.0;

        System.out.println("Total working days: " + totalWorkingDays);
        System.out.println("Present days: " + presentDays);
        System.out.println("Absent days: " + absentDays);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println();
        System.out.println("Required Attendance: " + requiredAttendance + "%");
        String eligibilityStatus = attendancePercentage >= requiredAttendance ? "Eligible" : "Not Eligible";
        String consistencyStatus = attendancePercentage >= requiredAttendance ? "Good Attendance" : "Poor Attendance";
        System.out.println("Eligibility Status: " + eligibilityStatus);
        System.out.println("Consistency Status: " + consistencyStatus);

    }
}
