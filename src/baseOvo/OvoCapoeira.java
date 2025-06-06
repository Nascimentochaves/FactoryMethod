package baseOvo;

public class OvoCapoeira implements Ovo{
    @Override
    public String getTipoOvo(){
        try{
            return ("Ovo de capoeira");
        } catch (Exception err) {
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
