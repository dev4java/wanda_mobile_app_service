
package iMobile.utils;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringFunction
{
	public static Map<Long, List<String>>	TEST_BR_STRRING	= new HashMap<Long, List<String>>();
	
	public static String getBrStr(BufferedReader br)
	{
		String str = "";
		try
		{
			str = br.readLine();
		}
		catch (Exception e)
		{}
		return str;
	}
}
