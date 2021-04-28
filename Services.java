class Services{
    private String serviceName; //onoma yphresias
    private float serviceFee; //pagio yphresias
    public Services(String name,float fee){
        this.serviceFee=fee;
        this.serviceName=name;
    }
}
class PhoneServices extends Services{
    private int freeMinutes; //dwrean lepta
    private int freeSMS; //dwrean sms
    private float minutesCost; //kostos leptwn meta apo dwrean
    private float smsCost; //kostos sms meta apo dwrean 
    public PhoneServices(String name,float fee,int mins,int sms,float minCost,float smsCost){
        super(name, fee);
        this.freeMinutes=mins;
        this.freeSMS=sms;
        this.minutesCost=minCost;
        this.smsCost=smsCost;
    }
}
class DataServices extends Services{
    private final float discount=(float)0.3; //Ypothetoume ekptwsh pou dinetai sthn ekfwnhsh
    private int freeData; //dwrean dedomena
    private float dataCost; //kostos dedomenwn meta apo dwrean
    public DataServices(String name,float fee,int freeData,float dataCost){
        super(name, fee);
        this.dataCost=dataCost;
        this.freeData=freeData;
    }
}
class Card extends PhoneServices{
    float budget; //arxiko mhniaio upoloipo gia ta kartosumvolaia
    public Card(String name,float fee,int mins,int sms,float minCost,float smsCost,float startingBudget){
        super(name,fee,mins,sms,minCost,smsCost);
        this.budget=startingBudget;
    }
}