package td1;

import java.util.List;

public class GestionSallesImpl extends GestionSallesPOA 
{
	private List<Salle> listeSalles;

	@Override
	public boolean ajouterSalle(String nomSalle, int nbPlaces) {
		// TODO Auto-generated method stub
		Salle salle = new Salle(nomSalle, nbPlaces);
		return listeSalles.add(salle);
	}

	@Override
	public boolean salleExiste(String nomSalle) 
	{
		boolean exists = false;
		
		for(Salle salle: listeSalles)
		{
			if (salle.getNomSalle().equals(nomSalle))
			{
				exists = true;
			}
		}
		return exists;
	}

	@Override
	public int capaciteSalle(String nomSalle) 
	{
		int capacite = -1;
		
		for(Salle salle: listeSalles)
		{
			if (salle.getNomSalle().equals(nomSalle))
			{
				capacite = salle.getCapacite();
			}
		}
		
		return capacite;
	}

	@Override
	public int disponibiliteSalle(String nomSalle) 
	{
		int dispo = -1;
		
		for(Salle salle: listeSalles)
		{
			if (salle.getNomSalle().equals(nomSalle))
			{
				dispo = salle.getPlacesDisponibles();
			}
		}
		
		return dispo;
	}

	@Override
	public String placerPersonne(String nomPersonne) 
	{
		String nomSalle = "";
		
		for(Salle salle: listeSalles)
		{
			if (salle.addPersonne(nomPersonne))
			{
				nomSalle = salle.getNomSalle();
			}
		}
		
		return nomSalle;
	}

	@Override
	public boolean placerPersonneDansSalle(String nomSalle, String nomPersonne) 
	{
		boolean place = false;
		
		for(Salle salle: listeSalles)
		{
			if (salle.getNomSalle().equals(nomSalle))
			{
				place = salle.addPersonne(nomPersonne);
			}
		}
		
		return place;
	}

	@Override
	public String salleAttribuee(String nomPersonne) 
	{
		String nomSalle = "";
		
		for(Salle salle: listeSalles)
		{
			if (salle.containsPersonne(nomPersonne))
			{
				nomSalle = salle.getNomSalle();
			}
		}
		
		return nomSalle;
	}

}
