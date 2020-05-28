package td1;

import java.util.ArrayList;
import java.util.List;

public class Salle 
{
	// Attributs d'une salle
	private String nomSalle;
	private int capaciteSalle;
	private List<String> personnes;
	
	// Constructeur d'une salle
	public Salle(String nom, int capacite) {
		nomSalle = nom;
		capaciteSalle = capacite;
		personnes = new ArrayList<String>();
	}
	
	// Méthodes 
	public boolean addPersonne(String personne) {
		if (personnes.contains(personne))
			return false;
		
		if (personnes.size() >= capaciteSalle)
			return false;
		
		personnes.add(personne);
		return true;
	}
	
	public boolean removePersonne(String personne)
	{
		if (!personnes.contains(personne))
			return false;
		
		personnes.remove(personne);
		return true;
	}
	
	public boolean containsPersonne(String personne)
	{
		return personnes.contains(personne);
	}
	
	public int getCapacite()
	{
		return capaciteSalle;
	}
	
	public int getPlacesDisponibles()
	{
		return capaciteSalle - personnes.size();
	}

	public String getNomSalle()
	{
		return nomSalle;
	}

	// Deux salles sont égales si elles ont le même nom
	public boolean equals(Object autreSalle)
	{
		if (autreSalle == null) return false;
		else
		{
			if (autreSalle instanceof Salle)
			{
				Salle s = (Salle) autreSalle;
				return s.getNomSalle().equals(nomSalle);
			}
			else return false;
		}
	}
}