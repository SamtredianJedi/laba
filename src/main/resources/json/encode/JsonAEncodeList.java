package json.encode;

import java.util.ArrayList;  
import java.util.List;  
import org.json.simple.JSONValue;  
import org.apache.logging.log4j.*;


public class JsonAEncodeList{    
	private static final Logger LOGGER = LogManager.getLogger(JsonAEncodeList.class);
public static void main(String args[]){  
	
	
  List arr = new ArrayList();  
  
  		arr.add("rezo");    
  		arr.add(new Integer(27));    
  		arr.add(new Double(600000));   
  			String jsonText = JSONValue.toJSONString(arr);  
  			LOGGER.info(jsonText);  
}}    
