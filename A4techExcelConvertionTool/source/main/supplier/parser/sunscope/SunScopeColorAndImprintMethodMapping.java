package parser.sunscope;

import java.util.HashMap;
import java.util.Map;

public class SunScopeColorAndImprintMethodMapping {
public static Map<String, String> COLOR_MAP = new HashMap<>();
public static Map<String,String> IMPRINT_METHOD_MAP = new HashMap<>();
	static{
		
		IMPRINT_METHOD_MAP.put("Blank","Unimprinted");
		IMPRINT_METHOD_MAP.put("Deboss/Foil/Pad","Debossed=Deboss,Foil Stamped=Foil,Pad Print=Pad");
		IMPRINT_METHOD_MAP.put("Pad Print","Pad Print");
		IMPRINT_METHOD_MAP.put("Silkscreen","Silkscreen");
		IMPRINT_METHOD_MAP.put("RotaWrap™","Other=RotaWrap");
		IMPRINT_METHOD_MAP.put("SpectraPrint","Other=SpectraPrint");
		IMPRINT_METHOD_MAP.put("SpectraDome™","Other=SpectraDome");
		IMPRINT_METHOD_MAP.put("Laser-Engraving","Laser Engraved=Laser-Engraving");
		IMPRINT_METHOD_MAP.put("Pad Imprint","Pad Print=Pad Imprint");
		IMPRINT_METHOD_MAP.put("SpectaDomeTM","Other=SpectaDomeTM");
		IMPRINT_METHOD_MAP.put("Foil & Deboss Combo","Debossed=Foil & Deboss Combo");
		IMPRINT_METHOD_MAP.put("ThermaPrint™","Other=ThermaPrint");
		IMPRINT_METHOD_MAP.put("SpectraCal™","Other=SpectraCal");
		IMPRINT_METHOD_MAP.put("SpectraPrint+™","Other=SpectraPrint");
		IMPRINT_METHOD_MAP.put("Deboss/Foil","Debossed=Deboss/Foil");
		IMPRINT_METHOD_MAP.put("SpectraPrint™","Other=SpectraPrint");
		IMPRINT_METHOD_MAP.put("ThermaPrint TM","Other=ThermaPrint");
       
		COLOR_MAP.put("Yellow","Medium Yellow");  
		COLOR_MAP.put("Supplier Value","Color Group"); 
		COLOR_MAP.put("White with Blue accents","White:Combo:Blue"); 
		COLOR_MAP.put("White with Black accents","White:Combo:Black"); 
		COLOR_MAP.put("White with Red accents","White:Combo:Red"); 
		COLOR_MAP.put("White with Green Accents","White:Combo:Green"); 
		COLOR_MAP.put("Natural with Blue","White:Combo:Blue"); 
		COLOR_MAP.put("Natural with Black","White:Combo:Black"); 
		COLOR_MAP.put("Natural with Red","White:Combo:Red"); 
		COLOR_MAP.put("Natural with Red accents","White:Combo:Red"); 
		COLOR_MAP.put("Natural with Blue accents","White:Combo:Blue"); 
		COLOR_MAP.put("Natural with Black  trim","White:Combo:Black"); 
		COLOR_MAP.put("Natural with Green trim","White:Combo:Green"); 
		COLOR_MAP.put("Natural with Red trim","White:Combo:Red"); 
		COLOR_MAP.put("Natural with Black accents","White:Combo:Black"); 
		COLOR_MAP.put("Natural with Baby Blue accents","White:Combo:Light Blue"); 
		COLOR_MAP.put("Natural with Pink Accents","White:Combo:Pink"); 
		COLOR_MAP.put("Natural with Blue stripes","White:Combo:Blue"); 
		COLOR_MAP.put("Natural with Red stripes","White:Combo:Red"); 
		COLOR_MAP.put("Black with Red Accents","Black:Combo:Red"); 
		COLOR_MAP.put("Black with Blue Accents","Black:Combo:Blue"); 
		COLOR_MAP.put("Black with Green Accents","Black:Combo:Green"); 
		COLOR_MAP.put("Black with pink accents","Black:Combo:Pink"); 
		COLOR_MAP.put("Black with baby blue accents","Black:Combo:Light Blue"); 
		COLOR_MAP.put("Black with Black accents","Black:Combo:Black"); 
		COLOR_MAP.put("Red with Black Accents","Red:Combo:Black"); 
		COLOR_MAP.put("Blue with Black Accents","Blue:Combo:Red"); 
		COLOR_MAP.put("Blue with Black accents","Blue:Combo:Black"); 
		COLOR_MAP.put("Natural with Red accents","White:Combo:Red"); 
		COLOR_MAP.put("Natural with Green accents","White:Combo:Green"); 
		COLOR_MAP.put("Black with Grey Trim","Black:Combo:Gray"); 
		COLOR_MAP.put("Black with Blue Stripe","Black:Combo:Blue"); 
		COLOR_MAP.put("Black with Red Stripe","Black:Combo:Red"); 
		COLOR_MAP.put("Blue with Black Trim","Blue:Combo:Black"); 
		COLOR_MAP.put("Red with Black Trim","Red:Combo:Black"); 
		COLOR_MAP.put("Natural with Black Trim","White:Combo:Black"); 
		COLOR_MAP.put("Red with Black Accents","Red:Combo:Black"); 
		COLOR_MAP.put("Yellow with Black Accents","Yellow:Combo:Black"); 
		COLOR_MAP.put("Black with Charcoal Trim","Black:Combo:Gray"); 
		COLOR_MAP.put("Black with Grey accents","Black:Combo:Gray"); 
		COLOR_MAP.put("Black with Black Trim","Black:Combo:Black"); 
		COLOR_MAP.put("Black with White Zippers","Black:Combo:White"); 
		COLOR_MAP.put("Grey with Black Zippers","Gray:Combo:Black"); 
		COLOR_MAP.put("Black with Blue accents","Black:Combo:Blue"); 
		COLOR_MAP.put("Black with Grey trim","Black:Combo:Gray"); 
		COLOR_MAP.put("Clear with Black Trim","Clear:Combo:Black"); 
		COLOR_MAP.put("Clear with Blue Trim","Clear:Combo:Blue"); 
		COLOR_MAP.put("Clear with Red Trim","Clear:Combo:Red"); 
		COLOR_MAP.put("Black with Black Accents","Black:Combo:Black"); 
		COLOR_MAP.put("Grey with Black accent","Gray:Combo:Black"); 
		COLOR_MAP.put("Black with Charcoal Accents","Black:Combo:Gray"); 
		COLOR_MAP.put("Black with Black Trim","Black:Combo:Black"); 
		COLOR_MAP.put("Blue with Red Trim","Blue:Combo:Red"); 
		COLOR_MAP.put("Black with Grey Trim","Black:Combo:Gray"); 
		COLOR_MAP.put("Black with Blue Trim","Black:Combo:Blue"); 
		COLOR_MAP.put("Black with Red Trim","Black:Combo:Red"); 
		COLOR_MAP.put("Black with Red","Black:Combo:Red"); 
		COLOR_MAP.put("Black with Grey","Black:Combo:Gray"); 
		COLOR_MAP.put("Red with Black Piping","Red:Combo:Black"); 
		COLOR_MAP.put("Blue with Black Piping","Blue:Combo:Black"); 
		COLOR_MAP.put("SS with Red Shade","Other:Combo:Red"); 
		COLOR_MAP.put("Blue Shade","Blue"); 
		COLOR_MAP.put("Green Shade","Green"); 
		COLOR_MAP.put("Stainless Steel with Blue trim","Silver Metal:Combo:Blue"); 
		COLOR_MAP.put("Stainless Steel with Red trim","Silver Metal:Combo:Red"); 
		COLOR_MAP.put("Silver with Black Shade","Gray:Combo:Black"); 
		COLOR_MAP.put("Black with red","Black:Combo:Red"); 
		COLOR_MAP.put("blue and green accents","Blue:Combo:Green"); 
		COLOR_MAP.put("Silver with red","Gray:Combo:Red"); 
		COLOR_MAP.put("blue and green accents","Blue:Combo:Green"); 
		COLOR_MAP.put("White with Red Trim","White:Combo:Red"); 
		COLOR_MAP.put("White with Blue Trim","White:Combo:Blue"); 
		COLOR_MAP.put("White with Green Trim","White:Combo:Green"); 
		COLOR_MAP.put("Black with Silver accent","Black:Combo:Sliver"); 
		COLOR_MAP.put("Silver with Black accent","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver with Blue accent","Gray:Combo:Black"); 
		COLOR_MAP.put("Red with Black accent","Red:Combo:Black"); 
		COLOR_MAP.put("Silver with Black accent","Gray:Combo:Black"); 
		COLOR_MAP.put("Blue with Black accent","Blue:Combo:Black"); 
		COLOR_MAP.put("Clear with Black accent","Clear:Combo:Black"); 
		COLOR_MAP.put("White with Black trim","White:Combo:Black"); 
		COLOR_MAP.put("Silver with Tr. Red trim","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver with Tr. Blue trim","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver with Tr. Green trim","Gray:Combo:Green"); 
		COLOR_MAP.put("Black with Yellow accent","Black:Combo:Yellow"); 
		COLOR_MAP.put("Silver with Black trim","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver/Blue trim","Gray:Combo:Blue"); 
		COLOR_MAP.put("White with Blue","White:Combo:Blue"); 
		COLOR_MAP.put("White with Red","White:Combo:Red"); 
		COLOR_MAP.put("White with Green","White:Combo:Green"); 
		COLOR_MAP.put("Black with Blue","Black:Combo:Blue"); 
		COLOR_MAP.put("Black with Green","Black:Combo:Green"); 
		COLOR_MAP.put("Silver with Blue accents","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver with Red accents","Gray:Combo:Red"); 
		COLOR_MAP.put("White with Black accent","Black:Combo:Yellow"); 
		COLOR_MAP.put("Red with Black Accent.","Red:Combo:Black"); 
		COLOR_MAP.put("Red with Black Accent","Red:Combo:Black"); 
		COLOR_MAP.put("Silver barrel with Blue grip ","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver barrel with Red grip","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver barrel with Purple grip","Gray:Combo:Purple"); 
		COLOR_MAP.put("White with Blue accent","White:Combo:Blue"); 
		COLOR_MAP.put("White with Red accent","White:Combo:Red"); 
		COLOR_MAP.put("White with Green accent","White:Combo:Green"); 
		COLOR_MAP.put("Silver with Green accent","Gray:Combo:Green"); 
		COLOR_MAP.put("Silver with Red accent","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver with Orange accent","Gray:Combo:Orange"); 
		COLOR_MAP.put("Silver Body with Black","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver Body with Blue","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver Body with Red trim","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver with Blue grip","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver with Red grip","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver with Green grip","Gray:Combo:Green"); 
		COLOR_MAP.put("Silver with Green grip","Gray:Combo:Green"); 
		COLOR_MAP.put("Silver with Orange grip","Gray:Combo:Orange"); 
		COLOR_MAP.put("Silver with Black grip","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver with Blue grip","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver with Red grip","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver with Purple grip","Gray:Combo:Purple"); 
		COLOR_MAP.put("Silver with Blue accent and Blue grip","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver with Red accent Red grip","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver Body with Burgundy grip and trim","Gray:Combo:Dark Red"); 
		COLOR_MAP.put("Silver Body with Black grip and trim","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver Body with Dark Red grip and trim","Gray:Combo:Dark Red"); 
		COLOR_MAP.put("Natural with Green accent","White:Combo:Green"); 
		COLOR_MAP.put("Green with Natural accent","Green:Combo:White"); 
		COLOR_MAP.put("Clear with Green accent","Clear:Combo:Green"); 
		COLOR_MAP.put("Clear with Red accent","Clear:Combo:Red"); 
		COLOR_MAP.put("White with Red accent","White:Combo:Red"); 
		COLOR_MAP.put("White with Red","White:Combo:Red"); 
		COLOR_MAP.put("White with Yellow","White:Combo:Yellow"); 
		COLOR_MAP.put("White with black","White:Combo:Black"); 
		COLOR_MAP.put("Red with Black grip","Red:Combo:Black"); 
		COLOR_MAP.put("Blue with Black grip","Blue:Combo:Black"); 
		COLOR_MAP.put("Black with Black grip","Black:Combo:Black"); 
		COLOR_MAP.put("Silver with Black accent and trim","Gray:Combo:Black"); 
		COLOR_MAP.put("Satin White Body with Red accent and Red grip","Gray:Combo:Red"); 
		COLOR_MAP.put("Satin White Body with Blue accent and Blue grip","Gray:Combo:Blue"); 
		COLOR_MAP.put("Satin White Body with Black accent and Black grip","Gray:Combo:Black"); 
		COLOR_MAP.put("Satin White Body with Green accent and Green grip","Gray:Combo:Green"); 
		COLOR_MAP.put("Silver Body with Blue","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver Body with Red","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver Body with Green trim","Gray:Combo:Green"); 
		COLOR_MAP.put("Silver Body with Black trim","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver Body with Blue trim","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver Body with Blue Marble","Gray:Combo:Blue"); 
		COLOR_MAP.put("Red Marble","Red"); 
		COLOR_MAP.put("Black Marble","Black"); 
		COLOR_MAP.put("Green with Chrome accent","Green:Combo:Gray"); 
		COLOR_MAP.put("Red with Chrome accent","Red:Combo:Gray"); 
		COLOR_MAP.put("Black with Chrome accent","Black:Combo:Gray"); 
		COLOR_MAP.put("Silver with Chrome accent","Sliver:Combo:Gray"); 
		COLOR_MAP.put("Satin White Body with Blue Marble","Gray:Combo:Blue"); 
		COLOR_MAP.put("Satin White Body with Red Marble","Gray:Combo:Red"); 
		COLOR_MAP.put("Satin White Body with Black Marble","Gray:Combo:Black"); 
		COLOR_MAP.put("Matte Silver barrel and Chrome trim with Inner Black grip","Gray:Combo:Gray:Secondary:Black"); 
		COLOR_MAP.put("Matte Silver barrel and Chrome trim with Inner Red grip","Gray:Combo:Gray:Secondary:Red"); 
		COLOR_MAP.put("Matte Silver barrel and Chrome trim with Inner Blue grip","Gray:Combo:Gray:Secondary:Blue"); 
		COLOR_MAP.put("Silver with Black trim","Gray:Combo:Black"); 
		COLOR_MAP.put("Blue with Black grip","Blue:Combo:Black"); 
		COLOR_MAP.put("Blue Body and Black grip","Blue:Combo:Black"); 
		COLOR_MAP.put("White Body and Black grip","White:Combo:Black"); 
		COLOR_MAP.put("White Body and Blue grip","White:Combo:Blue"); 
		COLOR_MAP.put("Dark Charcoal Gray and Cognac","Dark Gray:Combo:Medium Brown"); 
		COLOR_MAP.put("White with Grey trim accent","White:Combo:Gray"); 
		COLOR_MAP.put("White with Red dial","White:Combo:Red"); 
		COLOR_MAP.put("White with Blue dial","White:Combo:Blue"); 
		COLOR_MAP.put("Silver with Yellow buttons","Gray:Combo:Yellow"); 
		COLOR_MAP.put("Silver with Black display","Gray:Combo:Black"); 
		COLOR_MAP.put("Silver with Blue display","Gray:Combo:Blue"); 
		COLOR_MAP.put("Wood with Silver Metal accent","Brown:Combo:Gray"); 
		COLOR_MAP.put("Silver with White Face","Gray:Combo:White"); 
		COLOR_MAP.put("White with metal plate and Black button","White:Combo:Black"); 
		COLOR_MAP.put("White with metal plate","White:Combo:Gray"); 
		COLOR_MAP.put("White with Clear acrylic trim","White:Combo:Clear"); 
		COLOR_MAP.put("Black with Silver interior","Black:Combo:Gray"); 
		COLOR_MAP.put("Silver with Blue trim","Gray:Combo:Blue"); 
		COLOR_MAP.put("Silver with Red trim","Gray:Combo:Red"); 
		COLOR_MAP.put("Silver with Red trim","Gray:Combo:Red"); 
		COLOR_MAP.put("Ble","Blue"); 
		COLOR_MAP.put("Clear Acrylic","Clear"); 
		COLOR_MAP.put("Brushed Finish","Other"); 
		COLOR_MAP.put("Nickel Finish","Gray"); 
		COLOR_MAP.put("GREY","Gray"); 
		COLOR_MAP.put("Dark Charcoal Gray","Dark Gray"); 
		COLOR_MAP.put("Red Marble","Red"); 
		COLOR_MAP.put("Blue Silver","Light Blue"); 
		COLOR_MAP.put("Frosty White","White"); 
		COLOR_MAP.put("Custom","Other"); 
		COLOR_MAP.put("Electroplated Bronze","Light Brown"); 
		COLOR_MAP.put("Anodized Black","Black"); 
		COLOR_MAP.put("White","Medium White"); 
		COLOR_MAP.put("Silver","Silver Metal"); 
		COLOR_MAP.put("Black","Medium Black"); 
		COLOR_MAP.put("Red","Medium Red"); 
		COLOR_MAP.put("Blue","Medium Blue"); 
		COLOR_MAP.put("Gunmetal","Medium Gray"); 
		COLOR_MAP.put("Natural","DARK WHITE"); 
		COLOR_MAP.put("Orange","Medium Orange"); 
		COLOR_MAP.put("Purple","Medium Purple"); 
		COLOR_MAP.put("Pink","Medium Pink"); 
		COLOR_MAP.put("Lime Green","Bright Green"); 
		COLOR_MAP.put("Hunter Green","Medium Green"); 
		COLOR_MAP.put("Royal Blue","Bright Blue"); 
		COLOR_MAP.put("Navy Blue","Dark Blue"); 
		COLOR_MAP.put("Kelly Green","Medium Green"); 
		COLOR_MAP.put("Green","Medium Green"); 
		COLOR_MAP.put("Translucent Green","Clear Green"); 
		COLOR_MAP.put("Translucent Red","Clear Red"); 
		COLOR_MAP.put("clear","Clear"); 
		COLOR_MAP.put("Clear","Clear"); 
		COLOR_MAP.put("Translucent Blue","Clear Blue"); 
		COLOR_MAP.put("Gray","Medium Gray"); 
		COLOR_MAP.put("GREY","Medium Gray"); 
		COLOR_MAP.put("Stainless Steel","Silver Metal"); 
		COLOR_MAP.put("Neon Yellow","Medium Yellow"); 
		COLOR_MAP.put("Navy","Dark Blue"); 
		COLOR_MAP.put("Tr. Green","Clear Green"); 
		COLOR_MAP.put("Tr. Blue","Clear Blue"); 
		COLOR_MAP.put("Tr. Red","Clear Red"); 
		COLOR_MAP.put("Polished Chrome","Chrome Metal"); 
		COLOR_MAP.put("Chrome","Chrome Metal"); 
		COLOR_MAP.put("Translucent Orange","Clear Orange"); 
		COLOR_MAP.put("Brushed Silver","Silver Metal"); 
		COLOR_MAP.put("Translucent Purple","Clear Purple"); 
		COLOR_MAP.put("Translucent Black","Clear Black"); 
		COLOR_MAP.put("Translucent Yellow","Clear Yellow"); 
		COLOR_MAP.put("Gold","Gold Metal"); 
		COLOR_MAP.put("Smoke","Medium Gray"); 
		COLOR_MAP.put("Charcoal","Medium Gray"); 
		COLOR_MAP.put("Graphite","Medium Gray"); 
		COLOR_MAP.put("Yellow","Medium Yellow"); 
		COLOR_MAP.put("Gun Metal","Medium Gray"); 
		COLOR_MAP.put("Brushed Gold","Gold Metal"); 
		COLOR_MAP.put("Burgundy","Dark Red"); 
		COLOR_MAP.put("Teal","Medium Green"); 
		COLOR_MAP.put("Pearl White","Medium White"); 
		COLOR_MAP.put("Matte Blue","Medium Blue"); 
		COLOR_MAP.put("Matte Silver","Silver Metal"); 
		COLOR_MAP.put("Cherrywood","Medium Brown"); 
		COLOR_MAP.put("JAVA","Medium Brown"); 
		COLOR_MAP.put("Espresso Brown","Dark Brown"); 
		COLOR_MAP.put("Brown","Medium Brown"); 
		COLOR_MAP.put("Anthracite Metallic","Metallic Black"); 
		COLOR_MAP.put("Translucent Pink","Clear Pink"); 
		COLOR_MAP.put("Translucent Smoke Gray","Clear Gray"); 
		COLOR_MAP.put("Translucent Turquoise Blue","Clear Blue"); 
		COLOR_MAP.put("Translucent Lime Green","Clear Green"); 
		COLOR_MAP.put("Turquoise Blue","Clear Blue"); 
		COLOR_MAP.put("Frost White","Clear White"); 
		COLOR_MAP.put("Cobalt Blue","Medium Blue"); 
		COLOR_MAP.put("Translucent Smoke","Clear Gray"); 
		COLOR_MAP.put("Nickel","Nickel Metal"); 
		COLOR_MAP.put("Light Blue","Light Blue"); 
		COLOR_MAP.put("Assorted","Assorted"); 
		COLOR_MAP.put("Multi color","Multi Color"); 
		COLOR_MAP.put("Tan","Light Brown"); 
		COLOR_MAP.put("Cognac","Medium Brown"); 
		COLOR_MAP.put("Charcoal Gray","Dark Gray"); 
		COLOR_MAP.put("Dark Brown","Dark Brown"); 
		COLOR_MAP.put("Frosted","Clear"); 
		COLOR_MAP.put("Deep Red","Dark Red"); 
		COLOR_MAP.put("Bright Red","Bright Red"); 
		COLOR_MAP.put("Sky Blue","Light Blue"); 
		COLOR_MAP.put("Dark Blue","Dark Blue"); 
		COLOR_MAP.put("Dark Green","Dark Green"); 
		COLOR_MAP.put("Color Tinted","Clear"); 

	}
	public static String getColorGroup(String colorName){
		String group = COLOR_MAP.get(colorName);
		return group == null?"Other":group;
	}
	public static String getImprintMethodGroup(String imprintMethdVal){
		return IMPRINT_METHOD_MAP.get(imprintMethdVal);
	}
}
