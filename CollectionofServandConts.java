import java.util.ArrayList;
class CollectionofServandConts {
    private ArrayList<Services> serviceArray; //ArrayList gia tis diathesimes yphresies 
    private ArrayList<Contracts> contractArray; //ArrayList gia ta energa sumvolaia
    public CollectionofServandConts(){
        this.serviceArray=new ArrayList<Services>();
        this.contractArray=new ArrayList<Contracts>();
    }   
    void addToCollection(Services serv){
        this.serviceArray.add(serv);
    }
    void addToCollection(Contracts cont){
        this.contractArray.add(cont);
    }
    Services getFromServices(int i){
        return this.serviceArray.get(i);
    }
    Contracts getFromContracts(int i){
        return this.contractArray.get(i);
    }
    int getServicesLength(){
        return this.serviceArray.size();
    }
    int getContractLength(){
        return this.contractArray.size();
    }
    String getServiceType(Services serv){
        return serv.getClass().getName();
    }
    int getConId(Contracts con){
        return this.contractArray.indexOf(con);
    }
    int getServId(Services serv){
        return this.serviceArray.indexOf(serv);
    }
}