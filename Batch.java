import java.util.ArrayList;

public class Batch {
    public static ArrayList<Integer> filaProntos = new ArrayList<Integer>();
    public static ArrayList<Integer> filaChegada = new ArrayList<Integer>();
    public static ArrayList<Integer> filaExecucao = new ArrayList<Integer>();
    public static ArrayList<Integer> filaEspera = new ArrayList<Integer>();
    public static ArrayList<Integer> filaFinalizados = new ArrayList<Integer>();

    public static int nProcessos;
    public static int tempoChegada;
    public static int tempoExecucao;
    public static int tempoTrocaContexto;

    public static void FIFO(int nProcessos, int tempoChegada, int tempoExecucao, int tempoTrocaContexto) {
        int tempoTotal = 0;
        int tempoEspera = 0;
        int tempoRetorno = 0;
        int tempoResposta = 0;

        for(int i = 0; i < nProcessos; i++) {
            tempoChegada = tempoChegada + (int) (Math.random() * 100);
            tempoExecucao = tempoExecucao + (int) (Math.random() * 100);

            filaChegada.add(tempoChegada);
            filaExecucao.add(tempoExecucao);

            tempoTotal = tempoTotal + tempoExecucao;

            tempoEspera = tempoEspera + tempoChegada;
            tempoRetorno = tempoRetorno + tempoEspera + tempoExecucao;
            tempoResposta = tempoResposta + tempoEspera;
        }

        for(int i = 0; i < nProcessos; i++) {
            System.out.println("Processo " + i + ":");
            System.out.println("Chegou: " + filaChegada.get(i));
            System.out.println("Execucao: " + filaExecucao.get(i));
        }

        System.out.println("Tempo Total: " + tempoTotal);
        System.out.println("Tempo de Espera: " + (tempoEspera / nProcessos));
        System.out.println("Tempo de Retorno: " + (tempoRetorno / nProcessos));
        System.out.println("Tempo de Resposta: " + (tempoResposta / nProcessos));
    }
    public static void SJF(int nProcessos, int tempoChegada, int tempoExecucao, int tempoTrocaContexto) {
        int tempoTotal = 0;
        int tempoEspera = 0;
        int tempoRetorno = 0;
        int tempoResposta = 0;

        for(int i = 0; i < nProcessos; i++) {
            tempoChegada = tempoChegada + (int) (Math.random() * 100);
            tempoExecucao = tempoExecucao + (int) (Math.random() * 100);

            filaChegada.add(tempoChegada);
            filaExecucao.add(tempoExecucao);

            tempoTotal = tempoTotal + tempoExecucao;

            tempoEspera = tempoEspera + tempoChegada;
            tempoRetorno = tempoRetorno + tempoEspera + tempoExecucao;
            tempoResposta = tempoResposta + tempoEspera;
        }

        for(int i = 0; i < nProcessos; i++) {
            System.out.println("Processo " + i + ":");
            System.out.println("Chegou: " + filaChegada.get(i));
            System.out.println("Execucao: " + filaExecucao.get(i));
        }

        System.out.println("Tempo Total: " + tempoTotal + " segundos");
        System.out.println("Tempo de Espera: " + (tempoEspera / nProcessos));
        System.out.println("Tempo de Retorno: " + (tempoRetorno / nProcessos));
        System.out.println("Tempo de Resposta: " + (tempoResposta / nProcessos));
    }

    public static void main(String[] args) {

        nProcessos = 10;
        tempoChegada = 0;
        tempoExecucao = 0;
        tempoTrocaContexto = 2;

        FIFO(nProcessos, tempoChegada, tempoExecucao, tempoTrocaContexto);
        SJF(nProcessos, tempoChegada, tempoExecucao, tempoTrocaContexto);

    }

}