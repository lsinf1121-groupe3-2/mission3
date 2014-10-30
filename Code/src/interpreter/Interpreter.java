package interpreter;

import business.Journal;

public class Interpreter {

	/**
	 * 
	 * @param commandLigne
	 * @return le journal ou null si la ligne n'a pas pu etre interprétée
	 */
	public Journal interprete(String commandLigne) {
		Journal journal = null;
		if(commandLigne != null && !commandLigne.isEmpty()){
			String args[] = commandLigne.split(",", -1);
			if(args.length > 8){
				//there was a ',' inside a field.
				//guess it's in the title field so merge these fields
				for(int i = 2; i < args.length - 8; i++){
					args[1] += args[i];
				}
			}
			if (args.length < 8){
				System.out.println("incorrect line!");
			}
			else{
				journal = new Journal();
				journal.setRank(args[0]);
				journal.setTitle(args[1]);
				journal.setFoR1(args[2]);
				journal.setFoR1Name(args[3]);
				journal.setFoR2(args[4]);
				journal.setFoR2Name(args[5]);
				journal.setFoR3(args[6]);
				journal.setFoR3Name(args[7]);
				return journal;
			}
		}
		return null;
	}

}
