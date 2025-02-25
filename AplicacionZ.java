import java.util.Scanner; 
public class AplicacionZ{
    public static int horarioS = 480;
    public static int horarioD = 360;
    public static String [][]carteleraS={{"","",""},{"","",""}};
    public static String carteleraD=new String("");

    public static void esperar()
    {
        try {
            Thread.sleep(1999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void mostrarMenu()
    {
       /* System.out.println("Cartelera del sabado: " + CarteleraS);
        System.out.println("Cartelrea del Domingo: " + CarteleraD);
        System.out.println("Tiempo restante el Sabado: " + horarioS);
        System.out.println("Tiempo restante el Domingo: " + horarioD); */
        System.out.println("Elige un genero: ");
        System.out.println("0: Salir");
        System.out.println("1: Drama");
        System.out.println("2: Comedia");
        System.out.println("3: Terror");
        System.out.println("4: Ciencia ficcion");
        System.out.println("5: Ver resumen");

    }
    public static void mostrarpeliculas(String [][]peliculas)
    {
        int x=0;
        while(x<peliculas.length-1)
        {
            for (int i = 0; i < peliculas.length; i++) 
            {
            System.out.println((i+1) +  " " + peliculas[i][x]+ " "+peliculas[i][x+1]+" min.");
            }
            x++;
        }
    }
    public static String [][]cartelera(int opciones,String [][]peliculas, int cont)
    {
        String [][] carteleras=new String[8][3];
        for(int i = 0;i<peliculas.length;i++)
        {
            
            carteleras[cont][i]= peliculas[opciones][i];
            System.out.println(carteleras[cont][i]);
        }return carteleras;
    }
    public static void vercartelera(String [][]sabado, String [][] domingo)
    {
        int conts=0;
        int contd=0;
        for(int i=0;i<sabado.length;i++) 
        {
            System.out.println(sabado[conts][i]);
            conts++;
        }
        for(int i=0;i<domingo.length;i++) 
        {
            System.out.println(domingo[contd][i]);
            contd++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iDramaS = 0;
        int iDramaD = 0;
        int iComediaS = 0;
        int iComediaD=0;
        int iTerrorS  = 0;
        int iTerrorD = 0;
        int iCienciaFiccionS = 0;
        int iCienciaFiccionD = 0;
        int eleccion = 0;
        int opciones = 0;
        int contSab=0;
        int contDom=0;
        String [][]resumenCartelera=new String[12][3];
        String [][]CarteleraS = new String[8][3];
        String [][]CarteleraD = new String[8][3];
        String [] seleccion = {"Listado de peliculas", "Atras"};
        String drama [][] = {{"Titanic"," 194", "drama"}, {"la vida es bella", "116","drama"}};
        String comedia [][]= {{"Bitlechus Bitlechus"," 104.","comedia"},{ "Transformers One", "103 ","comedia"}};
        String terror [][]= {{"Chucky" ,"87.","terror"} ,{"Scream"," 109 min.","teror"}};
        String cienciaFiccion [][] = {{"Star Wars III: La venganza de los sith","  140","ciencia ficción"}, {"Transformers"," 90 ","ciencia ficción"}};
        String administrador = "Markel";
        String solucion = "1234";
            System.out.println("Hola! Estas entrando en la aplicacion.");
            //esperar();
            System.out.println("Introduzca el nombre de usuario: ");
            String usuario = sc.nextLine();
            while (!administrador.equals(usuario)){
                System.out.println("Usuario incorrecto. Vuelve a meter usuario: ");
                usuario = sc.nextLine();
            }
            System.out.println("Introduzca contraseña: ");
            String contraseña = sc.nextLine();
            while (!solucion.equals(contraseña)){
                System.out.println("Contraseña incorrecta. velve a meter la contraseña: ");
                contraseña = sc.nextLine();
            }
            int opcion = 0;
            do{  
                do{
                    mostrarMenu();
                   /* System.out.println("Cartelera del sabado: " + CarteleraS);
                    System.out.println("Cartelrea del Domingo: " + CarteleraD);
                    System.out.println("Tiempo restante el Sabado: " + horarioS);
                    System.out.println("Tiempo restante el Domingo: " + horarioD);
                    System.out.println("Elige un genero: ");
                    System.out.println("0: Salir");
                    System.out.println("1: Drama");
                    System.out.println("2: Comedia");
                    System.out.println("3: Terror");
                    System.out.println("4: Ciencia ficcion");
                    System.out.println("5: Ver resumen"); */
                    opcion = sc.nextInt();
                    if (opcion >= 6){
                        System.out.println("Opcion no valida. Por favor, elige otra.");
                    }  
                }while (opcion>=6 || opcion<0);
            OUTER:
            switch (opcion) {
                case 0:
                    System.out.println("Quieres guardar los cambios o quieres empezar de nuevo? \n1. Guardar cambios \n2. Empezar de nuevo");
                    int salir = sc.nextInt();
                    switch (salir) {
                        case 1 -> {
                            System.out.println("Cartelera guardada, saliendo del programa");
                           // esperar();
                            break OUTER;
                        }
                        case 2 -> {
                            System.out.println("Borrando cartelera");
                            /*horarioS = 480;
                            horarioD = 360;*/
                            CarteleraS = new String[8][3];
                            CarteleraD = new String[8][3];
                            //esperar();
                            break;
                        }
                        default -> {
                            System.out.println("Opcion no disponible");
                            //esperar();
                            break;
                        }
                    }

                case 1:
                    if (iDramaS<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de drama: ");
                            mostrarpeliculas(drama);
                            /*for (int i = 0; i < drama.length; i++) {
                                System.out.println((i + 1) + " " +drama[i]);
                            }*/
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1)
                            {   opciones--;
                               // carteleraS(opciones, comedia);
                                /*for(int i = 0;i<drama.length;i++)
                                {
                                    carteleraS[opciones][i]= drama[opciones][i];
                                    System.out.println(carteleraS[opciones][i]);
                                }*/
                               /*for (int i=0;i<carteleraS.length();i++)
                                carteleraS[i]=drama[opcion-1];*/
                                if (horarioS - 194 < 0)
                                {

                                    System.out.println("Pelicula demasiado larga para el tiempo restante."); 
                                  
                                    break;
                                }
                                CarteleraS=cartelera(opciones, drama,contSab);
                                contSab++;
                                iDramaS = 1;
                                
                                horarioS = horarioS - 194;
                               // System.out.println("pelicula elegida: " + drama[opciones][i] + " Minutos Restantes: " + horarioS);
                                //esperar();
                                break;
                            }
                            if (opciones == 2){
                                opciones--;    
                                if (horarioS - 116 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraS=cartelera(opciones, drama,contSab);
                                iDramaS = 1;
                                contSab++;
                                horarioS = horarioS - 116;
                                //System.out.println("pelicula elegida: " + drama[1] + " Minutos Restantes: " + horarioS);
                                //esperar();
                                break;
                            }else{
                                System.out.println("Opcion no valida");break;
                            }
                        }
                    }else if (iDramaD<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de drama: ");
                            mostrarpeliculas(drama);

                           // mostrarpeliculas(drama);
                           /*for (int i = 0; i < drama.length; i++) {
                                System.out.println((i + 1) + " " +drama[i]);
                            } for (int i = 0; i < drama.length; i++) {
                                System.out.println((i + 1) + " " +drama[i]);
                            }for (int i = 0; i < drama.length; i++) {
                                System.out.println((i + 1) + " " +drama[i]);
                            }*/
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1){
                                opciones--;
                                if (horarioD - 194 < 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante."); 
                                    //esperar();
                                    break;
                                }
                                CarteleraD=cartelera(opciones, drama,contDom);
                                contDom++;
                                iDramaD = 1;
                                horarioD = horarioD - 194;
                                //System.out.println("pelicula elegida: " + drama[0] + " Minutos Restantes: " + horarioD);
                                //(esperar();
                                break;
                            }
                            if (opciones == 2){
                                opciones--;    
                                if (horarioD - 116 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante."); 
                                    esperar();
                                    break;
                                }
                                CarteleraD=cartelera(opciones, drama,contDom);
                                contDom++;
                                iDramaD = 1;
                                horarioD = horarioD - 116;
                                //System.out.println("pelicula elegida: " + drama[1] + " Minutos Restantes: " + horarioD);
                                //esperar();
                                break;
                            }
                        }
                    }else if(iDramaD>0){
                        System.out.println("Genero ya agregado en ambos dias");
                        try {
                            Thread.sleep(1999);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                    break;
                case 2:
                    if (iComediaS<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de comedia: ");
                            mostrarpeliculas(comedia);
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1){
                                opciones--;
                                if (horarioS - 104 < 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraS=cartelera(opciones, comedia,contSab);
                                contSab++;
                                iComediaS = 1;
                                //CarteleraS = CarteleraS + comedia[0];
                                horarioS = horarioS - 104;
                                //System.out.println("pelicula elegida: " + comedia[0] + " Minutos Restantes: " + horarioS);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                            if (opciones == 2){   
                                opciones--; 
                                if (horarioS - 103 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraS=cartelera(opciones, comedia,contSab);
                                contSab++;
                                iComediaS = 1;

                                horarioS = horarioS - 103;
                                //System.out.println("pelicula elegida: " + comedia[1] + " Minutos Restantes: " + horarioS);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }else if (iComediaD<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de drama: ");
                            mostrarpeliculas(comedia);
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1){
                                opciones--;
                                if (horarioD - 104 < 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraD=cartelera(opciones, comedia,contDom);
                                contDom++;
                                iComediaD = 1;
                                horarioD = horarioD - 104;
                                //System.out.println("pelicula elegida: " + comedia[0] + " Minutos Restantes: " + horarioD);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                            if (opciones == 2){ 
                                opciones--;   
                                if (horarioD - 103 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraD=cartelera(opciones, comedia,contDom);
                                contDom++;
                                iComediaD = 1;
                                horarioD = horarioD - 103;
                                //System.out.println("pelicula elegida: " + comedia[1] + " Minutos Restantes: " + horarioD);
                                try {
                                    Thread.sleep(2999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }else if(iDramaD>0){
                        System.out.println("Genero ya agregado en ambos dias");
                        try {
                            Thread.sleep(1999);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }  
                    break;
                case 3:
                    if (iTerrorS<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de terror: ");
                            mostrarpeliculas(terror);
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1){
                                opciones--;
                                if (horarioS - 87 < 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraS=cartelera(opciones, terror,contSab);
                                contSab++;
                                iTerrorS = 1;
                                horarioS = horarioS - 87;
                                //System.out.println("pelicula elegida: " + terror[0] + " Minutos Restantes: " + horarioS);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                            if (opciones == 2){
                                opciones--;    
                                if (horarioS - 109 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraS=cartelera(opciones, terror,contSab);
                                contSab++;
                                iTerrorS = 1;
                                horarioS = horarioS - 109;
                                //System.out.println("pelicula elegida: " + terror[1] + " Minutos Restantes: " + horarioS);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }else if (iTerrorD<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de terror: ");
                            mostrarpeliculas(terror);
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1){
                                opciones--;
                                if (horarioD - 87 < 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraD=cartelera(opciones, terror,contDom);
                                contDom++;
                                iTerrorD = 1;
                                horarioD = horarioD - 87;
                                //System.out.println("pelicula elegida: " + terror[0] + " Minutos Restantes: " + horarioD);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                            if (opciones == 2){ 
                                opciones--;   
                                if (horarioD - 109 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraD=cartelera(opciones,terror,contDom);
                                contDom++;
                                iTerrorD = 1;
                                horarioD = horarioD - 109;
                                //System.out.println("pelicula elegida: " + terror[1] + " Minutos Restantes: " + horarioD);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }else if(iDramaD>0){
                        System.out.println("Genero ya agregado en ambos dias");
                        try {
                            Thread.sleep(1999);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }  
                    break;
                case 4:
                    if (iCienciaFiccionS<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de ciencia ficcion: ");
                            mostrarpeliculas(cienciaFiccion);
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1){
                                opciones--;
                                if (horarioS - 140 < 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante."); 
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraS=cartelera(opciones, cienciaFiccion,contSab);
                                contSab++;
                                iCienciaFiccionS = 1;
                                horarioS = horarioS - 140;
                                //System.out.println("pelicula elegida: " + cienciaFiccion[0] + " Minutos Restantes: " + horarioS);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                            if (opciones == 2){ 
                                opciones--;
                                if (horarioS - 90 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraS=cartelera(opciones, cienciaFiccion,contSab);
                                contSab++;
                                iCienciaFiccionS = 1;
                                horarioS = horarioS - 90;
                                //System.out.println("pelicula elegida: " + cienciaFiccion[1] + " Minutos Restantes: " + horarioS);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }else if (iCienciaFiccionD<=0){
                        for (int i = 0; i < seleccion.length; i++) {
                            System.out.println((i + 1) + " " +seleccion[i]);
                        }
                        System.out.println("Elige una de las dos opciones: ");
                        eleccion = sc.nextInt();
                        if (eleccion == 1){
                            System.out.println("Listado de peliculas de ciencia ficción: ");
                            mostrarpeliculas(cienciaFiccion);
                            System.out.println("Elige una: ");
                            opciones = sc.nextInt();                
                            if (opciones == 1){
                                opciones--;
                                if (horarioD - 140 < 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante."); 
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                CarteleraD=cartelera(opciones, cienciaFiccion,contDom);
                                contDom++;
                                iCienciaFiccionD = 1;
                                horarioD = horarioD - 140;
                                //System.out.println("pelicula elegida: " + cienciaFiccion[0] + " Minutos Restantes: " + horarioD);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                            if (opciones == 2){ 
                                opciones--;   
                                if (horarioD - 90 <= 0){
                                    System.out.println("Pelicula demasiado larga para el tiempo restante.");
                                    try {
                                        Thread.sleep(1999);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;            
                                }
                                CarteleraD=cartelera(opciones, cienciaFiccion,contDom);
                                contDom++;
                                iCienciaFiccionD = 1;
                                horarioD = horarioD - 90;
                                //System.out.println("pelicula elegida: " + cienciaFiccion[1] + " Minutos Restantes: " + horarioD);
                                try {
                                    Thread.sleep(1999);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }else if(iCienciaFiccionD>0){
                        System.out.println("Genero ya agregado en ambos dias");
                        try {
                            Thread.sleep(1999);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                    break;
                case 5: 
                   /* System.out.println("Cartelera del Sabado: " + CarteleraS);
                    System.out.println("Cartelera del Domingo: " + CarteleraD);
                    System.out.println("Tiempo restante el Sabado: " + horarioS);
                    System.out.println("Tiempo restante el Domingo: " + horarioD); */
                    vercartelera(CarteleraS,CarteleraD);
                    try {
                        Thread.sleep(3999);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }  while(opcion != 0);
    }
}