int compterNombreDe1(Tableau A){
	int nombreDe1 = 0;
	foreach(ligne in A){
		int indexCourant = n/2; //n est le nombre d'elements d'une ligne
		
		//Boucle tant qu'on n'a pas atteint une des extremites ou jusqu'a ce que l'element courant vaille 1 et le suivant 0
		while( indexCourant != 0 && indexCourant != n-1 && !(ligne.element(indexCourant) == 1 && ligne.element(indexCourant + 1) == 0) )
		{
			if(ligne.element(indexCourant) == 1){
				//voir dans le sous-tableau de droite
				indexCourant += (n - indexCourant) / 2;
			}
			else {
				//voir dans le sous-tableau de gauche
				indexCourant /= 2;
			}
		}
		
		if(ligne.element(indexCourant) == 1 && (indexCourant== (n-1) || ligne.element(indexCourant + 1) == 0)){
			nombreDe1 += indexCourant + 1; //car l'index part de 0 donc s'il vaut 6 il faut ajouter 7 au nombre de 1.
		}
	}
	return nombreDe1;
}