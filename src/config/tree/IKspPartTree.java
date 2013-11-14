package config.tree;

import java.util.Hashtable;

public interface IKspPartTree {
	public boolean addMechjeb(IKspPartTree module);
	public boolean addProtractor(IKspPartTree module);
	public boolean addDeadlyReentry(Hashtable<String, Object> deadlyReentry);
}
