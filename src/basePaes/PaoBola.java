package basePaes;

public class PaoBola implements Pao{
    @Override
    public String getTipoPao() {
        try {
            return ("Pao bola");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
