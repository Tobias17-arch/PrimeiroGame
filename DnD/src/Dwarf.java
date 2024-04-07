
public class Dwarf {
	int strengthBase = 2;
	int dexterityBase = 0;
	int constitutionBase = 0;
	int intelligenceBase = 0;
	int wisdomBase = 0;
	int charismaBase = 1;
	public static void Dwarf(String[] args){
		Dwarf atributosDwarf = new Dwarf();
		AtributoBase atributoBase = new AtributoBase();
		
		int StrengthDwarf = atributosDwarf.strengthBase + atributoBase.strengthBase;
		int DexterityDwarf = atributosDwarf.dexterityBase + atributoBase.dexterityBase;
		int ConstitutionDwarf = atributosDwarf.constitutionBase + atributoBase.constitutionBase;
		int intelligenceDwarf = atributosDwarf.intelligenceBase + atributoBase.intelligenceBase;
		int wisdomDwarf = atributosDwarf.wisdomBase + atributoBase.wisdomBase;
		int charismaDwarf = atributosDwarf.charismaBase + atributoBase.charismaBase;
		
	}
}
