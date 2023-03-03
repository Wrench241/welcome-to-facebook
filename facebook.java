import java.util.Scanner;

public class facebook extends logincad{
    public static void main(String[] args) {
        facebook log =new facebook();
        boolean repetir1 = true;
        while (true) {
        System.out.print("Bem Vindo ao Facebook\n");
        Scanner ba =new Scanner(System.in);
        System.out.print("[1] Login\n[2] Cadastro\n[3] exit\n");
        int ba1 = ba.nextInt();
         switch (ba1) {
            case 2:
            System.out.print("Digite seu novo login: ");
            String teste = ba.next();
            log.login12(teste);
            System.out.print("Digite sua nova senha: ");
            String testeS = ba.next();
            log.senha12(testeS);
            ba.nextLine();
            log.printS("nome completo: ");
            String nome = ba.nextLine().trim();
            log.dados[1] = nome;
            log.printS("sexo (M) ou (F): ");
            String sexo = ba.nextLine().trim().toUpperCase();
            log.dados[2] = sexo;
            log.printS("tel: ");
            String tel = ba.nextLine().trim();
            log.dados[3] = tel;
            log.printS("idade: ");
            String idade = ba.nextLine().trim();
            log.dados[4] = idade;
            log.printS("email: ");
            String email = ba.nextLine().trim();
            log.dados[5] = email;
            System.out.println("Cadastro concluído\n");
             break;
             case 1:
                System.out.print("Digite o login: ");
                String login1 = ba.next();
                System.out.print("Digite a senha: ");
                String senha1 = ba.next();
                if (login1.equals(log.getLogin()) && (senha1.equals(log.getSenha()))){
                    System.out.println("Login Sucessfuly...\n");
                    while (repetir1){
                    log.printS("[1] suas informações.\n");
                    log.printS("[0] voltar.\n");
                    int logSu = ba.nextInt();
                   if (logSu == 1) {
                            System.out.println("informações de cadastro.\n ");
                            System.out.println("nome: "+ log.dados[1]);
                            System.out.println("sexo: " + log.dados[2]);
                            System.out.println("tel: " + log.dados[3]);
                            System.out.println("idade: "+ log.dados[4]);
                            System.out.println("email: "+ log.dados[5]);
                            log.printS("\n");
                        } else if (logSu == 0){
                            repetir1 = false;   
                        }
                    }
                } else {
                    System.out.print("Login Incorrect.\n\n");
                }
             break;
             case 3:

             System.exit(0);
             break;
             default:
             log.printS("opção inválida.\n");

             break;
            }
        }
    }
}

