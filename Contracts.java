import java.sql.Date;
class Contracts {
    int id; //kwdikos sumbolaioy
    String serviceName; //onoma yphresias
    String clientName; //onoma pelath
    int clientNumber; //arithmos thlefwnou pelath
    Date activationDate; //hmerominia energopoihshs
    String paymentMethod; //tropos plhrwmhs
    int minutestoBase; //lepta omilias pros stathera
    int minutesToCell; //lepta omilias pros kinhta
    int sms; //arithmos sms
    int data; //ogkos dedomenwn
    public Contracts(int id,String serviceName,String clientName,int clientNumber,Date activationDate,String paymentMethod,int minutesToCell,int minutestoBase,int sms){
        this.id=id;
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.minutesToCell=minutesToCell;
        this.minutestoBase=minutestoBase;
        this.sms=sms;
    }
    public Contracts(int id,String serviceName,String clientName,int clientNumber,Date activationDate,String paymentMethod,int minutesToCell,int data){
        this.id=id;
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
        this.data=data;
    }
}
