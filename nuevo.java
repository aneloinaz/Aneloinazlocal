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
    public static String [][]cartelera(int opciones,String [][]peliculas)
    {
    for(int i = 0;i<peliculas.length;i++)
        {
            carteleraS[opciones][i]= peliculas[opciones][i];
            System.out.println(carteleraS[opciones][i]);
        }return carteleraS;
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
