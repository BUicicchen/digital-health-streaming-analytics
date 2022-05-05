package clusterdata;
// Insulin tracker tuple: <deviceID: int, timestamp: long, dose_amount: int>
public class TupInsulin extends TupDevice {
    protected Integer doseAmount;
    protected static final String deviceName = "Insulin Tracker";
    protected static final String attrNameDoseAmount = "dose amount";
    // default constructor
    public TupInsulin() {super(); doseAmount = null;}
    // parameterized constructor
    public TupInsulin(Integer deviceID, Integer patientID, Long timestamp, Integer doseAmount) {
        super(deviceID, patientID, timestamp);
        this.doseAmount = doseAmount;
    }
    // convert to string
    @Override
    public String toString() {
        return (deviceName + " " + super.toString() + ", " + attrNameDoseAmount + ": " + doseAmount);
    }
}
