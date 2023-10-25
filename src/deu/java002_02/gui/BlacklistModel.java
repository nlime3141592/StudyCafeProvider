package deu.java002_02.gui;

import java.util.Vector;

import deu.java002_02.data.Blacklist;

public class BlacklistModel extends Model
{
	 private BlacklistWorker m_worker;
	 private Vector<Blacklist> vb = new Vector<Blacklist>();
	 
	 public BlacklistModel()
	 {
		 m_worker = new BlacklistWorker(this);
	 }

	 public void addBlacklist(Blacklist blacklist)
	 {
		 vb.add(blacklist);
	 }

	 public void removeBlacklist(Blacklist blacklist)
	 {
		 vb.remove(blacklist);
	 }
}