
public class Main {

    public static void main(String[] args) {
        int day1 = 1;
        int day2 = 0;
        int day3 = 1;
        int day4 = 1;
        int day5 = 1;
        int day6 = 1;
        int day7 = 0;
        int day8 = 1;
        int day9 = 1;
        int day10 = 1;
        int totalWorkingDays = 10;
        int presentDays = day1 + day2 + day3 + day4 + day5 + day6 + day7 + day8 + day9 + day10;
        int absentDays = totalWorkingDays - presentDays;
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
