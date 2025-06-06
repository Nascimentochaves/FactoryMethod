package baseOvo;


public class OvoDeCodorna implements Ovo{
    @Override
    public String getTipoOvo(){
        try {
            return ("Ovo de Codorna");
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }
}