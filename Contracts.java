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
    public Contracts(Services serviceName,String clientName,String clientNumber,Date activationDate,String paymentMethod,int minutesToCell,int minutestoBase,int sms){
        this.id=id;
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.minutesToCell=minutesToCell;
        this.minutestoBase=minutestoBase;
        this.sms=sms;
        id+=1;
    }
    public Contracts(Services serviceName,String clientName,String clientNumber,Date activationDate,String paymentMethod,int data){
        this.id=id;
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.data=data;
        id+=1;
    }
}
