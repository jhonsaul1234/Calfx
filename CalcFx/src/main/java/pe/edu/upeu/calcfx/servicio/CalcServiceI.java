package pe.edu.upeu.calcfx.servicio;

import pe.edu.upeu.calcfx.modelo.CalcTO;
import java.util.List;

public interface CalcServiceI {

    public void guardarResultados(CalcTO to);//C
    public List<CalcTO> obtenerResultados();//R
<<<<<<< HEAD
    public void actualizarResultados(CalcTO to, Long index);//U
    public void eliminarResultados(Long index);//D
=======
    public void actualizarResultados(CalcTO to, int index);//U
    public void eliminarResultados(int index);//D
>>>>>>> dd8398c3f766db5560c1ec9c6232f3664bd920d5


}
