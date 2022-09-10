public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado(nombreVertebrado: "Camello", classVertebrado: "Mamifero"); 
        miVertebrados[1] = new Vertebrado(nombreVertebrado: "Vaca", classVertebrado: "Mamifero");
        miVertebrados[2] = new Vertebrado(nombreVertebrado: "Tiburón", classVertebrado: "Pez"); 
        
        return miVertebrados;
    }
}
