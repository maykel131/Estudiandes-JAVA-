package ejer;
import javax.swing.JOptionPane;
public class Estudiante {
    private int cod;
    private String ape;
    private String nom;
    private float nota_f;
    private int contApro, contApla;
    private float promSecc, acumNota;
    private static final String mensaje = "Desea procesar a otro estudiante";
    private static int continuar=0;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getNota_f() {
        return nota_f;
    }

    public void setNota_f(float nota_f) {
        this.nota_f = nota_f;
    }

    public Estudiante() {
    }

    public float calcularPromSecc() {
        int totalEst = contApro + contApla;
        return promSecc = acumNota / totalEst;
    }

    public void ImprimirDatos() {
        JOptionPane.showMessageDialog(null, "\n\t\tCódigo: " + getCod() + "\n\t\tApellido: " + getApe() +
                "\n\t\tNombre: " + getNom() + "\n\t\tNota Definitiva: " + getNota_f(), "DATO DEL ESTUDIANTE",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void Leerdatos() {
        cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Código", "REGISTRO DE ESTUDIANTE", JOptionPane.INFORMATION_MESSAGE));
        ape = JOptionPane.showInputDialog(null, "Ingrese el  Apellido", "REGISTRO DE ESTUDIANTE", JOptionPane.INFORMATION_MESSAGE);
        nom = JOptionPane.showInputDialog(null, "Ingrese el Nombre: ", "REGISTRO DE ESTUDIANTE", JOptionPane.INFORMATION_MESSAGE);
        nota_f = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la Nota Final ", "REGISTRO DE ESTUDIANTE", JOptionPane.INFORMATION_MESSAGE));
    }

    public float AcumuladorNota() {
        acumNota += nota_f;
        return acumNota;
    }

    public void imprimirResultado() {
        String salida = "";
        salida += "\n\t\tPromedio de la Sección: " + promSecc + "\n\t\tCantidad de Aprobado: " + contApro +
                "\n\t\tCantidad de Reprobado: " + contApla;
        JOptionPane.showMessageDialog(null, salida, "DATO DE LA SECCION", JOptionPane.INFORMATION_MESSAGE);
    }

    public void CalcularAproApla() {
        if (nota_f <= 9.4) 
            contApla++;
         else 
            contApro++;
    }

    public static void main(String[] args) {
        Estudiante objEst = new Estudiante();
        do {
            objEst.Leerdatos();
            objEst.CalcularAproApla();
            objEst.AcumuladorNota();
            objEst.ImprimirDatos();
            continuar = JOptionPane.showConfirmDialog(null, mensaje, "SALIR DEL SISTEMAS", JOptionPane.YES_NO_OPTION);
        } while (continuar == 0);
        objEst.calcularPromSecc();
        objEst.imprimirResultado();
        System.exit(0);
    }//Fin del main
}//Fin de la clase
/*  while(continuar==1){
         objEst.Leerdatos();
         objEst.imprimirDatos();
         String mensaje = "Esta seguro que desea salir del sistema";
         continuar = JOptionPane.showConfirmDialog(null, mensaje, "SALIR DEL SISTEMAS", JOptionPane.YES_NO_OPTION);
         if(continuar == 0) {
         System.exit(0);
         }            
         }//Fin del while*/