package domain;

public class KeepingObjects {

    private Object[] objects;
    private int freePosition;

    public KeepingObjects(){
        this.objects = new Object[10];
        this.freePosition = 0;
    }

    public void add(Object object){
        this.objects[this.freePosition] = object;
        this.freePosition++;
    }

    public int objectsQuantity(){
        return freePosition;
    }

    public Object getReference(int position){
        return this.objects[position];
    }
}
