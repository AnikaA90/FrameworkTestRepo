package configuration;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigInfo {
	
	public static String readProperty(String attributeName) throws IOException {
		
		FileReader input = new FileReader("C:\\Users\\grn_a\\git\\FrameworkTestRepo\\FrameworkTest\\src\\main\\java\\configuration\\config.properties");
		Properties p = new Properties();
		p.load(input);
		
		String Value = p.getProperty(attributeName);
		return Value;
	}

}
