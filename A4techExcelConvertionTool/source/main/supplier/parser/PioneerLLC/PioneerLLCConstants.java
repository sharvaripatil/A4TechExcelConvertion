package parser.PioneerLLC;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;


public class PioneerLLCConstants {
	
	private static Logger _LOGGER = Logger.getLogger(PioneerLLCConstants.class);
	public static Map<String, String> PIOCOLOR_MAP =new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);//new HashMap<String, String>();
	 static {
		 PIOCOLOR_MAP.put("NAME","COLOR GROUP");
		 PIOCOLOR_MAP.put("BLUE","MEDIUM BLUE");
		 PIOCOLOR_MAP.put("PINK","MEDIUM PINK");
		 PIOCOLOR_MAP.put("YELLOW","MEDIUM YELLOW");
		 PIOCOLOR_MAP.put("GREEN","MEDIUM GREEN");
		 PIOCOLOR_MAP.put("BLACK","MEDIUM BLACK");
		 PIOCOLOR_MAP.put("WHITE","MEDIUM WHITE");
		 PIOCOLOR_MAP.put("RED","MEDIUM RED");
		 PIOCOLOR_MAP.put("PURPLE","MEDIUM PURPLE");
		 PIOCOLOR_MAP.put("GOLD","GOLD METAL");
		 PIOCOLOR_MAP.put("ROSE GOLD","MEDIUM PINK");
		 PIOCOLOR_MAP.put("SILVER","SILVER METAL");
		 PIOCOLOR_MAP.put("GRAY","MEDIUM GRAY");
		 PIOCOLOR_MAP.put("CUSTOM","OTHER");
		 PIOCOLOR_MAP.put("SKY BLUE","LIGHT BLUE");
		 PIOCOLOR_MAP.put("BLACK RED","MEDIUM BLACK");
		 PIOCOLOR_MAP.put("BLACK GRAY","MEDIUM BLACK");
		 PIOCOLOR_MAP.put("GRAY BLUE","MEDIUM GRAY");
		 PIOCOLOR_MAP.put("GRAY PURPLE","MEDIUM GRAY");
		 PIOCOLOR_MAP.put("GRAY GREEN","MEDIUM GRAY");
		 PIOCOLOR_MAP.put("TRANSPARENT","CLEAR");
		 PIOCOLOR_MAP.put("CLEAR","CLEAR");
		 PIOCOLOR_MAP.put("ORANGE","MEDIUM ORANGE");
		 PIOCOLOR_MAP.put("MULTI-COLOR","MULTI COLOR");
		 PIOCOLOR_MAP.put("BROWN","MEDIUM BROWN");
		 PIOCOLOR_MAP.put("COLORFUL","OTHER");
		 PIOCOLOR_MAP.put("WOOD","MEDIUM BROWN");
		 PIOCOLOR_MAP.put("ROSE RED","MEDIUM RED");
		 PIOCOLOR_MAP.put("DARK BLUE","DARK BLUE");
		 PIOCOLOR_MAP.put("COFFEE","MEDIUM BROWN");
		 PIOCOLOR_MAP.put("CAMEL BEIGE","LIGHT BROWN");
		 PIOCOLOR_MAP.put("NAVY BLUE","DARK BLUE");
		 PIOCOLOR_MAP.put("STAINLESS STEEL","SILVER METAL");
		 PIOCOLOR_MAP.put("SKIN TONE","ASSORTED");
		 PIOCOLOR_MAP.put("PEACH","ASSORTED");
		 PIOCOLOR_MAP.put("ROYAL BLUE","BRIGHT BLUE");
		 PIOCOLOR_MAP.put("LIGHT BLUE","LIGHT BLUE");
		 PIOCOLOR_MAP.put("WOOD COLOR","ASSORTED");
		 PIOCOLOR_MAP.put("CUSTOMIZED","ASSORTED");
		 PIOCOLOR_MAP.put("REDDISH ORANGE","MEDIUM ORANGE");
		 PIOCOLOR_MAP.put("FLUORESCENT GREEN","MEDIUM GREEN");
		 PIOCOLOR_MAP.put("DEEP LIGHT","ASSORTED");
		 PIOCOLOR_MAP.put("BEIGE WHITE","DARK WHITE");
		 PIOCOLOR_MAP.put("MULTI COLOR","MULTI COLOR");
		 PIOCOLOR_MAP.put("ASSORTED","ASSORTED");
		 PIOCOLOR_MAP.put("FOOTBALL","MEDIUM BROWN");
		 PIOCOLOR_MAP.put("STAILESS STEEL","SILVER METAL");
		 PIOCOLOR_MAP.put("WINE RED","DARK RED");
		 PIOCOLOR_MAP.put("BLUE+GREEN","MEDIUM BLUE:COMBO:MEDIUM GREEN");
		 PIOCOLOR_MAP.put("MAROON","DARK RED");
		 PIOCOLOR_MAP.put("BLACK+GREY","ASSORTED");
		 PIOCOLOR_MAP.put("BLACK+YELLOW","ASSORTED");
		 PIOCOLOR_MAP.put("BLACK+DARK BROWN","ASSORTED");
		 PIOCOLOR_MAP.put("BLACK+TRANSPARENT","ASSORTED");
		 PIOCOLOR_MAP.put("BURGUNDY","DARK RED");
		 PIOCOLOR_MAP.put("PEACH RED","MEDIUM RED");
		 PIOCOLOR_MAP.put("DARK GREEN","MEDIUM GREEN");

	 }
	 public static String getColorGroup(String colorName){
			return PIOCOLOR_MAP.get(colorName.toUpperCase());
		}
	 }


