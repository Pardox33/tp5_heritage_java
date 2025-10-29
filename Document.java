package tp6;

public class Document {
	protected String titre;
	protected int numId,nbPage;
	
	public Document(String titre, int numId,int nbPage){
		this.titre=titre;
		this.numId=numId;
		this.nbPage=nbPage;
	}
	@Override
	public String toString() {
	    return "Document : " + titre + " / " + numId + " / " + nbPage;
	}
}

 class Article extends Document{
	 protected String nomAuteur;
	 
	 Article(String titre, int numId,int nbPage,String nomAuteur){
		 super(titre,numId,nbPage);
		 this.nomAuteur=nomAuteur;
	 }
	 @Override
	 public String toString() {
		return "Article : "+titre+" / "+nomAuteur+" / "+numId+" / "+nbPage;
	}
 }
 
class Livre extends Article{
	 private String nomEditeur;
	 
	 Livre(String titre, int numId,int nbPage,String nomAuteur,String nomEditeur){
		 super(titre,numId,nbPage,nomAuteur);
		 this.nomEditeur=nomEditeur;
	 }
	 
	 String getNomEditeur() {
		 return nomEditeur;
	 }
	 @Override
	 public String toString() {
		return "Livre : "+titre+" / "+nomAuteur+" / "+nomEditeur+" / "+numId+" / "+nbPage;
	}
 }
 
 class Periodique extends Document{
	 private int freqParution;
	 
	 Periodique(String titre, int numId,int nbPage,int freqParution){
		 super(titre,numId,nbPage);
		 this.freqParution=freqParution;
	 }
	 
	 int getFreqParution() {
		 return freqParution;
	 }
	 @Override
	 public String toString() {
		return "Periodique : "+titre+" / "+numId+" / "+nbPage+" / "+freqParution;
	}
 }