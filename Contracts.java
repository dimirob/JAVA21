import java.util.Scanner;
class Contracts  {
    private Services serviceName; //yphresia
    private String clientName; //onoma pelath
    private String clientNumber; //arithmos thlefwnou pelath
    private String activationDate; //hmerominia energopoihshs
    private String paymentMethod; //tropos plhrwmhs
    private int minutestoBase; //lepta omilias pros stathera
    private int minutesToCell; //lepta omilias pros kinhta
    private int sms; //arithmos sms
    private int data; //ogkos dedomenwn
    float discount; //endexomenh ekptwsh gia kathe symvolaio ksexwrista
    public Contracts(Services serviceName,String clientName,String clientNumber,String activationDate,String paymentMethod,int minutesToCell,int minutestoBase,int sms,float discount){
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
    public Contracts(Services serviceName,String clientName,String clientNumber,String activationDate,String paymentMethod,int data,float discount){
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
    static void setStats(Contracts con){
        Scanner sc=new Scanner(System.in);
        if (con.serviceName.getClass().getName()=="DataServices"){
            System.out.print("Enter data usage");
            con.data=sc.nextInt();
        }
        else{
            System.out.println("Enter minutes to cell");
            con.minutesToCell=sc.nextInt();
            System.out.println("Enter minutes to base phones");
            con.minutestoBase=sc.nextInt();
            System.out.println("Enter SMS");
            con.sms=sc.nextInt();
        }
    }
    static float getCost(CollectionofServandConts coll,Contracts con,Services serv){//function pou pairnei ws parametrous ta collections pou briskontai contracts kai services,to symvolaio,kai thn yphresia tou symvolaioy
        switch(coll.getServiceType(serv)){
            case "DataServices"://periptwsh data sumbolaiou
                float fee=serv.getServiceFee();
                int freedata=serv.getFreeData();
                if (con.data<=freedata) return fee;
                else{
                    float servDiscount=serv.getServiceDiscount();
                    float dataCost=serv.getDataCost();
                    return (float)fee+(con.data-freedata)*dataCost-(servDiscount+con.discount)*((con.data-freedata)*dataCost+fee);
                }
            case "nonCardContract"://periptwsh symbolaiou kinhths thlefwnias
                fee=serv.getServiceFee();
                int freeMins=serv.getFreeMinutes();
                int freeSMS=serv.getFreeSMS();
                if(con.minutesToCell+con.minutestoBase<=freeMins & con.sms<=freeSMS) return fee;
                else{
                    float servDiscount=serv.getServiceDiscount();
                    float minCost=serv.getMinutesCost();
                    float smsCost=serv.getSMSCost();
                    float sumMinCost=con.minutesToCell+con.minutestoBase<=freeMins?0:(con.minutesToCell+con.minutesToCell-freeMins)*minCost;
                    float sumSMSCost=con.sms<=freeSMS?0:(con.sms-freeSMS)*smsCost;
                    return fee+sumMinCost+sumSMSCost-(fee+sumMinCost+sumSMSCost)*(con.discount+servDiscount);
                } 
            case "CardContract":
                fee=serv.getServiceFee();
                freeMins=serv.getFreeMinutes();
                freeSMS=serv.getFreeSMS();
                float budget=serv.getBudget();
                float servDiscount=serv.getServiceDiscount();
                float minCost=serv.getMinutesCost();
                float smsCost=serv.getSMSCost();
                float sumMinCost=con.minutesToCell+con.minutestoBase<=freeMins?0:(con.minutesToCell+con.minutesToCell-freeMins)*minCost;
                float sumSMSCost=con.sms<=freeSMS?0:(con.sms-freeSMS)*smsCost;
                float totalCost=fee+sumMinCost+sumSMSCost-(fee+sumMinCost+sumSMSCost)*(con.discount+servDiscount);
                if(totalCost<=budget) return budget-totalCost;
                else return budget; 
            default:
                return 0;
        }   
    }
}