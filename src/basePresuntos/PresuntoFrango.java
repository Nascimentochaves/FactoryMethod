package basePresuntos;

public class PresuntoFrango implements Presunto{

    @Override
    public String getTipoPresunto() {
        try {
            return ("Presunto de frango");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
