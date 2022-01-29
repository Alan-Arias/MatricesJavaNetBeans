/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proymatriz2019;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ING IVETH ROBLES
 */
public class CMatriz {
    
    private int M[][]=new int [10][10];
    private int nfil,ncol;

    public CMatriz()
    {
        nfil=-1;
        ncol=-1;
    }

    public void SetElem(int val,int i,int j)
    {
        M[i][j]=val;
    }

    public int GetElem(int i,int j)
    {
        return (M[i][j]);
    }
    /*
     * Para definir numero de filas de la matriz:
     */
    public void SetNfil(int nf)
    {
        nfil = nf-1;
    }
    /*
     * Para definir numero de columnas de la matriz:
     */
    public void SetNcol(int nc)
    {
        ncol = nc-1;
    }

    /*
     * Para obtener numero de filas de la matriz:
     */
    public int GetNfil()
    {
        return nfil;
    }

    /*
     * Para Obtener numero de columnas de la matriz:
     */
    public int GetNcol()
    {
        return ncol;
    }
    
    public int CantElemMatriz()
    {
        return((nfil+1)*(ncol+1));
             
    }
    public void ColocarDimension()
    {
        String Cad="";
        Cad= JOptionPane.showInputDialog("Introduzca numero de filas");
        int numerofil= Integer.parseInt(Cad);
        
        Cad= JOptionPane.showInputDialog("Introduzca numero de columnas");
        int numerocol=Integer.parseInt(Cad);
        
        this.SetNfil(numerofil);
        this.SetNcol(numerocol);
    }
    
    public void CargarMatriz()
    {        
    int x;
        String Cad="";

        for (int i=0;i<=(nfil);i++)
        {
            for (int j=0;j<=(ncol);j++)
            {
                 Cad=JOptionPane.showInputDialog("M["+(i+1)+","+(j+1)+"]=");
                 x=Integer.parseInt(Cad);
                 M[i][j]=x;

            }
        }
    }
    
    public void MostrarMatriz(JTable TM)
    {
     int x;
        for (int i=0 ;i<= nfil;i++)
        {
            for (int j=0; j<=ncol;j++)
            {
                x= M[i][j];
                TM.setValueAt(x, i, j);
            }
        }    
    }             
    public int SumaElementos()
    {
        int ac=0;

        for(int i=0; i<nfil;i++)
        {
            for (int j=0; j<ncol;j++)
            {
                ac=ac+M[i][j];
            }
        }
        return ac;

    }

    public int SumaDiagPrincipal()
    {
        int ac=0;

        for (int i=0;i<=ncol;i++)
        {
            ac=ac+M[i][i];
        }
        return ac;

    }

    public int SumaDiagSecundaria()
    {
        int ac=0;

        for (int i=0;i<=ncol;i++)
        {
            ac=ac+M[i][ncol-i];
        }
        return ac;

    }

    /*
     * Suma de los elementos de la Triangular Inferior Izquierda
     */
    public int SumaTII()
    {
        int ac=0;

        for(int i=0; i<=nfil;i++)
        {
            for (int j=0; j<=i;j++)
            {
                ac=ac+M[i][j];
            }
        }
        return ac;

    }

    /*
     * Suma de los elementos de la Triangular Inferior Derecha
     */
    public int SumaTID()
    {
        int ac=0;

        for(int i=0; i<=nfil;i++)
        {
            for (int j=(nfil-i); j<ncol;j++)
            {
                ac=ac+M[i][j];
            }
        }
        return ac;

    }

    /*
     * Suma de los elementos de la Triangular Superior Derecha
     */
    public int SumaTSD()
    {
        int ac=0;

        for(int i=0; i<=nfil;i++)
        {
            for (int j=i; j<=ncol;j++)
            {
                ac=ac+M[i][j];
            }
        }
        return ac;

    }

    /*
     * Suma de los elementos de la Triangular Superior Izquierda
     */
    public int SumaTSI()
    {
        int ac=0;

        for(int i=0; i<=nfil;i++)
        {
            for (int j=0; j<=(nfil-i);j++)
            {
                ac=ac+M[i][j];
            }
        }
        return ac;

    }


    public void Menu()
    {
        System.out.println("M A T R I C E S");
        System.out.println("= = = = = = = =");
        System.out.println("1. Cargar matriz m*n");
        System.out.println("2. Mostrar matriz m*n");
        System.out.println("3. Retornar Numero de Filas de la Matriz");
        System.out.println("4. Retornar Numero de Columnas de la Matriz");
        System.out.println("5. Suma de elementos de la matriz");
        System.out.println("6. SuM de los elementos de la diagonal principal");
        System.out.println("7. Sum elementos de diagonal secundaria");
        System.out.println("8. sum elementos  Triangular Superior Izquierda");
        System.out.println("9.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


    }
}

