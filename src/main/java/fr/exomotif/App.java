package fr.exomotif;

public class App {
    
    public static void main(String[] args) {

        //Motif 1
        
        int nombre;

        for(int i=0;i<10;i++){
            System.out.print("----");
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.print("_-^-");
        }
        System.out.println("");
        for(int j =1;j<=2;j++){
            for(int i=1;i<=10;i++){
                nombre = i;
                if(i==10){
                    nombre = 0;
                }
                System.out.print(nombre);
                System.out.print(nombre);
            }
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.print("----");
        }
        System.out.println();


        //Motif 10

        int tire = 5;
        int chiffre = 1;
        int nombrechiffre = 1;


        for(int i=0;i<5;i++){

            for(int j=0;j<tire;j++){
                System.out.print("-");
            }
            for(int k=0;k<nombrechiffre;k++){
                System.out.print(chiffre);
            }
            for(int l=0;l<tire;l++){
                System.out.print("-");
            }

            tire = tire - 1;
            chiffre = chiffre + 2;
            nombrechiffre = nombrechiffre + 2;


            System.out.println();
        }
        System.out.println();


        //Motif 12
        System.out.println("+===+===+");
        for(int i=0;i<2;i++){
            
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.print("|   ");
                }
            System.out.println();
            }
            System.out.println("+===+===+");
        }
        


    }
    
}
