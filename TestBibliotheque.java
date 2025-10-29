package tp6;

public class TestBibliotheque {
    public static void main(String[] args) {
    	Bibliotheque b= new Bibliotheque(10);
        Document d1 = new Document("journal",1,3);
        Document d2 = new Document("Kafka",2,3);
        Article a1= new Article("Fiodor",5,20,"Dostovsky");
        Livre l1= new Livre ("Pride and prejudice",3,347,"Jane Austen","Collector's Edition");
        Livre l2= new Livre("La ferme des animaux",7,92,"Goerge Orwell","Secker and Warburg");
        Periodique p=new Periodique("National Giographic",10,2022,305);

        b.Ajout_doc(d1);
        b.Ajout_doc(d2);
        b.Ajout_doc(a1);
        b.Ajout_doc(l1);
        b.Ajout_doc(l2);
        b.Ajout_doc(p);
        
   

        b.Supprim_doc(d1.numId);

        System.out.println("La liste de bibliotheque triée par id: ");
        b.Inventair_doc();
        System.out.println("______________________________________________");
        System.out.println("La liste des articles: ");
        b.liste_article().Inventair_doc();
        System.out.println("______________________________________________");
        System.out.println("La liste des documents simple: ");
        b.liste_docsipmle().Inventair_doc();
        System.out.println("______________________________________________");
        System.out.println("La liste des livres: ");
        b.liste_livre().Inventair_doc();
        System.out.println("______________________________________________");
        System.out.println("La liste des periodiques: ");
        b.liste_periodique().Inventair_doc();
    }
}
