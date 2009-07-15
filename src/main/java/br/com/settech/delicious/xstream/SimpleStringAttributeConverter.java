package br.com.settech.delicious.xstream;

import java.lang.reflect.InvocationTargetException;

import br.com.settech.delicious.attribute.Attribute;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class SimpleStringAttributeConverter implements SingleValueConverter {
	
	private Class attributeClass;
	
	

	public SimpleStringAttributeConverter(Class attributeClass) {
		super();
		this.attributeClass = attributeClass;
	}

	public Object fromString(String value) {
		// TODO Auto-generated method stub
		try {
			Attribute attribute = (Attribute)attributeClass.getConstructor(String.class).newInstance(value);
			return attribute;
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}		
	}
		

	public String toString(Object att) {
		// TODO Auto-generated method stub
		return att.toString();
	}

	public boolean canConvert(Class type) {
		// TODO Auto-generated method stub
		return Attribute.class.isAssignableFrom(type);
	}

}
