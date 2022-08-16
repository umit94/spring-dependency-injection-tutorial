package utils;

public interface ClassPrintable extends ClassNameReceivable{
    private void print(String additionalString){
        System.out.println(getClassName()+" "+additionalString);
    }

    private void print(){
        System.out.println(getClassName());
    }

    default void printConstructor(){
        print("constructor");
    }

    default void printDefaultConstructor(){
        print("default constructor");
    }

    default void printSmartConstructor(){
        print("smart constructor");
    }

    default void printClassName(){
        print();
    }

    default void printPostConstruct(){
        print("post construct");
    }

    default void printPreDestroy(){
        print("pre destroy");
    }
}
