package taller3.televisores;

public class TV {
    Marca marca;
    int canal= 1;
    private int precio= 500;
    boolean estado;
    int volumen= 1;
    Control control;
    static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
        numTV+=1;
    }

    public static int getNumTV(){
        return TV.numTV;
    }
    public static void setNumTV(int numTV){
        TV.numTV=numTV;
    }

    //Metodos para marca 
    public Marca getMarca(){
        return this.marca;
    }
    public void setMarca(Marca marca){
        this.marca=marca;
    }

    //Metodos para canal
    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int canal){
        if (this.estado){
            if (canal >= 1 && canal <=120){
                this.canal=canal;
            }
        }
    }
    public void canalUp(){
        if (this.estado){
            if (this.canal >= 1 && this.canal <=119){
                this.canal+=1;
            }
        }
        
    }
    public void canalDown(){
        if (this.estado){
            if (this.canal >= 2 && this.canal <=120){
                this.canal-=1;
            }
        }
    }

    //Metodos para precio
    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }

    //Metodos para volumen
    public int getVolumen(){
        return this.volumen;
    }
    public void setVolumen(int volumen){
        if (this.estado){
            if (volumen >= 0 && volumen <=7){
                this.volumen=volumen;
            }
        }
    }

    //Metodos para control
    public Control getControl(){
        return this.control;
    }
    public void setControl(Control control){
        this.control=control;
    }
    //Metodos para estado
    public void turnOn(){
        this.estado=true;
    }
    public void turnOff(){
        this.estado=false;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void volumenUp(){
        if (this.estado){
            if (this.volumen >= 0 && this.volumen <=6){
                this.volumen+=1;
            }
        }
    }
    public void volumenDown(){
        if (this.estado){
            if (this.volumen >=1 && this.volumen <=7 ){
                this.volumen-=1;
            }
        }
    }
    

    




    
    
}
