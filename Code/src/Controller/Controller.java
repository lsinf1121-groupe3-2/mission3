package Controller;

import interpreter.Interpreter;

import java.io.*;

import dialog.Dialog;
import dictionary.JournalsDictionary;
import business.Journal;

/**
 *
 * @author Tanguy
 */
public class Controller {

    Interpreter csvInterpereter;
    String commandFile = "Journals.csv";
    BufferedReader br;
    JournalsDictionary catalog;

    /**
     * @pre --
     * @post l'objet est dans un état cohérent et prêt à être utilisé
     */
    public Controller() {
        this.csvInterpereter = new Interpreter();
    }
    
    /**
     * @pre la variable commandFile est initialisée
     * @post le fichier renseigné dans la variable commandFile est ouvert et prêt à être lu; la variable br est initialisée.
     * Si le fichier n'existe pas, le programme se termine avec le code d'erreur -2.
     */
    private void initializeReader(){
		try {
			InputStream ips = new FileInputStream(commandFile);
			InputStreamReader ipsr = new InputStreamReader(ips);
			this.br = new BufferedReader(ipsr);
		} catch (FileNotFoundException e1) {
			System.out.println("Commands file not found. please check the path.");
			System.exit(-2);
		}
    }
    
    /**
     * @pre les variables bw et br sont initialisées.
     * @post Les fichiers ouverts par le programme sont fermés.
     * Le programme se termine avec le code d'erreur -4 si il ne parvient pas à fermer correctement les fichiers.
     */
    private void closeFiles(){
    	try {
			br.close();
		} catch (IOException e) {
			System.out.println("Error while closing files.");
			System.exit(-4);
		}
    }
    
    /**
     * @pre Les variables bw et br sont initialisées.
     * @post Le fichier d'entrée à été entièrement lu et interprété.
     * Les journaux ont été ajoutés au dictionnaire
     */
    private void interpreteFile(){
    	String commandLigne;
		try {
			commandLigne = br.readLine(); //read the first line and drop it
			while ((commandLigne = br.readLine())!=null){
				if (!commandLigne.equalsIgnoreCase(""))
				{
					 Journal result = csvInterpereter.interprete(commandLigne); 
					 if (result!=null)
					 {
						 catalog.put(result.getTitle(), result);
					 }
				}
			}
		} catch (IOException e) {
			System.out.println("Error while I/O operations");
			System.exit(-5);
		}
    }

    /**
     * @pre --
     * @post La logique métier permettant de lire le fichier d'entrée contenant les commandes PostScript a été exécutée.
     * Le résultat a été écrit dans le fichier de sortie.
     * Les fichiers ont été fermés correctement.
     */
    public void start(String[] args) {
    	catalog = new JournalsDictionary();
    	this.initializeReader();
		this.interpreteFile();
		Dialog userDialog = new Dialog (catalog);
		userDialog.start();
		this.closeFiles();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller applicationController = new Controller();
        applicationController.start(args);
    }

}
