
public class HighElf {
	int strengthBase = 0;
	int dexterityBase = 2;
	int constitutionBase = 0;
	int intelligenceBase = 0;
	int wisdomBase = 0;
	int charismaBase = 0;
	public static void HighElf(String[] args){
		HighElf atributosHighElf = new HighElf();
		AtributoBase atributoBase = new AtributoBase();
		
		int StrengthHighElf = atributosHighElf.strengthBase + atributoBase.strengthBase;
		int DexterityHighElf = atributosHighElf.dexterityBase + atributoBase.dexterityBase;
		int ConstitutionHighElf = atributosHighElf.constitutionBase + atributoBase.constitutionBase;
		int intelligenceHighElf = atributosHighElf.intelligenceBase + atributoBase.intelligenceBase;
		int wisdomHighElf = atributosHighElf.wisdomBase + atributoBase.wisdomBase;
		int charismaHighElf = atributosHighElf.charismaBase + atributoBase.charismaBase;
		
	}
}
