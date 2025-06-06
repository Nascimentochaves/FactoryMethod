package baseOvo;

public class OvoGranja implements Ovo{
    @Override
    public String getTipoOvo(){
        try {
            return ("Ovo de granja");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}
