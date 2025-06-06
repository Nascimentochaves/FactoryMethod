package baseTomates;

public class TomateCereja implements Tomate{

    @Override
    public String getTipoTomate() {
        try {
            return ("Tomate Cereja");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}