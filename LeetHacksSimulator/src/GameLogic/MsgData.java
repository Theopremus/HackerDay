package GameLogic;

import java.util.LinkedList;

public class MsgData {
	public LinkedList<String> msgList;
	public MsgData() {
		msgList = new LinkedList<String>();
		msgList.add(0, "WARNING: THE CIA IS WATCHING");
		msgList.add(1, "PLEASE KILL YOURSELF SLOWLY ;)");
	}
}