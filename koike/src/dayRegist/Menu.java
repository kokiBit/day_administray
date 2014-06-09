package dayRegist;

import java.io.IOException;

public interface Menu {

	public abstract void go() throws IOException;

	public abstract void setDumpFile(String file);
}
