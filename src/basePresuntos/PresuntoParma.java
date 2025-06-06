package basePresuntos;



public class PresuntoParma implements Presunto{

    @Override
    public String getTipoPresunto() {
        try {
            return ("Presunto de Parma");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
