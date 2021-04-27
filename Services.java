class Services{
    private String serviceName;
    private float serviceFee;
    public Services(String name,float fee){
        this.serviceFee=fee;
        this.serviceName=name;
    }
    public String getserviceName(){
        return this.serviceName;
    }
    public float getserviceFee(){
        return this.serviceFee;
    }
}
class PhoneServices extends Services{
    private int freeMinutes;
    private int freeSMS;
    private float minutesCost;
    private float smsCost;
    public PhoneServices(String name,float fee,int mins,int sms,float minCost,float smsCost){
        super(name, fee);
        this.freeMinutes=mins;
        this.freeSMS=sms;
        this.minutesCost=minCost;
        this.smsCost=smsCost;
    }
}
class DataServices extends Services{
    private final float discount=(float)0.3;
    private int freeData;
    private float dataCost;
    public DataServices(String name,float fee,int freeData,float dataCost){
        super(name, fee);
        this.dataCost=dataCost;
        this.freeData=freeData;
    }
}