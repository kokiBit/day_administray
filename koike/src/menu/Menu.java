package menu;

import java.io.IOException;

import utile.DumpFile;

public interface Menu {

	public abstract void go() throws IOException;

	public abstract void setDumpFile(DumpFile f);
}
