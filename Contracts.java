import java.util.Date;
class Contracts {
    private static int id=0; //kwdikos sumbolaioy
    private Services serviceName; //yphresia
    private String clientName; //onoma pelath
    private String clientNumber; //arithmos thlefwnou pelath
    private Date activationDate; //hmerominia energopoihshs
    private String paymentMethod; //tropos plhrwmhs
    private int minutestoBase; //lepta omilias pros stathera
    private int minutesToCell; //lepta omilias pros kinhta
    private int sms; //arithmos sms
    private int data; //ogkos dedomenwn
    float discount; //endexomenh ekptwsh gia kathe symvolaio ksexwrista
    public Contracts(Services serviceName,String clientName,String clientNumber,Date activationDate,String paymentMethod,int minutesToCell,int minutestoBase,int sms,float discount){
        this.id=id;
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.minutesToCell=minutesToCell;
        this.minutestoBase=minutestoBase;
        this.sms=sms;
        this.discount=discount;
        id+=1;
    }
    public Contracts(Services serviceName,String clientName,String clientNumber,Date activationDate,String paymentMethod,int data,float discount){
        this.id=id;
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.data=data;
        this.discount=discount;
        id+=1;
    }
    Services getContractService(Contracts cont){
        return cont.serviceName;
    }
    public String toString(){
        return "Name: "+this.clientName+" client number: "+this.clientNumber+" activation date "+this.activationDate+" payment method: "+this.paymentMethod;
    }
}
