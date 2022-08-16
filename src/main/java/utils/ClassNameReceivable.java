package utils;

public interface ClassNameReceivable {
    default String getClassName(){
        return this.getClass().getName().split("\\.")[3];
    }
}
