package td1;


/**
* td1/_GestionSallesStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Thomas/eclipse-workspace/TP_Service_Salles_Corba/src/td1.idl
* jeudi 28 mai 2020 17 h 25 CEST
*/

public class _GestionSallesStub extends org.omg.CORBA.portable.ObjectImpl implements td1.GestionSalles
{

  public boolean ajouterSalle (String nomSalle, int nbPlaces)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ajouterSalle", true);
                $out.write_string (nomSalle);
                $out.write_long (nbPlaces);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return ajouterSalle (nomSalle, nbPlaces        );
            } finally {
                _releaseReply ($in);
            }
  } // ajouterSalle

  public boolean salleExiste (String nomSalle)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("salleExiste", true);
                $out.write_string (nomSalle);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return salleExiste (nomSalle        );
            } finally {
                _releaseReply ($in);
            }
  } // salleExiste

  public int capaciteSalle (String nomSalle)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("capaciteSalle", true);
                $out.write_string (nomSalle);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return capaciteSalle (nomSalle        );
            } finally {
                _releaseReply ($in);
            }
  } // capaciteSalle

  public int disponibiliteSalle (String nomSalle)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disponibiliteSalle", true);
                $out.write_string (nomSalle);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return disponibiliteSalle (nomSalle        );
            } finally {
                _releaseReply ($in);
            }
  } // disponibiliteSalle

  public String placerPersonne (String nomPersonne)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("placerPersonne", true);
                $out.write_string (nomPersonne);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return placerPersonne (nomPersonne        );
            } finally {
                _releaseReply ($in);
            }
  } // placerPersonne

  public boolean placerPersonneDansSalle (String nomSalle, String nomPersonne)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("placerPersonneDansSalle", true);
                $out.write_string (nomSalle);
                $out.write_string (nomPersonne);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return placerPersonneDansSalle (nomSalle, nomPersonne        );
            } finally {
                _releaseReply ($in);
            }
  } // placerPersonneDansSalle

  public String salleAttribuee (String nomPersonne)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("salleAttribuee", true);
                $out.write_string (nomPersonne);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return salleAttribuee (nomPersonne        );
            } finally {
                _releaseReply ($in);
            }
  } // salleAttribuee

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:td1/GestionSalles:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _GestionSallesStub
