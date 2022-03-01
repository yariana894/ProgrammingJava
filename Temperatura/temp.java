//Codificado por sAfOrAs
import javax.swing.JOptionPane;
public class temp
{
    /*
    La relación entre grados Celsius (C) y grados Fahrenheit (F) es la siguiente: F - 32 = 1,8 * C
    */
    double FahrenheitCelsius(double grado)
    {
        double gCelsius=(grado-32)/1.8;
        return gCelsius;
    }
 
    double CelsiusFahrenheit(double grado)
    {
        double gFahrenheit=(grado*1.8)+32;
        return gFahrenheit;
    }
 
    public static void main(String[] args)
    {
        double grado=0,gCelsius=0,gFahrenheit=0;
        temp tem = new temp();
 
        int opcion=0;
        String cadena;
    do{
    cadena=JOptionPane.showInputDialog("\n [1] Convertir Fahrenheit - Celsius \n [2] Convertir Celsius - Fahrenheit");
    opcion=Integer.parseInt(cadena);
    }while(opcion<1 || opcion>2);
            cadena=JOptionPane.showInputDialog("Ingrese la temperatura: ");
            grado=Double.parseDouble(cadena);
         
    switch(opcion)
        {
 
            case 1: {
                gCelsius=tem.FahrenheitCelsius(grado);
                JOptionPane.showMessageDialog(null," TEMPERATURA: "+gCelsius + " Celsius");
                };break;
                    
                 
            case 2: {
                gFahrenheit=tem.CelsiusFahrenheit(grado);
                JOptionPane.showMessageDialog(null," TEMPERATURA: "+gFahrenheit +" Fahrenheit");
                };break;
        }
 
    }
}