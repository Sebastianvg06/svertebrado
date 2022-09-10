public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado(nombreVertebrado: "Camello52", classVertebrado: "Mamifero36"); 
        miVertebrados[1] = new Vertebrado(nombreVertebrado: "Vaca25", classVertebrado: "Mamifero52");
        miVertebrados[2] = new Vertebrado(nombreVertebrado: "Tiburón32", classVertebrado: "Pez58"); 
        
        return miVertebrados;
    }
}
