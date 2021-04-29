import java.util.ArrayList;
class AddToCollection {
    ArrayList<Services> serviceArray=new ArrayList<Services>(); //ArrayList gia tis diathesimes yphresies 
    ArrayList<Contracts> contractArray=new ArrayList<Contracts>(); //ArrayList gia ta energa sumvolaia
    public AddToCollection(Services serv,int i){
        this.serviceArray.set(i,serv);
    }   
     public AddToCollection(Contracts cont,int i){
        this.contractArray.set(i,cont);
     } 
}