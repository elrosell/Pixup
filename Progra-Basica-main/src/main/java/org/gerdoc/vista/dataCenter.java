package org.gerdoc.vista;

import org.gerdoc.util.ReadUtil;
import org.gerdoc.util.manejoDatos.dataColonias;
import org.gerdoc.util.manejoDatos.dataEstados;
import org.gerdoc.util.manejoDatos.dataMunicipios;

public class dataCenter {

    public static void menuCatalogo() {
        boolean flag = true;
        int opcion;

        dataEstados Dataestados = new dataEstados();
        dataMunicipios Datamunicipios = new dataMunicipios(Dataestados);
        dataColonias Datacolonias = new dataColonias(Datamunicipios);

        while( flag ){
            Menu.menuCatalogo( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );

            switch (opcion) {
                case 1 -> Dataestados. menu();
                case 2 -> Datamunicipios.menu();
                case 3 -> Datacolonias.menu();
                case 4 -> flag = false;
                default -> Menu.opcionInvalida();
            }
        }
    }
}
