import baseTomates.Tomate;

public class TomateItaliano implements Tomate {

    @Override
    public String getTipoTomate() {
        try {
            return ("Tomate Italiano");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}