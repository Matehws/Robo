public class AppRobo {
    
    public static void main(String[] args) {
        
        

        Robo robo1 = new Robo(); 


        robo1.mostrarPosicao(); // teste posição inicial.

        robo1.girarPara("North"); // teste de valor não reconhecido.

        robo1.girarPara("S"); // teste para o sul.
        robo1.andar();
        robo1.andar();
        robo1.andar();
        robo1.andar();
        robo1.andar();
        robo1.andar();
        robo1.andar(); // teste andar até o limite.

        robo1.girarPara("O"); // teste para o oeste.
        robo1.andar();
        robo1.andar();
        robo1.andar();
        robo1.andar();
    }
}
