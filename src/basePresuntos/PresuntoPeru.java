package basePresuntos;

public class PresuntoPeru implements Presunto{
    @Override
    public String getTipoPresunto() {
        try {
            return ("Presunto de peru");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
