package baseQueijos;

public class QueijoMussarela implements Queijo{
    @Override
    public String getTipoQueijo() {
        try {
            return ("Queijo mussarela");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
