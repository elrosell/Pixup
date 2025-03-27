package org.gerdoc.vista;

import org.gerdoc.model.Vivienda;
import org.gerdoc.model.ViviendaEnum;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.util.ViviendaFactory;

public class Consola implements Ejecutable {
    private static Consola consola;

    private Consola() {
    }

    public static Consola getInstance() {
        if (consola == null) {
            return new Consola();
        }
        return consola;
    }

    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        ViviendaEnum viviendaEnum = null;
        while (flag) {
            Menu.principal();
            Menu.seleccionaOpcion();
            opcion = ReadUtil.readInt();

            ViviendaEnum = viviendaEnum.getFiguraEnumById(opcion);

            if (ViviendaEnum.SALIR.equals(viviendaEnum)) {
                flag = false;
            }
            if (ViviendaEnum.OPCION_ERRONEA.equals(viviendaEnum)) {
                Menu.opcionInvalida();
            }

            viviendaEnum = ViviendaFactory.getFiguraByFiguraEnum(viviendaEnum);
            if (Vivienda != null) {
                ((SolicitaDatos) Vivienda).leeDatos();
                Menu.calcula(Vivienda);
            }
        }

    }
}