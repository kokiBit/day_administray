package dayRegist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import menu.Comfirm;
import menu.Delete;
import menu.Menu;
import menu.Regist;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		Map<String, Menu> map = new HashMap<String, Menu>();

		map.put("1", new Regist());

		map.put("2", new Comfirm());

		map.put("3", new Delete());

		System.out.println("1登録");
		System.out.println("2確認");
		System.out.println("3削除");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		map.get(str).go();

	}

}
