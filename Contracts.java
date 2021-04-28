import java.sql.Date;
class Contracts {
    int id; //kwdikos sumbolaioy
    String serviceName; //onoma yphresias
    String clientName; //onoma pelath
    int clientNumber; //arithmos thlefwnou pelath
    Date activationDate; //hmerominia energopoihshs
    String paymentMethod; //tropos plhrwmhs
    public Contracts(int id,String serviceName,String clientName,int clientNumber,Date activationDate,String paymentMethod){
        this.id=id;
        this.serviceName=serviceName;
        this.clientName=clientName;
        this.clientNumber=clientNumber;
        this.activationDate=activationDate;
        this.paymentMethod=paymentMethod;
    }
    
}
