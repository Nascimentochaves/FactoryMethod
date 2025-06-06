package basePresuntos;

public class PresuntoDefumado implements Presunto {

    @Override
    public String getTipoPresunto() {
        try {
            return ("Presunto Defumado");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
