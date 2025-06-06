package baseTomates;

public class TomateNormal implements Tomate{

    @Override
    public String getTipoTomate() {
        try {
            return ("Tomate normal");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
