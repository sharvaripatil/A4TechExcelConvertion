package parser.apparel;

import java.util.HashMap;
import java.util.Map;

public class ApparelColorMapping {
	public static Map<String, String> COLOR_MAP =new HashMap<String, String>();
	static{
/*		COLOR_MAP.put("True Navy-Gray 264","Medium Gray");
		COLOR_MAP.put("True Navy 260","Dark Blue");
		COLOR_MAP.put("Gray 115","Medium Gray");
		COLOR_MAP.put("Navy 040","Dark Blue");
		COLOR_MAP.put("Black 010","Medium Black");
		COLOR_MAP.put("Forest 020","Dark Green");
		COLOR_MAP.put("Maroon 030","Dark Red");
		COLOR_MAP.put("Red 060","Medium Red");
		COLOR_MAP.put("Royal 070","Bright Blue");
		COLOR_MAP.put("White 080","Medium White");
		COLOR_MAP.put("Dark Navy 095","Dark Blue");
		COLOR_MAP.put("Black","Medium Black");
		COLOR_MAP.put("Purple 050","Medium Purple");
		COLOR_MAP.put("Charcoal Heather 110","Medium Gray");
		COLOR_MAP.put("Yellow 150","Medium Yellow");
		COLOR_MAP.put("Blue Fog 262","Medium Blue");
		COLOR_MAP.put("Oxford Heather 114","Light Gray");
		COLOR_MAP.put("Olive 284","Dark Green");
		COLOR_MAP.put("Plum 055","Medium Red");
		COLOR_MAP.put("Teal 232","Medium Green");
		COLOR_MAP.put("Pink-Reflective 188","Bright Pink");
		COLOR_MAP.put("Buttercup-Reflective 154","Medium Yellow");
		COLOR_MAP.put("Coral-Reflective 256","Medium Orange");
		COLOR_MAP.put("Red-Reflective 166","Medium Red");
		COLOR_MAP.put("Wave-Reflective 192","Light Blue");
		COLOR_MAP.put("Hot Pink-Reflective 334","Bright Pink");
		COLOR_MAP.put("Black-Reflective 210","Medium Black");
		COLOR_MAP.put("Mint-Reflective 323","Light Green");
		COLOR_MAP.put("Aqua-Reflective 236","Light Blue");
		COLOR_MAP.put("True Navy-Reflective 263","Dark Blue");
		COLOR_MAP.put("Violet-Reflective 353","Medium Purple");
		COLOR_MAP.put("Periwinkle 352","Light Purple");
		COLOR_MAP.put("Limited Quantity Bright Coral 358","Bright Orange");
		COLOR_MAP.put("Oxford Heather Gray 114","Medium Gray");
		COLOR_MAP.put("Lime Green 158","Light Green");
		COLOR_MAP.put("Saddle 274","Light Brown");
		COLOR_MAP.put("Black 006","Medium Black");
		COLOR_MAP.put("Columbia Blue 089","Medium Blue");
		COLOR_MAP.put("Stone 140","Light Green");
		COLOR_MAP.put("Pink 182","Medium Pink");
		COLOR_MAP.put("Royal 060","Medium Blue");
		COLOR_MAP.put("Coral 255","Medium Pink");
		COLOR_MAP.put("Mint 322","Light Green");
		COLOR_MAP.put("Aqua 228","Light Blue");
		COLOR_MAP.put("Hot Pink","Medium Pink");
		COLOR_MAP.put("Blush Pink 186","Medium Pink");
		COLOR_MAP.put("Cardinal 036","Medium Red");
		COLOR_MAP.put("Orange 250","Medium Orange");
		COLOR_MAP.put("Golden Yellow 150","Medium Yellow");
		COLOR_MAP.put("Marine Blue","Medium Green");
		COLOR_MAP.put("Storm Blue 266","Medium Blue");
		COLOR_MAP.put("Pink 180","Medium Pink");
		COLOR_MAP.put("Indigo Blue 179","Medium Blue");
		COLOR_MAP.put("Dark Charcoal Heather 111","Dark Gray");
		COLOR_MAP.put("Bright Coral 352","Bright Orange");
		COLOR_MAP.put("Navy Heather 240","Dark Blue");
		COLOR_MAP.put("Oatmeal Heather 129","Light Brown");
		COLOR_MAP.put("Jade Heather 230","Medium Green");
		COLOR_MAP.put("Heather Gray 116","Medium Gray");
		COLOR_MAP.put("Royal Blue 070","Bright Blue");
		COLOR_MAP.put("Purple Reign 053","Dark Purple");
		COLOR_MAP.put("Flamingo 389","Medium Pink");
		COLOR_MAP.put("Sea Glass 235","Medium Green");
		COLOR_MAP.put("Cobalt 191","Medium Blue");
		COLOR_MAP.put("Black Heather 104","Medium Black");
		COLOR_MAP.put("Brown Heather 279","Medium Brown");
		COLOR_MAP.put("Blue Heather 293","Medium Blue");
		COLOR_MAP.put("Orchid Heather 057","Medium Purple");
		COLOR_MAP.put("Graphite Heather 208","Medium Gray");
		COLOR_MAP.put("Black-Gray 006","Medium Black");
		COLOR_MAP.put("Passion Pink 337","Medium Pink");
		COLOR_MAP.put("Garnet 169","Medium Red");
		COLOR_MAP.put("Berry 122","Medium Purple");
		COLOR_MAP.put("Dove White 083","Medium White");
		COLOR_MAP.put("Shadow 001","Medium Black");
		COLOR_MAP.put("Steel Gray 204","Medium Gray");
		COLOR_MAP.put("Pewter 205","Medium Gray");
		COLOR_MAP.put("Wave-Reflectrive 192","Medium Blue");
		COLOR_MAP.put("Nautical Blue 175","Bright Blue");
		COLOR_MAP.put("Teal 328","Medium Green");
		COLOR_MAP.put("Cloud 206","Medium Gray");
		COLOR_MAP.put("Ash Gray 209","Light Gray");
		COLOR_MAP.put("Blue Ink 177","Dark Blue");
		COLOR_MAP.put("Blue Steel 173","Medium Blue");
		COLOR_MAP.put("Lead 202","Medium Black");
		COLOR_MAP.put("Jade 330","Medium Green");
		COLOR_MAP.put("Royal/Black 078","Medium Black");
		COLOR_MAP.put("Navy Blue","Dark Blue");
		COLOR_MAP.put("White","Medium White");
		COLOR_MAP.put("Charcoal 201","Medium Black");
		COLOR_MAP.put("Carolina Blue 268","Medium Blue");
		COLOR_MAP.put("Melon 37","Medium Pink");
		COLOR_MAP.put("Baby (Navy) Blue 410","Dark Blue");
		COLOR_MAP.put("Dark Gray Heather 511","Dark Gray");
		COLOR_MAP.put("Navy Blue 040","Dark Blue");
		COLOR_MAP.put("Bright Coral 358","Bright Pink");
		COLOR_MAP.put("Hot Pink 335","Bright Pink");
		COLOR_MAP.put("Multi color 100","Multi Color");
		COLOR_MAP.put("Cream 366","Medium White");
		COLOR_MAP.put("Black 210","Medium Black");
		COLOR_MAP.put("Gray 316","Medium Gray");
		COLOR_MAP.put("Orange 450","Medium Orange");
		COLOR_MAP.put("Red 166","Medium Red");
		COLOR_MAP.put("Hot Pink 334","Bright Pink");
		COLOR_MAP.put("Aqua 236","Light Blue");
		COLOR_MAP.put("Navy Blue 263","Dark Blue");
		COLOR_MAP.put("Light Gray Heather 514","Light Gray");
		COLOR_MAP.put("Ivory Heather 518","Medium White");
		COLOR_MAP.put("Kelly Green 145","Medium Green");
		COLOR_MAP.put("Graphite Navy 290","Dark Blue");
		COLOR_MAP.put("Khaki 130","Medium Brown");
		COLOR_MAP.put("Gray","Medium Gray");
		COLOR_MAP.put("Forest Green 020","Medium Green"); 
*/		/*COLOR_MAP.put("Aqua","Light Blue");
		COLOR_MAP.put("Aqua 228","Light Blue");
		COLOR_MAP.put("Ash Grey","Medium Gray");
		COLOR_MAP.put("Bay Blue","Medium Blue");
		COLOR_MAP.put("Berry","Medium Purple");
		COLOR_MAP.put("Black","Medium Black");
		COLOR_MAP.put("Black 010","Medium Black");
		COLOR_MAP.put("Black Heather","Medium Black");
		COLOR_MAP.put("Blue Fog","Medium Blue");
		COLOR_MAP.put("Blue Heather","Medium Blue");
		COLOR_MAP.put("Blue Ink","Dark Blue");
		COLOR_MAP.put("Blue Mist","Medium Blue");
		COLOR_MAP.put("Blue Steel","Medium Blue");
		COLOR_MAP.put("Blush Pink","Medium Pink");
		COLOR_MAP.put("Bright Coral","Bright Pink");
		COLOR_MAP.put("Bright Pink","Bright Pink");
		COLOR_MAP.put("Brown Heather","Medium Brown");
		COLOR_MAP.put("Burnt Orange","Dark Orange");
		COLOR_MAP.put("Buttercup","Medium Yellow");
		COLOR_MAP.put("Camo","Multi Color");
		COLOR_MAP.put("Cardinal","Medium Red");
		COLOR_MAP.put("Carolina Blue","Medium Blue");
		COLOR_MAP.put("Charcoal","Medium Black");
		COLOR_MAP.put("Charcoal Black","Dark Black");
		COLOR_MAP.put("Charcoal Heather","Medium Gray");
		COLOR_MAP.put("Cloud","Medium Gray");
		COLOR_MAP.put("Cobalt","Medium Blue");
		COLOR_MAP.put("Columbia Blue","Medium Blue");
		COLOR_MAP.put("Coral","Medium Pink");
		COLOR_MAP.put("Cream 366","Medium White");
		COLOR_MAP.put("Dark Charcoal","Dark Gray");
		COLOR_MAP.put("Dark Heather Grey","Dark Gray");
		COLOR_MAP.put("Dark Navy Blue","Dark Blue");
		COLOR_MAP.put("Dove White","Medium White");
		COLOR_MAP.put("Flamingo","Medium Pink");
		COLOR_MAP.put("Forest","Dark Green");
		COLOR_MAP.put("Fuchsia","Light Purple");
		COLOR_MAP.put("Fuschsia","Medium Purple");
		COLOR_MAP.put("Garnet","Medium Red");
		COLOR_MAP.put("Gold","Gold Metal");
		COLOR_MAP.put("Graphite","Medium Gray");
		COLOR_MAP.put("Graphite Heather","Medium Gray");
		COLOR_MAP.put("Graphite Heather 208","Medium Gray");
		COLOR_MAP.put("Graphite Navy Blue","Dark Blue");
		COLOR_MAP.put("Gray","Medium Gray");
		COLOR_MAP.put("Grey","Medium Gray");
		COLOR_MAP.put("Grey m�lange","Medium Gray");
		COLOR_MAP.put("Heather","Medium Gray");
		COLOR_MAP.put("Heather Grey","Medium Gray");
		COLOR_MAP.put("Hot Pink","Bright Pink");
		COLOR_MAP.put("Hot Pink 335","Bright Pink");
		COLOR_MAP.put("Indigo Blue","Medium Blue");
		COLOR_MAP.put("Ivory Heather","Medium White");
		COLOR_MAP.put("Jade","Medium Green");
		COLOR_MAP.put("Jade Heather","Medium Green");
		COLOR_MAP.put("Kelly Green","Medium Green");
		COLOR_MAP.put("Khaki","Medium Brown");
		COLOR_MAP.put("Lavender","Light Purple");
		COLOR_MAP.put("Lead","Medium Black");
		COLOR_MAP.put("Light Grey Heather","Light Gray");
		COLOR_MAP.put("Light Khaki","Light Brown");
		COLOR_MAP.put("Lilac","Medium Purple");
		COLOR_MAP.put("Lime","Bright Green");
		COLOR_MAP.put("Lime Green","Light Green");
		COLOR_MAP.put("Magenta","Light Pink");
		COLOR_MAP.put("Marine Blue","Medium Blue");
		COLOR_MAP.put("Maroon","Dark Red");
		COLOR_MAP.put("Melon","Light Green");
		COLOR_MAP.put("Midnight Blue","Dark Blue");
		COLOR_MAP.put("Mint","Light Green");
		COLOR_MAP.put("Multi color 100","Multi Color");
		COLOR_MAP.put("Nautical Blue","Bright Blue");
		COLOR_MAP.put("Navy Blue","Dark Blue");
		COLOR_MAP.put("Navy Blue Heather","Dark Blue");
		COLOR_MAP.put("Navy Heather 240","Dark Blue");
		COLOR_MAP.put("Neon Pink","Medium Pink");
		COLOR_MAP.put("New Red","Medium Red");
		COLOR_MAP.put("Oatmeal Heather","Light Brown");
		COLOR_MAP.put("Ocean Blue","Medium Blue");
		COLOR_MAP.put("Olive","Dark Green");
		COLOR_MAP.put("Olive Green","Dark Green");
		COLOR_MAP.put("Orange","Medium Orange");
		COLOR_MAP.put("Orchid Heather","Medium Purple");
		COLOR_MAP.put("Oxford Heather","Light Gray");
		COLOR_MAP.put("Passion Pink","Medium Pink");
		COLOR_MAP.put("Pearl","Medium Gray");
		COLOR_MAP.put("Pearl Grey","Medium Gray");
		COLOR_MAP.put("Periwinkle","Light Purple");
		COLOR_MAP.put("Pewter","Medium Gray");
		COLOR_MAP.put("Pewter Heather","Medium Gray");
		COLOR_MAP.put("Pink","Medium Pink");
		COLOR_MAP.put("Plum","Medium Red");
		COLOR_MAP.put("Purple","Medium Purple");
		COLOR_MAP.put("Purple Reign","Dark Purple");
		COLOR_MAP.put("Raspberry","Dark Red");
		COLOR_MAP.put("Red","Medium Red");
		COLOR_MAP.put("Reflective","Other");
		COLOR_MAP.put("Royal","Bright Blue");
		COLOR_MAP.put("Royal Blue","Bright Blue");
		COLOR_MAP.put("Saddle","Light Brown");
		COLOR_MAP.put("Sea Glass","Medium Green");
		COLOR_MAP.put("Shadow","Medium Black");
		COLOR_MAP.put("Slate","Medium Gray");
		COLOR_MAP.put("Steel Grey","Medium Gray");
		COLOR_MAP.put("Stone","Light Green");
		COLOR_MAP.put("Storm Blue","Medium Blue");
		COLOR_MAP.put("Taupe","Dark Brown");
		COLOR_MAP.put("Teal","Light Green");
		COLOR_MAP.put("True Navy Blue","Dark Blue");
		COLOR_MAP.put("Vapor Grey","Medium Gray");
		COLOR_MAP.put("Violet","Medium Purple");
		COLOR_MAP.put("Vivid Pink","Medium Pink");
		COLOR_MAP.put("Wave","Light Blue");
		COLOR_MAP.put("White","Medium White");
		COLOR_MAP.put("White Sand","Medium White");
		COLOR_MAP.put("Yellow","Medium Yellow");*/
		/*COLOR_MAP.put("Name","Color Group");//EXCIT-954
		COLOR_MAP.put("Anchor Aqua","Light Blue");
		COLOR_MAP.put("Aqua","Light Blue");
		COLOR_MAP.put("Ash Grey","Medium Gray");
		COLOR_MAP.put("Bay Blue","Medium Blue");
		COLOR_MAP.put("Berry","Medium Purple");
		COLOR_MAP.put("Black","Medium Black");
		COLOR_MAP.put("Black Heather","Medium Black");
		COLOR_MAP.put("Blue Fog","Medium Blue");
		COLOR_MAP.put("Blue Heather","Medium Blue");
		COLOR_MAP.put("Blue Ink","Dark Blue");
		COLOR_MAP.put("Blue Mist","Medium Blue");
		COLOR_MAP.put("Blue Steel","Medium Blue");
		COLOR_MAP.put("Blush Pink","Medium Pink");
		COLOR_MAP.put("Bright Coral","Bright Pink");
		COLOR_MAP.put("Bright Green","Bright Green");
		COLOR_MAP.put("Light Brown","Light Brown");
		COLOR_MAP.put("Brown Heather","Medium Brown");
		COLOR_MAP.put("Burnt Orange","Dark Orange");
		COLOR_MAP.put("BurntOrange","Dark Orange");
		COLOR_MAP.put("BUTTER","Light Yellow");
		COLOR_MAP.put("Buttercup","Medium Yellow");
		COLOR_MAP.put("Camo Print","Camouflage Green");
		COLOR_MAP.put("Cardinal","Medium Red");
		COLOR_MAP.put("Carolina Blue","Medium Blue");
		COLOR_MAP.put("Chambray Blue","Medium Blue");
		COLOR_MAP.put("Charcoal","Medium Black");
		COLOR_MAP.put("Charcoal","Dark Gray");
		COLOR_MAP.put("Charcoal Black","Dark Black");
		COLOR_MAP.put("Charcoal Heather","Medium Gray");
		COLOR_MAP.put("Chili Red","Medium Red");
		COLOR_MAP.put("Cloud","Medium Gray");
		COLOR_MAP.put("Cobalt","Medium Blue");
		COLOR_MAP.put("Columbia Blue","Medium Blue");
		COLOR_MAP.put("Coral","Medium Orange");
		COLOR_MAP.put("Coral","Medium Pink");
		COLOR_MAP.put("Cream","Medium White");
		COLOR_MAP.put("Dark Charcoal","Dark Gray");
		COLOR_MAP.put("Dark Heather Grey","Dark Gray");
		COLOR_MAP.put("Dark Navy Blue","Dark Blue");
		COLOR_MAP.put("Dot Navy Blue","Dark Blue");
		COLOR_MAP.put("Dove White","Medium White");
		COLOR_MAP.put("DUSK BLUE","Medium Blue");
		COLOR_MAP.put("Dusty Rose","Medium Red");
		COLOR_MAP.put("Emerald","Dark Green");
		COLOR_MAP.put("Flame","Medium Red");
		COLOR_MAP.put("Flamingo","Medium Pink");
		COLOR_MAP.put("Forest","Dark Green");
		COLOR_MAP.put("Forest","Medium Green");
		COLOR_MAP.put("Fuschsia","Bright Pink");
		COLOR_MAP.put("Fuchsia","Dark Purple");
		COLOR_MAP.put("Garnet","Medium Red");
		COLOR_MAP.put("Gold","Gold Metal");
		COLOR_MAP.put("Graphite","Medium Gray");
		COLOR_MAP.put("Graphite Heather","Medium Gray");
		COLOR_MAP.put("Graphite Navy Blue","Dark Blue");
		COLOR_MAP.put("Gray","Medium Gray");
		COLOR_MAP.put("Dark Gray","Dark Gray");
		COLOR_MAP.put("Green","Bright Green");
		COLOR_MAP.put("Grey","Medium Gray");
		COLOR_MAP.put("Grey melange","Medium Gray");
		COLOR_MAP.put("Grey Space Dye","Medium Gray");
		COLOR_MAP.put("Heather","Medium Gray");
		COLOR_MAP.put("Heather Gray","Medium Gray");
		COLOR_MAP.put("Heather Grey","Medium Gray");
		COLOR_MAP.put("Hot Pink","Bright Pink");
		COLOR_MAP.put("Hot Pink","Medium Pink");
		COLOR_MAP.put("Ice Blue","Light Blue");
		COLOR_MAP.put("Indigo Blue","Medium Blue");
		COLOR_MAP.put("Ivory Heather","Medium White");
		COLOR_MAP.put("Jade","Medium Green");
		COLOR_MAP.put("Jade Heather","Medium Green");
		COLOR_MAP.put("Kelly Green","Medium Green");
		COLOR_MAP.put("Khaki","Medium Brown");
		COLOR_MAP.put("Lake Blue","Medium Blue");
		COLOR_MAP.put("Lavendar","Medium Purple");
		COLOR_MAP.put("Lavender","Medium Purple");
		COLOR_MAP.put("Lead","Medium Black");
		COLOR_MAP.put("Light Blue","Light Blue");
		COLOR_MAP.put("Light Grey Heather","Light Gray");
		COLOR_MAP.put("Light Khaki","Light Brown");
		COLOR_MAP.put("Lilac","Medium Purple");
		COLOR_MAP.put("Lime","Bright Green");
		COLOR_MAP.put("Lime Green","Light Green");
		COLOR_MAP.put("Magenta","Medium Purple");
		COLOR_MAP.put("Marine Blue","Medium Green");
		COLOR_MAP.put("Maroon","Dark Red");
		COLOR_MAP.put("Maroon","Dark Purple");
		COLOR_MAP.put("Medium Blue Heather","Medium Blue");
		COLOR_MAP.put("Melon","Light Green");
		COLOR_MAP.put("Midnight Blue","Dark Blue");
		COLOR_MAP.put("Mint","Light Green");
		COLOR_MAP.put("Multi","Multi Color");
		COLOR_MAP.put("Nautical Blue","Bright Blue");
		COLOR_MAP.put("Navy Blue","Dark Blue");
		COLOR_MAP.put("Navy Blue Heather","Dark Blue");
		COLOR_MAP.put("Neon Pink","Bright Pink");
		COLOR_MAP.put("New Red","Medium Red");
		COLOR_MAP.put("Oatmeal Heather","Light Brown");
		COLOR_MAP.put("Ocean Blue","Dark Blue");
		COLOR_MAP.put("Olive","Dark Green");
		COLOR_MAP.put("Orange","Medium Orange");
		COLOR_MAP.put("Orchid Heather","Medium Purple");
		COLOR_MAP.put("Oxford Gray","Medium Gray");
		COLOR_MAP.put("Oxford Grey","Medium Gray");
		COLOR_MAP.put("Oxford Heather","Light Gray");
		COLOR_MAP.put("Pale Pink","Light Pink");
		COLOR_MAP.put("Passion Pink","Medium Pink");
		COLOR_MAP.put("Pearl","Medium Gray");
		COLOR_MAP.put("Pearl Grey","Medium Gray");
		COLOR_MAP.put("Periwinkle","Light Purple");
		COLOR_MAP.put("Pewter Heather","Medium Gray");
		COLOR_MAP.put("Pink","Medium Pink");
		COLOR_MAP.put("Pink","Bright Pink");
		COLOR_MAP.put("Bright Pink","Bright Pink");
		COLOR_MAP.put("Dark Pink","Dark Pink");
		COLOR_MAP.put("Pink Pale Heather","Light Pink");
		COLOR_MAP.put("Plum","Medium Red");
		COLOR_MAP.put("Polka","Other");
		COLOR_MAP.put("Poppy","Other");
		COLOR_MAP.put("Port","Other");
		COLOR_MAP.put("Powder Pink","Medium Pink");
		COLOR_MAP.put("Preppy Pink","Bright Pink");
		COLOR_MAP.put("Purple","Medium Purple");
		COLOR_MAP.put("Purple Reign","Dark Purple");
		COLOR_MAP.put("Raspberry","Dark Red");
		COLOR_MAP.put("Red","Medium Red");
		COLOR_MAP.put("Red Heather","Medium Red");
		COLOR_MAP.put("Reflective","Other");
		COLOR_MAP.put("Royal","Bright Blue");
		COLOR_MAP.put("Royal Blue","Bright Blue");
		COLOR_MAP.put("Saddle","Light Brown");
		COLOR_MAP.put("Salmon","Light Pink");
		COLOR_MAP.put("Sand","Medium White");
		COLOR_MAP.put("Sea Glass","Medium Green");
		COLOR_MAP.put("Shadow","Medium Black");
		COLOR_MAP.put("Slate","Medium Gray");
		COLOR_MAP.put("Slate","Light Gray");
		COLOR_MAP.put("Steel Heather","Medium Gray");
		COLOR_MAP.put("Stone","Light Green");
		COLOR_MAP.put("Storm Blue","Medium Blue");
		COLOR_MAP.put("Teal","Medium Green");
		COLOR_MAP.put("Teal","Medium Blue");
		COLOR_MAP.put("TRUE BLACK","Medium Black");
		COLOR_MAP.put("True Blue","Medium Blue");
		COLOR_MAP.put("True Navy Blue","Dark Blue");
		COLOR_MAP.put("Turquoise","Light Blue");
		COLOR_MAP.put("Vapor Gray","Medium Gray");
		COLOR_MAP.put("Vapor Grey","Medium Gray");
		COLOR_MAP.put("Violet","Medium Purple");
		COLOR_MAP.put("Vivid Pink","Bright Pink");
		COLOR_MAP.put("Wave","Light Blue");
		COLOR_MAP.put("White","Medium White");
		COLOR_MAP.put("White Sand","Medium White");
		COLOR_MAP.put("White Stripe","Medium White");
		COLOR_MAP.put("Yellow","Medium Yellow");*/
		COLOR_MAP.put("Black","Medium Black");//EXCIT-1002
		COLOR_MAP.put("Red","Medium Red");
		COLOR_MAP.put("Yellow","Medium Yellow");
		COLOR_MAP.put("Taupe","Medium Brown");
		COLOR_MAP.put("True Navy","Dark Blue");
		COLOR_MAP.put("Grey","Medium Gray");
		COLOR_MAP.put("Navy Blue","Dark Blue");
		COLOR_MAP.put("Maroon","Dark Purple");
		COLOR_MAP.put("Royal","Bright Blue");
		COLOR_MAP.put("Forest","Dark Green");
		COLOR_MAP.put("White","Medium White");
		COLOR_MAP.put("Purple","Medium Purple");
		COLOR_MAP.put("Navy","Dark Blue");
		COLOR_MAP.put("Dark Navy Blue","Dark Blue");
		COLOR_MAP.put("Charcoal Heather","Medium Gray");
		COLOR_MAP.put("Blue Fog","Medium Blue");
		COLOR_MAP.put("Oxford Heather","Light Gray");
		COLOR_MAP.put("Olive","Dark Green");
		COLOR_MAP.put("Plum","Medium Red");
		COLOR_MAP.put("Teal","Medium Green");
		COLOR_MAP.put("Pink","Bright Pink");
		COLOR_MAP.put("Bright Pink","Bright Pink");
		COLOR_MAP.put("Dark Pink","Dark Pink");
		COLOR_MAP.put("Periwinkle","Light Purple");
		COLOR_MAP.put("Bright Coral","Bright Pink");
		COLOR_MAP.put("Charcoal Black","Dark Black");
		COLOR_MAP.put("Lime Green","Bright Green");
		COLOR_MAP.put("Saddle","Light Brown");
		COLOR_MAP.put("Hot Pink","Medium Pink");
		COLOR_MAP.put("Columbia Blue","Medium Blue");
		COLOR_MAP.put("Aqua","Light Blue");
		COLOR_MAP.put("Mint","Light Green");
		COLOR_MAP.put("Coral","Medium Pink");
		COLOR_MAP.put("Cardinal","Medium Red");
		COLOR_MAP.put("Stone","Light Green");
		COLOR_MAP.put("Blush Pink","Medium Pink");
		COLOR_MAP.put("Blue Mist","Medium Blue");
		COLOR_MAP.put("Marine Blue","Medium Green");
		COLOR_MAP.put("Orange","Medium Orange");
		COLOR_MAP.put("Storm Blue","Medium Blue");
		COLOR_MAP.put("Indigo Blue","Medium Blue");
		COLOR_MAP.put("Dark Charcoal","Dark Gray");
		COLOR_MAP.put("Preppy Pink","Bright Pink");
		COLOR_MAP.put("Navy Blue Heather","Dark Blue");
		COLOR_MAP.put("Oatmeal Heather","Light Brown");
		COLOR_MAP.put("Jade Heather","Medium Green");
		COLOR_MAP.put("Heather Gray","Medium Gray");
		COLOR_MAP.put("Purple Reign","Dark Purple");
		COLOR_MAP.put("Flamingo","Medium Pink");
		COLOR_MAP.put("Sea Glass","Medium Green");
		COLOR_MAP.put("Cobalt","Medium Blue");
		COLOR_MAP.put("Black Heather","Medium Black");
		COLOR_MAP.put("Brown Heather","Medium Brown");
		COLOR_MAP.put("Blue Heather","Medium Blue");
		COLOR_MAP.put("Orchid Heather","Medium Purple");
		COLOR_MAP.put("Graphite Heather","Medium Gray");
		COLOR_MAP.put("Passion Pink","Medium Pink");
		COLOR_MAP.put("Garnet","Medium Red");
		COLOR_MAP.put("Berry","Medium Purple");
		COLOR_MAP.put("Dove White","Medium White");
		COLOR_MAP.put("Shadow","Medium Black");
		COLOR_MAP.put("Vapor Gray","Medium Gray");
		COLOR_MAP.put("Steel Gray","Medium Gray");
		COLOR_MAP.put("Pewter","Medium Gray");
		COLOR_MAP.put("Nautical Blue","Bright Blue");
		COLOR_MAP.put("Cloud","Medium Gray");
		COLOR_MAP.put("Ash Grey","Medium Gray");
		COLOR_MAP.put("Blue Ink","Dark Blue");
		COLOR_MAP.put("Ash Gray","Medium Gray");
		COLOR_MAP.put("Blue Steel","Medium Blue");
		COLOR_MAP.put("Jade","Medium Green");
		COLOR_MAP.put("Lead","Medium Black");
		COLOR_MAP.put("Gray","Medium Gray");
		COLOR_MAP.put("Dark Gray","Dark Gray");
		COLOR_MAP.put("Heather Grey","Medium Gray");
		COLOR_MAP.put("Carolina Blue","Medium Blue");
		COLOR_MAP.put("Bay Blue","Medium Blue");
		COLOR_MAP.put("Charcoal","Dark Gray");
		COLOR_MAP.put("Melon","Light Green");
		COLOR_MAP.put("Dark Gray Heather","Dark Gray");
		COLOR_MAP.put("Cream","Medium White");
		COLOR_MAP.put("Lavender","Medium Purple");
		COLOR_MAP.put("Ocean Blue","Dark Blue");
		COLOR_MAP.put("Vivid Pink","Bright Pink");
		COLOR_MAP.put("Light Grey Heather","Light Gray");
		COLOR_MAP.put("Ivory Heather","Medium White");
		COLOR_MAP.put("Light Gray Heather","Medium Gray");
		COLOR_MAP.put("Graphite Navy Blue","Dark Blue");
		COLOR_MAP.put("Kelly Green","Medium Green");
		COLOR_MAP.put("Khaki","Medium Brown");
		COLOR_MAP.put("Gray Melange","Medium Gray");
		COLOR_MAP.put("Lime","Bright Green");
		COLOR_MAP.put("Fuchsia","Dark Purple");
		COLOR_MAP.put("Neon Pink","Bright Pink");
		COLOR_MAP.put("Lilac","Medium Purple");
		COLOR_MAP.put("Pewter Heather","Medium Gray");
		COLOR_MAP.put("Camo Print","Camouflage Green");
		COLOR_MAP.put("Chambray Blue","Medium Blue");
		COLOR_MAP.put("Chili Red","Medium Red");
		COLOR_MAP.put("True Blue","Medium Blue");
		COLOR_MAP.put("Port","Dark Red");
		COLOR_MAP.put("Emerald","Dark Green");
		COLOR_MAP.put("Poppy","Medium Red");
		COLOR_MAP.put("Oxford Grey","Medium Gray");
		COLOR_MAP.put("Bright Green","Bright Green");
		COLOR_MAP.put("Brown","Medium Brown");
		COLOR_MAP.put("Light Brown","Light Brown");
		COLOR_MAP.put("Oxford Gray","Medium Gray");
		COLOR_MAP.put("Green","Bright Green");
		COLOR_MAP.put("Salmon","Light Pink");
		COLOR_MAP.put("Grey Space Dye","Medium Gray");
		COLOR_MAP.put("TRUE BLACK","Medium Black");
		COLOR_MAP.put("Light Blue","Light Blue");
		COLOR_MAP.put("Sand","Medium White");
		COLOR_MAP.put("Powder Pink","Medium Pink");
		COLOR_MAP.put("Pink Pale Heather","Light Pink");
		COLOR_MAP.put("Pale Pink","Light Pink");


	}
	
	public static String getColorGroup(String colorName){
		String colorValue = COLOR_MAP.get(colorName);
		return colorValue == null?"Other":colorValue;
	}
}