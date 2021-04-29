import java.util.Calendar;
import java.util.Date;

class MainProgram {
    public static void main(String[] Args){
        Collections colls=new Collections(); //dhmiourgia antikeimenou gia ta collections

        colls.addToCollection(new DataServices("On the go",(float)20.50,500,(float)0.15)); //arxh arxikopoihshs katalogou yphresiwn
        colls.addToCollection(new DataServices("DataAth",(float)24.50,400,(float)0.12));
        colls.addToCollection(new CardContract("TalkALot", (float)14.40, 100, 100, (float)1.05, (float)0.1, (float)10.0));
        colls.addToCollection(new CardContract("TalkMore", (float)16.80, 110, 120, (float)1.15, (float)0.15, (float)8.0));
        colls.addToCollection(new nonCardContract("UNI student", (float)12.30, 300, 50, (float)0.9,(float)0.05));
        colls.addToCollection(new nonCardContract("Every Student", (float)12.50, 250, 100, (float)0.95,(float)0.12)); //telos arxikopoihshs katalogou yphresiwn
        
    
        colls.addToCollection(new Contracts(colls.getFromServices(0), "Dimitris Vosnakis", "8235799430",new Date(2020, 3, 19), "Cash", 210)); //arxh arxikopoihshs katalogou energwn symvolaiwn 
        colls.addToCollection(new Contracts(colls.getFromServices(0), "Serafeim Kapetanis", "235624626",new Date(2012, 2, 9), "Card", 20));
        colls.addToCollection(new Contracts(colls.getFromServices(1), "Elias Kalantzis", "3285694851", new Date(2017,6,14), "Card", 1245));
        colls.addToCollection(new Contracts(colls.getFromServices(1), "Giannis Apostolou", "98476291374", new Date(2018,9,16), "Card", 321));
        colls.addToCollection(new Contracts(colls.getFromServices(2), "Petros Poulios", "5237589702", new Date(2017, 2, 11), "Cash", 123, 20, 11));
        colls.addToCollection(new Contracts(colls.getFromServices(2), "Sarah Vosnaki", "9231749863", new Date(2021, 1, 24), "Card", 11, 10, 23));
        colls.addToCollection(new Contracts(colls.getFromServices(3), "Giannis Agrogannis", "0487238964", new Date(2011, 5, 14), "Cash", 112, 31, 1));
        colls.addToCollection(new Contracts(colls.getFromServices(3), "Giorgos Parasxos", "51862875", new Date(2013, 6, 12), "Cash", 675, 321, 12));
        colls.addToCollection(new Contracts(colls.getFromServices(4), "Arhs Poulios", "23412352", new Date(2014, 7, 22), "Card", 321, 13, 32));
        colls.addToCollection(new Contracts(colls.getFromServices(4), "Akhs Glykakis", "243516", new Date(2013, 6, 12), "Cash", 31, 133, 321));
        colls.addToCollection(new Contracts(colls.getFromServices(5), "Natalia Gorlia", "42124154", new Date(2020, 2, 22), "Cash", 1000, 122, 0));
        colls.addToCollection(new Contracts(colls.getFromServices(5), "Giorgos Parasxos", "51862875", new Date(2011, 10, 12), "Cash", 23,12, 123)); //telos arxikopoihshs katalogou yphresiwn






    }
    
}
