import model.*;

import java.util.ArrayList;

public class testLogus {

    public static void main(String[] args) {
        TipoConbustivel etanol = new TipoConbustivel("etanol");
        TipoConbustivel gasolina = new TipoConbustivel("gasolina");

        ArrayList<ConbustivelHasModelo> conbustiveisfiatUno = new ArrayList<>();
        Modelo fiatUno = new Modelo("FIAT-UNO",48);
        conbustiveisfiatUno.add(new ConbustivelHasModelo(fiatUno,etanol,8.9));
        conbustiveisfiatUno.add(new ConbustivelHasModelo(fiatUno,gasolina,12.7));

        ArrayList<ConbustivelHasModelo> conbustiveisfordKa = new ArrayList<>();
        Modelo fordKa = new Modelo("FORD-KA",55);
        conbustiveisfordKa.add(new ConbustivelHasModelo(fordKa,etanol,8.1));
        conbustiveisfordKa.add(new ConbustivelHasModelo(fordKa,gasolina,11.6));

        ArrayList<ConbustivelHasModelo> conbustiveiscitroenC3 = new ArrayList<>();
        Modelo citroenC3 = new Modelo("CITRON-C3",47);
        conbustiveiscitroenC3.add(new ConbustivelHasModelo(citroenC3,etanol,7.5));
        conbustiveiscitroenC3.add(new ConbustivelHasModelo(citroenC3,gasolina,11.9));

        ArrayList<ConbustivelHasModelo> conbustiveisrenaultClio = new ArrayList<>();
        Modelo renaultClio = new Modelo("RENAULT-CLIO",50);
        conbustiveisrenaultClio.add(new ConbustivelHasModelo(renaultClio,etanol,9.5));
        conbustiveisrenaultClio.add(new ConbustivelHasModelo(renaultClio,gasolina,14.3));

        ArrayList<ConbustivelHasModelo> conbustiveisaudiA1 = new ArrayList<>();
        Modelo audiA1 = new Modelo("AUDI-A1",45);
        conbustiveisaudiA1.add(new ConbustivelHasModelo(audiA1,gasolina,10.8));

        ArrayList<ConbustivelHasModelo> conbustiveisaudiA4 = new ArrayList<>();
        Modelo audiA4 = new Modelo("AUDI-A4",65);
        conbustiveisaudiA4.add(new ConbustivelHasModelo(audiA4,gasolina,8.8));

        ArrayList<ConbustivelHasModelo> conbustiveisaudiA5 = new ArrayList<>();
        Modelo audiA5 = new Modelo("AUDI-A5",65);
        conbustiveisaudiA5.add(new ConbustivelHasModelo(audiA5,gasolina,8.8));

        ArrayList<ConbustivelHasModelo> conbustiveisaudiA12 = new ArrayList<>();
        Modelo audiA12 = new Modelo("AUDI-A12",65);
        conbustiveisaudiA12.add(new ConbustivelHasModelo(audiA12,gasolina,8.8));


        Veiculo veiculo1 =new Veiculo(fiatUno,"JGG-7384");
        Veiculo veiculo2 =new Veiculo(fordKa,"JGF-8573");
        Veiculo veiculo3 =new Veiculo(audiA1,"JGE-0620");
        Veiculo veiculo4 =new Veiculo(citroenC3,"JWM-1235");
        Veiculo veiculo5 =new Veiculo(renaultClio,"KRM-6771");
        Veiculo veiculo6 =new Veiculo(audiA1,"JGE-4583");
        Veiculo veiculo7 =new Veiculo(fordKa,"JGE-9393");
        Veiculo veiculo8 =new Veiculo(renaultClio,"JGE-0611");
        Veiculo veiculo9 =new Veiculo(citroenC3,"JHM-7491");
        Veiculo veiculo10 =new Veiculo(fordKa,"JGM-4773");
        Veiculo veiculo11 =new Veiculo(audiA4,"JMM-7573");
        Veiculo veiculo12 =new Veiculo(audiA12,"JMM-1234");
        Veiculo veiculo13 =new Veiculo(audiA5,"AAA-7513");



        Posto posto = new Posto();
        posto.entrarNoPosto();
        posto.abastecer(veiculo1,3);
        posto.abastecer(veiculo3,3);
        posto.liberarBomba(3);
        posto.abastecer(veiculo3,1);
        posto.abastecer(veiculo5,3);
        posto.abastecer(veiculo4,4);
        posto.entrarNoPosto();
        posto.adicinarBomba();
        posto.entrarNoPosto();

        TipoConbustivel gas = new TipoConbustivel("gas");




    }
}
