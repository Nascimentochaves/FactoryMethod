package baseSanduiches;

import baseOvo.*;
import basePaes.*;
import basePresuntos.*;
import baseQueijos.*;
import baseTomates.*;

public abstract class Sanduiche {

    public String montarSanduiche() {
        try{
            Pao pao = criarPao();
            Queijo queijo = criarQueijo();
            Presunto presunto = criarPresunto();
            Ovo ovo = criarOvo();
            Tomate tomate = criarTomate();

            return ("Sanduiche montado com " + pao.getTipoPao() + ", " + queijo.getTipoQueijo() + ", " + presunto.getTipoPresunto() + ", " + ovo.getTipoOvo() + " e " + tomate.getTipoTomate());
        } catch (Exception err){
            System.out.println("Erro: " + err);
        }
        return null;
    }

    public abstract Pao criarPao();
    public abstract Presunto criarPresunto();
    public abstract Queijo criarQueijo();
    public abstract Ovo criarOvo();
    public abstract Tomate criarTomate();
}
