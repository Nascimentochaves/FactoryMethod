package baseSanduiches;

import baseOvo.*;
import basePaes.*;
import basePresuntos.*;
import baseQueijos.*;
import baseTomates.*;

public class PrimeiroSanduiche extends Sanduiche{
    @Override
    public Pao criarPao() {
        try {
            return new PaoBola();

        } catch (Exception err){
            System.out.println("Erro ao criar pao (S1)");
        }
        return null;
    }

    @Override
    public Presunto criarPresunto() {
        try {
            return new PresuntoPeru();

        } catch (Exception err){
            System.out.println("Erro ao criar presunto (S1)");
        }
        return null;
    }

    @Override
    public Queijo criarQueijo() {
        try {
            return new QueijoCheddar();
        } catch (Exception err){
            System.out.println("Erro ao criar queijo (S1)");
        }
        return null;
    }

    @Override
    public Ovo criarOvo() {
        try {
            return new OvoCapoeira();
        } catch (Exception err){
            System.out.println("Erro ao criar ovo (S1)");
        }
        return null;
    }

    @Override
    public Tomate criarTomate() {
        try {
            return new TomateNormal();
        } catch (Exception err){
            System.out.println("Erro ao criar tomate (S1)");
        }
        return null;
    }
}
