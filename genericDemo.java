class Box<T>{
    private T value;
    void setValue(T value){
        this.value=value;
    }
    T getValue(){
        return value;
    }
}
class GenericDemo{
    public static<T> void display(T value){
        System.out.println("value: "+value);
    }
    public static void main(String args[]){
        Box<Integer> intbox= new Box<>();
        intbox.setValue(100);
        System.out.println("Integer value: "+intbox.getValue());
        Box<String> stringbox= new Box<>();
        stringbox.setValue("Java");
        System.out.println("String value: "+stringbox.getValue());
        Box<Double> doublebox = new Box<>();
        doublebox.setValue(25.56);
        System.out.println("Double value: "+doublebox.getValue());
        display(100);
        display("hello");
        display(2000.0);
    }
}