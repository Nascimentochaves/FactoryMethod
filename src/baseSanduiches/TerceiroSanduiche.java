package baseSanduiches;

import baseOvo.*;
import basePaes.*;
import basePresuntos.*;
import baseQueijos.*;
import baseTomates.*;

public class TerceiroSanduiche extends Sanduiche{
    @Override
    public Pao criarPao() {
        try {
            return new PaoFrances();

        } catch (Exception err){
            System.out.println("Erro ao criar pao (S3)");
        }
        return null;
    }

    @Override
    public Presunto criarPresunto() {
        try {
            return new PresuntoPeru();

        } catch (Exception err){
            System.out.println("Erro ao criar presunto (S3)");
        }
        return null;
    }

    @Override
    public Queijo criarQueijo() {
        try {
            return new QueijoPrato();
        } catch (Exception err){
            System.out.println("Erro ao criar queijo (S3)");
        }
        return null;
    }

    @Override
    public Ovo criarOvo() {
        try {
            return new OvoCapoeira();
        } catch (Exception err){
            System.out.println("Erro ao criar ovo (S3)");
        }
        return null;
    }

    @Override
    public Tomate criarTomate() {
        try {
            return new TomateNormal();
        } catch (Exception err){
            System.out.println("Erro ao criar tomate (S3)");
        }
        return null;
    }
}

