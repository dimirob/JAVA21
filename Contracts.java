import java.util.Date;
class Contracts  {
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
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.minutesToCell=minutesToCell;
        this.minutestoBase=minutestoBase;
        this.sms=sms;
        this.discount=discount;
    }
    public Contracts(Services serviceName,String clientName,String clientNumber,Date activationDate,String paymentMethod,int data,float discount){
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.data=data;
        this.discount=discount;
    }
    Services getContractService(Contracts cont){
        return cont.serviceName;
    }
    public String toString(){
        if (this.serviceName.getClass().getName()=="DataServices") return "Name: "+this.clientName+" client number: "+this.clientNumber+" activation date "+this.activationDate+" payment method: "+this.paymentMethod+" data: "+this.data+" special discount: "+this.discount;
        else return "Name: "+this.clientName+" client number: "+this.clientNumber+" activation date "+this.activationDate+" payment method: "+this.paymentMethod+" minutes to cellphones: "+this.minutesToCell+" minutes to base phones: "+this.minutestoBase+" special discount: "+this.discount;
    }
}
