
public class Human {
	int strengthBase = 1;
	int dexterityBase = 1;
	int constitutionBase = 1;
	int intelligenceBase = 1;
	int wisdomBase = 1;
	int charismaBase = 1;
	public static void Human(String[] args){
		Human atributosHuman = new Human();
		AtributoBase atributoBase = new AtributoBase();
		
		int StrengthHuman = atributosHuman.strengthBase + atributoBase.strengthBase;
		int DexterityHuman = atributosHuman.dexterityBase + atributoBase.dexterityBase;
		int ConstitutionHuman = atributosHuman.constitutionBase + atributoBase.constitutionBase;
		int intelligenceHuman = atributosHuman.intelligenceBase + atributoBase.intelligenceBase;
		int wisdomHuman = atributosHuman.wisdomBase + atributoBase.wisdomBase;
		int charismaHuman = atributosHuman.charismaBase + atributoBase.charismaBase;
		
	}
}
