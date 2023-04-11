
public interface FunctionalInterFa {
	abstract void add();
	default int sub(int a,int b) {
		return a-b;
	}
}
