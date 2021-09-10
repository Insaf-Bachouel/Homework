
## Homework: Partition Function
Ce projet s'inscrit dans le cadre de la réalisation d'un test en java ou on est amené à créer une fonction « partition » qui prend en paramètre une « liste » 
une « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » élément.
La solution devra avoir la possibilité d'etre utilisée par d'autres applications. 
Exemple d'inputs et outputs : 
 *partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
 
 ## Démarrage
 
 - Pour l'execution du projet il suffit d'executer la commande "java -cp partition-0.0.1-SNAPSHOT.jar com.partition.Partition" sous le répertoire target du projet et ça devrait afficher 
 [[1, 2], [3, 4], [5]] qui est le résultat de l'execution de la fonction pour la liste qu'on a définit dans la méthode main. 
 - Il est possible d'executer le projet avec un ide tel que Eclipse, STS, Intellij.. 


## Integration dans d'autres applications
Pour utiliser la fonction dans d'autres aplications il suffit de :
- importer le fichier "partition-0.0.1-SNAPSHOT.jar" en tant que "External Archives" dans votre projet.
- Appeler la fonction grace à : Partition.partitionFunction(votre liste, la taille souhaitée) et il suffit d'ajouter l'import "import partition.Partition"pour que ça marche. 







