package tp6;

public class Bibliotheque {
	private Document[] Listdoc;
	private int nbDocument;
	private int Capacite;
	
	Bibliotheque(int Capacite){
		this.Capacite=Capacite;
		Listdoc= new Document[Capacite];
		
	}
	
	int getCapacite() {
		return Capacite;
	}
	
	int getNombre_document() {
		return nbDocument;
	} 
	
	void Ajout_doc(Document d) {
		if(nbDocument<Capacite){
			if(nbDocument==0) {
				Listdoc[0]=d;
				nbDocument++;
				return;
			}
			int i=0;
			while(i<nbDocument && Listdoc[i].numId<d.numId){
				i++;
			}
			for(int j=nbDocument;j>i;j--) {
				Listdoc[j]=Listdoc[j-1];
			}
			Listdoc[i]=d;
			nbDocument++;
		}
		else
			System.out.println("Erreur: Rempli");
	}
	
	void Supprim_doc(int num) {
		if(nbDocument==0) {
			System.out.println("Vide");
			return;
		}
		int i=0;
		while (i<nbDocument && Listdoc[i].numId!=num) {
			i++;
		}
		if(i==nbDocument) {
			System.out.println("Non existant");
			return;
		}
		for(int j=i;j<nbDocument;j++) {
				Listdoc[j]=Listdoc[j+1];
			}
		nbDocument--;
	}

	
	void Inventair_doc() {
		for(int i=0;i<nbDocument;i++) {
			System.out.println(Listdoc[i].toString());
		}
	}
	
	Bibliotheque liste_livre() {
		Bibliotheque bLivre= new Bibliotheque(10);
		int j=0;
			for(int i=0;i<nbDocument;i++) {
				if(Listdoc[i] instanceof Livre) {
					bLivre.Ajout_doc(Listdoc[i]);
					j++;
				}
			}
		bLivre.nbDocument=j;
		return bLivre;
	}
	
	Bibliotheque liste_article() {
		Bibliotheque bArticle= new Bibliotheque(10);
		int j=0;
			for(int i=0;i<nbDocument;i++) {
				if(Listdoc[i] instanceof Article &&
					!(Listdoc[i] instanceof Livre)) {
					bArticle.Ajout_doc(Listdoc[i]);
					j++;
				}
			}
		bArticle.nbDocument=j;
		return bArticle;
	}
	
	Bibliotheque liste_docsipmle() {
		Bibliotheque bdocsimple= new Bibliotheque(10);
		int j=0;
			for(int i=0;i<nbDocument;i++) {
				if(	!(Listdoc[i] instanceof Article) &&
					!(Listdoc[i] instanceof Livre) &&
					!(Listdoc[i] instanceof Periodique) ) {
					bdocsimple.Ajout_doc(Listdoc[i]);
					j++;
				}
			}
		bdocsimple.nbDocument=j;
		return bdocsimple;
	}
	
	Bibliotheque liste_periodique() {
		Bibliotheque bPeriodique= new Bibliotheque(10);
		int j=0;
			for(int i=0;i<nbDocument;i++) {
				if(Listdoc[i] instanceof Periodique) {
					bPeriodique.Ajout_doc(Listdoc[i]);
					j++;
				}
			}
		bPeriodique.nbDocument=j;
		return bPeriodique;
	}
	
}
