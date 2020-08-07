package aop;

public class FileRecorder implements Recorder {

	@Override
	public void save() {
		System.out.println("save to file");
	}

	public void test(){
		System.out.println("test ....");
	}
}
