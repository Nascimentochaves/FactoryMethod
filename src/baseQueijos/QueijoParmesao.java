package baseQueijos;


public class QueijoParmesao implements Queijo{
    @Override
    public String getTipoQueijo() {
        try {
            return ("Queijo Parmesão");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
