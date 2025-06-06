package basePaes;

public class PaoFrances implements Pao{
    @Override
    public String getTipoPao() {
        try {
            return ("Pao frances");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
