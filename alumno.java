public class alumno {
    private String nombreAlumno;
    private int [] califAlumno;

    //creación de constructores.
    public alumno(String nombreAlumno, int[] califAlumno){

        this.nombreAlumno = nombreAlumno;
        this.califAlumno = califAlumno;
    }

    // metodo de calcular promedio de alumno.
    public double promedioCalcular(){
        int sumaProm = 0;
        for (int calif : califAlumno){
            sumaProm += calif;
        }
        return sumaProm / (double) califAlumno.length;
    }

    //else if para comparar calificaciones.
    public char calificacionFinal (double promAlum){
        if (promAlum <= 50) {
            return 'F';
        }else if (promAlum <= 60 ){
            return 'E';
        }else if (promAlum <= 70){
            return 'D';
        }else if (promAlum <= 80){
            return 'C';
        }else if (promAlum <= 90){
            return 'B';
        }else if (promAlum <= 100){
            return 'A';
        }
        return 0; //se agrega un return 0.
    }

        // metodo para imprimir los resultados.
        public void printResultados(){ //comienza la impresion de nombre y calificaciones.
            System.out.println("Nombre del Estudiante: " + nombreAlumno);
            System.out.println("______________________________________________________________________");
            //for (int i = 0; 1 < califAlumno.length; i++) problema con bucle para acceder al indice.
                for (int i = 0; i < califAlumno.length; i++){
            System.out.println("Calificación " + (i+1) + ": " + califAlumno[i]);
            }
        double promAlum = promedioCalcular();
            char calificacionFinal = calificacionFinal(promAlum);
            System.out.println("__________________________________________________________________");
            System.out.println("Nomenclatura de Calificación: " + "-" + calificacionFinal + "-");
            System.out.println("Promedio final del Alumno : " + "-" + promAlum + "-");
            System.out.println("__________________________________________________________________");
        }

    public static void main(String []args){
        String nombreAlumno = "Jorge Prueba Dos";
        int[] califAlumno = {70,40,80,100,70}; //se ponen las calificaciones.
        alumno alumno = new alumno(nombreAlumno, califAlumno);
        alumno.printResultados();
    }
}
