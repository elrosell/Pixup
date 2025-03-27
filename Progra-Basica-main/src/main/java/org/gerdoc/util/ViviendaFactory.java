package org.gerdoc.util;

import org.gerdoc.model.ViviendaEnum;

public class ViviendaFactory
{

    public static ViviendaEnum getFiguraByFiguraEnum(ViviendaEnum viviendaEnum )
    {
        switch (viviendaEnum)
        {
            case COLONIA:
                return new colonia( );
            case ESTADO:
                return new estado( );
            case COLONIA:
                return new colonia( );
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}
