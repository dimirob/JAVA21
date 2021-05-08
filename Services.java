abstract class Services{ //afhrhmenh klash gia kathe yphresia
    protected String serviceName; //onoma yphresias
    protected float serviceFee; //pagio yphresias
    public Services(String name,float fee){
        this.serviceFee=fee;
        this.serviceName=name;
    }
    abstract float getServiceDiscount();
    abstract float getDataCost();
    abstract int getFreeData();
    abstract int getFreeMinutes();
    abstract int getFreeSMS();
    abstract float getMinutesCost();
    abstract float getSMSCost();
    abstract float getBudget();
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
    int getFreeData() {return 0;}//implementation methodou (den yparxei free data se yphresias kinhths thlefwnias)
    float getDataCost() {return 0;}//implementation methodou (den yparxei data cost se yphresias kinhths thlefwnias)
    float getServiceDiscount(){return 0;}//geter gia ekptwsh yphresias
    int getFreeMinutes() {return this.freeMinutes;}//geter gia dwrean lepta yphresias 
    int getFreeSMS() {return this.freeSMS;}//geter gia dwrean sms 
    float getMinutesCost() {return this.minutesCost;}//geter gia kostos ana lepto
    float getSMSCost() {return this.smsCost;}//getter gia kostos ana sms
    float getBudget() {return 0;}//geter gia diathesimo ypoloipo (yphresies kartosymbolaiou)
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
    int getFreeData(){return this.freeData;}//geter gia free data
    float getDataCost(){return this.dataCost;}//geter gia data cost
    float getServiceDiscount(){return this.discount;} //geter gia thn ekptwsh ths uphresias
    int getFreeMinutes() {return 0;}// arxh implemantation methodwn pou den efarmozontai gia data services 
    int getFreeSMS() {return 0;}
    float getMinutesCost() {return 0;}
    float getSMSCost() {return 0;}// telos implementation methodwn pou den efarmozontai gia data services
    float getBudget() {return 0;}//methodos gia to ypoloipo budget gia kartosymbolaia
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
    float getServiceDiscount(){return this.discount;}//geter gia ekptwsh yphresias
    @Override
    float getBudget(){return this.budget;}//getter gia diathesimo ypoloipo
}
class nonCardContract extends PhoneServices{ //Programma symvolaioy
    private final float discount=(float)0.2; //Ypothetoume ekptwsh pou dinetai sthn ekfwnhsh
    public nonCardContract(String name,float fee,int mins,int sms,float minCost,float smsCost){
        super(name,fee,mins,sms,minCost,smsCost);
    }
    public String toString(){
        return "Service type: non Card Contract  Service name: "+this.serviceName+"  Service Fee: "+this.serviceFee+"  Free minutes: "+this.freeMinutes+"  Minutes cost: "+this.minutesCost+"  Free SMS: "+this.freeSMS+"  SMS Cost: "+this.smsCost;
    }
    float getServiceDiscount(){return this.discount;}//geter gia ekptwsh yphresias
}