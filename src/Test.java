import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Properties;
import java.util.stream.Collectors;

public class Test {
	public String convertJson(Object object) throws IllegalArgumentException, IllegalAccessException, IOException
	{
		//Finding Class of object
		Class<?> class1=object.getClass();
		//converting into Key value Pairs 
		HashMap<String,String> mapObject=new HashMap<>();
		
		for(Field field :class1.getDeclaredFields())
		{
			if(field.isAnnotationPresent((Class<? extends Annotation>) ChangeId.class))
			{
				field.setAccessible(true);
				mapObject.put(getValue(field),  field.get(object).toString());	
			}
			else
			{
				field.setAccessible(true);
				mapObject.put(field.getName(), field.get(object).toString());
			}
		}
		String jsonString = mapObject.entrySet().stream().map(entry -> "\n\t" + "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"").collect(Collectors.joining(","));
		FileWriter writer=new FileWriter("C:\\programs\\CUSTOM_ANNOTATIOND_DEMO\\src\\Properties.properties",true);
		writer.write("{" + jsonString + "}\n");
		writer.close();
		return jsonString;
      

	}
	//Annotation value getting Method
	 private String getValue(Field field){
	        return field.getAnnotation((Class<T>) ChangeId.class).value();
	 }
	 
	 //FileReader using
	 public static Object jsonObjectToObject(Object object) throws IOException, IllegalArgumentException, IllegalAccessException,NullPointerException
	 {
		 Class<?> class2 = object.getClass();
		 FileReader reader=new FileReader("C:\\programs\\CUSTOM_ANNOTATIOND_DEMO\\src\\Properties.properties");
		 Properties property=new Properties();
		 property.load(reader);
		 reader.close();
		  for(Field field : class2.getDeclaredFields())
		  {
	            field.setAccessible(true);
	            Class<?> type = field.getType();
	            String value;
	               if(field.isAnnotationPresent(ChangeId.class))
	               {
	                 value = field.getAnnotation(ChangeId.class).value();
	               }
	              else
	               {
	                value = field.getName();
	                }
	            if(type.equals(int.class))
	            {
	                int temp = Integer.parseInt(property.getProperty(value));
	                field.set(object,temp);
	            }
	            else if(type.equals(String.class))
	            {
	                String temp = property.getProperty(value);
	                field.set(object,temp);
	            }
	        }
			 
		 


		 return object;
		 
		 
	 }
	public String convert(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}

	
	   // public <E> String convert(Object object) throws IllegalAccessException, IOException {
	       // Class<?> clapp = object.getClass();
	     //   HashMap<String, String> variables = new HashMap<>();
	        
	       // PrintWriter write=new PrintWriter("C:\\Users\\admin\\Desktop\\Workspace\\Java\\src\\EmplyeeData");
	       // FileReader read=new FileReader("C:\\Users\\admin\\Desktop\\Workspace\\Java\\src\\EmplyeeData");
	       
	       // FileReader read=new FileReader("C:\\\\Users\\\\admin\\\\Desktop\\\\Workspace\\\\Java\\\\src\\\\EmplyeeData");
	     //   Properties values=new Properties();
	       // values.load(read);
	    //    Scanner scan=new Scanner((Readable) values);
			
		//	while(scan.hasNext()) {
		 //   read.add(scan.next());
		//	}
	        //System.out.println(values.getProperty("EmployeeName"));
	       // List<E> values=new ArrayList();
	     //   Scanner scan=new Scanner(read);
			
			//while(scan.hasNext()) {
			//values.add((E) scan.next());
	   // }
	       
	      //  for(Field field: clapp.getDeclaredFields()){
	        //	field.setAccessible(true);
	          //  if(field.isAnnotationPresent(Similar.class)) {
	            //    variables.put(getValue(field), field.get(object).toString());
	        //    }else{
	             //   variables.put(field.getName(), field.get(object).toString());
	        //    }
	      //  }
	   //    String str= variables.entrySet().stream().map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"").collect(Collectors.joining(","));
	       
	      // write.println();
	       // write.flush();
	       // read.close();
	      //  return null;
	        
	 //   }

	   // private Properties readPropertiesFile(String string) {
	//		return null;
	//	}

	//	private String getValue(Field field){
	      //  String value = field.getAnnotation(Similar.class).value();
	      //  return value;
	  //  }
	//}

