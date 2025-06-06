package baseSanduiches;

import baseOvo.*;
import basePaes.*;
import basePresuntos.*;
import baseQueijos.*;
import baseTomates.*;

public class SegundoSanduiche extends Sanduiche{
    @Override
    public Pao criarPao() {
        try {
            return new PaoBola();

        } catch (Exception err){
            System.out.println("Erro ao criar pao (S2)");
        }
        return null;
    }

    @Override
    public Presunto criarPresunto() {
        try {
            return new PresuntoFrango();

        } catch (Exception err){
            System.out.println("Erro ao criar presunto (S2)");
        }
        return null;
    }

    @Override
    public Queijo criarQueijo() {
        try {
            return new QueijoMussarela();
        } catch (Exception err){
            System.out.println("Erro ao criar queijo (S2)");
        }
        return null;
    }

    @Override
    public Ovo criarOvo() {
        try {
            return new OvoGranja();
        } catch (Exception err){
            System.out.println("Erro ao criar ovo (S2)");
        }
        return null;
    }

    @Override
    public Tomate criarTomate() {
        try {
            return new TomateNormal();
        } catch (Exception err){
            System.out.println("Erro ao criar tomate (S2)");
        }
        return null;
    }
}
