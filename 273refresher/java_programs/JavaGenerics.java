package java_programs;

public class JavaGenerics<T> {

public <T extends Number> T mul(T a1,T a2){
	if (a1 instanceof Double) {
        return (T) new Double(a1.doubleValue() * a2.doubleValue());
    } else if (a1 instanceof Integer) {
        return (T)new Integer(a1.intValue() * a2.intValue());
    } else {
        throw new IllegalArgumentException("Type " + a1.getClass() + " is not supported by this method");
    }
}
}
