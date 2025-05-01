public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable one, SingleTable two) {
        table1 = one;
        table2 = two;
    }

    public boolean canSeat(int num) {
        return (num<=(table1.getNumSeats()+table2.getNumSeats()-2));
    }

    public double getDesirability() {
        double avg = (table1.getViewQuality()+table2.getViewQuality())/2;
        if (table1.getHeight()==table2.getHeight()) return avg;
        else return avg-10;
    }
}