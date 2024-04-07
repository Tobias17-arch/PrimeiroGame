
public class LowElf {
	int strengthBase = 0;
	int dexterityBase = 2;
	int constitutionBase = 0;
	int intelligenceBase = 0;
	int wisdomBase = 0;
	int charismaBase = 1;
	public static void LowElf(String[] args){
		LowElf atributosLowElf = new LowElf();
		AtributoBase atributoBase = new AtributoBase();
		
		int StrengthLowElf = atributosLowElf.strengthBase + atributoBase.strengthBase;
		int DexterityLowElf = atributosLowElf.dexterityBase + atributoBase.dexterityBase;
		int ConstitutionLowElf = atributosLowElf.constitutionBase + atributoBase.constitutionBase;
		int intelligenceLowElf = atributosLowElf.intelligenceBase + atributoBase.intelligenceBase;
		int wisdomLowElf = atributosLowElf.wisdomBase + atributoBase.wisdomBase;
		int charismaLowElf = atributosLowElf.charismaBase + atributoBase.charismaBase;
		
	}
}
