package dictionary;

import java.util.HashMap;

import business.Journal;


public class JournalsDictionary extends HashMap<String, Journal>{
	
	public JournalsDictionary(){
		//On h�sitait � mettre super(20000) car on conaissait la taille du fichier utilis�
		super();
	}
}
