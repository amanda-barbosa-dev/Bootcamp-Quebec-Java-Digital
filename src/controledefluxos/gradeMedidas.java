package controledefluxos;

public class gradeMedidas {

    public static void main(String[] args) {

        String siglaMedida = "P";
        //Condicão encadeada
        /*if (siglaMedida == "P") {
            System.out.println("PEQUENO");
        }else if (siglaMedida == "M") {
            System.out.println("MEDIO");
        }else if (siglaMedida == "G") {
            System.out.println("GRANDE");
        } else {
            System.out.println("INDEFINIDO");
        }*/

        //Switch Case
        switch (siglaMedida){
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default: {
                System.out.println("INDEFINIDO");
            }
        }

    }
}
