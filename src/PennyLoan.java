public class PennyLoan
{
  import java.text.DecimalFormat;
        private int amount ; // Amount of loan in pence
        private int length ; // length of subscription in months
        private static DecimalFormat df2 = new DecimalFormat(".##");
        public PennyLoan(int a, int l) {
                amount = a/100 ;
                length = l ;


        }

        /**
        * Calculate the monthly payment in pounds,
        * rounded up to the nearest penny.
        */

        public double paymentPerMonth() {
                double r = (double) amount/ (double) length;

                return df2.format(r);
        }
}
