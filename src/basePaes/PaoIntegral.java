package basePaes;

public class PaoIntegral implements Pao{
    @Override
    public String getTipoPao() {
        try {
            return ("Pao integral");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
