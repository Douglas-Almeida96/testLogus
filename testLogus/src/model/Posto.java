package model;


import java.util.Arrays;

public class Posto {



    private Object[] elementos;
    private int tamanho;
    private TipoConbustivel[] tipoConbustivel;

    public Posto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public Posto() {
        this.elementos = new Object[5];
        this.tamanho = 0;
    }

    public void entrarNoPosto(){
        bombasOcupadas();
        bombasLivres();
        System.out.println();
    }
    protected void bombasOcupadas(){
        for(int i =0; i< elementos.length;i++){
            if(elementos[i]!=null){
                Veiculo veiculo = (Veiculo) elementos[i];
                System.out.println("bomba "+(i+1)+" em uso por: "+veiculo.getPlaca());
            }
        }
        System.out.println();
    }
    protected void bombasLivres(){
        for(int i =0; i< elementos.length;i++){
            if(elementos[i]==null){
                System.out.println("bomba "+(i+1)+" livre");
            }
        }
        System.out.println();
    }

    public void abastecer(Veiculo veiculo , int numeroBomba){
        int aux = numeroBomba-1;
        if(elementos[aux]==null){
            elementos[aux]=veiculo;
            System.out.println("bomba "+numeroBomba+" em uso por "+ veiculo.getPlaca());
        }else{
            System.out.println("Bomba ocupada!");
            bombasLivres();
        }
        System.out.println();
    }

    public void liberarBomba(int posicao){
        System.out.println("Liberando bomba....");
        elementos[posicao-1]=null;
        System.out.println("bomba "+posicao+" liberada!");
        System.out.println();
    }

    public void adicinarBomba(){
        System.out.println("Adicionando bomba....");
        Object[] elementosNovos = new Object[this.elementos.length+1];
        for (int i=0; i<this.elementos.length; i++){
            elementosNovos[i] = this.elementos[i];
        }
        this.elementos = elementosNovos;
        System.out.println("bomba "+elementos.length+" adicionada! ");
        System.out.println();
    }




}
