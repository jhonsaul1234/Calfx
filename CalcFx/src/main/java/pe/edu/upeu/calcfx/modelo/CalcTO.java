package pe.edu.upeu.calcfx.modelo;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "calculadora")
public class CalcTO {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
=======

public class CalcTO {
>>>>>>> dd8398c3f766db5560c1ec9c6232f3664bd920d5
    String num1;
    String num2;
    char operador;
    String resultado;

<<<<<<< HEAD
=======


    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

>>>>>>> dd8398c3f766db5560c1ec9c6232f3664bd920d5
    @Override
    public String toString() {
        return "CalcTO{" +
                "num1='" + num1 + '\'' +
                ", num2='" + num2 + '\'' +
                ", operador=" + operador +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}
