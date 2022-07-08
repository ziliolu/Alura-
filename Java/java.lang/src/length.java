
public class length {
    public static void main(String[] args) {
        String nome = "Alura";
        String vazio = " ";
        String vazioSemEspaco = vazio.trim();

        System.out.println(vazio.trim().isEmpty());
        System.out.println(vazioSemEspaco.isEmpty());
        System.out.println(nome.contains("z"));
        System.out.println(nome.contains("lura"));

        System.out.println(nome.length());

        System.out.println(1); //int
        System.out.println("Luiza"); //string
        System.out.println(true); //boolean

        println( int i){
            return i;
        }
        println(String s){
            return i;
        }



        for(int i = 0; i <nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

    }
}
