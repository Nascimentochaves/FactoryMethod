package baseQueijos;

public class QueijoPrato implements Queijo{
    @Override
    public String getTipoQueijo() {
        try {
            return ("Queijo prato");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
