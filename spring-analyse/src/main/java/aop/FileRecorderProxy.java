package aop;

import java.util.Date;

/**
 * 代理类
 */
public class FileRecorderProxy implements Recorder {

	private FileRecorder fileRecorder;

	public FileRecorderProxy(FileRecorder fileRecorder) {
		this.fileRecorder = fileRecorder;
	}


	@Override
	public void save() {
		System.out.println("startTime:" + new Date());
		fileRecorder.save();
		System.out.println("endTime:" + new Date());
	}

}
