import java.util.Date;
import java.util.Scanner;
class MainProgram {
    public static void main(String[] Args){
        Collections colls=new Collections(); //dhmiourgia antikeimenou gia ta collections
        Scanner sc=new Scanner(System.in); // dhmiourgia antikeimenou gia diepafh xrhsth-ypologisth
        int choice; //metablhth gia epilogi xrhsth apo to menu

        colls.addToCollection(new DataServices("On the go",(float)20.50,500,(float)0.15)); //arxh arxikopoihshs katalogou yphresiwn
        colls.addToCollection(new DataServices("DataAth",(float)24.50,400,(float)0.12));
        colls.addToCollection(new CardContract("TalkALot", (float)14.40, 100, 100, (float)1.05, (float)0.1, (float)10.0));
        colls.addToCollection(new CardContract("TalkMore", (float)16.80, 110, 120, (float)1.15, (float)0.15, (float)8.0));
        colls.addToCollection(new nonCardContract("UNI student", (float)12.30, 300, 50, (float)0.9,(float)0.05));
        colls.addToCollection(new nonCardContract("Every Student", (float)12.50, 250, 100, (float)0.95,(float)0.12)); //telos arxikopoihshs katalogou yphresiwn
        
    
        colls.addToCollection(new Contracts(colls.getFromServices(0), "Dimitris Vosnakis", "8235799430",new Date(2020, 3, 19), "Cash", 210,(float)0.0)); //arxh arxikopoihshs katalogou energwn symvolaiwn 
        colls.addToCollection(new Contracts(colls.getFromServices(0), "Serafeim Kapetanis", "235624626",new Date(2012, 2, 9), "Card", 20,(float)0.2));
        colls.addToCollection(new Contracts(colls.getFromServices(1), "Elias Kalantzis", "3285694851", new Date(2017,6,14), "Card", 1245,(float)0.1));
        colls.addToCollection(new Contracts(colls.getFromServices(1), "Giannis Apostolou", "98476291374", new Date(2018,9,16), "Card", 321,(float)0.12));
        colls.addToCollection(new Contracts(colls.getFromServices(2), "Petros Poulios", "5237589702", new Date(2017, 2, 11), "Cash", 123, 20, 11,(float)0.0));
        colls.addToCollection(new Contracts(colls.getFromServices(2), "Sarah Vosnaki", "9231749863", new Date(2021, 1, 24), "Card", 11, 10, 23,(float)0.11));
        colls.addToCollection(new Contracts(colls.getFromServices(3), "Giannis Agrogannis", "0487238964", new Date(2011, 5, 14), "Cash", 112, 31, 1,(float)0.04));
        colls.addToCollection(new Contracts(colls.getFromServices(3), "Giorgos Parasxos", "51862875", new Date(2013, 6, 12), "Cash", 675, 321, 12,(float)0.05));
        colls.addToCollection(new Contracts(colls.getFromServices(4), "Arhs Poulios", "23412352", new Date(2014, 7, 22), "Card", 321, 13, 32,(float)0.22));
        colls.addToCollection(new Contracts(colls.getFromServices(4), "Akhs Glykakis", "243516", new Date(2013, 6, 12), "Cash", 31, 133, 321,(float)0.12));
        colls.addToCollection(new Contracts(colls.getFromServices(5), "Natalia Gorlia", "42124154", new Date(2020, 2, 22), "Cash", 1000, 122, 0,(float)0.03));
        colls.addToCollection(new Contracts(colls.getFromServices(5), "Giorgos Parasxos", "51862875", new Date(2011, 10, 12), "Cash", 23,12, 123,(float)0.0)); //telos arxikopoihshs katalogou yphresiwn

        printMenu(); //ektypwsh menu
        choice=sc.nextInt(); //epilogh xrhsth
        while (choice!=0){ //Eksodos apo to programma 
            switch(choice){
                case 1:
                    printServ(colls); //Func gia thn ektypwsh yphresiwn
                    break; 
                case 2:
                    System.out.println("Choose Service");
                    printServ(colls);
                    int serv=sc.nextInt(); //arithmos
                    if(colls.getServiceType(colls.getFromServices(serv))=="DataServices") createDataCont(colls.getFromServices(serv),colls); //an to symbolaio anaferetai se kinhto internet, kaloume katallhlo "kataskeyasth"
                    else createTalkCon(colls.getFromServices(serv),colls); //alliws kaloume to func "kataskeyasth" gia ta sumvolaia kinhths thlefwnias
                    break;
                case 3:
                    System.out.println("Print 1 for Data Service contracts");
                    System.out.println("Print 2 for Card Service contracts");
                    System.out.println("Print 3 for Non Card Service contracts");
                    serv=sc.nextInt(); //epilogh yphresias gia emfanish symbolaiwn 
                    printContbyType(serv,colls); //func gia emfanish sygkekrimenwn symbolaiwn 
                    break;
                case 4:
                    printCon(colls);
                    System.out.println("Choose contract id to update stats");
                    int con=sc.nextInt(); //id symbolaiou tou opoiou ta statistika tha ananewthoun
                    System.out.println(colls.getFromContracts(con)); //ektypwsh symbolaiou
                    Contracts.setStats(colls.getFromContracts(con)); //ananewsh statistikwn 
                    break;
                case 5:
                    printCon(colls);
                    System.out.println("Choose contract id to calculate cost");
                    con=sc.nextInt();
                    System.out.println(colls.getFromContracts(con));
                    System.out.println("Contract total cost: "+Contracts.getCost(colls,colls.getFromContracts(con),colls.getFromContracts(con).getContractService(colls.getFromContracts(con))));
            }
            printMenu();
            choice=sc.nextInt();
        }
        sc.close();


    }
    static void printMenu() {
        System.out.println("0: Eksodos apo menu"); //Arxh emfanishs menu
        System.out.println("1: Emfanish Diathesimwn yprhesiwn");  
        System.out.println("2: Dhmioyrgia neou symbolaioy");
        System.out.println("3: Emfanish symbolaiwn gia sygkekrimeno typo yphresias");
        System.out.println("4: Enhmerwsh statistikwn xrhshs symbolaioy");
        System.out.println("5: Ypologismos synolikou mhniaiou kostous (Symbolaia thlefwnias kai internet) kai diathesimo mhniaio ypoloipo gia kartosymbolaia");
        System.out.println("6: Ypologismos ypoloipou dwrean SMS kai xronou omilias gia kartosumbolaia kai symbolaia kin. thlefwnias, kai ypoloipoy dwrean data gia kinhto Internet"); //Telos emfanishs menu
    }
    static void printServ(Collections colls){
        for (int i=0;i<colls.getServicesLength();i++) System.out.println(colls.getFromServices(i)+"  service no: "+i); //Ektypwsh diathesimwn yphresiwn
    }
    static void printCon(Collections colls){
        for (int i=0;i<colls.getContractLength();i++) System.out.println(colls.getFromContracts(i)+"  Contract id: "+colls.getConId(colls.getFromContracts(i))); //Ektypwsh energwn symbolaiwn
    }
    static void createDataCont(Services serv,Collections colls){
        Scanner sc=new Scanner(System.in);
        System.out.println("Client name: "); //arxh sulloghs katallhlwn dedomenwn
        String name=sc.next();
        System.out.println("Client number: ");
        String num=sc.next();
        System.out.println("Activation Year: ");
        int year=sc.nextInt();
        System.out.println("Activation Month: ");
        int month=sc.nextInt();
        System.out.println("Activation day: ");
        int day=sc.nextInt();
        Date actDate=new Date(year, month, day);
        System.out.println("Payment method: ");
        String payMethod=sc.next();
        System.out.println("Data usage: ");
        int data=sc.nextInt();
        System.out.println("Special discount (if there is no discount enter 0): ");
        float discount=sc.nextFloat(); //telos sylloghs katallhlwn dedomenwn
        colls.addToCollection(new Contracts(serv, name, num, actDate, payMethod, data, discount)); //prosthkh neou symvolaioy-antikeimenou sthn sullogh symvolaiwn
        sc.close();
    }
    static void createTalkCon(Services serv,Collections colls){
        Scanner sc=new Scanner(System.in);
        System.out.println("Client name: "); //arxh sylloghs katallhlwn dedomenwn
        String name=sc.next();
        System.out.println("Client number: ");
        String num=sc.next();
        System.out.println("Activation Year: ");
        int year=sc.nextInt();
        System.out.println("Activation Month: ");
        int month=sc.nextInt();
        System.out.println("Activation day: ");
        int day=sc.nextInt();
        Date actDate=new Date(year, month, day);
        System.out.println("Payment method: ");
        String payMethod=sc.next();
        System.out.println("Minutes to cell phones: ");
        int minutesToCell=sc.nextInt();
        System.out.println("Minutes to base phones: ");
        int minutestoBase=sc.nextInt();
        System.out.println("SMS: ");
        int sms=sc.nextInt();
        System.out.println("Special discount (if there is no discount enter 0): "); //telos sylloghs katallhlwn dedomenwn
        float discount=sc.nextFloat();
        colls.addToCollection(new Contracts(serv, name, num, actDate, payMethod, minutesToCell,minutestoBase,sms, discount)); //prosthkh neou symvolaioy-antikeimenou sthn sullogh symvolaiwn
        sc.close();
    }
    static void printContbyType(int serv,Collections colls){
        switch(serv){
            case 1:
                for (int i=0;i<colls.getContractLength();i++){
                    if (colls.getServiceType(colls.getFromContracts(i).getContractService(colls.getFromContracts(i)))=="DataServices") System.out.println(colls.getFromContracts(i)); //epilegoume mono dataservice contracts
                }
                break;
            case 2:
                for (int i=0;i<colls.getContractLength();i++){
                    if (colls.getServiceType(colls.getFromContracts(i).getContractService(colls.getFromContracts(i)))=="CardContract") System.out.println(colls.getFromContracts(i)); //epilegoume mono Card contracts
                }
                break;
            case 3:
                for (int i=0;i<colls.getContractLength();i++){
                    if (colls.getServiceType(colls.getFromContracts(i).getContractService(colls.getFromContracts(i)))=="nonCardContract") System.out.println(colls.getFromContracts(i)); //epilegoume mono nonCard contracts
                }
                break;
                
        }
    }
}
