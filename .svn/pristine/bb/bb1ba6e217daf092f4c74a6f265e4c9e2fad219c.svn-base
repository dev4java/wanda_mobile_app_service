
package iMobile.dao.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

public class DaoUtil
{
	public static void setFieldValue(Class<?> clazz, Object obj, ResultSet rs)
	{
		Field[] fields = clazz.getDeclaredFields();
		try
		{
			int count = rs.getMetaData().getColumnCount();
			for (int i = 1; i <= count; i++)
			{
				String cn = rs.getMetaData().getColumnName(i);
				for (Field field : fields)
				{
					Column column = field.getAnnotation(Column.class);
					if (null != column && column.name().equalsIgnoreCase(cn))
					{
						field.setAccessible(true);
						if (field.getType().equals(String.class))
						{
							field.set(obj, rs.getString(cn));
						}
						else if (field.getType().equals(Long.class))
						{
							field.set(obj, rs.getLong(cn));
						}
						else if (field.getType().equals(Double.class))
						{
							field.set(obj, rs.getDouble(cn));
						}
						else if (field.getType().equals(Float.class))
						{
							field.set(obj, rs.getFloat(cn));
						}
						else if (field.getType().equals(Integer.class))
						{
							field.set(obj, rs.getInt(cn));
						}
						else if (field.getType().equals(Short.class))
						{
							field.set(obj, rs.getShort(cn));
						}
						else if (field.getType().equals(Date.class))
						{
							field.set(obj, rs.getTime(cn));
						}
						else
						{
							field.set(obj, rs.getObject(cn));
						}
						break;
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void setFieldValue(Class<?> clazz, Object obj, Object value)
	{
		try
		{
			Field field = getPkField(clazz);
			field.setAccessible(true);
			field.set(obj, value);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Object getFieldValue(Class<?> clazz, Object obj, Field field)
	{
		String fieldName = field.getName();
		fieldName = firstLetterUpperCase(fieldName);
		try
		{
			Method method = clazz.getMethod("get" + fieldName);
			if (null != method)
			{
				return method.invoke(obj);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static Field getPkField(Class<?> clazz)
	{
		Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; i++)
		{
			Field field = fields[i];
			Id pk = field.getAnnotation(Id.class);
			if (null != pk)
			{
				return field;
			}
		}
		return null;
	}
	
	public static String firstLetterUpperCase(String name)
	{
		Pattern pattern = Pattern.compile("^(\\w{1})(\\w+)", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(name);
		if (matcher.find())
		{
			name = matcher.group(1).toUpperCase() + matcher.group(2);
		}
		return name;
	}
	
	public static String getTableName(Class<?> clazz)
	{
		Table table = clazz.getAnnotation(Table.class);
		return table.name();
	}
}
