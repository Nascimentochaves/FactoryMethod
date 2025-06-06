package baseQueijos;

public class QueijoCheddar implements Queijo{
    @Override
    public String getTipoQueijo() {
        try {
            return ("Queijo cheddar");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
