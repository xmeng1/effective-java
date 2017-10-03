package science.mengxin.java.effective.item30;

/**
 * User:    mengxin
 * Date:    03/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item30
 * Description: PayrollDay.
 *
 * @author mengxin
 * @version 1.0
 */

// Enum that switches on its value to share code - questionable
    // we want to share part of code, but we also want to reduce the error when add new
    // constant. They are conflict.
enum PayrollDay {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    private static final int HOURS_PER_SHIFT = 8;

    double pay(double hoursWorked, double payRate) {
        double basePay = hoursWorked * payRate;

        double overtimePay; // Calculate overtime pay
        switch (this) {
            case SATURDAY:
            case SUNDAY:
                overtimePay = hoursWorked * payRate / 2;
            default: // Weekdays
                overtimePay = hoursWorked <= HOURS_PER_SHIFT ?
                        0 : (hoursWorked - HOURS_PER_SHIFT) * payRate / 2;
                break;
        }

        return basePay + overtimePay;

    }

}