package pe.edu.upeu.calcfx.servicio;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.calcfx.modelo.CalcTO;
import pe.edu.upeu.calcfx.repositorio.CalculadoraRepository;
=======
import org.springframework.stereotype.Service;
import pe.edu.upeu.calcfx.modelo.CalcTO;
>>>>>>> dd8398c3f766db5560c1ec9c6232f3664bd920d5

import java.util.ArrayList;
import java.util.List;

@Service
public class CalcServiceImp implements CalcServiceI{

<<<<<<< HEAD
    @Autowired
    CalculadoraRepository repository;

    //List<CalcTO> dbOper= new ArrayList<>();

    @Override
    public void guardarResultados(CalcTO to) {
        repository.save(to);
=======
    List<CalcTO> dbOper= new ArrayList<>();

    @Override
    public void guardarResultados(CalcTO to) {
        dbOper.add(to);
>>>>>>> dd8398c3f766db5560c1ec9c6232f3664bd920d5
    }

    @Override
    public List<CalcTO> obtenerResultados() {
<<<<<<< HEAD
        return repository.findAll();
    }

    @Override
    public void actualizarResultados(CalcTO to, Long index) {
        to.setId(index);
        repository.save(to);
    }

    @Override
    public void eliminarResultados(Long index) {
        repository.deleteById(index);
=======
        return dbOper;
    }

    @Override
    public void actualizarResultados(CalcTO to, int index) {
        dbOper.set(index,to);
    }

    @Override
    public void eliminarResultados(int index) {
        dbOper.remove(index);
>>>>>>> dd8398c3f766db5560c1ec9c6232f3664bd920d5
    }
}
