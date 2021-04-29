import java.util.ArrayList;
class Collections {
    private ArrayList<Services> serviceArray; //ArrayList gia tis diathesimes yphresies 
    private ArrayList<Contracts> contractArray; //ArrayList gia ta energa sumvolaia
    public Collections(){
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
}