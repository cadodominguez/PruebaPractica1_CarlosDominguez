
package pruebapractica.pkg1_carlosdominguez;

import java.util.Scanner;
public class PruebaPractica1_CarlosDominguez {

    public static void main(String[] args) {
        Scanner brazil = new Scanner (System.in);
        // el nombre de scanner fue de broma
        
        //inicio del programa
        System.out.println("**********Menu**********");
        System.out.println("1.Repetir mi nombre");
        System.out.println("2.subMenu de mensajes");
        System.out.println("3.Salir");
        int opcion = brazil.nextInt();
        int vecesdemenu = 1;
        boolean out1 = true;
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante :");
                    // el brazil.nextLine() es para evitar el bug
                    brazil.nextLine();
                    String nombre = brazil.nextLine();
                    System.out.println("Cuantas veces desea repetir el texto :");
                    int rep = brazil.nextInt();
                    for (int i = 0;i < rep;i++){
                        System.out.println("¡Hola mi nombre es "+nombre+"y miren mi prueba!");
                    }
                    //de vuelta al menu
                    vecesdemenu+=1;
                    System.out.println("**********Menu**********");
                    System.out.println("1.Repetir mi nombre");
                    System.out.println("2.subMenu de mensajes");
                    System.out.println("3.Salir");
                    opcion = brazil.nextInt();
                    break;
                case 2:
                    boolean out2 = true;
                    System.out.println("********SubMenu*******");
                    System.out.println("1.Bienvenida");
                    System.out.println("2.Despedida");
                    System.out.println("3.Salir del Submenu");
                    int opcion2 = brazil.nextInt();
                    while (out2 == true) {
                        //iba a usar switch pero nos toca usar if y else-if asi que mas larga va ser esta parte
                        if (opcion2 == 1) {
                            System.out.println("Buenos dias,Buenas tardes o Buenas Noches cuando este leyendo esto Ingeniera :)");
                            System.out.println("Y tambien que este bien de salud");
                            System.out.println("");
                            System.out.println("********SubMenu*******");
                            System.out.println("1.Bienvenida");
                            System.out.println("2.Despedida");
                            System.out.println("3.Salir del Submenu");
                            opcion2 = brazil.nextInt();
                        }else if (opcion2 == 2){
                            System.out.println("Hasta Luego,gracias por usar mi programa");
                            System.out.println("");
                            System.out.println("********SubMenu*******");
                            System.out.println("1.Bienvenida");
                            System.out.println("2.Despedida");
                            System.out.println("3.Salir del Submenu");
                            opcion2 = brazil.nextInt();
                        }else if (opcion2 == 3){
                            System.out.println("Saliendo del submenu");
                            System.out.println("");
                            out2 = false;
                        }
                        // la verdad este if es inecesario pero bueno
                        if (opcion > 4 || opcion < 0) {
                            System.out.println("Opcion no valida");
                            System.out.println("");
                            System.out.println("********SubMenu*******");
                            System.out.println("1.Bienvenida");
                            System.out.println("2.Despedida");
                            System.out.println("3.Salir del Submenu");
                            opcion2 = brazil.nextInt();
                        }
                    }
                    System.out.println("**********Menu**********");
                    System.out.println("1.Repetir mi nombre");
                    System.out.println("2.subMenu de mensajes");
                    System.out.println("3.Salir");
                    vecesdemenu+=1;
                    opcion = brazil.nextInt();
                    break;
                case 3:
                    System.out.println("Adios, esta fue mi prueba");
                    System.out.println("El menu principal se repitio "+ vecesdemenu +" veces");
                    out1 = false;
                    //fin definitivo del programa
                    break;
                default:
                    // en el caso que ingresen una opcion no valida
                    System.out.println("La opcion no es valida");
                    System.out.println("");
                    vecesdemenu+=1;
                    System.out.println("**********Menu**********");
                    System.out.println("1.Repetir mi nombre");
                    System.out.println("2.subMenu de mensajes");
                    System.out.println("3.Salir");
                    opcion = brazil.nextInt();
            }
        } while (out1);
        //por cierto voy a ver si puedo subirlo con git bash
        
    }
    
}
