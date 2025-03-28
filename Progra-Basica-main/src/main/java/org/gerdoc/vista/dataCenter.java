package org.gerdoc.vista;
import org.gerdoc.util.manejoDatos.dataEstados;
import org.gerdoc.util.manejoDatos.dataColonias;
import org.gerdoc.util.manejoDatos.dataMunicipios;
import org.gerdoc.util.ReadUtil;

public class dataCenter
{
    public static void menuDataCenter() {
        boolean flag = true;
        int opcion;

        dataEstados dataestados = new dataEstados();
        dataMunicipios datamunicipios = new dataMunicipios(dataestados);
        dataColonias dataColonias = new dataColonias(datamunicipios);

        while( flag ){
            Menu.menuCatalogo( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );

            switch (opcion) {
                case 1 -> dataestados. menu();
                case 2 -> datamunicipios.menu();
                case 3 -> dataColonias.menu();
                case 4 -> flag = false;
                default -> Menu.opcionInvalida();
            }
        }
    }
}
