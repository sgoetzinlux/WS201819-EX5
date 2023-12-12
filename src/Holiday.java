public class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String name, int day, String month) {

        this. name = name;
        this.day = day;
        this.month = month;
    }
    // Getter for month
    public String getMonth() {
        return month;
    }
    boolean inSameMonth(Holiday holiday) {

        return (this.getMonth()  == holiday.month);
    }


    static double avgDate(Holiday HolidayArr[]) {

        double sum = 0;
        for (int i = 0; i < HolidayArr.length; i++) {
            sum += HolidayArr[i].day;
        }

        return (double) sum/ HolidayArr.length;
    }
    public static void main(String args[]) {

        // Create 2 instances of Holiday
        Holiday holiday1 = new Holiday("New Year", 1, "January");
        Holiday holiday2 = new Holiday("Christmas", 25, "December");
        Holiday holiday4 = new Holiday("Birthday Serge", 4, "January");

        // Check if month of holiday1 and holiday2 are identical
        boolean sameMonth = holiday4.inSameMonth(holiday1);
        System.out.println("Same month is :" + sameMonth);

        // Create array of holiday and call avgDate method
        Holiday[] holidays = new Holiday[] { new Holiday("New Year", 1, "January"),
                                             new Holiday("Christmas", 25, "December"),
                                             new Holiday("Lux national day", 23, "June") };
        double averageDay = avgDate(holidays);
        System.out.println("Average of day :" + averageDay);

        // Create instance of Holiday
        Holiday holiday3 = new Holiday("Independence day", 4, "July");

    }




}
