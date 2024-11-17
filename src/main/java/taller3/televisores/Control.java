package taller3.televisores;

public class Control {
    TV tv;

    public void enlazar(TV tv){
        this.tv=tv;
        this.tv.control=this;
    }

    //Metodos para estado

    public void turnOn(){
        this.tv.estado=true;
    }
    public void turnOff(){
        this.tv.estado=false;
    }

    //Metodos para canal

    public void setCanal(int canal){
        if (this.tv.estado){
            if (canal >= 1 && canal <=120){    
                this.tv.canal=canal;
            }
        }
    }
    public void canalUp(){
        if (this.tv.estado){
            if (this.tv.canal >= 1 && this.tv.canal <=119){
                this.tv.canal+=1;
            }
        }
    }
    public void canalDown(){
        if (this.tv.estado){
            if (this.tv.canal >= 2 && this.tv.canal <=120){
                this.tv.canal-=1;
            }
        }
    }

    //Metodos para volumen 
    public void setVolumen(int volumen){
        if (this.tv.estado){
            if (volumen >= 0 && volumen <=7){
                this.tv.volumen=volumen;
            }
        }
    }
    public void volumenUp(){
        if (this.tv.estado){
            if (this.tv.volumen >= 0 && this.tv.volumen <=6){
                this.tv.volumen+=1;
            }
        } 
    }
    public void volumenDown(){
        if (this.tv.estado){
            if (this.tv.volumen >=1 && this.tv.volumen <=7 ){
                this.tv.volumen-=1;
            }
        }
    }

    public void setTv(TV tv){
        this.tv=tv;
    }
    public TV getTv(){
        return this.tv;
    }


    
}
