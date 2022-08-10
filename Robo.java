public class Robo {

    int posX = 0; // posição X (padrão = 0)
    int posY = 0; // posição Y (padrão = 0)
    int linhas = 6; // altera eixo Y
    int colunas = 6; // altera eixo X
    String direcao = "L"; // altera direção inicial


    public void girarPara(String lado) {


        if (lado == "N") {
            direcao = lado;
            System.out.println("A direção agora é Norte.");


        } else if (lado == "S") {
            direcao = lado;
            System.out.println("A direção agora é Sul.");


        } else if (lado == "L") {
            direcao = lado;
            System.out.println("A direção agora é Leste.");


        } else if (lado == "O") {
            direcao = lado;
            System.out.println("A direção agora é Oeste.");


        } else {
            System.out.println("Direção não reconhecida. Use N para Norte, S para Sul, L para Leste ou O para Oeste.");
        }
    }



    public void mostrarPosicao() {
        System.out.println("Posição atual: ( " + posX + ", " + posY + " )"); // retorna o valor 
    }



    public void andar() {

        if (posY < linhas && direcao == "N") {
            posY ++;
            System.out.println("Andou para o Norte.");
            mostrarPosicao();


        } else if (posY > -linhas && direcao == "S") {
            posY --;
            System.out.println("Andou para o Sul.");
            mostrarPosicao();


        } else if (posX < colunas && direcao == "L") {
            posX ++;
            System.out.println("Andou para o Leste.");
            mostrarPosicao();


        } else if (posX > -colunas && direcao == "O") {
            posX --;
            System.out.println("Andou para o Oeste.");
            mostrarPosicao();


        } else {
            System.out.println("Não pode se mover para esta direção, o limite foi atingido."); 
        }
    }
}
