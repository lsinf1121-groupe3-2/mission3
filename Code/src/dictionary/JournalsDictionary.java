package dictionary;

import java.util.HashMap;

import business.Journal;


public class JournalsDictionary extends HashMap<String, Journal>{
	
	public JournalsDictionary(){
		super(20000,(float)0.75);
	}
}
