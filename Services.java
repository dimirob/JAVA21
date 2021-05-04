class Services{ //yphresia
    protected String serviceName; //onoma yphresias
    protected float serviceFee; //pagio yphresias
    public Services(String name,float fee){
        this.serviceFee=fee;
        this.serviceName=name;
    }
}
class PhoneServices extends Services{ //yphresia kinhths thlefwnias 
    protected int freeMinutes; //dwrean lepta
    protected int freeSMS; //dwrean sms
    protected float minutesCost; //kostos leptwn meta apo dwrean
    protected float smsCost; //kostos sms meta apo dwrean 
    public PhoneServices(String name,float fee,int mins,int sms,float minCost,float smsCost){
        super(name, fee);
        this.freeMinutes=mins;
        this.freeSMS=sms;
        this.minutesCost=minCost;
        this.smsCost=smsCost;
    }
}
class DataServices extends Services{ //yphresia kinhtoy internet
    private final float discount=(float)0.3; //Ypothetoume ekptwsh pou dinetai sthn ekfwnhsh
    private int freeData; //dwrean dedomena
    private float dataCost; //kostos dedomenwn meta apo dwrean
    public DataServices(String name,float fee,int freeData,float dataCost){
        super(name, fee);
        this.dataCost=dataCost;
        this.freeData=freeData;
    }
    public String toString(){
        return "Service type: Data service  Service name: "+this.serviceName+"  Service Fee: "+this.serviceFee+"  Free data: "+this.freeData+"  Data cost: "+this.dataCost;
    }
}
class CardContract extends PhoneServices{ //programma kartosymvolaioy
    float budget; //arxiko mhniaio upoloipo gia ta kartosumvolaia
    private final float discount=(float)0.25; //Ypothetoume ekptwsh pou dinetai sthn ekfwnhsh
    public CardContract(String name,float fee,int mins,int sms,float minCost,float smsCost,float startingBudget){
        super(name,fee,mins,sms,minCost,smsCost);
        this.budget=startingBudget;
    }
    public String toString(){
        return "Service type: Card Contract  Service name: "+this.serviceName+"  Service Fee: "+this.serviceFee+"  Free minutes: "+this.freeMinutes+"  Minutes cost: "+this.minutesCost+"  Free SMS: "+this.freeSMS+"  SMS Cost: "+this.smsCost+"  Starting budget: "+this.budget;
    }
}
class nonCardContract extends PhoneServices{ //Programma symvolaioy
    private final float discount=(float)0.2; //Ypothetoume ekptwsh pou dinetai sthn ekfwnhsh
    public nonCardContract(String name,float fee,int mins,int sms,float minCost,float smsCost){
        super(name,fee,mins,sms,minCost,smsCost);
    }
    public String toString(){
        return "Service type: non Card Contract  Service name: "+this.serviceName+"  Service Fee: "+this.serviceFee+"  Free minutes: "+this.freeMinutes+"  Minutes cost: "+this.minutesCost+"  Free SMS: "+this.freeSMS+"  SMS Cost: "+this.smsCost;
    }
}