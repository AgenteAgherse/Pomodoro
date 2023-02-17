package Entities.Ciclo;

public class Ciclo {
    /**
     * Variable que nos va a permitir saber cuánto va a ser el ciclo de nuestro pomodoro
     * (En mins).
     */
    private Integer ciclo;
    
    /**
     * Variables que van a dividir el tiempo del ciclo (En segs).
     */
    private Double tEstudio;
    private Double tDescanso;
    
    public Ciclo(Integer ciclo) {
        this.ciclo = ciclo * 60; //Pasa a segundos.
        this.tEstudio = definirtEstudio(ciclo);
        this.tDescanso = definirtDescanso(ciclo);
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public Double gettEstudio() {
        return tEstudio;
    }

    public Double gettDescanso() {
        return tDescanso;
    }
    
    
    private Double definirtEstudio(Integer ciclo) {
        //Se divide entre 3/4 debido a que ese es el tiempo que se asigna de estudio.
        //Después se multiplica por 60 para que nos dé la cantidad de segundos.
        return ciclo * 0.75;
    }
    
    private Double definirtDescanso(Integer ciclo) {
        //Se divide entre 1/4 debido a que ese es el tiempo que se asigna de descanso.
        //Después se multiplica por 60 para que nos dé la cantidad de segundos.
        return ciclo * 0.25;
    }
    
    public void reducirTiempoEstudio() {
        this.tEstudio--;
    }
    
    public void reducirTiempoDescanso() {
        this.tEstudio--;
    }
    
    public void reducirVidaCiclo() {
        this.ciclo--;
    }
}
