package science.mengxin.java.effective.item30;

/**
 * User:    mengxin
 * Date:    03/10/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item30
 * Description: PayrollDayBetter.
 *
 * @author mengxin
 * @version 1.0
 */

// The strategy enum pattern
    // add inner enum to share code.
enum PayrollDayBetter {

    MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY), THURSDAY(
            PayType.WEEKDAY), FRIDAY(PayType.WEEKDAY), SATURDAY(PayType.WEEKEND), SUNDAY(
            PayType.WEEKEND);

    private final PayType payType;

    PayrollDayBetter(PayType payType) {
        this.payType = payType;
    }

    double pay(double hoursWorked, double payRate) {
        return payType.pay(hoursWorked, payRate);
    } // The strategy enum type

    private enum PayType {
        WEEKDAY {
            double overtimePay(double hours, double payRate) {
                return hours <= HOURS_PER_SHIFT ? 0 :
                        (hours - HOURS_PER_SHIFT) * payRate / 2;
            }
        }, WEEKEND {
            double overtimePay(double hours, double payRate) {
                return hours * payRate / 2;
            }
        };
        private static final int HOURS_PER_SHIFT = 8;

        abstract double overtimePay(double hrs, double payRate);

        double pay(double hoursWorked, double payRate) {
            double basePay = hoursWorked * payRate;
            return basePay + overtimePay(hoursWorked, payRate);
        }

    }

}